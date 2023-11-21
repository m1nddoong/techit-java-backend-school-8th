package d2prob;

import java.util.Scanner;

/*
Q6 :
세개의 양의 정수 A, B, C를 입력받아서,
A가 B와 C의 공배수인지를 true 또는 false로 출력하여라.
 */
public class Q6Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        boolean isCommonMultiple = (A % B == 0) && (A % C == 0);  // 괄호 안써도 됨.
        System.out.println(isCommonMultiple);
    }
}
