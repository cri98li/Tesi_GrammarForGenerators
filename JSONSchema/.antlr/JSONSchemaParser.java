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
		RULE_root_jsonSchema = 0, RULE_jsonSchema = 1, RULE_keyword = 2, RULE_uniqueItems = 3, 
		RULE_type = 4, RULE_pattern = 5, RULE_required = 6, RULE_minimum = 7, 
		RULE_maximum = 8, RULE_exclusiveMinimum = 9, RULE_exclusiveMaximum = 10, 
		RULE_minLength = 11, RULE_maxLength = 12, RULE_minItems = 13, RULE_maxItems = 14, 
		RULE_minProperties = 15, RULE_maxProperties = 16, RULE_minContains = 17, 
		RULE_maxContains = 18, RULE_multipleOf = 19, RULE_js_not = 20, RULE_allOf = 21, 
		RULE_anyOf = 22, RULE_oneOf = 23, RULE_if_then_else = 24, RULE_ref = 25, 
		RULE_items = 26, RULE_additionalItems = 27, RULE_properties = 28, RULE_patternProperties = 29, 
		RULE_additionalProperties = 30, RULE_propertyNames = 31, RULE_contains = 32, 
		RULE_js_const = 33, RULE_js_enum = 34, RULE_number_JSONValue = 35, RULE_nonNegInt_JSONValue = 36, 
		RULE_types = 37;
	public static final String[] ruleNames = {
		"root_jsonSchema", "jsonSchema", "keyword", "uniqueItems", "type", "pattern", 
		"required", "minimum", "maximum", "exclusiveMinimum", "exclusiveMaximum", 
		"minLength", "maxLength", "minItems", "maxItems", "minProperties", "maxProperties", 
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
	public static class Root_jsonSchemaContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public Root_jsonSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_jsonSchema; }
	}

	public final Root_jsonSchemaContext root_jsonSchema() throws RecognitionException {
		Root_jsonSchemaContext _localctx = new Root_jsonSchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root_jsonSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			keyword();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(78);
				match(T__1);
				setState(79);
				keyword();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__2);
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
		enterRule(_localctx, 2, RULE_jsonSchema);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(87);
				match(T__0);
				setState(88);
				keyword();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(89);
					match(T__1);
					setState(90);
					keyword();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(T__2);
				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
		enterRule(_localctx, 4, RULE_keyword);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				uniqueItems();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				type();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				pattern();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				required();
				}
				break;
			case T__9:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				minimum();
				}
				break;
			case T__11:
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				maximum();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				minLength();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				maxLength();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				minItems();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				maxItems();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				minProperties();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				maxProperties();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(113);
				minContains();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 14);
				{
				setState(114);
				maxContains();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 15);
				{
				setState(115);
				multipleOf();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 16);
				{
				setState(116);
				js_not();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 17);
				{
				setState(117);
				allOf();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 18);
				{
				setState(118);
				oneOf();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 19);
				{
				setState(119);
				anyOf();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 20);
				{
				setState(120);
				if_then_else();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 21);
				{
				setState(121);
				ref();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 22);
				{
				setState(122);
				items();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 23);
				{
				setState(123);
				additionalItems();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 24);
				{
				setState(124);
				properties();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(125);
				propertyNames();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(126);
				contains();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 27);
				{
				setState(127);
				js_enum();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 28);
				{
				setState(128);
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
		enterRule(_localctx, 6, RULE_uniqueItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__3);
			setState(132);
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
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__4);
			setState(147);
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
				setState(135);
				types();
				}
				break;
			case T__5:
				{
				{
				setState(136);
				match(T__5);
				setState(137);
				types();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(138);
					match(T__1);
					setState(139);
					types();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
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
		enterRule(_localctx, 10, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__7);
			setState(150);
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
		enterRule(_localctx, 12, RULE_required);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__8);
			setState(153);
			match(ALFABETICSTRING);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(154);
				match(T__1);
				setState(155);
				match(ALFABETICSTRING);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		enterRule(_localctx, 14, RULE_minimum);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(163);
				match(T__9);
				setState(164);
				number_JSONValue();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(165);
					match(T__10);
					setState(166);
					match(BOOLEAN);
					}
				}

				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
		enterRule(_localctx, 16, RULE_maximum);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(172);
				match(T__11);
				setState(173);
				number_JSONValue();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(174);
					match(T__12);
					setState(175);
					match(BOOLEAN);
					}
				}

				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
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
		enterRule(_localctx, 18, RULE_exclusiveMinimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__13);
			setState(182);
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
		enterRule(_localctx, 20, RULE_exclusiveMaximum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__14);
			setState(185);
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
		enterRule(_localctx, 22, RULE_minLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__15);
			setState(188);
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
		enterRule(_localctx, 24, RULE_maxLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__16);
			setState(191);
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
		enterRule(_localctx, 26, RULE_minItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__17);
			setState(194);
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
		enterRule(_localctx, 28, RULE_maxItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__18);
			setState(197);
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
		enterRule(_localctx, 30, RULE_minProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__19);
			setState(200);
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
		enterRule(_localctx, 32, RULE_maxProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__20);
			setState(203);
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
		enterRule(_localctx, 34, RULE_minContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__21);
			setState(206);
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
		enterRule(_localctx, 36, RULE_maxContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__22);
			setState(209);
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
		enterRule(_localctx, 38, RULE_multipleOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__23);
			setState(212);
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
		enterRule(_localctx, 40, RULE_js_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__24);
			setState(215);
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
		enterRule(_localctx, 42, RULE_allOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__25);
			setState(218);
			jsonSchema();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(219);
				match(T__1);
				setState(220);
				jsonSchema();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		enterRule(_localctx, 44, RULE_anyOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__26);
			setState(229);
			jsonSchema();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(230);
				match(T__1);
				setState(231);
				jsonSchema();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		enterRule(_localctx, 46, RULE_oneOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__27);
			setState(240);
			jsonSchema();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(241);
				match(T__1);
				setState(242);
				jsonSchema();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		enterRule(_localctx, 48, RULE_if_then_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__28);
			setState(251);
			jsonSchema();
			setState(252);
			match(T__29);
			setState(253);
			jsonSchema();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(254);
				match(T__30);
				setState(255);
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
		enterRule(_localctx, 50, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__31);
			setState(259);
			match(T__32);
			setState(260);
			match(STRINGFORREF);
			setState(261);
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
		enterRule(_localctx, 52, RULE_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__34);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
				{
				setState(264);
				jsonSchema();
				}
				break;
			case T__5:
				{
				setState(265);
				match(T__5);
				setState(266);
				jsonSchema();
				{
				setState(267);
				match(T__1);
				setState(268);
				jsonSchema();
				}
				setState(270);
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
		enterRule(_localctx, 54, RULE_additionalItems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__35);
			setState(275);
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
		enterRule(_localctx, 56, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__36);
			setState(278);
			match(ALFABETICSTRING);
			setState(279);
			match(T__37);
			setState(280);
			jsonSchema();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(281);
				match(T__1);
				setState(282);
				match(ALFABETICSTRING);
				setState(283);
				match(T__37);
				setState(284);
				jsonSchema();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
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
		enterRule(_localctx, 58, RULE_patternProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__39);
			setState(293);
			match(PATTERNSTRING);
			setState(294);
			match(T__37);
			setState(295);
			jsonSchema();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(296);
				match(T__1);
				setState(297);
				match(PATTERNSTRING);
				setState(298);
				match(T__37);
				setState(299);
				jsonSchema();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
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
		enterRule(_localctx, 60, RULE_additionalProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__40);
			setState(308);
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
		enterRule(_localctx, 62, RULE_propertyNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__41);
			setState(311);
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
		enterRule(_localctx, 64, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__42);
			setState(314);
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
		enterRule(_localctx, 66, RULE_js_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__43);
			setState(317);
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
		enterRule(_localctx, 68, RULE_js_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__44);
			setState(320);
			match(JSONValue);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(321);
				match(T__1);
				setState(322);
				match(JSONValue);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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
		enterRule(_localctx, 70, RULE_number_JSONValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 72, RULE_nonNegInt_JSONValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 74, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\3\3"+
		"\3\3\5\3f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6"+
		"\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009f\n\b\f\b\16"+
		"\b\u00a2\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\5\t\u00ad\n\t"+
		"\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e0\n\27\f\27\16\27\u00e3\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f6\n\31\f\31\16\31\u00f9\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0113"+
		"\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0120"+
		"\n\36\f\36\16\36\u0123\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u012f\n\37\f\37\16\37\u0132\13\37\3\37\3\37\3 \3 \3 \3!"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\7$\u0146\n$\f$\16$\u0149\13$\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\3\2<=\4\2\60\60;;\3\2\61\67\2"+
		"\u0159\2N\3\2\2\2\4e\3\2\2\2\6\u0083\3\2\2\2\b\u0085\3\2\2\2\n\u0088\3"+
		"\2\2\2\f\u0097\3\2\2\2\16\u009a\3\2\2\2\20\u00ac\3\2\2\2\22\u00b5\3\2"+
		"\2\2\24\u00b7\3\2\2\2\26\u00ba\3\2\2\2\30\u00bd\3\2\2\2\32\u00c0\3\2\2"+
		"\2\34\u00c3\3\2\2\2\36\u00c6\3\2\2\2 \u00c9\3\2\2\2\"\u00cc\3\2\2\2$\u00cf"+
		"\3\2\2\2&\u00d2\3\2\2\2(\u00d5\3\2\2\2*\u00d8\3\2\2\2,\u00db\3\2\2\2."+
		"\u00e6\3\2\2\2\60\u00f1\3\2\2\2\62\u00fc\3\2\2\2\64\u0104\3\2\2\2\66\u0109"+
		"\3\2\2\28\u0114\3\2\2\2:\u0117\3\2\2\2<\u0126\3\2\2\2>\u0135\3\2\2\2@"+
		"\u0138\3\2\2\2B\u013b\3\2\2\2D\u013e\3\2\2\2F\u0141\3\2\2\2H\u014c\3\2"+
		"\2\2J\u014e\3\2\2\2L\u0150\3\2\2\2NO\7\3\2\2OT\5\6\4\2PQ\7\4\2\2QS\5\6"+
		"\4\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\5"+
		"\2\2X\3\3\2\2\2YZ\7\3\2\2Z_\5\6\4\2[\\\7\4\2\2\\^\5\6\4\2][\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\5\2\2cf\3\2\2\2d"+
		"f\7A\2\2eY\3\2\2\2ed\3\2\2\2f\5\3\2\2\2g\u0084\5\b\5\2h\u0084\5\n\6\2"+
		"i\u0084\5\f\7\2j\u0084\5\16\b\2k\u0084\5\20\t\2l\u0084\5\22\n\2m\u0084"+
		"\5\30\r\2n\u0084\5\32\16\2o\u0084\5\34\17\2p\u0084\5\36\20\2q\u0084\5"+
		" \21\2r\u0084\5\"\22\2s\u0084\5$\23\2t\u0084\5&\24\2u\u0084\5(\25\2v\u0084"+
		"\5*\26\2w\u0084\5,\27\2x\u0084\5\60\31\2y\u0084\5.\30\2z\u0084\5\62\32"+
		"\2{\u0084\5\64\33\2|\u0084\5\66\34\2}\u0084\58\35\2~\u0084\5:\36\2\177"+
		"\u0084\5@!\2\u0080\u0084\5B\"\2\u0081\u0084\5F$\2\u0082\u0084\5D#\2\u0083"+
		"g\3\2\2\2\u0083h\3\2\2\2\u0083i\3\2\2\2\u0083j\3\2\2\2\u0083k\3\2\2\2"+
		"\u0083l\3\2\2\2\u0083m\3\2\2\2\u0083n\3\2\2\2\u0083o\3\2\2\2\u0083p\3"+
		"\2\2\2\u0083q\3\2\2\2\u0083r\3\2\2\2\u0083s\3\2\2\2\u0083t\3\2\2\2\u0083"+
		"u\3\2\2\2\u0083v\3\2\2\2\u0083w\3\2\2\2\u0083x\3\2\2\2\u0083y\3\2\2\2"+
		"\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083~\3"+
		"\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\7\3\2\2\2\u0085\u0086\7\6\2\2\u0086\u0087\7A\2\2"+
		"\u0087\t\3\2\2\2\u0088\u0095\7\7\2\2\u0089\u0096\5L\'\2\u008a\u008b\7"+
		"\b\2\2\u008b\u0090\5L\'\2\u008c\u008d\7\4\2\2\u008d\u008f\5L\'\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\t\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0096\13\3\2\2"+
		"\2\u0097\u0098\7\n\2\2\u0098\u0099\7?\2\2\u0099\r\3\2\2\2\u009a\u009b"+
		"\7\13\2\2\u009b\u00a0\7>\2\2\u009c\u009d\7\4\2\2\u009d\u009f\7>\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4"+
		"\17\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a9\5H%\2\u00a7\u00a8\7\r\2\2"+
		"\u00a8\u00aa\7A\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00a5\3\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\21\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b2\5H%\2\u00b0\u00b1\7"+
		"\17\2\2\u00b1\u00b3\7A\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00ae\3\2\2\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00b9\7;\2\2\u00b9"+
		"\25\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\7;\2\2\u00bc\27\3\2\2\2\u00bd"+
		"\u00be\7\22\2\2\u00be\u00bf\7;\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\23\2"+
		"\2\u00c1\u00c2\7;\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5"+
		"\7;\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7;\2\2\u00c8"+
		"\37\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7;\2\2\u00cb!\3\2\2\2\u00cc"+
		"\u00cd\7\27\2\2\u00cd\u00ce\7;\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7\30\2\2"+
		"\u00d0\u00d1\7;\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\7"+
		";\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7\7;\2\2\u00d7)\3"+
		"\2\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\5\4\3\2\u00da+\3\2\2\2\u00db\u00dc"+
		"\7\34\2\2\u00dc\u00e1\5\4\3\2\u00dd\u00de\7\4\2\2\u00de\u00e0\5\4\3\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\t\2\2\u00e5"+
		"-\3\2\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00ec\5\4\3\2\u00e8\u00e9\7\4\2\2"+
		"\u00e9\u00eb\5\4\3\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\t\2\2\u00f0/\3\2\2\2\u00f1\u00f2\7\36\2\2\u00f2\u00f7\5\4\3\2"+
		"\u00f3\u00f4\7\4\2\2\u00f4\u00f6\5\4\3\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7\t\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7\37\2"+
		"\2\u00fd\u00fe\5\4\3\2\u00fe\u00ff\7 \2\2\u00ff\u0102\5\4\3\2\u0100\u0101"+
		"\7!\2\2\u0101\u0103\5\4\3\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\63\3\2\2\2\u0104\u0105\7\"\2\2\u0105\u0106\7#\2\2\u0106\u0107\78\2\2"+
		"\u0107\u0108\7$\2\2\u0108\65\3\2\2\2\u0109\u0112\7%\2\2\u010a\u0113\5"+
		"\4\3\2\u010b\u010c\7\b\2\2\u010c\u010d\5\4\3\2\u010d\u010e\7\4\2\2\u010e"+
		"\u010f\5\4\3\2\u010f\u0110\3\2\2\2\u0110\u0111\7\t\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u010a\3\2\2\2\u0112\u010b\3\2\2\2\u0113\67\3\2\2\2\u0114\u0115"+
		"\7&\2\2\u0115\u0116\5\4\3\2\u01169\3\2\2\2\u0117\u0118\7\'\2\2\u0118\u0119"+
		"\7>\2\2\u0119\u011a\7(\2\2\u011a\u0121\5\4\3\2\u011b\u011c\7\4\2\2\u011c"+
		"\u011d\7>\2\2\u011d\u011e\7(\2\2\u011e\u0120\5\4\3\2\u011f\u011b\3\2\2"+
		"\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7)\2\2\u0125;\3\2\2\2\u0126\u0127"+
		"\7*\2\2\u0127\u0128\7?\2\2\u0128\u0129\7(\2\2\u0129\u0130\5\4\3\2\u012a"+
		"\u012b\7\4\2\2\u012b\u012c\7?\2\2\u012c\u012d\7(\2\2\u012d\u012f\5\4\3"+
		"\2\u012e\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7)\2\2\u0134"+
		"=\3\2\2\2\u0135\u0136\7+\2\2\u0136\u0137\5\4\3\2\u0137?\3\2\2\2\u0138"+
		"\u0139\7,\2\2\u0139\u013a\5\4\3\2\u013aA\3\2\2\2\u013b\u013c\7-\2\2\u013c"+
		"\u013d\5\4\3\2\u013dC\3\2\2\2\u013e\u013f\7.\2\2\u013f\u0140\7:\2\2\u0140"+
		"E\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0147\7:\2\2\u0143\u0144\7\4\2\2\u0144"+
		"\u0146\7:\2\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7\t\2\2\u014bG\3\2\2\2\u014c\u014d\t\2\2\2\u014dI\3\2\2\2\u014e"+
		"\u014f\t\3\2\2\u014fK\3\2\2\2\u0150\u0151\t\4\2\2\u0151M\3\2\2\2\25T_"+
		"e\u0083\u0090\u0095\u00a0\u00a9\u00ac\u00b2\u00b5\u00e1\u00ec\u00f7\u0102"+
		"\u0112\u0121\u0130\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}