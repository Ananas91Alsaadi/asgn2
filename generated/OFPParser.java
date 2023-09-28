// Generated from c:\Users\Anas_\OneDrive\school\ST\CT\A2\OFP.g4 by ANTLR 4.9.2
 
    package generated; 
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OFPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, PLUS=26, MINUS=27, MULT=28, DIV=29, SMALL=30, BIGGER=31, EQUAL=32, 
		INT=33, FLOAT=34, STR=35, CHAR=36, SYM=37, OPR=38, COMMENT=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_method = 2, RULE_block = 3, RULE_parameterList = 4, 
		RULE_parameter = 5, RULE_type = 6, RULE_arrType = 7, RULE_expr = 8, RULE_methodAccess = 9, 
		RULE_arrayList = 10, RULE_varType = 11, RULE_stmt = 12, RULE_asgnStmt = 13, 
		RULE_declaration = 14, RULE_array = 15, RULE_ifStmt = 16, RULE_condition = 17, 
		RULE_elseStmt = 18, RULE_whileStmt = 19, RULE_print = 20, RULE_returnStmt = 21, 
		RULE_methodCall = 22, RULE_localDecl = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "method", "block", "parameterList", "parameter", "type", 
			"arrType", "expr", "methodAccess", "arrayList", "varType", "stmt", "asgnStmt", 
			"declaration", "array", "ifStmt", "condition", "elseStmt", "whileStmt", 
			"print", "returnStmt", "methodCall", "localDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"'int'", "'float'", "'string'", "'char'", "'bool'", "'new'", "'.length'", 
			"'='", "';'", "'if'", "'else'", "'while'", "'println'", "'print'", "'return'", 
			null, "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "PLUS", "MINUS", "MULT", "DIV", "SMALL", "BIGGER", "EQUAL", 
			"INT", "FLOAT", "STR", "CHAR", "SYM", "OPR", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "OFP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OFPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					method();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			main();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(55);
				method();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MainContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(T__1);
			setState(63);
			match(T__2);
			setState(64);
			match(T__3);
			setState(65);
			block();
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__0);
				setState(68);
				match(ID);
				setState(69);
				match(T__2);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(70);
					parameterList();
					}
				}

				setState(73);
				match(T__3);
				setState(74);
				block();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				type();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(76);
					match(T__4);
					setState(77);
					match(T__5);
					}
				}

				setState(80);
				match(ID);
				setState(81);
				match(T__2);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(82);
					parameterList();
					}
				}

				setState(85);
				match(T__3);
				setState(86);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				stmt();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__7);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			parameter();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(100);
				match(T__8);
				setState(101);
				parameter();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__9);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(111);
					arrType();
					}
					break;
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__10);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(115);
					arrType();
					}
					break;
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__11);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(119);
					arrType();
					}
					break;
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__12);
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(123);
					arrType();
					}
					break;
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__13);
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

	public static class ArrTypeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public ArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterArrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitArrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrTypeContext arrType() throws RecognitionException {
		ArrTypeContext _localctx = new ArrTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(129);
				match(ID);
				}
			}

			setState(132);
			match(T__4);
			setState(133);
			expr(0);
			setState(134);
			match(T__5);
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

	public static class ExprContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public MethodAccessContext methodAccess() {
			return getRuleContext(MethodAccessContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(OFPParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OFPParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(OFPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OFPParser.MINUS, 0); }
		public TerminalNode SMALL() { return getToken(OFPParser.SMALL, 0); }
		public TerminalNode BIGGER() { return getToken(OFPParser.BIGGER, 0); }
		public TerminalNode EQUAL() { return getToken(OFPParser.EQUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(137);
				match(T__14);
				setState(138);
				type();
				}
				break;
			case 3:
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__15);
				}
				break;
			case 4:
				{
				setState(141);
				methodAccess();
				}
				break;
			case 5:
				{
				setState(142);
				varType();
				}
				break;
			case 6:
				{
				setState(143);
				arrayList();
				}
				break;
			case 7:
				{
				setState(144);
				arrType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(148);
						match(MULT);
						setState(149);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(151);
						match(DIV);
						setState(152);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(154);
						match(PLUS);
						setState(155);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(157);
						match(MINUS);
						setState(158);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(160);
						match(SMALL);
						setState(161);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(163);
						match(BIGGER);
						setState(164);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(166);
						match(EQUAL);
						setState(167);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class MethodAccessContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public MethodAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterMethodAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitMethodAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitMethodAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodAccessContext methodAccess() throws RecognitionException {
		MethodAccessContext _localctx = new MethodAccessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(173);
				match(ID);
				}
			}

			setState(176);
			match(T__2);
			setState(177);
			expr(0);
			setState(178);
			match(T__3);
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

	public static class ArrayListContext extends ParserRuleContext {
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitArrayList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			varType();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(T__8);
					setState(182);
					varType();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public TerminalNode INT() { return getToken(OFPParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(OFPParser.MINUS, 0); }
		public TerminalNode FLOAT() { return getToken(OFPParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(OFPParser.STR, 0); }
		public TerminalNode CHAR() { return getToken(OFPParser.CHAR, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varType);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(189);
					match(MINUS);
					}
				}

				setState(192);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(193);
					match(MINUS);
					}
				}

				setState(196);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(STR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(CHAR);
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

	public static class StmtContext extends ParserRuleContext {
		public AsgnStmtContext asgnStmt() {
			return getRuleContext(AsgnStmtContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				asgnStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				returnStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				localDecl();
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

	public static class AsgnStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public AsgnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterAsgnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitAsgnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitAsgnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsgnStmtContext asgnStmt() throws RecognitionException {
		AsgnStmtContext _localctx = new AsgnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asgnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==ID) {
				{
				setState(212);
				arrType();
				}
			}

			setState(215);
			match(T__16);
			setState(216);
			expr(0);
			setState(217);
			match(T__17);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ArrTypeContext> arrType() {
			return getRuleContexts(ArrTypeContext.class);
		}
		public ArrTypeContext arrType(int i) {
			return getRuleContext(ArrTypeContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			type();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(220);
				arrType();
				}
				break;
			}
			setState(223);
			match(ID);
			setState(224);
			match(T__16);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(225);
				expr(0);
				}
				break;
			case 2:
				{
				setState(226);
				arrType();
				}
				break;
			case 3:
				{
				setState(227);
				array();
				}
				break;
			}
			setState(230);
			match(T__17);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ArrayListContext> arrayList() {
			return getRuleContexts(ArrayListContext.class);
		}
		public ArrayListContext arrayList(int i) {
			return getRuleContext(ArrayListContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__6);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				arrayList();
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << MINUS) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << CHAR))) != 0) );
			setState(238);
			match(T__7);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__18);
			setState(241);
			match(T__2);
			setState(242);
			condition();
			setState(243);
			match(T__3);
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__18:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case ID:
				{
				setState(244);
				stmt();
				}
				break;
			case T__6:
				{
				setState(245);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(248);
				elseStmt();
				}
				break;
			}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPR() { return getToken(OFPParser.OPR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(251);
				expr(0);
				setState(252);
				match(OPR);
				setState(253);
				expr(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				expr(0);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258);
			match(T__19);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__18:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case ID:
				{
				setState(259);
				stmt();
				}
				break;
			case T__6:
				{
				setState(260);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__20);
			setState(264);
			match(T__2);
			setState(265);
			condition();
			setState(266);
			match(T__3);
			setState(267);
			match(T__6);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				stmt();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0) );
			setState(273);
			match(T__7);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public TerminalNode STR() { return getToken(OFPParser.STR, 0); }
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
			match(T__2);
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(277);
				match(ID);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==ID) {
					{
					setState(278);
					arrType();
					}
				}

				}
				break;
			case STR:
				{
				setState(281);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(284);
			match(T__3);
			setState(285);
			match(T__17);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__23);
			setState(288);
			expr(0);
			setState(289);
			match(T__17);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ID);
			setState(292);
			match(T__2);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << MINUS) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << CHAR))) != 0)) {
				{
				{
				setState(293);
				varType();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(T__3);
			setState(300);
			match(T__17);
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

	public static class LocalDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OFPParser.ID, 0); }
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OFPListener ) ((OFPListener)listener).exitLocalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OFPVisitor ) return ((OFPVisitor<? extends T>)visitor).visitLocalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_localDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			type();
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(303);
				arrType();
				}
				break;
			}
			setState(306);
			match(ID);
			setState(307);
			match(T__17);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n"+
		"\4\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\7\5_\n\5\f\5\16\5"+
		"b\13\5\3\5\3\5\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\3\b\3\b"+
		"\5\bs\n\b\3\b\3\b\5\bw\n\b\3\b\3\b\5\b{\n\b\3\b\3\b\5\b\177\n\b\3\b\5"+
		"\b\u0082\n\b\3\t\5\t\u0085\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0094\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae"+
		"\13\n\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00ba\n"+
		"\f\f\f\16\f\u00bd\13\f\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\5\r\u00c5\n\r\3\r"+
		"\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d4"+
		"\n\16\3\17\3\17\5\17\u00d8\n\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00e0"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\20\3\20\3\21\3\21\6\21"+
		"\u00ed\n\21\r\21\16\21\u00ee\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00f9\n\22\3\22\5\22\u00fc\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0103"+
		"\n\23\3\24\3\24\3\24\5\24\u0108\n\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25"+
		"\u0110\n\25\r\25\16\25\u0111\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u011a"+
		"\n\26\3\26\5\26\u011d\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\7\30\u0129\n\30\f\30\16\30\u012c\13\30\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u0133\n\31\3\31\3\31\3\31\3\31\2\3\22\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\30\31\2\u015a\2\65\3\2\2\2\4?\3\2"+
		"\2\2\6Z\3\2\2\2\b\\\3\2\2\2\ne\3\2\2\2\fm\3\2\2\2\16\u0081\3\2\2\2\20"+
		"\u0084\3\2\2\2\22\u0093\3\2\2\2\24\u00b0\3\2\2\2\26\u00b6\3\2\2\2\30\u00c9"+
		"\3\2\2\2\32\u00d3\3\2\2\2\34\u00d5\3\2\2\2\36\u00dd\3\2\2\2 \u00ea\3\2"+
		"\2\2\"\u00f2\3\2\2\2$\u0102\3\2\2\2&\u0104\3\2\2\2(\u0109\3\2\2\2*\u0115"+
		"\3\2\2\2,\u0121\3\2\2\2.\u0125\3\2\2\2\60\u0130\3\2\2\2\62\64\5\6\4\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"\65\3\2\2\28<\5\4\3\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2"+
		"\2=\3\3\2\2\2><\3\2\2\2?@\7\3\2\2@A\7\4\2\2AB\7\5\2\2BC\7\6\2\2CD\5\b"+
		"\5\2D\5\3\2\2\2EF\7\3\2\2FG\7\33\2\2GI\7\5\2\2HJ\5\n\6\2IH\3\2\2\2IJ\3"+
		"\2\2\2JK\3\2\2\2KL\7\6\2\2L[\5\b\5\2MP\5\16\b\2NO\7\7\2\2OQ\7\b\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\33\2\2SU\7\5\2\2TV\5\n\6\2UT\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\7\6\2\2XY\5\b\5\2Y[\3\2\2\2ZE\3\2\2\2ZM\3\2\2\2"+
		"[\7\3\2\2\2\\`\7\t\2\2]_\5\32\16\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ac\3\2\2\2b`\3\2\2\2cd\7\n\2\2d\t\3\2\2\2ej\5\f\7\2fg\7\13\2\2gi\5"+
		"\f\7\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2m"+
		"n\5\16\b\2no\7\33\2\2o\r\3\2\2\2pr\7\f\2\2qs\5\20\t\2rq\3\2\2\2rs\3\2"+
		"\2\2s\u0082\3\2\2\2tv\7\r\2\2uw\5\20\t\2vu\3\2\2\2vw\3\2\2\2w\u0082\3"+
		"\2\2\2xz\7\16\2\2y{\5\20\t\2zy\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7\17"+
		"\2\2}\177\5\20\t\2~}\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080\u0082"+
		"\7\20\2\2\u0081p\3\2\2\2\u0081t\3\2\2\2\u0081x\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083\u0085\7\33\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\7\2\2\u0087"+
		"\u0088\5\22\n\2\u0088\u0089\7\b\2\2\u0089\21\3\2\2\2\u008a\u0094\b\n\1"+
		"\2\u008b\u008c\7\21\2\2\u008c\u0094\5\16\b\2\u008d\u008e\7\33\2\2\u008e"+
		"\u0094\7\22\2\2\u008f\u0094\5\24\13\2\u0090\u0094\5\30\r\2\u0091\u0094"+
		"\5\26\f\2\u0092\u0094\5\20\t\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2"+
		"\u0093\u008d\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u00ac\3\2\2\2\u0095\u0096\f\17\2\2"+
		"\u0096\u0097\7\36\2\2\u0097\u00ab\5\22\n\20\u0098\u0099\f\16\2\2\u0099"+
		"\u009a\7\37\2\2\u009a\u00ab\5\22\n\17\u009b\u009c\f\r\2\2\u009c\u009d"+
		"\7\34\2\2\u009d\u00ab\5\22\n\16\u009e\u009f\f\f\2\2\u009f\u00a0\7\35\2"+
		"\2\u00a0\u00ab\5\22\n\r\u00a1\u00a2\f\13\2\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00ab\5\22\n\f\u00a4\u00a5\f\n\2\2\u00a5\u00a6\7!\2\2\u00a6\u00ab\5\22"+
		"\n\13\u00a7\u00a8\f\t\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00ab\5\22\n\n\u00aa"+
		"\u0095\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7\33\2\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\5\22"+
		"\n\2\u00b4\u00b5\7\6\2\2\u00b5\25\3\2\2\2\u00b6\u00bb\5\30\r\2\u00b7\u00b8"+
		"\7\13\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00ca\7\33\2\2\u00bf\u00c1\7\35\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00ca\7#\2\2\u00c3\u00c5"+
		"\7\35\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00ca\7$\2\2\u00c7\u00ca\7%\2\2\u00c8\u00ca\7&\2\2\u00c9\u00be"+
		"\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00d4\5\34\17\2\u00cc\u00d4\5\36"+
		"\20\2\u00cd\u00d4\5\"\22\2\u00ce\u00d4\5(\25\2\u00cf\u00d4\5*\26\2\u00d0"+
		"\u00d4\5,\27\2\u00d1\u00d4\5.\30\2\u00d2\u00d4\5\60\31\2\u00d3\u00cb\3"+
		"\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2"+
		"\2\2\u00d4\33\3\2\2\2\u00d5\u00d7\7\33\2\2\u00d6\u00d8\5\20\t\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\23"+
		"\2\2\u00da\u00db\5\22\n\2\u00db\u00dc\7\24\2\2\u00dc\35\3\2\2\2\u00dd"+
		"\u00df\5\16\b\2\u00de\u00e0\5\20\t\2\u00df\u00de\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e6\7\23\2\2\u00e3"+
		"\u00e7\5\22\n\2\u00e4\u00e7\5\20\t\2\u00e5\u00e7\5 \21\2\u00e6\u00e3\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\24\2\2\u00e9\37\3\2\2\2\u00ea\u00ec\7\t\2\2\u00eb\u00ed\5\26"+
		"\f\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1!\3\2\2\2"+
		"\u00f2\u00f3\7\25\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\5$\23\2\u00f5\u00f8"+
		"\7\6\2\2\u00f6\u00f9\5\32\16\2\u00f7\u00f9\5\b\5\2\u00f8\u00f6\3\2\2\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\5&\24\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc#\3\2\2\2\u00fd\u00fe\5\22\n\2\u00fe"+
		"\u00ff\7(\2\2\u00ff\u0100\5\22\n\2\u0100\u0103\3\2\2\2\u0101\u0103\5\22"+
		"\n\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103%\3\2\2\2\u0104\u0107"+
		"\7\26\2\2\u0105\u0108\5\32\16\2\u0106\u0108\5\b\5\2\u0107\u0105\3\2\2"+
		"\2\u0107\u0106\3\2\2\2\u0108\'\3\2\2\2\u0109\u010a\7\27\2\2\u010a\u010b"+
		"\7\5\2\2\u010b\u010c\5$\23\2\u010c\u010d\7\6\2\2\u010d\u010f\7\t\2\2\u010e"+
		"\u0110\5\32\16\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\n\2\2\u0114"+
		")\3\2\2\2\u0115\u0116\t\2\2\2\u0116\u011c\7\5\2\2\u0117\u0119\7\33\2\2"+
		"\u0118\u011a\5\20\t\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u011d\7%\2\2\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\7\6\2\2\u011f\u0120\7\24\2\2\u0120+\3\2\2\2"+
		"\u0121\u0122\7\32\2\2\u0122\u0123\5\22\n\2\u0123\u0124\7\24\2\2\u0124"+
		"-\3\2\2\2\u0125\u0126\7\33\2\2\u0126\u012a\7\5\2\2\u0127\u0129\5\30\r"+
		"\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\6\2\2\u012e"+
		"\u012f\7\24\2\2\u012f/\3\2\2\2\u0130\u0132\5\16\b\2\u0131\u0133\5\20\t"+
		"\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\7\33\2\2\u0135\u0136\7\24\2\2\u0136\61\3\2\2\2&\65<IPUZ`jrvz~\u0081\u0084"+
		"\u0093\u00aa\u00ac\u00b0\u00bb\u00c0\u00c4\u00c9\u00d3\u00d7\u00df\u00e6"+
		"\u00ee\u00f8\u00fb\u0102\u0107\u0111\u0119\u011c\u012a\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}