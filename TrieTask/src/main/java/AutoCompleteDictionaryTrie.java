import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * An trie data structure that implements the Dictionary and the AutoComplete
 * ADT
 *
 */
public class AutoCompleteDictionaryTrie implements Dictionary, AutoComplete {

	private TrieNode root;
	private int size;
	private Pattern pattern = Pattern.compile("[a-z]+(([\'`])[a-z]+)?");

	public AutoCompleteDictionaryTrie() {
		size = 0;
		root = new TrieNode();
	}

	/**
	 * Insert a word into the trie.
	 */
	public boolean addWord(String word) {
	    if(!isCorrectWord(word)) return false;

        TrieNode curr = root;
        for(Character ch : word.toLowerCase().toCharArray()){
            curr = curr.getValidNextCharacters().contains(ch)
                    ? curr.getChild(ch)
                    : curr.insert(ch);
        }
        if (!curr.endsWord())
        {
            curr.setEndsWord(true);
            size++;
            return true;
        }
		return false;
	}

	private boolean isCorrectWord(String word){
        if(word == null) return false;
        word = word.toLowerCase();
        return pattern.matcher(word).matches();
    }

	/**
	 * Return the number of words in the dictionary. This is NOT necessarily the
	 * same as the number of TrieNodes in the trie.
	 */
	public int size() {
		return size;
	}

	/** Returns whether the string is a word in the trie */
	public boolean isWord(String s) {
	    TrieNode curr = root;
		for(Character ch : s.toLowerCase().toCharArray()){
            curr = curr.getChild(ch);
            if(curr == null) return false;
        }
		return curr.endsWord();
	}

	/**
	 * * Returns up to the n "best" predictions, including the word itself, in terms
	 * of length If this string is not in the trie, it returns null.
	 * 
	 * @param prefix
	 *            The text to use at the word stem
	 * @param numCompletions
	 *            The maximum number of predictions desired.
	 * @return A list containing the up to n best predictions
	 */
	public List<String> predictCompletions(String prefix, int numCompletions) {
        List<String> completions = new ArrayList<>();
        if(prefix == null || numCompletions < 0)
            return completions;

        TrieNode curr;

        if(prefix.isEmpty()) curr = root;
        else curr = findWordEnd(prefix);

        if(curr == null) return completions;

        List<TrieNode> queue = new LinkedList<>();
        ((LinkedList<TrieNode>) queue).addLast(curr);

        while(!queue.isEmpty() && numCompletions > 0){
            curr = ((LinkedList<TrieNode>) queue).removeFirst();

            if(curr.endsWord()){
                completions.add(curr.getText());
                numCompletions--;
            }
            for(Character ch : curr.getValidNextCharacters()){
                ((LinkedList<TrieNode>) queue).addLast(curr.getChild(ch));
            }
        }
		return completions;
	}

	private TrieNode findWordEnd(String word){
        TrieNode curr = root;
        for(Character ch : word.toLowerCase().toCharArray()){
            curr = curr.getChild(ch);
            if(curr == null) return null;
        }
        return curr;
    }

	// For debugging
	public void printTree() {
		printNode(root);
	}

	/** Do a pre-order traversal from this node down */
	private void printNode(TrieNode curr) {
		if (curr == null)
			return;

		System.out.println(curr.getText());

		TrieNode next;
		for (Character c : curr.getValidNextCharacters()) {
			next = curr.getChild(c);
			printNode(next);
		}
	}

}