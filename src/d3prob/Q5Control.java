package d3prob;
import java.util.Scanner;

/*
정수 n과 n개의 정수가 순서대로 입력된다.
n개의 정수의 퐁합, 평균을 출력하여야.
 */

public class Q5Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 n: ");
        int n = scanner.nextInt(); // 정수 n
        int sum = 0;
        //int[] intArr = new int[n];

        // 몇개의 정수가 입력될지 n에 저장되어 있다.
        // 즉 n번 반복해서 입력을 받으면 된다
        for (int i = 0; i < n; i++) {
            // intArr[i] = scanner.nextInt();
            // sum += intArr[i];

            sum += scanner.nextInt();
        }
        System.out.println("총합은 : " + sum);
        System.out.println("평균은 : " + (double) sum / n);
    }
}

/*
int 배열에 넣어주는 방법도 맞긴하다.
 */
