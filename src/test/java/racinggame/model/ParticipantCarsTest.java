package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParticipantCarsTest {
	private static final String[] participantCarsNames
		= {"pobi,crong,honux", "pobi", ",crong,", ",,honux", "pobi,,"};

	@Test
	void createParticipantCarsSuccessTest() {
		for (String participantCarsNamesString : participantCarsNames) {
			ParticipantCars participantCars = new ParticipantCars(participantCarsNamesString);

			assertThat(participantCars.getParticipants())
				.hasSizeGreaterThan(0);
		}
	}
}
