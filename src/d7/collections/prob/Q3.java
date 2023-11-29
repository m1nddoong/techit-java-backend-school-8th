package d7.collections.prob;

/*

Map
어떤 가게의 메뉴 <메뉴명> <가격>형태로 계속 입력된다.
"order"가 입력되었을 때,
사용자의 단일 주문을 받고 금액을 출력하시오.

입력
Americano 1500
Cappuccino 2000
Latte 2500
Mocha 3000
order
Latte

출력
2500
 */
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inputMap = new HashMap<>();
        while (true) {
            String input = scanner.nextLine(); // 입력 받고
            if ("order".equals(input)) {
                String order = scanner.nextLine();
                System.out.println(inputMap.get(order));
                break;
            }
            String[] menuLine = input.split(" "); // 쪼개고 (쪼개는 tip)
            inputMap.put(menuLine[0], Integer.valueOf(menuLine[1])); // 쪼갠것 각각 맵에 넣어주기
            // System.out.println(Arrays.toString(menuLine));    // 출력
        }
    }
}