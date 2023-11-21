package OperatorPractice;

/*
어떤 수 A와 B가 입력된다..
A를 B로 나눈 몫과 나머지를, "A = 몫 * B + 나머지"의 형태로 출력하여라.
예) A = 10, B = 3가 입력될때,
A = 3 * B + 1
 */

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();

        int quotient = A / B;
        int remainder = A % B;

        System.out.println(String.format("A = %d * B + %d", quotient, remainder));
    }
}
