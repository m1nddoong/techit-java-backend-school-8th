package HControlStatement;


/*
1인치는 2.54 센티미터이다.
사용자에게 정수를 두개 입력받는다.
첫번째 정수가 0이라면 두번째 정수는 센티미터이고,
첫번째 정수가 1이라면 두번째 정수는 인치이다.
센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로 소수점 2째 자리까지 출력하여라.
 */

import java.util.Scanner;

public class H3ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정수 2개 입력 받기
        System.out.println("정수 두개를 입력하시오.");
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();

        if (a == 0) {
            System.out.println(String.format("%d cm", b));
        } else if (a == 1) {
            System.out.println(String.format("%.2f inch", (double) b * 2.54));
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
