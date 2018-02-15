# graphql-spring-boot

1. Run a postgres database on a docker container using the yml file on /src/main/docker

```
docker-compose up -f postgres.yml up -d
```

2. Execute database script first at /src/main/resources/static/db/data.sql

3. Do maven install and run it.

```
# do an install
mvn clean install

# then run it
java -jar target/*.jar
```
4. The GraphQL client is at http://localhost:9978/graphql-client and for Browser clients is at http://localhost:9978/graphql-api. These url are configured on application.yml.
