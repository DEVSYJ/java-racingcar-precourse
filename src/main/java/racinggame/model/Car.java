package racinggame.model;

import lombok.ToString;

@ToString
public class Car {
	private CarName name;

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
}
