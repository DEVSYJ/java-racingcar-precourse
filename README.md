# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

---

## 요구사항 정리
    
### 게임관리자
* 자동차 이름 설정
    * 전체 input에서 쉼표로 구분
    * 5자 이하
* 이동 횟수 내 게임 진행
    * 사용자에게 이동 횟수 입력받기
    * 각 자동차들 전진
* 우승자 시상
    * 우승자 공유
    * 우승자가 한명 이상일 경우 쉼표로 이름 구분해 출력
    
### 자동차
* 전진여부 체크
    * 0~9의 random값 돌리기
        * 4 이상일 경우 전진
        * 3 이하일 경우 스탑
  
### 에러처리
* 사용자가 잘못된 값을 입력할 경우 "[ERROR]"로 시작하는 에러메시지를 출력 후 재입력
    
---

## 프로그램 실행 결과
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행결과
pobi:-
crong:
honux:-

pobi:--
crong:-
honux:--

pobi:---
crong:--
honux:---

pobi:----
crong:---
honux:----

pobi:-----
crong:----
honux:-----

최종 우승자는 pobi,honux 입니다.
```
