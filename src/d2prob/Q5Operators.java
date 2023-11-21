package d2prob;

import java.util.Scanner;

/*
기온아 20도 초과, 30도 미만일 때 나들이 가기가 좋다
기온을 입력받아 오늘 나들이를 갈지 말지를 t 또는 f 로 나타내시오
 */
public class Q5Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println(temperature > 20 && temperature < 30);
    }
}
