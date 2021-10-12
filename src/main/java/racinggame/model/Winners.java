package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Winners {
	List<Car> winners = new ArrayList<>();

	public Winners(ParticipantCars participant) {
		int bestDistance = 0;
		for (Car car : participant.getParticipants()) {
			addIfTopWinner(car, bestDistance);
			bestDistance = setIfTopWinner(car, bestDistance);
		}
	}

	private int setIfTopWinner(Car car, int bestDistance) {
		if (car.getMoveCount() > bestDistance) {
			winners.clear();
			winners.add(car);
			return car.getMoveCount();
		}
		return bestDistance;
	}

	private void addIfTopWinner(Car car, int bestDistance) {
		if (car.getMoveCount() == bestDistance) {
			winners.add(car);
		}
	}

	@Override
	public String toString() {
		if (winners.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		result.append(winners.get(0).getName());
		for (int i = 1; i < winners.size(); i++) {
			result.append(",");
			result.append(winners.get(i).getName());
		}
		return result.toString();
	}
}
