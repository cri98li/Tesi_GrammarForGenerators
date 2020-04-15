find ./tests -type f -name 'test_*.txt' -delete; \
grammarinator-process JSONSchema.g4 -o tests/py/ --no-actions; \
grammarinator-generate -r rootDef_assertion -d 10 -o tests/test_%d.txt -p tests/py/JSONSchemaUnparser.py -l tests/py/JSONSchemaUnlexer.py -n 10;
