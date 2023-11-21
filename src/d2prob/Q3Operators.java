package d2prob;

import java.util.Scanner;
import javax.annotation.processing.SupportedSourceVersion;

/*
Scanner 이외의 변수를 한개만 선언하여
정수를 총 5개 입력받아,
첫번쨰 입력된 숫자에, 이후에 입력된 숫자를 순서대로
더하고 배고 곱하고 몫을 구하여 출력하여라.
 */
public class Q3Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] num = new int[5];
        int num = scanner.nextInt();

        num += scanner.nextInt();
        num -= scanner.nextInt();
        num *= scanner.nextInt();
        num /= scanner.nextInt();
        System.out.println(num);

        //num[0] = scanner.nextInt();
        //num[1] = scanner.nextInt();
        //num[2] = scanner.nextInt();
        //num[3] = scanner.nextInt();
        //num[4] = scanner.nextInt();

        //int sum = num[0];
        //sum += num[1];
        //System.out.println(sum);
        //sum -= num[2];
        //System.out.println(sum);
        //sum *= num[3];
        //System.out.println(sum);
        //sum /= num[4];
        //System.out.println(sum);

        // 내 코드 리뷰
        // 변수를 여러개 쓸 필요 없이, nextInt() 로 여러개 입력받을 수 있다?
    }
}
