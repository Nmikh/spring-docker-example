//without docker-compose.yml
mvn clean package
docker build . -t nmikh:spring_boot_docker_test
docker run -d -p 8080:8080 nmikh:spring_boot_docker_test

//with docker-compose.yml
mvn clean package
docker-compose build
docker-compose up