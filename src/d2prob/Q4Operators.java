package d2prob;

import java.util.Scanner;

/*
Q4
 */
public class Q4Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A*A*A >= B*B);
        // 자바에서는 **2 이런식의 제곱근 표현이 어려움.
    }
}


