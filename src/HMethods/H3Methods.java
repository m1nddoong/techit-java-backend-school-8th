package HMethods;

/*
사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.
 */

import java.util.Scanner;

public class H3Methods {

    public static void Calc(int first, String operator, int second) {
        switch (operator) {
            case "+":
                System.out.println(String.format("%d + %d = %d", first, second, first+second));
                break;
            case "-":
                System.out.println(String.format("%d - %d = %d", first, second, first-second));
                break;
            case "*":
                System.out.println(String.format("%d * %d = %d", first, second, first*second));
                break;
            case "/":
                System.out.println(String.format("%d / %d = %d", first, second, first / second));
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        String operator = scanner.next();
        int second = scanner.nextInt();

        Calc(first, operator, second);
    }
}
