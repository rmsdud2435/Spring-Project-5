# Spring with H2 Database

## H2 데이터베이스 접속

먼저 `./mvnw spring-boot:run` 명령어로 서버를 실행시킵니다.

[localhost:8080/h2-console/](localhost:8080/h2-console/) 에 접속해서 connect를 하면 됩니다.
- h2-console 연결에 필요한 입력 정보는 아래와 같습니다
  - Dirver Class: org.h2.Driver,
  - User name: sa
  - JDBC URL: jdbc:h2:mem:testdb
