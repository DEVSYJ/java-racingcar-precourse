package racinggame.model;

import static nextstep.utils.Randoms.*;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Car {
	private CarName name;
	private MoveCount moveCount = new MoveCount();

	public Car(String name) {
		this.name = new CarName(name);
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
