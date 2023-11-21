package d1prob;/*
두 개의 숫자를 입력받고,
순서를 바꿔서 출력하시오
 */

import java.util.Scanner;

public class Q2VarAndType {
    public static void main(String[] args) {
        // Scanner를 사용해 정수 2개 입력을 받는다 (*2)
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 입력받은 변수를 순서를 바꿔서 출력한다.
        System.out.println(b);
        System.out.println(a);
    }
}
