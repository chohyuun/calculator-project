# 계산기 프로젝트

스파르타 내일배움 클럽 Spring 7기 java 개인 과제로 시작한 계산기 프로젝트 입니다.
## 개발 기간
- 24.10.14 - 24.10.16
## 개발 환경
- `JDK 17`
- `IDE : InetlliJ`

## 기능
### 계산 입력 / 연산
- 숫자와 연산자 입력 받기
- 잘못된 입력이 들어올 경우 예외 처리
  - `NumberFormatException`
     숫자 타입에 숫자 이외의 입력이 들어올 경우의 예외 처리
  - `ArithmeticException`
     나누기, 나머지 연산 진행 시 분모가 0이 들어올 경우의 예외처리
  - `사용자 지정 예외처리 - OperationException`
     요청 가능 한 연산자 이외의 문자가 들어왔을 경우의 예외처리

### 연산 내용 저장
- 진행한 연산들의 결과 값을 저장
  - Queue를 사용한 연산 결과 저장
  - `Calculator.java - removeResult method`
    Queue에 입력한 내용 중 제일 앞의 내용 제거
