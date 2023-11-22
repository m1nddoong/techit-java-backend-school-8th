package HControlStatement;


/*
3명의 사람들에 대한 정보가
개행문자로 구분된 이름(문자열)이 세번
개행문자로 구분된 체온(정수)이 세번
입력된다.
이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
 */

import java.util.Scanner;

public class H4ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3명의 사람 이름 입력 : ");
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("각 사람의 체온 입력 : ");
        Double[] temperatures = new Double[3];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        // 38 도가 넘는 사람들의 이름 출력
        System.out.print("38 도가 넘는 사람들 : ");
        for (int i = 0; i < names.length; i++) {
            if (temperatures[i] >= 38) {
                System.out.print(names[i] + ", ");
            }
        }
    }
}
