import java.math.BigInteger;
import java.util.Random;

/**
 *  The {@code RabinKarp} class finds the first occurrence of a pattern string
 *  in a text string.
 *  <p>
 *  This implementation uses the Rabin-Karp algorithm.
 *  <p>
 *  For additional documentation,
 *  see <a href="https://algs4.cs.princeton.edu/53substring">Section 5.3</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 */
public class RabinKarp {
    private String pat;      // the pattern  // needed only for Las Vegas
    private long patHash;    // pattern hash value
    private int patLength;           // pattern length
    private long q;          // a large prime, small enough to avoid long overflow
    private int R;           // radix
    private long RM;         // R^(M-1) % Q

    /**
     * Preprocesses the pattern string.
     *
     * @param pat the pattern string
     */
    public RabinKarp(String pat) {
        this.pat = pat;      // save pattern (needed only for Las Vegas)
        R = 256;
        patLength = pat.length();
        q = longRandomPrime();

        // precompute R^(m-1) % q for use in removing leading digit
        RM = 1;
        for (int i = 1; i <= patLength - 1; i++)
            RM = (R * RM) % q;
        patHash = hash(pat, patLength);
    }

    // Compute hash for key[0..m-1].
    private long hash(String key, int m) {
        long h = 0;
        for (int j = 0; j < m; j++)
            h = (R * h + key.charAt(j)) % q;
        return h;
    }

    // Las Vegas version: does pat[] match txt[i..i-m+1] ?
    private boolean check(String txt, int i) {
        for (int j = 0; j < patLength; j++)
            if (pat.charAt(j) != txt.charAt(i + j))
                return false;
        return true;
    }

    // Monte Carlo version: always return true
    // private boolean check(int i) {
    //    return true;
    //}

    /**
     * Returns the index of the first occurrrence of the pattern string
     * in the text string.
     *
     * @param  txt the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; n if no such match
     */
    public int search(String txt) {
        int textLength = txt.length();
        if (textLength < patLength) return -1;
        long txtHash = hash(txt, patLength);

        // check for match at offset 0
        if ((patHash == txtHash) && check(txt, 0))
            return 0;

        // check for hash match; if hash match, check for exact match
        for (int i = patLength; i < textLength; i++) {
            // Remove leading digit, add trailing digit, check for match.
            txtHash = (txtHash + q - RM * txt.charAt(i - patLength) % q) % q;
            txtHash = (txtHash*R + txt.charAt(i)) % q;

            // match
            int offset = i - patLength + 1;
            if ((patHash == txtHash) && check(txt, offset))
                return offset;
        }

        // no match
        return -1;
    }


    // a random 31-bit prime
    private static long longRandomPrime() {
        BigInteger prime = BigInteger.probablePrime(31, new Random());
        return prime.longValue();
    }
}
