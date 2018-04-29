/**
 * Dictionary interface, representing and old school word-lookup dictionary
 */

/**
 *
 */
public interface Dictionary {
	/**
	 * Add this word to the dictionary.
	 * 
	 * @param word
	 *            The word to add
	 * @return true if the word was added to the dictionary (it wasn't already
	 *         there).
	 */
	boolean addWord(String word);

	/** Is this a word according to this dictionary? */
	boolean isWord(String s);

	/** Return the number of words in the dictionary */
	int size();

}
