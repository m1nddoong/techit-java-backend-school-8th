package d3prob;
import java.util.Scanner;

/*
정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
n개의 이름을 입력된 순서의 반대로 출력하여라.
 */
public class Q6Control {
    public static void main(String[] args) {
        // 3
        // Alex Rodz -> next 를 쓰면 Alex 에서 끊기기 떄문에 nextLine 을 사용
        // Brad
        // Chad
        Scanner scanner = new Scanner(System.in);
        // 몇개의 이름이 들어올 것인지
        int n = scanner.nextInt();

        // (주의) 개행문자는 따로 소모해줘야 한다.
        // 정수 입력 이후 개별 소모 용도
        scanner.nextLine();

        String[] names = new String[n];
        // n개의 이름 입력 받기
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        // 이 시점에서 모든 이름을 받은 상태이다.
//        for (int i = 0; i < n;  i++) {
//            // 0 ~ n - 1 까지 n개 임으로,
//            // 제일 뒤에 있는 애는 n - 1에 있다.
//            System.out.println(names[n-1-i]);
//        }
        for (int i = n-1; i >= 0;  i--) {
            System.out.println(names[i]);
        }
    }
}
