package HControlStatement;

/*
축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
남은 경기와 목표 승점이 주어졌을 때,
남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
없으면 최고 승점을 출력하여라.
 */

import java.util.Scanner;

public class H2ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 승점은 0점으로 가정합니다.");
        System.out.print("남은 경기 : ");  // 2 경기
        int matches = scanner.nextInt();
        System.out.print("목표 승점 : ");  // 12 점을 목표로 함
        int target = scanner.nextInt();
        int win = target / 3;   // 12 / 3 = 4승 가능
        int draw = target % 3;  // 12 % 3 = 0무 가능
        int lose = matches - (win + draw); // 2 - (4+0) = -2패 가능
        if (matches >= (win + draw) && draw >= 0) {
            System.out.println(String.format("목표 승점까지 필요한 최소 승수 : %d승 %d무 %d패", win, draw, lose));
        } else {
            System.out.println("최고 승점 : " + matches * 3);
        }
    }
}
