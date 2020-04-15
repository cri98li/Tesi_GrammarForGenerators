find ./tests -type f -name 'test_*.json' -delete; \
grammarinator-process JSONSchema.g4 -o tests/py/ --no-actions; \
grammarinator-generate -r jsonSchema -o tests/test_%d.json -p tests/py/JSONSchemaUnparser.py -l tests/py/JSONSchemaUnlexer.py -n 100;
