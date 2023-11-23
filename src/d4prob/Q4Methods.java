package d4prob;


/*
int[], long[], double[] 배열이 있다.
상기의 자료형에 대해서 동작하는 메서드를 같으 이름을 만들어
평균을 구하는 메서드를 만드시오
 */


// 메서드 오버로딩
// 이름은 같은, 매개변수 형태가 다른 메서드를
// 여러개 만들 수 있게 해준다.
// 메서드 호출하는 코드에서 코드 활용도가 높아진다
public class Q4Methods {
    public static int avg(int[] intNums) {
        int sum = 0;
        for (int number : intNums) {
            sum += number;
        }
        return sum / intNums.length;
    }

    public static long avg(long[] longNums) {
        long sum = 0;
        for (long number : longNums) {
            sum += number;
        }
        return sum / longNums.length;
    }

    public static double avg(double[] doubleNums) {
        double sum = 0;
        for (double number : doubleNums) {
            sum += number;
        }
        return sum / doubleNums.length;
    }

    public static void main(String[] args) {
        int[] intNums = {1, 2, 3};
        long[] longNums = {2, 4, 6};
        double[] doubleNums = {1, 3, 5};
        System.out.println(avg(intNums));
        System.out.println(avg(longNums));
        System.out.println(avg(doubleNums));
    }
}
