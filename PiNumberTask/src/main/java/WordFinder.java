import java.util.HashMap;
import java.util.Map;

public class WordFinder {
	/**
	 * Given a String (the haystack) and an array of Strings (the needles),
	 * return a Map<String, Integer>, where keys in the map correspond to
	 * elements of needles that were found as substrings of haystack, and the
	 * value for each key is the lowest index of haystack at which that needle
	 * was found. A needle that was not found in the haystack should not be
	 * returned in the output map.
	 * 
	 * @param haystack
	 *            The string to search into.
	 * @param needles
	 *            The array of strings to search for. This array is not mutated.
	 * @return The list of needles that were found in the haystack.
	 */
	public static Map<String, Integer> findWords(String haystack,
			String[] needles) {
		Map<String, Integer> output = new HashMap<String, Integer>();
		if(haystack == null || needles == null) return output;

		for(String needle : needles){
		    RabinKarp rk = new RabinKarp(needle);
		    int idx = rk.search(haystack);
            if (idx > -1) {
                output.put(needle, idx);
            }
        }
		return output;
	}
}
