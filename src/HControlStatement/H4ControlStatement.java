package HControlStatement;

/*
3명의 사람들에 대한 정보가
개행문자로 구분된 이름(문자열)이 세번
개행문자로 구분된 체온(정수)이 세번
입력된다.
이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
 */

// nextInt 다음 nextLine 을 하면 nextLine 이 제대로 동작하지 않는다
// nextLine 다음 nextInt 를 for 문으로 3번 돌린다면
// 첫번째 nextLine 한바퀴까지는 잘 되는데, 두번째 for문이 시작됬을때 두번째 nextLine 이 실행되고 나서
// nextInt 가 소모하지 못한 개행문자에 대해 오류를 발생시킬 수 있다. ???

import java.util.Scanner;

public class H4ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 이름을 담아둘 배열
        String[] names = new String[3];
        // 체온을 담아둘 배열
        int[] temps = new int[3];

        // 먼저 3번의 이름을 입력받는다.
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();
        }

        // 그다음 3번의 채온을 입력받는다.
        for (int i = 0; i < 3; i++) {
            temps[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            // 38도가 넘으면
            if (temps[i] > 38) {
                // 같은 위치의 이름을 출력
                System.out.println(names[i]);
            }
        }
    }
}
