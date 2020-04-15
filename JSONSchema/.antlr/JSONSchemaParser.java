// Generated from /home/cri98li/Scrivania/Tesi_GrammarForGenerators/JSONSchema/JSONSchema.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONSchemaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, STRINGFORREF=54, Int_JSONValue=55, JSONValue=56, NONEGATIVEINT=57, 
		INT=58, FLOAT=59, ALFABETICSTRING=60, PATTERNSTRING=61, STRING=62, BOOLEAN=63, 
		WS=64;
	public static final int
		RULE_jsonSchema = 0, RULE_keyword = 1, RULE_uniqueItems = 2, RULE_type = 3, 
		RULE_pattern = 4, RULE_required = 5, RULE_minimum = 6, RULE_maximum = 7, 
		RULE_exclusiveMinimum = 8, RULE_exclusiveMaximum = 9, RULE_minLength = 10, 
		RULE_maxLength = 11, RULE_minItems = 12, RULE_maxItems = 13, RULE_minProperties = 14, 
		RULE_maxProperties = 15, RULE_minContains = 16, RULE_maxContains = 17, 
		RULE_multipleOf = 18, RULE_js_not = 19, RULE_allOf = 20, RULE_anyOf = 21, 
		RULE_oneOf = 22, RULE_if_then_else = 23, RULE_ref = 24, RULE_items = 25, 
		RULE_additionalItems = 26, RULE_properties = 27, RULE_patternProperties = 28, 
		RULE_additionalProperties = 29, RULE_propertyNames = 30, RULE_contains = 31, 
		RULE_js_const = 32, RULE_js_enum = 33, RULE_number_JSONValue = 34, RULE_nonNegInt_JSONValue = 35, 
		RULE_types = 36;
	public static final String[] ruleNames = {
		"jsonSchema", "keyword", "uniqueItems", "type", "pattern", "required", 
		"minimum", "maximum", "exclusiveMinimum", "exclusiveMaximum", "minLength", 
		"maxLength", "minItems", "maxItems", "minProperties", "maxProperties", 
		"minContains", "maxContains", "multipleOf", "js_not", "allOf", "anyOf", 
		"oneOf", "if_then_else", "ref", "items", "additionalItems", "properties", 
		"patternProperties", "additionalProperties", "propertyNames", "contains", 
		"js_const", "js_enum", "number_JSONValue", "nonNegInt_JSONValue", "types"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{ '", "', '", "' }'", "'\"uniqueItems\": '", "'\"type\": '", "'['", 
		"']'", "'\"pattern\": '", "'\"required\": ['", "'\"minimum\": '", "', \"exclusiveMinimum\": '", 
		"'\"maximum\": '", "', \"exclusiveMaximum\": '", "'\"exclusiveMinimum\": '", 
		"'\"exclusiveMaximum\": '", "'\"minLength\": '", "'\"maxLength\": '", 
		"'\"minItems\": '", "'\"maxItems\": '", "'\"minProperties\": '", "'\"maxProperties\": '", 
		"'\"minContains\": '", "'\"maxContains\": '", "'\"multipleOf\": '", "'\"not\": '", 
		"'\"allOf\": ['", "'\"anyOf\": ['", "'\"oneOf\": ['", "'\"if\": '", "', \"then\": '", 
		"', \"else\": '", "'\"ref\": '", "'\"#/$defs/'", "'\"'", "'\"items\": '", 
		"'\"additionalItems\": '", "'\"properties\": {'", "':'", "'}'", "'\"patternProperties\": {'", 
		"'\"additionalProperties\": '", "'\"propertyNames\": '", "'\"contains\": '", 
		"'\"const\": '", "'\"enum\": ['", "'null'", "'\"object\"'", "'\"string\"'", 
		"'\"number\"'", "'\"integer\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "STRINGFORREF", "Int_JSONValue", "JSONValue", 
		"NONEGATIVEINT", "INT", "FLOAT", "ALFABETICSTRING", "PATTERNSTRING", "STRING", 
		"BOOLEAN", "WS"
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
	public String getGrammarFileName() { return "JSONSchema.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONSchemaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonSchemaContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(JSONSchemaParser.BOOLEAN, 0); }
		public JsonSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonSchema; }
	}

	public final JsonSchemaContext jsonSchema() throws RecognitionException {
		JsonSchemaContext _localctx = new JsonSchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsonSchema);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(T__0);
				setState(75);
				keyword();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(76);
					match(T__1);
					setState(77);
					keyword();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__2);
				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(BOOLEAN);
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

	public static class KeywordContext extends ParserRuleContext {
		public UniqueItemsContext uniqueItems() {
			return getRuleContext(UniqueItemsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public RequiredContext required() {
			return getRuleContext(RequiredContext.class,0);
		}
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public MaximumContext maximum() {
			return getRuleContext(MaximumContext.class,0);
		}
		public MinLengthContext minLength() {
			return getRuleContext(MinLengthContext.class,0);
		}
		public MaxLengthContext maxLength() {
			return getRuleContext(MaxLengthContext.class,0);
		}
		public MinItemsContext minItems() {
			return getRuleContext(MinItemsContext.class,0);
		}
		public MaxItemsContext maxItems() {
			return getRuleContext(MaxItemsContext.class,0);
		}
		public MinPropertiesContext minProperties() {
			return getRuleContext(MinPropertiesContext.class,0);
		}
		public MaxPropertiesContext maxProperties() {
			return getRuleContext(MaxPropertiesContext.class,0);
		}
		public MinContainsContext minContains() {
			return getRuleContext(MinContainsContext.class,0);
		}
		public MaxContainsContext maxContains() {
			return getRuleContext(MaxContainsContext.class,0);
		}
		public MultipleOfContext multipleOf() {
			return getRuleContext(MultipleOfContext.class,0);
		}
		public Js_notContext js_not() {
			return getRuleContext(Js_notContext.class,0);
		}
		public AllOfContext allOf() {
			return getRuleContext(AllOfContext.class,0);
		}
		public OneOfContext oneOf() {
			return getRuleContext(OneOfContext.class,0);
		}
		public AnyOfContext anyOf() {
			return getRuleContext(AnyOfContext.class,0);
		}
		public If_then_elseContext if_then_else() {
			return getRuleContext(If_then_elseContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public AdditionalItemsContext additionalItems() {
			return getRuleContext(AdditionalItemsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertyNamesContext propertyNames() {
			return getRuleContext(PropertyNamesContext.class,0);
		}
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public Js_enumContext js_enum() {
			return getRuleContext(Js_enumContext.class,0);
		}
		public Js_constContext js_const() {
			return getRuleContext(Js_constContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_keyword);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				uniqueItems();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				type();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				pattern();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				required();
				}
				break;
			case T__9:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				minimum();
				}
				break;
			case T__11:
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				maximum();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				minLength();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				maxLength();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				minItems();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				maxItems();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(98);
				minProperties();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(99);
				maxProperties();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(100);
				minContains();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 14);
				{
				setState(101);
				maxContains();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 15);
				{
				setState(102);
				multipleOf();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 16);
				{
				setState(103);
				js_not();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 17);
				{
				setState(104);
				allOf();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 18);
				{
				setState(105);
				oneOf();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 19);
				{
				setState(106);
				anyOf();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 20);
				{
				setState(107);
				if_then_else();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 21);
				{
				setState(108);
				ref();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 22);
				{
				setState(109);
				items();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 23);
				{
				setState(110);
				additionalItems();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 24);
				{
				setState(111);
				properties();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(112);
				propertyNames();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(113);
				contains();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 27);
				{
				setState(114);
				js_enum();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 28);
				{
				setState(115);
				js_const();
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

	public static class UniqueItemsContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JSONSchemaParser.BOOLEAN, 0); }
		public UniqueItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueItems; }
	}

	public final UniqueItemsContext uniqueItems() throws RecognitionException {
		UniqueItemsContext _localctx = new UniqueItemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_uniqueItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__3);
			setState(119);
			match(BOOLEAN);
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
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__4);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				{
				setState(122);
				types();
				}
				break;
			case T__5:
				{
				{
				setState(123);
				match(T__5);
				setState(124);
				types();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(125);
					match(T__1);
					setState(126);
					types();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(T__6);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PatternContext extends ParserRuleContext {
		public TerminalNode PATTERNSTRING() { return getToken(JSONSchemaParser.PATTERNSTRING, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__7);
			setState(137);
			match(PATTERNSTRING);
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

	public static class RequiredContext extends ParserRuleContext {
		public List<TerminalNode> ALFABETICSTRING() { return getTokens(JSONSchemaParser.ALFABETICSTRING); }
		public TerminalNode ALFABETICSTRING(int i) {
			return getToken(JSONSchemaParser.ALFABETICSTRING, i);
		}
		public RequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required; }
	}

	public final RequiredContext required() throws RecognitionException {
		RequiredContext _localctx = new RequiredContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_required);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__8);
			setState(140);
			match(ALFABETICSTRING);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(141);
				match(T__1);
				setState(142);
				match(ALFABETICSTRING);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__6);
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

	public static class MinimumContext extends ParserRuleContext {
		public Number_JSONValueContext number_JSONValue() {
			return getRuleContext(Number_JSONValueContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JSONSchemaParser.BOOLEAN, 0); }
		public ExclusiveMinimumContext exclusiveMinimum() {
			return getRuleContext(ExclusiveMinimumContext.class,0);
		}
		public MinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum; }
	}

	public final MinimumContext minimum() throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_minimum);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(150);
				match(T__9);
				setState(151);
				number_JSONValue();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(152);
					match(T__10);
					setState(153);
					match(BOOLEAN);
					}
				}

				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				exclusiveMinimum();
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

	public static class MaximumContext extends ParserRuleContext {
		public Number_JSONValueContext number_JSONValue() {
			return getRuleContext(Number_JSONValueContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JSONSchemaParser.BOOLEAN, 0); }
		public ExclusiveMaximumContext exclusiveMaximum() {
			return getRuleContext(ExclusiveMaximumContext.class,0);
		}
		public MaximumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximum; }
	}

	public final MaximumContext maximum() throws RecognitionException {
		MaximumContext _localctx = new MaximumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_maximum);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(159);
				match(T__11);
				setState(160);
				number_JSONValue();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(161);
					match(T__12);
					setState(162);
					match(BOOLEAN);
					}
				}

				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				exclusiveMaximum();
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

	public static class ExclusiveMinimumContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public ExclusiveMinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveMinimum; }
	}

	public final ExclusiveMinimumContext exclusiveMinimum() throws RecognitionException {
		ExclusiveMinimumContext _localctx = new ExclusiveMinimumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exclusiveMinimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__13);
			setState(169);
			match(NONEGATIVEINT);
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

	public static class ExclusiveMaximumContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public ExclusiveMaximumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveMaximum; }
	}

	public final ExclusiveMaximumContext exclusiveMaximum() throws RecognitionException {
		ExclusiveMaximumContext _localctx = new ExclusiveMaximumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exclusiveMaximum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			match(NONEGATIVEINT);
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

	public static class MinLengthContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MinLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minLength; }
	}

	public final MinLengthContext minLength() throws RecognitionException {
		MinLengthContext _localctx = new MinLengthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(175);
			match(NONEGATIVEINT);
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

	public static class MaxLengthContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MaxLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLength; }
	}

	public final MaxLengthContext maxLength() throws RecognitionException {
		MaxLengthContext _localctx = new MaxLengthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_maxLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__16);
			setState(178);
			match(NONEGATIVEINT);
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

	public static class MinItemsContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MinItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minItems; }
	}

	public final MinItemsContext minItems() throws RecognitionException {
		MinItemsContext _localctx = new MinItemsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_minItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__17);
			setState(181);
			match(NONEGATIVEINT);
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

	public static class MaxItemsContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MaxItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxItems; }
	}

	public final MaxItemsContext maxItems() throws RecognitionException {
		MaxItemsContext _localctx = new MaxItemsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_maxItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__18);
			setState(184);
			match(NONEGATIVEINT);
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

	public static class MinPropertiesContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MinPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minProperties; }
	}

	public final MinPropertiesContext minProperties() throws RecognitionException {
		MinPropertiesContext _localctx = new MinPropertiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_minProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__19);
			setState(187);
			match(NONEGATIVEINT);
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

	public static class MaxPropertiesContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MaxPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxProperties; }
	}

	public final MaxPropertiesContext maxProperties() throws RecognitionException {
		MaxPropertiesContext _localctx = new MaxPropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_maxProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__20);
			setState(190);
			match(NONEGATIVEINT);
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

	public static class MinContainsContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MinContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minContains; }
	}

	public final MinContainsContext minContains() throws RecognitionException {
		MinContainsContext _localctx = new MinContainsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__21);
			setState(193);
			match(NONEGATIVEINT);
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

	public static class MaxContainsContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MaxContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxContains; }
	}

	public final MaxContainsContext maxContains() throws RecognitionException {
		MaxContainsContext _localctx = new MaxContainsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_maxContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__22);
			setState(196);
			match(NONEGATIVEINT);
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

	public static class MultipleOfContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public MultipleOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleOf; }
	}

	public final MultipleOfContext multipleOf() throws RecognitionException {
		MultipleOfContext _localctx = new MultipleOfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multipleOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__23);
			setState(199);
			match(NONEGATIVEINT);
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

	public static class Js_notContext extends ParserRuleContext {
		public JsonSchemaContext jsonSchema() {
			return getRuleContext(JsonSchemaContext.class,0);
		}
		public Js_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_js_not; }
	}

	public final Js_notContext js_not() throws RecognitionException {
		Js_notContext _localctx = new Js_notContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_js_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__24);
			setState(202);
			jsonSchema();
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

	public static class AllOfContext extends ParserRuleContext {
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public AllOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOf; }
	}

	public final AllOfContext allOf() throws RecognitionException {
		AllOfContext _localctx = new AllOfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_allOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__25);
			setState(205);
			jsonSchema();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(206);
				match(T__1);
				setState(207);
				jsonSchema();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__6);
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

	public static class AnyOfContext extends ParserRuleContext {
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public AnyOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyOf; }
	}

	public final AnyOfContext anyOf() throws RecognitionException {
		AnyOfContext _localctx = new AnyOfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_anyOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__26);
			setState(216);
			jsonSchema();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(217);
				match(T__1);
				setState(218);
				jsonSchema();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__6);
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

	public static class OneOfContext extends ParserRuleContext {
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public OneOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOf; }
	}

	public final OneOfContext oneOf() throws RecognitionException {
		OneOfContext _localctx = new OneOfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_oneOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__27);
			setState(227);
			jsonSchema();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(228);
				match(T__1);
				setState(229);
				jsonSchema();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__6);
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

	public static class If_then_elseContext extends ParserRuleContext {
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public If_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else; }
	}

	public final If_then_elseContext if_then_else() throws RecognitionException {
		If_then_elseContext _localctx = new If_then_elseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_then_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__28);
			setState(238);
			jsonSchema();
			setState(239);
			match(T__29);
			setState(240);
			jsonSchema();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(241);
				match(T__30);
				setState(242);
				jsonSchema();
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode STRINGFORREF() { return getToken(JSONSchemaParser.STRINGFORREF, 0); }
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__31);
			setState(246);
			match(T__32);
			setState(247);
			match(STRINGFORREF);
			setState(248);
			match(T__33);
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

	public static class ItemsContext extends ParserRuleContext {
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__34);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
				{
				setState(251);
				jsonSchema();
				}
				break;
			case T__5:
				{
				setState(252);
				match(T__5);
				setState(253);
				jsonSchema();
				{
				setState(254);
				match(T__1);
				setState(255);
				jsonSchema();
				}
				setState(257);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AdditionalItemsContext extends ParserRuleContext {
		public JsonSchemaContext jsonSchema() {
			return getRuleContext(JsonSchemaContext.class,0);
		}
		public AdditionalItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalItems; }
	}

	public final AdditionalItemsContext additionalItems() throws RecognitionException {
		AdditionalItemsContext _localctx = new AdditionalItemsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_additionalItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__35);
			setState(262);
			jsonSchema();
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<TerminalNode> ALFABETICSTRING() { return getTokens(JSONSchemaParser.ALFABETICSTRING); }
		public TerminalNode ALFABETICSTRING(int i) {
			return getToken(JSONSchemaParser.ALFABETICSTRING, i);
		}
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__36);
			setState(265);
			match(ALFABETICSTRING);
			setState(266);
			match(T__37);
			setState(267);
			jsonSchema();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(268);
				match(T__1);
				setState(269);
				match(ALFABETICSTRING);
				setState(270);
				match(T__37);
				setState(271);
				jsonSchema();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(T__38);
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

	public static class PatternPropertiesContext extends ParserRuleContext {
		public List<TerminalNode> PATTERNSTRING() { return getTokens(JSONSchemaParser.PATTERNSTRING); }
		public TerminalNode PATTERNSTRING(int i) {
			return getToken(JSONSchemaParser.PATTERNSTRING, i);
		}
		public List<JsonSchemaContext> jsonSchema() {
			return getRuleContexts(JsonSchemaContext.class);
		}
		public JsonSchemaContext jsonSchema(int i) {
			return getRuleContext(JsonSchemaContext.class,i);
		}
		public PatternPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternProperties; }
	}

	public final PatternPropertiesContext patternProperties() throws RecognitionException {
		PatternPropertiesContext _localctx = new PatternPropertiesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_patternProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__39);
			setState(280);
			match(PATTERNSTRING);
			setState(281);
			match(T__37);
			setState(282);
			jsonSchema();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(283);
				match(T__1);
				setState(284);
				match(PATTERNSTRING);
				setState(285);
				match(T__37);
				setState(286);
				jsonSchema();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(T__38);
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

	public static class AdditionalPropertiesContext extends ParserRuleContext {
		public JsonSchemaContext jsonSchema() {
			return getRuleContext(JsonSchemaContext.class,0);
		}
		public AdditionalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalProperties; }
	}

	public final AdditionalPropertiesContext additionalProperties() throws RecognitionException {
		AdditionalPropertiesContext _localctx = new AdditionalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_additionalProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__40);
			setState(295);
			jsonSchema();
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

	public static class PropertyNamesContext extends ParserRuleContext {
		public JsonSchemaContext jsonSchema() {
			return getRuleContext(JsonSchemaContext.class,0);
		}
		public PropertyNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNames; }
	}

	public final PropertyNamesContext propertyNames() throws RecognitionException {
		PropertyNamesContext _localctx = new PropertyNamesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_propertyNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__41);
			setState(298);
			jsonSchema();
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

	public static class ContainsContext extends ParserRuleContext {
		public JsonSchemaContext jsonSchema() {
			return getRuleContext(JsonSchemaContext.class,0);
		}
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__42);
			setState(301);
			jsonSchema();
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

	public static class Js_constContext extends ParserRuleContext {
		public TerminalNode JSONValue() { return getToken(JSONSchemaParser.JSONValue, 0); }
		public Js_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_js_const; }
	}

	public final Js_constContext js_const() throws RecognitionException {
		Js_constContext _localctx = new Js_constContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_js_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__43);
			setState(304);
			match(JSONValue);
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

	public static class Js_enumContext extends ParserRuleContext {
		public List<TerminalNode> JSONValue() { return getTokens(JSONSchemaParser.JSONValue); }
		public TerminalNode JSONValue(int i) {
			return getToken(JSONSchemaParser.JSONValue, i);
		}
		public Js_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_js_enum; }
	}

	public final Js_enumContext js_enum() throws RecognitionException {
		Js_enumContext _localctx = new Js_enumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_js_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__44);
			setState(307);
			match(JSONValue);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(308);
				match(T__1);
				setState(309);
				match(JSONValue);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(T__6);
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

	public static class Number_JSONValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JSONSchemaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JSONSchemaParser.FLOAT, 0); }
		public Number_JSONValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_JSONValue; }
	}

	public final Number_JSONValueContext number_JSONValue() throws RecognitionException {
		Number_JSONValueContext _localctx = new Number_JSONValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number_JSONValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static class NonNegInt_JSONValueContext extends ParserRuleContext {
		public TerminalNode NONEGATIVEINT() { return getToken(JSONSchemaParser.NONEGATIVEINT, 0); }
		public NonNegInt_JSONValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNegInt_JSONValue; }
	}

	public final NonNegInt_JSONValueContext nonNegInt_JSONValue() throws RecognitionException {
		NonNegInt_JSONValueContext _localctx = new NonNegInt_JSONValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nonNegInt_JSONValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==NONEGATIVEINT) ) {
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

	public static class TypesContext extends ParserRuleContext {
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\3\2\3\2\5\2Y\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3w\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085"+
		"\13\5\3\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0092\n\7"+
		"\f\7\16\7\u0095\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\5\b\u00a0"+
		"\n\b\3\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00de\n\27\f\27\16\27\u00e1\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f6\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0106"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0113"+
		"\n\35\f\35\16\35\u0116\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u0122\n\36\f\36\16\36\u0125\13\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\7#\u0139\n#\f#\16#\u013c"+
		"\13#\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\2<=\4\2\60\60;;\3\2\61\67"+
		"\2\u014c\2X\3\2\2\2\4v\3\2\2\2\6x\3\2\2\2\b{\3\2\2\2\n\u008a\3\2\2\2\f"+
		"\u008d\3\2\2\2\16\u009f\3\2\2\2\20\u00a8\3\2\2\2\22\u00aa\3\2\2\2\24\u00ad"+
		"\3\2\2\2\26\u00b0\3\2\2\2\30\u00b3\3\2\2\2\32\u00b6\3\2\2\2\34\u00b9\3"+
		"\2\2\2\36\u00bc\3\2\2\2 \u00bf\3\2\2\2\"\u00c2\3\2\2\2$\u00c5\3\2\2\2"+
		"&\u00c8\3\2\2\2(\u00cb\3\2\2\2*\u00ce\3\2\2\2,\u00d9\3\2\2\2.\u00e4\3"+
		"\2\2\2\60\u00ef\3\2\2\2\62\u00f7\3\2\2\2\64\u00fc\3\2\2\2\66\u0107\3\2"+
		"\2\28\u010a\3\2\2\2:\u0119\3\2\2\2<\u0128\3\2\2\2>\u012b\3\2\2\2@\u012e"+
		"\3\2\2\2B\u0131\3\2\2\2D\u0134\3\2\2\2F\u013f\3\2\2\2H\u0141\3\2\2\2J"+
		"\u0143\3\2\2\2LM\7\3\2\2MR\5\4\3\2NO\7\4\2\2OQ\5\4\3\2PN\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\5\2\2VY\3\2\2\2WY\7A"+
		"\2\2XL\3\2\2\2XW\3\2\2\2Y\3\3\2\2\2Zw\5\6\4\2[w\5\b\5\2\\w\5\n\6\2]w\5"+
		"\f\7\2^w\5\16\b\2_w\5\20\t\2`w\5\26\f\2aw\5\30\r\2bw\5\32\16\2cw\5\34"+
		"\17\2dw\5\36\20\2ew\5 \21\2fw\5\"\22\2gw\5$\23\2hw\5&\24\2iw\5(\25\2j"+
		"w\5*\26\2kw\5.\30\2lw\5,\27\2mw\5\60\31\2nw\5\62\32\2ow\5\64\33\2pw\5"+
		"\66\34\2qw\58\35\2rw\5> \2sw\5@!\2tw\5D#\2uw\5B\"\2vZ\3\2\2\2v[\3\2\2"+
		"\2v\\\3\2\2\2v]\3\2\2\2v^\3\2\2\2v_\3\2\2\2v`\3\2\2\2va\3\2\2\2vb\3\2"+
		"\2\2vc\3\2\2\2vd\3\2\2\2ve\3\2\2\2vf\3\2\2\2vg\3\2\2\2vh\3\2\2\2vi\3\2"+
		"\2\2vj\3\2\2\2vk\3\2\2\2vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3\2"+
		"\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\5\3\2\2\2xy\7"+
		"\6\2\2yz\7A\2\2z\7\3\2\2\2{\u0088\7\7\2\2|\u0089\5J&\2}~\7\b\2\2~\u0083"+
		"\5J&\2\177\u0080\7\4\2\2\u0080\u0082\5J&\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0089\3\2\2\2\u0088|\3\2\2\2"+
		"\u0088}\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7?\2\2"+
		"\u008c\13\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u0093\7>\2\2\u008f\u0090"+
		"\7\4\2\2\u0090\u0092\7>\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7\t\2\2\u0097\r\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009c"+
		"\5F$\2\u009a\u009b\7\r\2\2\u009b\u009d\7A\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\5\22\n\2\u009f\u0098\3"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a5\5F$\2\u00a3\u00a4\7\17\2\2\u00a4\u00a6\7A\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8"+
		"\u00a1\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\7\20\2"+
		"\2\u00ab\u00ac\7;\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00af"+
		"\7;\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\7;\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\7;\2\2\u00b5\31\3\2\2\2\u00b6"+
		"\u00b7\7\24\2\2\u00b7\u00b8\7;\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\25\2"+
		"\2\u00ba\u00bb\7;\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00be"+
		"\7;\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7;\2\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\7;\2\2\u00c4#\3\2\2\2\u00c5"+
		"\u00c6\7\31\2\2\u00c6\u00c7\7;\2\2\u00c7%\3\2\2\2\u00c8\u00c9\7\32\2\2"+
		"\u00c9\u00ca\7;\2\2\u00ca\'\3\2\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5"+
		"\2\2\2\u00cd)\3\2\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d4\5\2\2\2\u00d0\u00d1"+
		"\7\4\2\2\u00d1\u00d3\5\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7\t\2\2\u00d8+\3\2\2\2\u00d9\u00da\7\35\2\2\u00da\u00df"+
		"\5\2\2\2\u00db\u00dc\7\4\2\2\u00dc\u00de\5\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3-\3\2\2\2\u00e4\u00e5"+
		"\7\36\2\2\u00e5\u00ea\5\2\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e9\5\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee"+
		"/\3\2\2\2\u00ef\u00f0\7\37\2\2\u00f0\u00f1\5\2\2\2\u00f1\u00f2\7 \2\2"+
		"\u00f2\u00f5\5\2\2\2\u00f3\u00f4\7!\2\2\u00f4\u00f6\5\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\61\3\2\2\2\u00f7\u00f8\7\"\2\2\u00f8"+
		"\u00f9\7#\2\2\u00f9\u00fa\78\2\2\u00fa\u00fb\7$\2\2\u00fb\63\3\2\2\2\u00fc"+
		"\u0105\7%\2\2\u00fd\u0106\5\2\2\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\5\2"+
		"\2\2\u0100\u0101\7\4\2\2\u0101\u0102\5\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\7\t\2\2\u0104\u0106\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe\3\2"+
		"\2\2\u0106\65\3\2\2\2\u0107\u0108\7&\2\2\u0108\u0109\5\2\2\2\u0109\67"+
		"\3\2\2\2\u010a\u010b\7\'\2\2\u010b\u010c\7>\2\2\u010c\u010d\7(\2\2\u010d"+
		"\u0114\5\2\2\2\u010e\u010f\7\4\2\2\u010f\u0110\7>\2\2\u0110\u0111\7(\2"+
		"\2\u0111\u0113\5\2\2\2\u0112\u010e\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7)\2\2\u01189\3\2\2\2\u0119\u011a\7*\2\2\u011a\u011b\7?\2\2\u011b"+
		"\u011c\7(\2\2\u011c\u0123\5\2\2\2\u011d\u011e\7\4\2\2\u011e\u011f\7?\2"+
		"\2\u011f\u0120\7(\2\2\u0120\u0122\5\2\2\2\u0121\u011d\3\2\2\2\u0122\u0125"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\7)\2\2\u0127;\3\2\2\2\u0128\u0129\7+\2\2\u0129"+
		"\u012a\5\2\2\2\u012a=\3\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\5\2\2\2\u012d"+
		"?\3\2\2\2\u012e\u012f\7-\2\2\u012f\u0130\5\2\2\2\u0130A\3\2\2\2\u0131"+
		"\u0132\7.\2\2\u0132\u0133\7:\2\2\u0133C\3\2\2\2\u0134\u0135\7/\2\2\u0135"+
		"\u013a\7:\2\2\u0136\u0137\7\4\2\2\u0137\u0139\7:\2\2\u0138\u0136\3\2\2"+
		"\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\t\2\2\u013eE\3\2\2\2\u013f"+
		"\u0140\t\2\2\2\u0140G\3\2\2\2\u0141\u0142\t\3\2\2\u0142I\3\2\2\2\u0143"+
		"\u0144\t\4\2\2\u0144K\3\2\2\2\24RXv\u0083\u0088\u0093\u009c\u009f\u00a5"+
		"\u00a8\u00d4\u00df\u00ea\u00f5\u0105\u0114\u0123\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}