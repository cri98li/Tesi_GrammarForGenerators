mvn install; \
mv target/Testing-0.0.1-SNAPSHOT.jar Testing-0.0.1-SNAPSHOT.jar; \
java -cp Testing-0.0.1-SNAPSHOT.jar MainClass "$@"
