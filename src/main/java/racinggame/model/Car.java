package racinggame.model;

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
		/* TODO
		전진여부 체크
		0~9의 random값 돌리기
		4 이상일 경우 전진
		3 이하일 경우 스탑
		 */
	}

	boolean move(int randomValue) {
		return false;
	}
}
