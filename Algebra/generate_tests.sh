find ./tests -type f -name 'test_*.txt' -delete; \
grammarinator-process Algebra.g4 -o tests/py/ --no-actions; \
grammarinator-generate -r rootDef_assertion -o tests/test_%d.txt -p tests/py/AlgebraUnparser.py -l tests/py/AlgebraUnlexer.py -n 100;
