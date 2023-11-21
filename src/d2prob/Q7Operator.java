package d2prob;


import java.util.Scanner;

public class Q7Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 미세먼지 수치
        int dust = scanner.nextInt();
        //int dust = 37;
        // 80 이하면 "좋음", 아니면 "나쁨"
        String message = dust <= 80 ? "좋음" : "나쁨";

        System.out.println(String.format("미세먼지 수치: %d, (%s)", dust, message));


    }
}
