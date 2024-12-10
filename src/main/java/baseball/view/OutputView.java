package baseball.view;

public class OutputView {
    public void printStartGameText() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printNumberInputText() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public void printGameResult(int ball, int strike) {
        if (ball == 0 && strike > 0) {
            System.out.println(strike + "스트라이크");
        }
        if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        }
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        }
        if (strike != 0 && ball != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }

    public void printGameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void askAnotherGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
