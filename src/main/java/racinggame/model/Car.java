package racinggame.model;

import static nextstep.utils.Randoms.*;

import lombok.ToString;

@ToString
public class Car {

	private CarName name;
	private MoveCount moveCount = new MoveCount();

	public Car(String name) {
		this.name = new CarName(name);
	}

	public String getName() {
		return name.getValue();
	}

	public int getMoveCount() {
		return moveCount.getValue();
	}

	public String printMoveCount() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < moveCount.getValue(); i++) {
			result.append("-");
		}
		return result.toString();
	}

	public void move() {
		if (isMovable(pickNumberInRange(0, 9))) {
			this.moveCount.plusCount();
		}
	}

	boolean isMovable(int randomValue) {
		return randomValue >= 4;
	}
}
