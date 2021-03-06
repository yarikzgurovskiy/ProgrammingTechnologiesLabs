// Generated from /home/yaroslav/IdeaProjects/ProgrammingTechnologies/Lab3/src/main/resources/Matrix.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NUMBER=2, VECTOR=3, MATRIX=4, EQUAL=5, WHITESPACE=6, LB=7, RB=8, 
		NL=9, DIVIDE=10, TRANSPOSE=11, RANK=12, DET=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "NUMBER", "VECTOR", "MATRIX", "EQUAL", "WHITESPACE", "LB", "RB", 
		"NL", "DIVIDE", "TRANSPOSE", "RANK", "DET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'='", null, "'('", "')'", "'\n'", "'/'", 
		"'^T'", "'rank'", "'det'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "NUMBER", "VECTOR", "MATRIX", "EQUAL", "WHITESPACE", "LB", 
		"RB", "NL", "DIVIDE", "TRANSPOSE", "RANK", "DET"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MatrixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Matrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\5\3!\n\3\3\3\6\3$\n\3\r\3\16"+
		"\3%\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\6\3/\n\3\r\3\16\3\60\5\3\63\n\3\3\4"+
		"\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\7\5P\n\5\f\5\16\5S\13\5"+
		"\3\5\3\5\3\6\3\6\3\7\6\7Z\n\7\r\7\16\7[\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35"+
		"\3\2\2\2\5 \3\2\2\2\7\64\3\2\2\2\tE\3\2\2\2\13V\3\2\2\2\rY\3\2\2\2\17"+
		"_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31j\3\2\2\2"+
		"\33o\3\2\2\2\35\36\t\2\2\2\36\4\3\2\2\2\37!\7/\2\2 \37\3\2\2\2 !\3\2\2"+
		"\2!\62\3\2\2\2\"$\t\3\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\63"+
		"\3\2\2\2\')\t\3\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
		",.\7\60\2\2-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\63\3\2\2\2\62#\3\2\2\2\62(\3\2\2\2\63\6\3\2\2\2\64\65\7]\2\2\65@\5"+
		"\5\3\2\66:\7.\2\2\679\5\r\7\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;=\3\2\2\2<:\3\2\2\2=?\5\5\3\2>\66\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AC\3\2\2\2B@\3\2\2\2CD\7_\2\2D\b\3\2\2\2EF\7]\2\2FQ\5\7\4\2GK\7.\2"+
		"\2HJ\5\r\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NP\5\7\4\2OG\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2"+
		"\2TU\7_\2\2U\n\3\2\2\2VW\7?\2\2W\f\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\7\2\2^\16\3\2\2\2_`\7*\2\2`\20"+
		"\3\2\2\2ab\7+\2\2b\22\3\2\2\2cd\7\f\2\2d\24\3\2\2\2ef\7\61\2\2f\26\3\2"+
		"\2\2gh\7`\2\2hi\7V\2\2i\30\3\2\2\2jk\7t\2\2kl\7c\2\2lm\7p\2\2mn\7m\2\2"+
		"n\32\3\2\2\2op\7f\2\2pq\7g\2\2qr\7v\2\2r\34\3\2\2\2\r\2 %*\60\62:@KQ["+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}