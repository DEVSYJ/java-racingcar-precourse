package racinggame.model;

import static exception.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;

import exception.InputException;

public class ParticipantCars {
	List<Car> participants = new ArrayList<>();

	public ParticipantCars(String participantsString) {
		// TODO : 자동차 이름 설정
		// TODO : 전체 input에서 쉼표로 구분

		// TODO : INPUT 에러처리
		if (false) {
			throw new InputException(PARTICIPANT_CARS_INPUT_FORMAT_ERROR_MESSAGE);
		}

	}
}
