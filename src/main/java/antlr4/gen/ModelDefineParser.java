// Generated from D:/products/model2Vue/src/main/java/antlr4\ModelDefine.g4 by ANTLR 4.7
package antlr4.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelDefineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, DATE=3, CONSKEYWORD=4, VALIDATOR=5, CONSTRAINTKEY=6, 
		CONSTRAINTVALUE=7, ABSTRACT=8, ASSERT=9, BOOLEAN=10, BREAK=11, BYTE=12, 
		CASE=13, CATCH=14, CHAR=15, CLASS=16, CONST=17, CONTINUE=18, DEFAULT=19, 
		DO=20, DOUBLE=21, ELSE=22, ENUM=23, EXTENDS=24, FINAL=25, FINALLY=26, 
		FLOAT=27, FOR=28, IF=29, GOTO=30, IMPLEMENTS=31, IMPORT=32, INSTANCEOF=33, 
		INT=34, INTERFACE=35, LONG=36, NATIVE=37, NEW=38, PACKAGE=39, PRIVATE=40, 
		PROTECTED=41, PUBLIC=42, RETURN=43, SHORT=44, STATIC=45, STRICTFP=46, 
		SUPER=47, SWITCH=48, SYNCHRONIZED=49, THIS=50, THROW=51, THROWS=52, TRANSIENT=53, 
		TRY=54, VOID=55, VOLATILE=56, WHILE=57, DECIMAL_LITERAL=58, HEX_LITERAL=59, 
		OCT_LITERAL=60, BINARY_LITERAL=61, FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, 
		BOOL_LITERAL=64, CHAR_LITERAL=65, STRING_LITERAL=66, NULL_LITERAL=67, 
		LPAREN=68, RPAREN=69, LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, 
		COMMA=75, DOT=76, ASSIGN=77, GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, 
		COLON=83, EQUAL=84, LE=85, GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, 
		DEC=91, ADD=92, SUB=93, MUL=94, DIV=95, BITAND=96, BITOR=97, CARET=98, 
		MOD=99, ADD_ASSIGN=100, SUB_ASSIGN=101, MUL_ASSIGN=102, DIV_ASSIGN=103, 
		AND_ASSIGN=104, OR_ASSIGN=105, XOR_ASSIGN=106, MOD_ASSIGN=107, LSHIFT_ASSIGN=108, 
		RSHIFT_ASSIGN=109, URSHIFT_ASSIGN=110, ARROW=111, COLONCOLON=112, AT=113, 
		ELLIPSIS=114, WS=115, COMMENT=116, LINE_COMMENT=117, IDENTIFIER=118;
	public static final int
		RULE_modelDeclaration = 0, RULE_modelBody = 1, RULE_modelBodyDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_typeType = 4, RULE_modelType = 5, RULE_primitiveType = 6, 
		RULE_fieldDeclaratorId = 7, RULE_constraintDeclaration = 8, RULE_constraintBody = 9, 
		RULE_constraintBodyDeclaration = 10, RULE_constaintFiledId = 11, RULE_constraintDeclare = 12, 
		RULE_validatorDeclare = 13, RULE_validatorMethods = 14;
	public static final String[] ruleNames = {
		"modelDeclaration", "modelBody", "modelBodyDeclaration", "fieldDeclaration", 
		"typeType", "modelType", "primitiveType", "fieldDeclaratorId", "constraintDeclaration", 
		"constraintBody", "constraintBodyDeclaration", "constaintFiledId", "constraintDeclare", 
		"validatorDeclare", "validatorMethods"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'number'", "'dataTime'", "'constraints'", "'validator'", 
		null, null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", "'->'", "'::'", "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "DATE", "CONSKEYWORD", "VALIDATOR", "CONSTRAINTKEY", 
		"CONSTRAINTVALUE", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", 
		"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
		"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
		"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "ModelDefine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelDefineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ModelBodyContext modelBody() {
			return getRuleContext(ModelBodyContext.class,0);
		}
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelDeclaration(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(IDENTIFIER);
			setState(31);
			modelBody();
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

	public static class ModelBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ModelDefineParser.LBRACE, 0); }
		public ModelBodyDeclarationContext modelBodyDeclaration() {
			return getRuleContext(ModelBodyDeclarationContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ModelDefineParser.RBRACE, 0); }
		public ModelBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelBody(this);
		}
	}

	public final ModelBodyContext modelBody() throws RecognitionException {
		ModelBodyContext _localctx = new ModelBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LBRACE);
			setState(34);
			modelBodyDeclaration();
			setState(35);
			match(RBRACE);
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

	public static class ModelBodyDeclarationContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<ConstraintDeclarationContext> constraintDeclaration() {
			return getRuleContexts(ConstraintDeclarationContext.class);
		}
		public ConstraintDeclarationContext constraintDeclaration(int i) {
			return getRuleContext(ConstraintDeclarationContext.class,i);
		}
		public ModelBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelBodyDeclaration(this);
		}
	}

	public final ModelBodyDeclarationContext modelBodyDeclaration() throws RecognitionException {
		ModelBodyDeclarationContext _localctx = new ModelBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DATE) | (1L << BOOLEAN))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(37);
				fieldDeclaration();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSKEYWORD) {
				{
				{
				setState(43);
				constraintDeclaration();
				}
				}
				setState(48);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public FieldDeclaratorIdContext fieldDeclaratorId() {
			return getRuleContext(FieldDeclaratorIdContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			typeType();
			setState(50);
			fieldDeclaratorId();
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ModelTypeContext modelType() {
			return getRuleContext(ModelTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case DATE:
			case BOOLEAN:
				{
				setState(52);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				{
				setState(53);
				modelType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(56);
				match(LBRACK);
				setState(57);
				match(RBRACK);
				}
				}
				setState(62);
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

	public static class ModelTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ModelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelType(this);
		}
	}

	public final ModelTypeContext modelType() throws RecognitionException {
		ModelTypeContext _localctx = new ModelTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENTIFIER);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ModelDefineParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(ModelDefineParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ModelDefineParser.NUMBER, 0); }
		public TerminalNode DATE() { return getToken(ModelDefineParser.DATE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DATE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FieldDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public FieldDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterFieldDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitFieldDeclaratorId(this);
		}
	}

	public final FieldDeclaratorIdContext fieldDeclaratorId() throws RecognitionException {
		FieldDeclaratorIdContext _localctx = new FieldDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IDENTIFIER);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(68);
				match(LBRACK);
				setState(69);
				match(RBRACK);
				}
				}
				setState(74);
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

	public static class ConstraintDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSKEYWORD() { return getToken(ModelDefineParser.CONSKEYWORD, 0); }
		public ConstraintBodyContext constraintBody() {
			return getRuleContext(ConstraintBodyContext.class,0);
		}
		public ConstraintDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintDeclaration(this);
		}
	}

	public final ConstraintDeclarationContext constraintDeclaration() throws RecognitionException {
		ConstraintDeclarationContext _localctx = new ConstraintDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraintDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CONSKEYWORD);
			setState(76);
			constraintBody();
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

	public static class ConstraintBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ModelDefineParser.LBRACE, 0); }
		public ConstraintBodyDeclarationContext constraintBodyDeclaration() {
			return getRuleContext(ConstraintBodyDeclarationContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ModelDefineParser.RBRACE, 0); }
		public ConstraintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintBody(this);
		}
	}

	public final ConstraintBodyContext constraintBody() throws RecognitionException {
		ConstraintBodyContext _localctx = new ConstraintBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constraintBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LBRACE);
			setState(79);
			constraintBodyDeclaration();
			setState(80);
			match(RBRACE);
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

	public static class ConstraintBodyDeclarationContext extends ParserRuleContext {
		public ConstaintFiledIdContext constaintFiledId() {
			return getRuleContext(ConstaintFiledIdContext.class,0);
		}
		public ValidatorDeclareContext validatorDeclare() {
			return getRuleContext(ValidatorDeclareContext.class,0);
		}
		public List<ConstraintDeclareContext> constraintDeclare() {
			return getRuleContexts(ConstraintDeclareContext.class);
		}
		public ConstraintDeclareContext constraintDeclare(int i) {
			return getRuleContext(ConstraintDeclareContext.class,i);
		}
		public ConstraintBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintBodyDeclaration(this);
		}
	}

	public final ConstraintBodyDeclarationContext constraintBodyDeclaration() throws RecognitionException {
		ConstraintBodyDeclarationContext _localctx = new ConstraintBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraintBodyDeclaration);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				constaintFiledId();
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					constraintDeclare(0);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONSTRAINTKEY );
				{
				setState(89);
				validatorDeclare();
				}
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

	public static class ConstaintFiledIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ConstaintFiledIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constaintFiledId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstaintFiledId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstaintFiledId(this);
		}
	}

	public final ConstaintFiledIdContext constaintFiledId() throws RecognitionException {
		ConstaintFiledIdContext _localctx = new ConstaintFiledIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constaintFiledId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(94);
				match(LBRACK);
				setState(95);
				match(RBRACK);
				}
				}
				setState(100);
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

	public static class ConstraintDeclareContext extends ParserRuleContext {
		public TerminalNode CONSTRAINTKEY() { return getToken(ModelDefineParser.CONSTRAINTKEY, 0); }
		public TerminalNode CONSTRAINTVALUE() { return getToken(ModelDefineParser.CONSTRAINTVALUE, 0); }
		public List<ConstraintDeclareContext> constraintDeclare() {
			return getRuleContexts(ConstraintDeclareContext.class);
		}
		public ConstraintDeclareContext constraintDeclare(int i) {
			return getRuleContext(ConstraintDeclareContext.class,i);
		}
		public ConstraintDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintDeclare(this);
		}
	}

	public final ConstraintDeclareContext constraintDeclare() throws RecognitionException {
		return constraintDeclare(0);
	}

	private ConstraintDeclareContext constraintDeclare(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstraintDeclareContext _localctx = new ConstraintDeclareContext(_ctx, _parentState);
		ConstraintDeclareContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_constraintDeclare, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(CONSTRAINTKEY);
			setState(103);
			match(COLON);
			setState(104);
			match(CONSTRAINTVALUE);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstraintDeclareContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constraintDeclare);
					setState(106);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(107);
					match(COMMA);
					setState(108);
					constraintDeclare(2);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ValidatorDeclareContext extends ParserRuleContext {
		public TerminalNode VALIDATOR() { return getToken(ModelDefineParser.VALIDATOR, 0); }
		public ValidatorMethodsContext validatorMethods() {
			return getRuleContext(ValidatorMethodsContext.class,0);
		}
		public ValidatorDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validatorDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterValidatorDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitValidatorDeclare(this);
		}
	}

	public final ValidatorDeclareContext validatorDeclare() throws RecognitionException {
		ValidatorDeclareContext _localctx = new ValidatorDeclareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_validatorDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(VALIDATOR);
			setState(115);
			match(COLON);
			setState(116);
			validatorMethods();
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

	public static class ValidatorMethodsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ModelDefineParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ModelDefineParser.IDENTIFIER, i);
		}
		public ValidatorMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validatorMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterValidatorMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitValidatorMethods(this);
		}
	}

	public final ValidatorMethodsContext validatorMethods() throws RecognitionException {
		ValidatorMethodsContext _localctx = new ValidatorMethodsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_validatorMethods);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(LBRACK);
				setState(120);
				match(IDENTIFIER);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					match(IDENTIFIER);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(RBRACK);
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
		case 12:
			return constraintDeclare_sempred((ConstraintDeclareContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constraintDeclare_sempred(ConstraintDeclareContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u0086\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\5"+
		"\3\5\3\5\3\6\3\6\5\69\n\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\7\tI\n\t\f\t\16\tL\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\6\fX\n\f\r\f\16\fY\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\7\rc\n"+
		"\r\f\r\16\rf\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16p\n\16\f"+
		"\16\16\16s\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20~\n"+
		"\20\f\20\16\20\u0081\13\20\3\20\5\20\u0084\n\20\3\20\2\3\32\21\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2\3\5\f\f\2\u0081\2 \3\2\2\2\4#"+
		"\3\2\2\2\6*\3\2\2\2\b\63\3\2\2\2\n8\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2\20"+
		"E\3\2\2\2\22M\3\2\2\2\24P\3\2\2\2\26]\3\2\2\2\30_\3\2\2\2\32g\3\2\2\2"+
		"\34t\3\2\2\2\36\u0083\3\2\2\2 !\7x\2\2!\"\5\4\3\2\"\3\3\2\2\2#$\7H\2\2"+
		"$%\5\6\4\2%&\7I\2\2&\5\3\2\2\2\')\5\b\5\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+\60\3\2\2\2,*\3\2\2\2-/\5\22\n\2.-\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2\2\62\60\3\2\2\2\63\64\5\n\6\2\64\65"+
		"\5\20\t\2\65\t\3\2\2\2\669\5\16\b\2\679\5\f\7\28\66\3\2\2\28\67\3\2\2"+
		"\29>\3\2\2\2:;\7J\2\2;=\7K\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\13\3\2\2\2@>\3\2\2\2AB\7x\2\2B\r\3\2\2\2CD\t\2\2\2D\17\3\2\2\2EJ\7x"+
		"\2\2FG\7J\2\2GI\7K\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\21\3\2"+
		"\2\2LJ\3\2\2\2MN\7\6\2\2NO\5\24\13\2O\23\3\2\2\2PQ\7H\2\2QR\5\26\f\2R"+
		"S\7I\2\2S\25\3\2\2\2T^\3\2\2\2UW\5\30\r\2VX\5\32\16\2WV\3\2\2\2XY\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\34\17\2\\^\3\2\2\2]T\3\2\2\2]"+
		"U\3\2\2\2^\27\3\2\2\2_d\7x\2\2`a\7J\2\2ac\7K\2\2b`\3\2\2\2cf\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2e\31\3\2\2\2fd\3\2\2\2gh\b\16\1\2hi\7\b\2\2ij\7U\2"+
		"\2jk\7\t\2\2kq\3\2\2\2lm\f\3\2\2mn\7M\2\2np\5\32\16\4ol\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2r\33\3\2\2\2sq\3\2\2\2tu\7\7\2\2uv\7U\2\2vw\5"+
		"\36\20\2w\35\3\2\2\2x\u0084\7x\2\2yz\7J\2\2z\177\7x\2\2{|\7M\2\2|~\7x"+
		"\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7K\2\2\u0083x\3\2\2\2\u0083y\3"+
		"\2\2\2\u0084\37\3\2\2\2\r*\608>JY]dq\177\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}