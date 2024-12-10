package baseball.controller;

import baseball.dto.TargetNumber;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.handler.InputHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballController {
    private static boolean isGameOver = false;
    private TargetNumber targetNumber; // 인스턴스 변수

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);

    public void start() {
        while (true) {
            targetNumber = new TargetNumber(); // 인스턴스 변수 초기화
            targetNumber.setTargetNumber();   // 타겟 숫자 설정

            outputView.printStartGameText();
            isGameOver = false;
            playGame();

            if (askAnotherGame() != 1) {
                break;
            }
        }
    }

    public void playGame() {
        while (!isGameOver) {
            outputView.printNumberInputText();
            String number = inputHandler.receiveValidNumberInput();
            List<Integer> numberList = Arrays.stream(number.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> target = targetNumber.getTargetNumber(); // 인스턴스 변수 사용
            List<Integer> result = countBallStrike(target, numberList);

            int ball = result.get(0);
            int strike = result.get(1);

            outputView.printGameResult(ball, strike);

            if (strike == 3) {
                isGameOver = true;
                outputView.printGameOver();
            }
        }
    }

    public List<Integer> countBallStrike(List<Integer> targetNumber, List<Integer> numberList) {
        List<Integer> ballStrike = new ArrayList<>();
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            if (targetNumber.get(i).equals(numberList.get(i))) {
                strike += 1;
            }
        }

        for (int num : numberList) {
            if (targetNumber.contains(num)) {
                ball += 1;
            }
        }
        ball -= strike;
        ballStrike.add(ball);
        ballStrike.add(strike);
        return ballStrike;
    }

    public int askAnotherGame() {
        outputView.askAnotherGame();
        String input = inputHandler.receiveValidNumber2Input();
        int number = Integer.parseInt(input);
        return number;
    }
}
