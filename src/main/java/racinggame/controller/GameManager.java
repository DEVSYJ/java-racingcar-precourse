package racinggame.controller;

import static nextstep.utils.Console.*;
import static racinggame.view.ConsoleOutput.*;

import exception.InputException;
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
		printMessageForParticipantCarsNameInput();
		ParticipantCars result;
		try {
			result = new ParticipantCars(readLine());
		} catch (InputException e) {
			printlnMessage(e.getMessage());
			return setCar();
		}
		return result;
	}

	private static TryCount setTryCount() {
		printMessageForTryCountInput();
		TryCount tryCount;
		try {
			tryCount = new TryCount(readLine());
		} catch (InputException e) {
			printlnMessage(e.getMessage());
			return setTryCount();
		}
		return tryCount;
	}

	private static Winners playGame(ParticipantCars participant, TryCount tryCount) {
		printExecutionResultStringOutput();

		for (int i = 0; i < tryCount.getValue(); i++) {
			participant.moveEachCar();
			printlnMessage(participant.toString());
		}

		return new Winners(participant);
	}

	private static void awardWinner(Winners winners) {
		printWinnersOutput(winners.toString());
	}
}
