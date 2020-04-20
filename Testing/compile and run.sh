echo 'Ricordati di fare: git pull'
mvn install; \
mv target/Testing-0.0.1-SNAPSHOT-jar-with-dependencies.jar Testing-0.0.1-SNAPSHOT-jar-with-dependencies.jar; \
java -cp Testing-0.0.1-SNAPSHOT-jar-with-dependencies.jar MainClass "$@"
