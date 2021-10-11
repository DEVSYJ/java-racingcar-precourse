package racinggame.model;

import static exception.ErrorMessage.*;

import exception.InputException;
import lombok.Getter;

@Getter
public class CarName {
	private static final int MAX_LENGTH_CAR_NAME = 5;
	private String name;

	public CarName(String name) {
		if (name.length() > MAX_LENGTH_CAR_NAME) {
			throw new InputException(CAR_NAME_INPUT_FORMAT_ERROR_MESSAGE);
		}

		this.name = name;
	}
}
