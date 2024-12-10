package baseball.view.handler;

import baseball.view.ErrorView;
import baseball.view.InputView;
import java.util.function.Supplier;

public class InputHandler {
    private final InputView inputView;

    public InputHandler(InputView inputView) {
        this.inputView = inputView;
    }

    public String receiveValidNumberInput() {
        return receiveValidatedInput(inputView::inputNumber);
    }

    public String receiveValidNumber2Input() {
        return receiveValidatedInput(inputView::inputAnotherGameInput);
    }

    private <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                ErrorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
