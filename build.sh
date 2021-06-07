mvn clean
mvn package -Dmaven.test.skip=true

docker build -t sun/clock-in-core:latest .
