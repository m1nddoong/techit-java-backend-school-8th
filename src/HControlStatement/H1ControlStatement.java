package HControlStatement;

/*
한 정수를 입력받아,
해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
 */

import java.util.Scanner;

public class H1ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 n : ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("양수 입니다.");
        } else if (n < 0) {
            System.out.println("음수 입니다.");
        } else {
            System.out.println("0 입니다.");
        }
    }
}
