package racinggame.view;

public class ConsoleOutput {
	private static final String INPUT_PARTICIPANT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
	private static final String OUTPUT_WINNERS_MESSAGE_1 = "최종 우승자는 ";
	private static final String OUTPUT_WINNERS_MESSAGE_2 = " 입니다.";
	private static final String OUTPUT_EXECUTION_RESULT_MESSAGE = "실행결과";

	public static void printMessageForParticipantCarsNameInput() {
		printlnMessage(INPUT_PARTICIPANT_CARS_NAME_MESSAGE);
	}

	public static void printMessageForTryCountInput() {
		printlnMessage(INPUT_TRY_COUNT_MESSAGE);
	}

	public static void printWinnersOutput(String winnersString) {
		printlnMessage(OUTPUT_WINNERS_MESSAGE_1 + winnersString + OUTPUT_WINNERS_MESSAGE_2);
	}

	public static void printExecutionResultStringOutput() {
		printlnMessage(OUTPUT_EXECUTION_RESULT_MESSAGE);
	}

	public static void printlnMessage(String message) {
		System.out.println(message);
	}
}
