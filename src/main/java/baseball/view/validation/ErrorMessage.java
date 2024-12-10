package baseball.view.validation;

public enum ErrorMessage {
    INVALID_NUMBER("세 자리 숫자를 입력해야 합니다."),
    INVALID_NUMBER2("1 또는 2의 숫자를 입력해야 합니다");
    
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}