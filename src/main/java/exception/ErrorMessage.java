package exception;

public enum ErrorMessage {
	CAR_NAME_INPUT_FORMAT_ERROR_MESSAGE("[ERROR] 차 이름은 5자 이하여야 합니다."),
	TRY_COUNT_INPUT_FORMAT_ERROR_MESSAGE("[ERROR] 시도 횟수는 양의 정수여야 합니다.");

	private String errorMessage;

	ErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
