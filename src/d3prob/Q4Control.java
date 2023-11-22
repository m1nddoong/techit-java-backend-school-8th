package d3prob;

public class Q4Control {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 19, 23};
        // 총합, 최대, 평균
        int sum = 0;
        int max = numbers[0]; // 제일 첫번째걸로 초기화
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (max < numbers[i]) {
                max = numbers[i];
            }
            // 3항 연산자 사용
            // max = numbers[i] > max ? numbers[i] : max;
        }
        System.out.println("총합은 : " + sum);
        System.out.println("최댓값은 : " + max);
        System.out.println("평균은 : " + (double) sum / numbers.length);

    }
}
