package exception;

public enum ErrorMessage {
	PARTICIPANT_CARS_INPUT_FORMAT_ERROR_MESSAGE("[ERROR] 입력은 쉼표(,) 기준으로 구분되어야 합니다."),
	TRY_COUNT_INPUT_FORMAT_ERROR_MESSAGE("[ERROR] 시도 횟수는 양의 정수여야 합니다.");

	private String errorMessage;

	ErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
