package d3prob;

/*
ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
이때, 밤위 밖의 입력이 들어오면, "잘못된 입력입니다" 를 출력하여라.
 */

import java.util.Scanner;

public class Q1Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ~ 26 사이의 숫자 입력 : ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 26) {
            System.out.println((char) (64 + n));
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
