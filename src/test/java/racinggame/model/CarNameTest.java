package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.InputException;

class CarNameTest {
	private static final String[] matchCarNames = {"pobi", "crong", "honux", "a"};
	private static final String[] missMatchCarNames = {"123456", "missmatch"};

	@Test
	void createCarNameSuccessTest() {
		for (String carNameString : matchCarNames) {
			CarName carName = new CarName(carNameString);

			assertThat(carName.getValue())
				.hasSizeLessThanOrEqualTo(5);
		}
	}

	@Test
	void createCarNameFailTest() {
		for (String carNameString : missMatchCarNames) {
			assertThrows(InputException.class, () -> {
				new CarName(carNameString);
			});
		}
	}
}
