import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    // 사용자에게 3자리의 수를 입력받는 함수
    public static HashMap<Integer, Integer> inputNumbers() {
        System.out.print("숫자를 입력해 주세요 : ");
        HashMap<Integer, Integer> numbers = new HashMap<>();
        String input = scanner.nextLine();
        for (int i = 0; i < Baseball.NUMSIZE; i++) {
            numbers.put(input.charAt(i)-'0', i);
        }
        return numbers;
    }

    public static void printRoundResult(int[] bs){
        StringBuilder sb = new StringBuilder();
        if(bs[0] != 0) sb.append(bs[0]).append("볼 ");
        if(bs[1] != 0) sb.append(bs[1]).append("스트라이크");
        if(sb.isEmpty()) sb.append("낫싱");

        System.out.println(sb.toString());
    }

    public static void printGameOverMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    // 1을 입력받으면 true 반환 (다시 시작)
    public static boolean inputRestartOrEnd(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int value = scanner.nextInt();
        if(scanner.nextInt() == 1){
            return true;
        }
        return false;
    }
}
