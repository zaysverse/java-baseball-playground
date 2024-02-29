import java.util.HashMap;
import java.util.Random;

public class Baseball {
    public static final int NUMSIZE = 3;
    public static final int BALL_INDEX = 0;
    public static final int STRIKE_INDEX = 1;

    private HashMap<Integer, Integer> numbers; // <서로 다른 수, 인덱스>

    public Baseball() {
        init();
    }

    public void run() {
        while (!round()) {
        }
        View.printGameOverMessage();
        if (View.inputRestartOrEnd()) {
            init();
            run();
        }
    }


    public boolean round() {
        HashMap<Integer, Integer> userNums = View.inputNumbers();
        int[] result = judgeRound(userNums);
        View.printRoundResult(result);

        return result[STRIKE_INDEX] == NUMSIZE;
    }


    // 컴퓨터가 무작위로 3자리의 수를 정한다
    private void init() {
        numbers = new HashMap<>();
        for (int i = 0; i < NUMSIZE; i++) {
            numbers.put(pickRandomNumber(), i);
        }
    }

    private int pickRandomNumber(){
        Random random = new Random();
        int n = random.nextInt(9)+1;
        if(numbers.containsKey(n)) return pickRandomNumber();
        return n;
    }

    private int[] judgeRound(HashMap<Integer, Integer> userNums) {
        int ball = 0, strike = 0;
        for (Integer userNum : userNums.keySet()) {
            if (numbers.containsKey(userNum) && numbers.get(userNum).equals(userNums.get(userNum))) {
                strike++;
                continue;
            }
            if (numbers.containsKey(userNum)) ball++;

        }
        return new int[]{ball, strike};
    }


}
