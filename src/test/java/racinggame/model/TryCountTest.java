package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.InputException;

class TryCountTest {
	private static final String[] matchTryCountString = {"1", "2", "11"};
	private static final String[] missMatchTryCountString = {"r", "가", "0", "-1"};

	@Test
	void createTryCountSuccessTest() {
		for (String tryCountString : matchTryCountString) {
			TryCount tryCount = new TryCount(tryCountString);

			assertThat(tryCount.getValue())
				.isPositive();
		}
	}

	@Test
	void createCarNameFailTest() {
		for (String tryCountString : missMatchTryCountString) {
			assertThrows(InputException.class, () -> {
				new TryCount(tryCountString);
			});
		}
	}
}
