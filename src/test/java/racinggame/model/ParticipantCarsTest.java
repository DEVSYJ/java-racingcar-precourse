package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.InputException;

class ParticipantCarsTest {
	private static final String[] participantCarsNames
		= {"pobi,crong,honux", "pobi", ",crong,", ",,honux", "pobi,,", "a b, c d"};
	private static final String[] missMatchParticipantCarsNames
		= {"pobi123,crong,honux", "pobi123", ",crong123,", ",,honux123", "pobi123,,", "a b, c d123"};
	private static final String participantCarsName = "pobi,crong,honux";

	@Test
	void createParticipantCarsSuccessTest() {
		for (String participantCarsNamesString : participantCarsNames) {
			ParticipantCars participantCars = new ParticipantCars(participantCarsNamesString);

			System.out.println(participantCars);

			assertThat(participantCars.getParticipants())
				.hasSizeGreaterThan(0);
		}
	}

	@Test
	void createParticipantCarsFailTest() {
		for (String participantCarsNamesString : missMatchParticipantCarsNames) {
			assertThrows(InputException.class, () -> {
				new ParticipantCars(participantCarsNamesString);
			});
		}
	}

	@Test
	void moveParticipantCarsSuccessTest() {
		ParticipantCars participantCars = new ParticipantCars(participantCarsName);
		participantCars.moveEachCar();

		for (int i = 0; i < 3; i++) {
			assertThat(participantCars.getParticipants().get(i).getMoveCount().getValue())
				.isNotNegative();
		}
	}
}
