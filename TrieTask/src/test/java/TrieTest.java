import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TrieTest {

	private AutoCompleteDictionaryTrie ac;

	@BeforeEach
	void init() {
		ac = new AutoCompleteDictionaryTrie();
	}

	@Test
	void testAddWords() {
		// Adding first word to dictionary...
		assertEquals(0, ac.size());
		assertTrue(ac.addWord("dog"));
		assertEquals(1, ac.size());

		// Adding two more words and testing size...
		assertTrue(ac.addWord("downhill"));
		assertTrue(ac.addWord("downhiller"));

		assertEquals(3, ac.size());

		assertTrue(ac.addWord("doge"));
		assertTrue(ac.addWord("dogg"));
		assertTrue(ac.addWord("dawg"));
		assertTrue(ac.addWord("dage"));
		assertTrue(ac.addWord("doggo"));
		assertTrue(ac.addWord("doggie"));
		assertTrue(ac.addWord("doggos"));
		assertTrue(ac.addWord("doggoes"));
		assertTrue(ac.addWord("doggies"));
		assertTrue(ac.addWord("test"));
		assertTrue(ac.addWord("tester"));
		assertTrue(ac.addWord("testing"));
		assertTrue(ac.addWord("tested"));
		assertTrue(ac.addWord("testin"));
		assertTrue(ac.addWord("teston"));
		assertTrue(ac.addWord("testone"));
		assertTrue(ac.addWord("testine"));
		assertTrue(ac.addWord("testell"));
		assertTrue(ac.addWord("testcase"));
		assertTrue(ac.addWord("testbase"));
		assertTrue(ac.addWord("testcases"));

		assertEquals(24, ac.size());

		// Adding duplicate word
		assertFalse(ac.addWord("dog"));
		// Checking size after try to add duplicate word...
		assertEquals(24, ac.size());

	}

	@Test
	void testAddWordsInvalid() {
		// upper-case symbols
		assertEquals(0, ac.size());
		assertFalse(ac.addWord(""));
		assertFalse(ac.addWord(" test"));
		assertFalse(ac.addWord(null));
		assertFalse(ac.addWord("dogE"));
		assertFalse(ac.addWord("downhill2"));
		assertFalse(ac.addWord("%ownhiller"));
		assertFalse(ac.addWord("down hiller"));
		assertEquals(0, ac.size());

	}

	@Test
	void testPredictCompletions(){
        testAddWords();

        String[] expectedFirst = {
                "dog", "doge", "dogg", "doggo", "doggie", "doggos", "doggies", "doggoes"
        };
        String[] expectedSecond = {
                "doggo", "doggos","doggoes"
        };
        assertLinesMatch(Arrays.asList(expectedFirst), ac.predictCompletions("dog", 20));
        assertLinesMatch(Arrays.asList(expectedSecond), ac.predictCompletions("doggo", 100));

	}

    @Test
    void testInvalidPredictCompletions(){
	    testAddWords();
        assertEquals(0, ac.predictCompletions("qweqwe", 12).size());
        assertNull(ac.predictCompletions("dog", -1));
    }
}
