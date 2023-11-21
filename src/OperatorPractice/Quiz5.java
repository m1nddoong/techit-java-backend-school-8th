package OperatorPractice;

/*
Scanner 이외의 변수를 한개만 선언하여
정수 A를 입력받아,
A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
 */

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.println(String.format("A^2의 1의 자리 : %d", A*A % 10));
        System.out.println(String.format("A^4의 1의 자리 : %d", A*A*A*A % 10));
        System.out.println(String.format("A^8의 1의 자리 : %d", A*A*A*A % 10));
    }
}
