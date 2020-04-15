grammar JSONSchema;

//--------------------root

jsonSchema: '{ ' keyword (', ' keyword)* ' }'; /* mettiamoci poi i vri tag */



//------------------------strutturali

keyword: uniqueItems

                    |   type
                    |   pattern
                    |   required_assertion

                    |   between_assertion
                    |   xbetween_assertion
                    |   length_assertion
                    |   bet_items_assertion
                    |   between_properties_assertion
                    |   multiple_of_assertion
                    |   not_multiple_of_assertion

                    |   not_assertion
                    |   all_of_assertion
                    |   one_of_assertion
                    |   any_of_assertion
                    |   if_then_else_assertion

                    |   ref_assertion

                    |   items_assertion
                    |   properties_assertion
                    |   propertyNames
                    |   contains_assertion
                    |   pattern_required
                    |   additional_pattern_required
                    ;







//---------------------------------SINGOLE KEYWORDS

uniqueItems: '"uniqueItems": 'BOOLEAN;


//---------------------------------STRINGHE

type: '"type": ' (types | ('[' types (', ' types)* ']')) ')';

pattern: '"pattern": "' PATTERNSTRING '"';

required: '"required": [' ALFABETICSTRING (', ' ALFABETICSTRING)* ']';


//---------------------------------NUMERICI
minimum: '"minimum": ' number_JSONValue (', "exclusiveMinimum": ' BOOLEAN)?;

maximum: '"maximum": ' number_JSONValue (', "exclusiveMaximum": ' BOOLEAN)?;

exclusiveMinimum: 'xbet(' (( NONEGATIVEINT ', 'number_JSONValue);

length_assertion: 'xbet(' (( NONEGATIVEINT ', 'nonNegInt_JSONValue )
                    | ( nonNegInt_JSONValue ', 'NONEGATIVEINT )) ')';

bet_items_assertion : 'betitems(' (( NONEGATIVEINT ', 'nonNegInt_JSONValue )
                        | ( nonNegInt_JSONValue ', 'NONEGATIVEINT )) ')';

between_properties_assertion : 'pro(' (( NONEGATIVEINT ', 'nonNegInt_JSONValue )
                                    | ( nonNegInt_JSONValue ', 'NONEGATIVEINT )) ')';

multiple_of_assertion: 'mof('NONEGATIVEINT')';

not_multiple_of_assertion : 'notMof''('NONEGATIVEINT')';	


//--------------------------------LOGICI

not_assertion: 'not: ' assertion;

all_of_assertion: 'allOf[' assertion (', 'assertion)* ']';

any_of_assertion: 'anyOf[' assertion (', 'assertion)* ']';

one_of_assertion: 'oneOf[' assertion (', 'assertion)* ']';

if_then_else_assertion: 'if: ' assertion ', then: ' assertion (', else: ' assertion)?;


//--------------------------------REF

ref_assertion: 'ref: ' ALFABETICSTRING;


//--------------------------------NODI
items_assertion: 'items(' assertion (', ' assertion)*';)'
                    | 'items(' (assertion (', ' assertion)*)?'; 'assertion')';

properties_assertion: 'props[' ALFABETICSTRING ':' assertion (', 'ALFABETICSTRING ':' assertion)* ';]'
                        | 'props[' (ALFABETICSTRING ':' assertion (', 'ALFABETICSTRING ':' assertion)*)? ';'assertion']';

propertyNames: 'names: ' assertion;

contains_assertion: 'contains (' nonNegInt_JSONValue ', ' nonNegInt_JSONValue')' assertion;

pattern_required: 'pattReq''[' PATTERNSTRING ':' assertion (', ' PATTERNSTRING ':' assertion)* ']';

additional_pattern_required: 'addPattReq''[' '('(PATTERNSTRING (', ' PATTERNSTRING))*')' ':' assertion ']';



//------------------------------Costanti (contengono json)

const_assertion: 'const(' JSONValue ')';

enum_assertion: 'enum[' JSONValue (', ' JSONValue)* ']';



number_JSONValue: INT | FLOAT;

nonNegInt_JSONValue: NONEGATIVEINT | 'null';

Int_JSONValue: INT;

JSONValue: INT | FLOAT | STRING | 'null' 
            |   '[' JSONValue (', ' JSONValue)* ']'
            |   '{' ALFABETICSTRING': ' JSONValue (', ' ALFABETICSTRING': ' JSONValue)*'}';

types: 'obj' | 'str' | 'num' | 'int' | 'arr' | 'bool' | 'null';

NONEGATIVEINT: [1-9][0-9]*;

INT: '-'? NONEGATIVEINT;

FLOAT: INT '.' [0-9]* [1-9];

ALFABETICSTRING: '"STR_'[a-zA-Z]+'"';

PATTERNSTRING: '"PAT_' STRING '"';

//STRING: .+?;

STRING: ~('"𐠽')+;
BOOLEAN: 'true' | 'false';

WS : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
