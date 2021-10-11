package racinggame.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MoveCount {
	private int value = 0;

	public void plusCount() {
		this.value++;
	}
}
