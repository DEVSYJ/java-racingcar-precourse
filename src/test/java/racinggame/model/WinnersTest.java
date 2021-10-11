package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WinnersTest {
	private static final String participantCarsName = "pobi,crong,honux";

	@Test
	void createOneWinnersSuccessTest() {
		ParticipantCars participantCars = new ParticipantCars(participantCarsName);
		participantCars.getParticipants().get(0).forceMove();

		Winners winners = new Winners(participantCars);

		assertThat(winners.winners)
			.hasSize(1);
	}

	@Test
	void createTwoWinnersSuccessTest() {
		ParticipantCars participantCars = new ParticipantCars(participantCarsName);
		participantCars.getParticipants().get(0).forceMove();
		participantCars.getParticipants().get(1).forceMove();

		Winners winners = new Winners(participantCars);

		assertThat(winners.winners)
			.hasSize(2);
	}
}
