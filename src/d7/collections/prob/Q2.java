package d7.collections.prob;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Scanner 와 Set
엔터로 구분된 정수 입력이 임의의 횟수로 이뤄진다.
'q'가 입력되면 모든 데이터가 입력된 것이라고 생각할  때,
여태까지 입력한 정수가 몇가지!!!가 되는지 출력하시오.
+ 총합
+ 정수 아닌 입력도 들어온다
 */

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> inputSet = new HashSet<>();

        while (true) {
            String input = scanner.nextLine();
            // "q" 가 입력시 반복(입력) 종료
            if ("q".equals(input)) break;
            inputSet.add(Integer.parseInt(input)); // 정수로 변환해서 넣는다.
        }
        // 정수 종류 출력하기
        // 1. count로 숫자 세주기
        int count = 0;
        for (Integer number : inputSet) {
            count++;
        }
        System.out.println(count);

        // 2. Set.size()
        System.out.println(inputSet.size());
    }
}
