package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {
	private Car car;

	@BeforeEach
	void beforeEach() {
		car = new Car("test");
	}

	@Test
	void forwardMoveTest() {
		int[] mockRandomValues = {4, 5, 6, 7, 8, 9};
		for (int mockRandomValue : mockRandomValues) {
			assertThat(car.isMovable(mockRandomValue))
				.isTrue();
		}
	}

	@Test
	void stopMoveTest() {
		int[] mockRandomValues = {0, 1, 2, 3};
		for (int mockRandomValue : mockRandomValues) {
			assertThat(car.isMovable(mockRandomValue))
				.isFalse();
		}
	}
}
