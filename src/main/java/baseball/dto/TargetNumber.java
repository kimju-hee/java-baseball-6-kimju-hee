package baseball.dto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class TargetNumber {
    private List<Integer> targetNumber = new ArrayList<>();

    public List<Integer> setTargetNumber() {
        while (targetNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!targetNumber.contains(randomNumber)) {
                targetNumber.add(randomNumber);
            }
        }
        return targetNumber;
    }

    public List<Integer> getTargetNumber() {
        return targetNumber;
    }
}