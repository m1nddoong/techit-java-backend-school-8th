package HControlStatement;

/*
1. 1월 1일의 요일과
2. 2월 29일의 유무가 정수, 불린으로 주어진다.
이때 1월 1일의 요일은,
: 0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일

으로 입력된다.
각 달의 1일이 무슨 요일인지 1월부터 12월까지 순서대로 출력하는 코드를 작성하시오.
 */

import java.util.Scanner;

public class H6ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDay = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        // 1월 1일의 요일은 숫자로 입력된다 (0 ~ 6)
        System.out.println("0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일");
        System.out.print("1월 1일의 요일을 숫자로 입력하세요 : ");
        int day = scanner.nextInt();  // 0입력 -> 1.1(월)

        System.out.print("2월 윤일 유무 : ");
        boolean leapDay = scanner.nextBoolean(); // 2월 29일 존재 : true, 그렇지 않으면 : false

        // 1월 계산
        System.out.println(String.format("1월 1일은 %s입니다.", weekDay[day]));

        // 2월 게산 -> 이게 바로 2.1일의 요일, 목요일
        int a = 31 % 7;
        System.out.println(String.format("2월 1일은 %s입니다.", weekDay[a]));

        // 3월 계산
        // 내가 계산하는 방법은
        // 일단 1월1일이 포함된 주의 일수를 모두 날려버리고, 남은 일수에 7로 나눈 나머지를 요일로 환산
        if (leapDay == true) { // 2월달이 29일일떄
            System.out.println(String.format("3월 1일은 %s입니다.", weekDay[29 - 7 - a - 1 % 7]));
        }
        // 3월 계산
        //
    }
}
