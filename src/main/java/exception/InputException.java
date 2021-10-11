package exception;

public class InputException extends CustomException {
	public InputException(ErrorMessage errorMessage) {
		super(errorMessage);
	}
}
