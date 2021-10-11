package racinggame.model;

import static exception.ErrorMessage.*;

import exception.InputException;
import lombok.Getter;

@Getter
public class TryCount {
	private Integer value;

	public TryCount(String tryCountString) {
		Integer tryCount;
		try {
			tryCount = Integer.parseInt(tryCountString);
		} catch (NumberFormatException e) {
			throw new InputException(TRY_COUNT_INPUT_FORMAT_ERROR_MESSAGE);
		}
		if (tryCount < 1) {
			throw new InputException(TRY_COUNT_INPUT_FORMAT_ERROR_MESSAGE);
		}
		this.value = tryCount;
	}
}
