package racinggame.controller;

import racinggame.model.ParticipantCars;
import racinggame.model.TryCount;
import racinggame.model.Winners;

public class GameManager {
	public static void startGame() {
		ParticipantCars participant = setCar();
		TryCount tryCount = setTryCount();
		Winners winners = playGame(participant, tryCount);
		awardWinner(winners);
	}

	private static ParticipantCars setCar() {
		// TODO : 자동차 이름 설정
		// TODO : 전체 input에서 쉼표로 구분

		// TODO : INPUT 에러처리
		return new ParticipantCars();
	}

	private static TryCount setTryCount() {
		// TODO : 사용자에게 이동 횟수 입력받기

		// TODO : INPUT 에러처리
		return new TryCount();
	}

	private static Winners playGame(ParticipantCars participant, TryCount tryCount) {
		// TODO : tryCount 내 각 자동차들 전진
		/* TODO
		전진여부 체크
		0~9의 random값 돌리기
		4 이상일 경우 전진
		3 이하일 경우 스탑
		 */
		return new Winners();
	}

	private static void awardWinner(Winners winners) {
		// TODO : 우승자 공유
		// TODO : 우승자가 한명 이상일 경우 쉼표로 이름 구분해 출력
	}
}
