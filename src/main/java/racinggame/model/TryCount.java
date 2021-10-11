package racinggame.model;

import static exception.ErrorMessage.*;

import exception.InputException;
import lombok.Getter;

@Getter
public class TryCount {
	private Integer tryCount;

	public TryCount(String readLine) {
		// TODO : 사용자에게 이동 횟수 입력받기
		// TODO : INPUT 에러처리
		if (false) {
			throw new InputException(TRY_COUNT_INPUT_FORMAT_ERROR_MESSAGE);
		}
	}
}
