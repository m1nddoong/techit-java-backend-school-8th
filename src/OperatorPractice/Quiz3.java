package OperatorPractice;

/*
ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
 */

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ~ 26 사이의 숫자 입력 : ");
        int n = scanner.nextInt();
        System.out.println((char)(65 + n));
    }
}
