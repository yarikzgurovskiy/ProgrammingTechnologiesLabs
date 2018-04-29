import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlphabetGenerator {
	/**
	 * Given a numeric base, return a char[] that maps every digit that is
	 * representable in that base to a lower-case char.
	 * 
	 * This method will try to weight each character of the alphabet
	 * proportional to their occurrence in words in a training set.
	 * 
	 * The letters should occur in lexicographically ascending order in the
	 * returned array. - {"a", "b", "c", "c", "d"} is a valid output. - {"b",
	 * "c", "c", "d", "a"} is not.
	 * 
	 * If base >= 0, the returned array should have length equal to the size of
	 * the base.
	 * 
	 * If base < 0, return null.
	 * 
	 * If a String of trainingData has any characters outside the range a-z,
	 * ignore those characters and continue.
	 * 
	 * @param base
	 *            A numeric base to get an alphabet for.
	 * @param trainingData
	 *            The training data from which to generate frequency counts.
	 *            This array is not mutated.
	 * @return A char[] that maps every digit of the base to a char that the
	 *         digit should be translated into.
	 */
	public static char[] generateFrequencyAlphabet(int base,
			String[] trainingData) {
		if(base < 0) return null;

        Map<Character, Integer> occurrences = occurrences(trainingData);
        Character[] keys = occurrences.keySet().toArray(new Character[0]);
        Arrays.sort(keys);
        // Truncate if the letters are more than the base
        if (base < keys.length) keys = Arrays.copyOf(keys, base);

        int total = 0;
        for (char ch : keys) total += occurrences.get(ch);

        Map<Character, Float> cumProbs = new HashMap<>();
        float prior = 0f;
        for (char i : keys) {
            float prob = occurrences.get(i) / (float)total;
            cumProbs.put(i, prob + prior);
            prior += prob;
        }

        // Fill in the output array
        char[] res = new char[base];
        int j = 0;
        for (char i : keys) {
            int limit = (int)Math.ceil(cumProbs.get(i) * base);
            while ((j < limit) && (j < base)) {
                res[j] = i;
                j++;
            }
        }
        return res;
	}

	private static Map<Character, Integer> occurrences(String[] trainingData){
        Map<Character, Integer> charMap = new HashMap<>();

        // Generate a map of characters with counts as values
        for(String s : trainingData){
            char[] charArray = s.toCharArray();
            for(Character character : charArray){
                if (Character.isLetter(character)) {
                    char lowerChar = Character.toLowerCase(character);
                    if (charMap.containsKey(lowerChar)) {
                        charMap.put(lowerChar, charMap.get(lowerChar) + 1);
                    } else {
                        charMap.put(lowerChar, 1);
                    }
                }
            }
        }
        return charMap;
    }
}
