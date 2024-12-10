package baseball.view.validation;

public class Number2Validator {
    public static void validator(String input) {
        isNumber(input);
        isOneTwo(input);
    }

    public static void isNumber(String input) {
        if (!input.matches("\\d+")) {
            throwError();
        }
    }

    public static void isOneTwo(String input) {
        if ((Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2)) {
            throwError();
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER2.getMessage());
    }
}
