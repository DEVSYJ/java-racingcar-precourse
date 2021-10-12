package racinggame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import lombok.Getter;

@Getter
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

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Car car : participants) {
			result.append(car.getName());
			result.append(" : ");
			result.append(car.printMoveCount());
			result.append("\n");
		}
		return result.toString();
	}
}
