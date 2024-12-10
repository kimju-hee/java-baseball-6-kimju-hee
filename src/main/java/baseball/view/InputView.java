package baseball.view;

import baseball.view.validation.Number2Validator;
import baseball.view.validation.NumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputNumber() {
        String number = Console.readLine();
        NumberValidator.validator(number);
        return number;
    }

    public String inputAnotherGameInput() {
        String number = Console.readLine();
        Number2Validator.validator(number);
        return number;
    }
}
