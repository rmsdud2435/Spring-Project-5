# Spring with H2 Database

## H2 데이터베이스 접속

1. 먼저 터미널을 열어 `/start`를 입력하고, 화면 우측 상단의 `실행`을 누르면 별도의 웹페이지로 서버에 접속됩니다. (API 서버이므로 별도의 화면은 구현되어 있지 않습니다. 해당 서버에 API 호출을 보내어 서버 작동을 확인할 수 있습니다.)
2. 서버에 접속한 웹페이지에서 현재의 URL 뒤에 `h2-console/`을 입력하여 콘솔을 엽니다. (만약 콘솔이 뜨지 않을 경우,  URL 뒤에 `h2-console/login.jsp`를 입력합니다.) 
3. 콘솔이 열린 뒤, `JDBC URL`을 `jdbc:h2:mem:testdb`로 바꾼 다음 `connect`를 누르면 연결됩니다.

- h2-console 연결에 필요한 입력 정보
  - Dirver Class: org.h2.Driver
  - User name: sa
  - JDBC URL: jdbc:h2:mem:testdb

## 테스트 실행

`mvn test` 명령어를 입력하면 테스트 코드를 실행할 수 있습니다. 
실제 시험에서는 직접 테스트 코드를 작성하여 본인의 코드를 테스트해볼 수 있습니다.

## 로컬 환경에서 작업하기

현재 웹 상의 VS Code 환경이 아닌 개인 로컬 환경에서 작업을 원하시면 아래의 과정으로 진행하실 수 있습니다.

1. 현재의 local repository의 프로젝트를 remote repository로 가져가는(import) 작업 진행
2. 해당 remote repostiory를 local repository에 복제(git clone)하여 로컬 환경에서 문제 풀이 진행
3. 로컬 환경 작업을 remote repository에 반영(git push) 후에 웹상의 VS Code 환경의 repository에 가져와서(git pull) 테스트를 진행한 후 제출

### Remote Repository로 프로젝트를 가져가는 방법

remote repository는 github에서 생성한다는 가정 하에 설명합니다. 별도의 remote repository를 이용하시려면 github의 내용을 제외하고 적용해 주시길 바랍니다.

1. github에 repository 생성
  - 현재의 repository를 import할 예정이므로 Initialize this repository with 과정 스킵
  - 참조 : https://docs.github.com/en/get-started/quickstart/create-a-repo

2. 웹 상의 VS Code 환경에서 터미널(VS Code 메뉴의 터미널 클릭)을 실행하여 아래 명령어 실행
  - `git remote add origin [github remote repository address]`
  - `git push -u origin main`

3. github 인증
  - 나타난 팝업 창 취소 누른 후 Username 및 Password 입력
  - 인증 시에 `please use a personal access token instead`와 같은 error가 발생되면 암호 대신에 `personal access token`을 만들어서 입력해주세요.
  - Personal Access Toke 생성 참조 : https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token
