package racinggame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ParticipantCars {
	private List<Car> participants = new ArrayList<>();

	public ParticipantCars(String participantsString) {
		StringTokenizer st = new StringTokenizer(participantsString, ",");

		while (st.hasMoreTokens()) {
			participants.add(new Car(st.nextToken()));
		}
	}

	public void moveEachCar() {
		for (Car car : participants) {
			car.move();
		}
	}
}
