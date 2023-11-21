package OperatorPractice;

/*
두 정수 A와 B가 입력될 때,
A가 B로 나누어 떨어지는지를 true 또는 false로 출력하여라.
 */

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        System.out.print("A가 B로 나누어 떨어집니까? : ");
        System.out.println(A % B == 0);
    }
}
