grammar JSONSchema;

//--------------------root

jsonSchema: ('{ ' keyword (', ' keyword)* ' }') | BOOLEAN; /* mettiamoci poi i vari tag?? */



//------------------------strutturali

keyword: uniqueItems

                    |   type
                    |   pattern
                    |   required

                    |   minimum
                    |   maximum
                    |   minLength
                    |   maxLength
                    |   minItems
                    |   maxItems
                    |   minProperties
                    |   maxProperties
                    |   minContains
                    |   maxContains
                    |   multipleOf

                    |   not
                    |   allOf
                    |   oneOf
                    |   anyOf
                    |   if_then_else

                    |   ref

                    |   items
                    |   additionalItems
                    |   properties
                    |   propertyNames
                    |   contains

                    |   enum
                    |   const
                    ;







//---------------------------------SINGOLE KEYWORDS

uniqueItems: '"uniqueItems": 'BOOLEAN;


//---------------------------------STRINGHE

type: '"type": ' (types | ('[' types (', ' types)* ']')) ')';

pattern: '"pattern": "' PATTERNSTRING '"';

required: '"required": [' ALFABETICSTRING (', ' ALFABETICSTRING)* ']';


//---------------------------------NUMERICI
minimum: ('"minimum": ' number_JSONValue (', "exclusiveMinimum": ' BOOLEAN)?) | exclusiveMinimum;

maximum: ('"maximum": ' number_JSONValue (', "exclusiveMaximum": ' BOOLEAN)?) | exclusiveMaximum;

exclusiveMinimum: '"exclusiveMinimum": 'NONEGATIVEINT;

exclusiveMaximum: '"exclusiveMaximum": 'NONEGATIVEINT;

minLength: '"minLength": ' NONEGATIVEINT;

maxLength: '"maxLength": ' NONEGATIVEINT;

minItems : '"minItems": ' NONEGATIVEINT;

maxItems : '"maxItems": ' NONEGATIVEINT;

minProperties : '"minProperties": ' NONEGATIVEINT;

maxProperties : '"maxProperties": ' NONEGATIVEINT;

minContains : '"minContains": ' NONEGATIVEINT;

maxContains : '"maxContains": ' NONEGATIVEINT;

multipleOf: '"multipleOf": 'NONEGATIVEINT;

//--------------------------------LOGICI

not: 'not: ' jsonSchema;

allOf: '"allOf": [' jsonSchema (', 'jsonSchema)* ']';

anyOf: '"anyOf": [' jsonSchema (', 'jsonSchema)* ']';

oneOf: '"oneOf": [' jsonSchema (', 'jsonSchema)* ']';

if_then_else: 'if: ' jsonSchema ', then: ' jsonSchema (', else: ' jsonSchema)?;


//--------------------------------REF

ref: '"ref": ' '"#/$defs/' ALFABETICSTRING '"';


//--------------------------------NODI
items: '"items": ' (jsonSchema | '[' jsonSchema (', ' jsonSchema) ']');

additionalItems: '"additionalItems": ' jsonSchema;

properties: '"properties": {' ALFABETICSTRING':' jsonSchema (', ' ALFABETICSTRING':' jsonSchema)* '}';

patternProperties: '"patternProperties": {' PATTERNSTRING':' jsonSchema (', ' PATTERNSTRING':' jsonSchema)* '}';

additionalProperties: '"additionalProperties": ' jsonSchema;

propertyNames: '"propertyNames": ' jsonSchema;

contains: '"contains": ' jsonSchema;



//------------------------------Costanti (contengono json)

const: '"const": ' JSONValue;

enum: '"enum": [' JSONValue (', ' JSONValue)*']';



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
