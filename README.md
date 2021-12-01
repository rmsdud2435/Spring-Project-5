# Spring with H2 Database
## H2 데이터베이스 접속
먼저 터미널을 열어 `/start`로 서버를 실행시키고 `실행`을 누르면 별도의 창으로 서버가 열립니다.
서버가 열린 창에서 `[서버 실행 시 URL]/h2-console/`에 접속해서 connect를 하면 됩니다.
- h2-console 연결에 필요한 입력 정보는 아래와 같습니다
  - Dirver Class: org.h2.Driver,
  - User name: sa
  - JDBC URL: jdbc:h2:mem:testdb
## 테스트 실행
`mvn test` 명령어를 입력하면 테스트 코드를 실행할 수 있습니다. 
실제 시험에서는 직접 테스트 코드를 작성하여 본인의 코드를 테스트해볼 수 있습니다.
## 로컬 환경에서 작업하기
현재 웹 상의 VS Code 환경이 아닌 로컬 환경에서 작업하기 원하시면 아래와 같이 remote repository를 변경하여 작업하실 수 있습니다.
- git remote add origin [remote git address]
- git branch -M main
- git push -u origin main

**주의:** 현재 Github의 인증 방식이 토큰 방식으로 변경되었기 때문에 인증 시 패스워드가 아닌 토큰 주소를 복사하여 비밀번호 대신 입력하셔야 합니다. 
