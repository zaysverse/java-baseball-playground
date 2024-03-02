package baseball;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MIN_MAX = 9;

    public static boolean validNo(int no) {
        return no >= MIN_NO && no <= MIN_MAX;
    }
}
