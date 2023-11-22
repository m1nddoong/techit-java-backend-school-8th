import java.util.Scanner;

public class D3ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나이를 입력받고, 나이가 20 미만일때 입장불가 출력
        // int age = scanner.nextInt()
        int age = 20;
        if (age < 20) {  // if 탭 누르면 자동 완성
            System.out.println("입장불가");
            System.out.println(String.format("%d년 뒤에 오세요" , 20 - age));
        }

        int multiple = 7;
        // multiple이 2의 배수면, 2의 배수 출력
        if (multiple % 2 == 0) {
            System.out.println("2의 배수");
        }
        // multiple이 5의 배수면, 5의 배수 출력
        if (multiple % 5 == 0) {
            System.out.println("5의 배수");
        }
        // multiple이 10의 배수면, 10의 배수 출력
        if (multiple % 10 == 0) {
            System.out.println("10의 배수");
        }


        // 몇년인지 입력받는다.
        int year = 2023;
        // <윤년의 조건>
        // 1) 4의 배수이면서 100의 배수가 아니여야 한다.
        // 2) 4의 배수이면서, 400의 배수여야 한다
        if (year % 4 == 0) {
            String message = scanner.nextLine();
            if (year % 100 != 0) {
                System.out.println("윤년이다");
            }
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("윤년이 아니다.");
            }
            if (year % 400  == 0) {
                System.out.println("윤년이다.");
            }
        }

        // 2의 배수면 짝수, 아니면 홀수
        // int number = 10;
        // if (number % 2 == 0) {
        //     System.out.println("짝수");
        // } else {
        //     System.out.println("홀");
        // }

        /*
        어떤  학생의 시험점수가 입력 되었을 때,
        80점을 넘으면 "Good Job"
        못넘으면 "Too Bad"
         */

        //int score = scanner.nextInt();
        //if (0 <= score && score <= 100) {
        //    if (score > 80) {
        //        System.out.println("Good Job");
        //    } else {
        //        System.out.println("Too Bad");
        //    }
        //} else {
        //    System.out.println("잘못된 입력입니다.");
        //}

        int result;
        int x = 10;
        int y = -2;
        if (x > 0) {
            if (y > 0) {
                result = 1;
            } else {
                result = 2;
            }
        } else {
            if (y > 0) {
                result = 3;
            } else {
                result = 4;
            }
        }
        System.out.println(result);

        // 0 ~ 30 : 좋음
        // 31 ~ 80 : 보통
        // 81 ~ 150 : 나쁨
        // 151 ~ : 매우 나쁨
        int dust = 15;
        if (dust <= 30) {
            System.out.println("좋음");
        } else if (dust <= 80) { // 여기서 (30 < dust) 는 무조건 성립하기 떄문에 생략해도 됨
            System.out.println("보통");
        } else if (dust <= 150) {
            System.out.println("나쁨");
        } else {
            System.out.println("매우 나쁨");
        }


        // switch
        // String input = scanner.nextLine();
        String input = "w";
        // (확인하고 싶은 값)
        switch (input) {
            case "w" : // imput == "w"
                System.out.println("up");
                break;
            case "a": // imput == "a"
                System.out.println("left");
                break;
            case "s": // imput == "s"
                System.out.println("down");
                break;
            case "d": // imput == "d"
                System.out.println("right");
                break;
            // 기본 동
            default:
                System.out.println("bad input");
                break;
        }

        // while
        // 대출금 천만원
        // int loan = 1717; //1717 을 하면 대출금을 갚더라도 이자 때문에 무한루프
        int loan = 1716;
        // 대출금 남았니?
        int months = 0;
        while (loan > 0) {
            loan -= 50;
            loan *= 1.03;
            months++;
            System.out.println("남은 대출액: " + loan);
        }
        System.out.println("대출 상환 완료! 총 걸린 개월수: " + months);

//        int[] numbers = {2, 3, 5, 6, 19, 23}; // 배열 만들어주기
//        int i=0;
//        // 총합 및 평균 구하기
//
//        int sum = 0;
//        while (i < 6) {
//            System.out.println(numbers[i]);
//            sum += numbers[i];
//            i++;
//        }
//        System.out.println("총합은 : " + sum);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }


        /*
        *
        **
        ***
        ****
        *****
         */

        // 별찍기 문제 -> 나중에 백준 "분할정복" 점찍기 문제 풀어보기
        for (int i = 0; i < 5; i++) {           //i는 몇번 쨰 줄인지
            for (int j = 0; j < i+1; j++) {     //j는 몇개를 찍을건지
                System.out.print("*");
            }
            System.out.println();
        }


        //foreach
        String[] fruits = {"apple", "peer", "banna"};
        for(String names : fruits) {   //name : 뭐라고 부를건지?, fruit: 배열
            System.out.println(names);
        }

        // 같은 기능을 하는 for문은
        for (int i = 0; i < fruits.length; i++) {
            String names = fruits[i];
            System.out.println(names);
        }

        // 반복문 제어
        int wallet = 20000;
        int pizza = 5000;
        while (true) {
            wallet -= pizza;
            if (wallet < 0) {
                System.out.println("돈 다 써서 더 못먹음");
                // 그만먹자
                break;
            }
            System.out.println(String.format("1인분 먹고 %d 남음", wallet));
        }


        // numbers 내부에 19가 어디에 있는지 찾기
        // 있다면 그 위치를, 없다면 -1 을 출력하도록
        int[] numbers = new int[] {1, 3, 4, 11, 19, 21, 23};
        int target = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 19) {
                target = i;
                break;
            }
        }
        System.out.println(target);


        // continue
        // 0 ~ 10 사이의 짝수만 출력하고 싶다.
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {   // i가 짝수가 아닐 경우,
                continue;       // 나머지 코드는 무시하고 증감문으로 이동
            }
            System.out.println(i);
        }




        // 백신을 맞지 않은 사람만 세기
        boolean[] vaccinated = {true, false, false, false, false, false, false, true, true};
        int groupCount = 0;
        for (boolean vaccine : vaccinated) {
            if (vaccine) {
                System.out.println("백신 맞으면 세지 않아요");
                continue;
            }
            groupCount++;
            // 일정 인원 이상이면 입장불가
            if (groupCount > 5) {
                System.out.println("입장이 불가합니다...");
                break;
            }
        }
    }
}
