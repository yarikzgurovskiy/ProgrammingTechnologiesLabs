// Generated from /home/yaroslav/IdeaProjects/ProgrammingTechnologies/Lab3/src/main/resources/Matrix.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NUMBER=2, VECTOR=3, MATRIX=4, EQUAL=5, WHITESPACE=6, LB=7, RB=8, 
		NL=9, DIVIDE=10, TRANSPOSE=11, RANK=12, DET=13;
	public static final int
		RULE_root = 0, RULE_input = 1, RULE_assignment = 2, RULE_divide = 3, RULE_det = 4, 
		RULE_rank = 5, RULE_transpose = 6, RULE_atom = 7;
	public static final String[] ruleNames = {
		"root", "input", "assignment", "divide", "det", "rank", "transpose", "atom"
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

	@Override
	public String getGrammarFileName() { return "Matrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatrixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	 
		public RootContext() { }
		public void copyFrom(RootContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RootRuleContext extends RootContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MatrixParser.EOF, 0); }
		public RootRuleContext(RootContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterRootRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitRootRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitRootRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			_localctx = new RootRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			input();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToSetVariableContext extends InputContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ToSetVariableContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterToSetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitToSetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitToSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteExpressionContext extends InputContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MatrixParser.EOF, 0); }
		public TerminalNode NL() { return getToken(MatrixParser.NL, 0); }
		public ExecuteExpressionContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitExecuteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitExecuteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ToSetVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExecuteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				divide(0);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(21);
					match(NL);
					}
				}

				setState(24);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MakeAssignmentContext extends AssignmentContext {
		public TerminalNode VAR() { return getToken(MatrixParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(MatrixParser.EQUAL, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public MakeAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			_localctx = new MakeAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
			setState(29);
			match(EQUAL);
			setState(30);
			input();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivideContext extends ParserRuleContext {
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
	 
		public DivideContext() { }
		public void copyFrom(DivideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToDetContext extends DivideContext {
		public DetContext det() {
			return getRuleContext(DetContext.class,0);
		}
		public ToDetContext(DivideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterToDet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitToDet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitToDet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MakeDivisionContext extends DivideContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(MatrixParser.DIVIDE, 0); }
		public DetContext det() {
			return getRuleContext(DetContext.class,0);
		}
		public MakeDivisionContext(DivideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		return divide(0);
	}

	private DivideContext divide(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivideContext _localctx = new DivideContext(_ctx, _parentState);
		DivideContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_divide, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToDetContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(33);
			det();
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MakeDivisionContext(new DivideContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_divide);
					setState(35);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(36);
					match(DIVIDE);
					setState(37);
					det();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DetContext extends ParserRuleContext {
		public DetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_det; }
	 
		public DetContext() { }
		public void copyFrom(DetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalcDetContext extends DetContext {
		public TerminalNode DET() { return getToken(MatrixParser.DET, 0); }
		public DetContext det() {
			return getRuleContext(DetContext.class,0);
		}
		public CalcDetContext(DetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterCalcDet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitCalcDet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitCalcDet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToRankContext extends DetContext {
		public RankContext rank() {
			return getRuleContext(RankContext.class,0);
		}
		public ToRankContext(DetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterToRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitToRank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitToRank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DetContext det() throws RecognitionException {
		DetContext _localctx = new DetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_det);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DET:
				_localctx = new CalcDetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(DET);
				setState(44);
				det();
				}
				break;
			case VAR:
			case NUMBER:
			case MATRIX:
			case LB:
			case RANK:
				_localctx = new ToRankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				rank();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankContext extends ParserRuleContext {
		public RankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank; }
	 
		public RankContext() { }
		public void copyFrom(RankContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalcRankContext extends RankContext {
		public TerminalNode RANK() { return getToken(MatrixParser.RANK, 0); }
		public RankContext rank() {
			return getRuleContext(RankContext.class,0);
		}
		public CalcRankContext(RankContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterCalcRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitCalcRank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitCalcRank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToTransposeContext extends RankContext {
		public TransposeContext transpose() {
			return getRuleContext(TransposeContext.class,0);
		}
		public ToTransposeContext(RankContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterToTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitToTranspose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitToTranspose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankContext rank() throws RecognitionException {
		RankContext _localctx = new RankContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rank);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANK:
				_localctx = new CalcRankContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(RANK);
				setState(49);
				rank();
				}
				break;
			case VAR:
			case NUMBER:
			case MATRIX:
			case LB:
				_localctx = new ToTransposeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				transpose(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransposeContext extends ParserRuleContext {
		public TransposeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transpose; }
	 
		public TransposeContext() { }
		public void copyFrom(TransposeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MakeTransposeContext extends TransposeContext {
		public TransposeContext transpose() {
			return getRuleContext(TransposeContext.class,0);
		}
		public TerminalNode TRANSPOSE() { return getToken(MatrixParser.TRANSPOSE, 0); }
		public MakeTransposeContext(TransposeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeTranspose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeTranspose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends TransposeContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(TransposeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransposeContext transpose() throws RecognitionException {
		return transpose(0);
	}

	private TransposeContext transpose(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TransposeContext _localctx = new TransposeContext(_ctx, _parentState);
		TransposeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_transpose, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(54);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MakeTransposeContext(new TransposeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_transpose);
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					match(TRANSPOSE);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MakeNumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(MatrixParser.NUMBER, 0); }
		public MakeNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MakeBracesContext extends AtomContext {
		public TerminalNode LB() { return getToken(MatrixParser.LB, 0); }
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public TerminalNode RB() { return getToken(MatrixParser.RB, 0); }
		public MakeBracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MakeMatrixContext extends AtomContext {
		public TerminalNode MATRIX() { return getToken(MatrixParser.MATRIX, 0); }
		public MakeMatrixContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MakeVariableContext extends AtomContext {
		public TerminalNode VAR() { return getToken(MatrixParser.VAR, 0); }
		public MakeVariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).enterMakeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixListener ) ((MatrixListener)listener).exitMakeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixVisitor ) return ((MatrixVisitor<? extends T>)visitor).visitMakeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new MakeNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case MATRIX:
				_localctx = new MakeMatrixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(MATRIX);
				}
				break;
			case VAR:
				_localctx = new MakeVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(VAR);
				}
				break;
			case LB:
				_localctx = new MakeBracesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(LB);
				setState(67);
				divide(0);
				setState(68);
				match(RB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return divide_sempred((DivideContext)_localctx, predIndex);
		case 6:
			return transpose_sempred((TransposeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean divide_sempred(DivideContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean transpose_sempred(TransposeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\7\5\7\66"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tI\n\t\3\t\2\4\b\16\n\2\4\6\b\n\f\16\20\2\2\2K\2\22\3\2\2\2\4"+
		"\34\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n\60\3\2\2\2\f\65\3\2\2\2\16\67\3"+
		"\2\2\2\20H\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\35\5\6"+
		"\4\2\26\30\5\b\5\2\27\31\7\13\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3"+
		"\2\2\2\32\33\7\2\2\3\33\35\3\2\2\2\34\25\3\2\2\2\34\26\3\2\2\2\35\5\3"+
		"\2\2\2\36\37\7\3\2\2\37 \7\7\2\2 !\5\4\3\2!\7\3\2\2\2\"#\b\5\1\2#$\5\n"+
		"\6\2$*\3\2\2\2%&\f\4\2\2&\'\7\f\2\2\')\5\n\6\2(%\3\2\2\2),\3\2\2\2*(\3"+
		"\2\2\2*+\3\2\2\2+\t\3\2\2\2,*\3\2\2\2-.\7\17\2\2.\61\5\n\6\2/\61\5\f\7"+
		"\2\60-\3\2\2\2\60/\3\2\2\2\61\13\3\2\2\2\62\63\7\16\2\2\63\66\5\f\7\2"+
		"\64\66\5\16\b\2\65\62\3\2\2\2\65\64\3\2\2\2\66\r\3\2\2\2\678\b\b\1\28"+
		"9\5\20\t\29>\3\2\2\2:;\f\4\2\2;=\7\r\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\17\3\2\2\2@>\3\2\2\2AI\7\4\2\2BI\7\6\2\2CI\7\3\2\2DE\7\t\2"+
		"\2EF\5\b\5\2FG\7\n\2\2GI\3\2\2\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2"+
		"\2I\21\3\2\2\2\t\30\34*\60\65>H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}