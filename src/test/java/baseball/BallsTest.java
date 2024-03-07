package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {
    private Balls answer;

    @BeforeEach
    void setUp() {
        answer = new Balls(Arrays.asList(2, 4, 9));
    }

    @Test
    void balls_nothing() {
        PlayResult result = answer.play(Arrays.asList(1, 5, 3));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void balls_ball1_strike1() {
        PlayResult result = answer.play(Arrays.asList(2, 3, 4));
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(1);
    }
}
