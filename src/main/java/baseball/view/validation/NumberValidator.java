package baseball.view.validation;

public class NumberValidator {

    public static void validator(String input) {
        isNumber(input);
        isNumberLength(input);
    }

    public static void isNumber(String input) {
        if (!input.matches("\\d+")) {
            throwError();
        }
    }

    public static void isNumberLength(String input) {
        if (input.length() != 3) {
            throwError();
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER.getMessage());
    }
}
