package HControlStatement;

/*
한 정수를 입력받는다.
이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
한번만 거듭제곱해도 본래 숫자가 되면 결과는 1이다.
 */

import java.util.Scanner;

public class H5ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = scanner.nextInt(); // n = 2
        int count = 0;
        int power = num;
        // 2^2 2^3 2^4 ...
        while (true) {
            power *= num; // 거듭제곱 수행
            count++;  // 횟수 증가
            System.out.println(String.format("%d 번 거듭제곱 : %d", count, power));

            // 거급제곱 결과 1의 자리 숫자가 원래 숫자와 일치
            if (power % 10 == num) {
                System.out.println("-----------------------------------");
                System.out.println(count + " 번 거듭제곱 시 원래의 숫자의 1의 자리랑 일치");
                break;
            }
        }
    }
}
