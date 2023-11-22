package OperatorPractice;

/*
바쁜 일정으로 컨디션이 안좋아져서,
체온이 38도 이상이거나 36도 이하일때는 병원에 가기로 했다.
체온을 입력받아서 병원에 가야할지를 true 또는 false로 출력하여라.
체온은 실수(double)로 주어진다.
 */

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("체온을 입력하세요 : ");
        double temperature = scanner.nextDouble();
        boolean result = temperature >= 38 || temperature <= 36;
        System.out.println("병원을 가야할지? " + result);
    }
}
