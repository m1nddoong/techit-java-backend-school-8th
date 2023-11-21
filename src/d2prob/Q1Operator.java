package d2prob;

import java.util.Scanner;

/*
Q1 : 세 과목의 시험점수(int)가 입력될 떄,
평균 점수(double)를 구하여라
 */
public class Q1Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나눗셈 직전에 피연산자 둘중 하나는 실수여야 한다!
        double totalScore = 0.0;

        int[] scores = new int[3];  // 배열 선언
        for (int i = 0; i < 3; i++) {
            scores[i] = scanner.nextInt();
            totalScore += scores[i];
        }
        System.out.println(totalScore / 3);
    }
}
