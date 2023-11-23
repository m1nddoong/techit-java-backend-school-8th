package HMethods;

/*
미세먼지 수치를 입력받고,
0 ~ 30 이면 "좋음"
31 ~ 80 이면 "보통"
80 ~ 150 이면 "나쁨"
151 ~ 이면 "매우 나쁨"
이라는 문자열을 반환하는 메서드를 작성하시오.
 */

import java.util.Scanner;

public class H1Methods {

    public static void whetherIs(int dust) {
        if (0 <= dust && dust <= 30) {
            System.out.println("좋음");
        } else if (31 <= dust && dust <= 80) {
            System.out.println("보통");
        } else if (81 <= dust && dust <= 150) {
            System.out.println("나쁨");
        } else {
            System.out.println("매우 나쁨");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dust = scanner.nextInt();
        whetherIs(dust);

    }
}
