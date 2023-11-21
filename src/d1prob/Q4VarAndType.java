package d1prob;/*
시간과 오전 오후를 입력받고, 11 오전 -> nextInt() -> nextLine()
오전 XX시
의 형식으로 출력하는 코드를 작성하시오.
 */

import java.util.Scanner;

public class Q4VarAndType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        // nextLine : 남은 줄 전체 (스페이스가 들어간만큼 다 저장딘다)
        // next : 다음 단어
        String amPm = scanner.next();
        System.out.println(String.format("%s %d시", amPm, time));
    }
}
