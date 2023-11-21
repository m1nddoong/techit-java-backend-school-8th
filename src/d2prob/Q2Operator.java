package d2prob;

/*
Q2 : 현재 오전 7시 이다.
n을 입력받아서,
n 시간 후 12시까지 표기된 시계에서
시침이 어떤 숫자 위에 있는지 구하시오. (단, 12시는 0으로 표기한다)
(0 <= n <= 127);
 */

import java.util.Scanner;

public class Q2Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = 7; // 현재는 오전 7시
        int n = scanner.nextInt(); // n시간 입력

        int clockPoint = (current + n) % 12;
        System.out.println(clockPoint);
    }
}
