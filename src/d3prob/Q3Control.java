package d3prob;

public class Q3Control {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 19, 23};
        int i=0;

        // 총합 및 평균 구하기
        int sum = 0;
        while (i < 6) {
            System.out.println(numbers[i]);
            sum += numbers[i];
            i++;
        }
        System.out.println("총합은 : " + sum);
        System.out.println("평균은 : " + (double)sum/numbers.length);
    }
}
