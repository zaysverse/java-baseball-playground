package baseball;

public class PlayResult {
    private int ball = 0;
    private int strike = 0;

    public int getBall() {
        return this.ball;
    }

    public int getStrike() {
        return this.strike;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {    // status == BallStatus.STRIKE 처럼 직접 접근하는 것보다 객체에 메시지를 내리는 식으로 코딩한다.
            this.strike++;
        }
        if (status.isBall()){
            this.ball++;
        }
    }
}
