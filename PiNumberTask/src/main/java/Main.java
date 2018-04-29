import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    private static final int PI_PRECISION = 10000;
    private static final char[] ENG_ALPHABET =
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                    'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static String[] WORD_LIST;

    public static void main(String[] args) {
        System.out.println("Reading words...");
        try {
            ArrayList<String> wordsFromCSV = FileReader.ReadFile("src/main/resources/words.csv");
            int wordsCount = wordsFromCSV.size();
            WORD_LIST = new String[wordsCount];
            wordsFromCSV.toArray(WORD_LIST);
            System.out.printf("Total number of words: %d\n", wordsCount);
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("1: Calculating Pi...");
        int[] piHexDigits = PiGenerator.computePiInHex(PI_PRECISION);
        System.out.printf(
                "Digits of Pi in base-16: %s\n\n",
                truncateString(Arrays.toString(piHexDigits), 30));

        System.out.println("2: Translating Pi to base-26...");
        int[] translatedPiBase26 =
                BaseTranslator.convertBase(piHexDigits, 16, 26, PI_PRECISION);
        System.out.printf(
                "Digits of Pi in base-26: %s\n\n",
                truncateString(Arrays.toString(translatedPiBase26), 30));

        System.out.println("3: Converting Pi using basic alphabet");
        String basicConversion = DigitsToStringConverter.convert(
                translatedPiBase26, 26, ENG_ALPHABET);
        System.out.printf(
                "Digits of Pi translated into a-z: %s\n\n",
                truncateString(basicConversion, 30));

        System.out.println("4: Getting word matches");
        Map<String, Integer> basicSubstrings = WordFinder.findWords(basicConversion, WORD_LIST);
        for (Map.Entry<String, Integer> entry : basicSubstrings.entrySet()) {
            printWithContext(basicConversion, entry.getValue(),
                    entry.getKey(), 3);
        }
        System.out.printf("Word coverage using basic alphabet: %f\n\n",
                ((double)basicSubstrings.size()) / WORD_LIST.length);

        System.out.println("5: Getting word matches with base-100 and" +
                " frequency dictionary");
        int[] translatedPiBase100 = BaseTranslator.convertBase(piHexDigits, 16, 100, PI_PRECISION);
        char[] alphabet = AlphabetGenerator.generateFrequencyAlphabet(
                100, WORD_LIST);

        System.out.printf("Frequency dictionary generated: %s\n",
                truncateString(Arrays.toString(alphabet), 50));

        String frequencyConversion =
                DigitsToStringConverter.convert(
                        translatedPiBase100, 100, alphabet);
        System.out.printf(
                "Digits of Pi translated into a-z: %s\n",
                truncateString(frequencyConversion, 50));

        Map<String, Integer> frequencySubstrings =
                WordFinder.findWords(frequencyConversion, WORD_LIST);

        for (Map.Entry<String, Integer> entry : frequencySubstrings.entrySet()) {
            printWithContext(frequencyConversion, entry.getValue(), entry.getKey(), 3);
        }

        System.out.printf("Word coverage using frequency alphabet: %f\n\n",
                ((double)frequencySubstrings.size()) / WORD_LIST.length);

    }

    private static String truncateString(String input, int len) {
        return ((input.length() > len) ? input.substring(0, len) : input) +
                ((input.length() > len) ? "..." : "");
    }

    private static void printWithContext(String haystack, int offset,
                                        String needle, int numContext) {
        if (offset < 0 || offset + needle.length() > haystack.length()) {
            return;
        }

        int substringStart = Math.max(0, offset - numContext);
        int substringEnd = Math.min(haystack.length(),
                offset + needle.length() + numContext);

        System.out.printf("\tSubstring '%s' found at index %d: %s%s%s\n",
                needle, offset,
                (substringStart > 0) ? "..." : "",
                haystack.substring(substringStart, substringEnd),
                (substringEnd < haystack.length()) ? "..." : "");
    }
}
