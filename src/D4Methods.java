import java.util.SortedMap;

public class D4Methods {
    public static int threeIntAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // 정수 배열을 받아서, 1이 어디있는지 반환하거나, 없으면 -1을 반환하는 메서드
    public static int fineOneBreak(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            // 찾았다!
            if (numbers[i] == 1) {
                //return i;
                index = i;
                break;  // 반복문의 종료를 의미하므로
                // 반복문 바깥의 "for 종료" 가 출력되고 인덱스 반환
            }
        }
        System.out.println("for 종료");
        return index;
    }

    public static int fineOneReturn(int[] numbers) {
        int index = -1;

        // 부정 데이터 방지도 가능
        if (numbers.length == 0) {
            // 배열의 길이가 0이면 데이터가 없으니, 굳이 찾을 필요 없음
            return -1;
        }

        for (int i = 0; i < numbers.length; i++) {
            // 찾았다!
            if (numbers[i] == 1) {
                index = i;
                // return i;
                return index; // 굳이 break 를 쓰지 않고 인덱스 업데이트
                // "for 종료"가 보이지 않음, 반복문이 종로되기 전에 메서드가 끝남
                // return 이 중간에 나타나도 상관없다.
            }
        }
        System.out.println("for 종료");
        // return -1;
        return index;
    }

    // n! = n * (n - 1)!
    // n == 1 || n == 0 -> n! = 1
    public static int factorial(int n) {
        // 0이나 1이면 1을 반환한다.
        if (n == 1 || n == 0) {
            return 1;
        }
        // 아니면 n * f(n-1)를 반환한다.
        else {
            return n * factorial(n - 1);
        }
    }


    // 메서드 오버로딩
    // 메서드 호출하는 코드에서 코드 활용도가 높아진다.
    public static int add(int a, int b) { // int + int
        return a + b;
    }

    public static long add(long a, long b) { // long + long
        return a + b;
    }

    public static long add(int a, long b) {
        return a + b;
    }

    // Varargs - 가변 인자
    // 출처를 모르는 여러개의 매개변수를 받아서 활용할 떄에는 마치 배열을 선언한것처럼 내용을 작성하면 된다.
    // public static int varargsAvg (int[] ints)
    // 사용은 배열 쓰듯이
    public static int varargsAvg(int... ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }

//    public static int varargsAvg(int offset, int... ints) {
//        int sum = offset;
//        for (int i = 0; i < ints.length; i++) {
//            sum += ints[i];
//        }
//        return sum / ints.length;
//    }

    public static void main(String[] args) {
        System.out.println(varargsAvg(1, 2, 3, 4, 5));
        System.out.println(varargsAvg(10, 12, 13, 14));
        System.out.println(varargsAvg(2, 4, 5, 7));

        int[] argList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 배열로 쓸수는 있다. (하지만 배열을 위해서는 아니고,
        // 목적은 여러개의 임의의 인자들을 넣어주기 위해 varargs 를 사용한다.)
        System.out.println("avg of 1 ~ 10: " + varargsAvg(argList));

//        int intA = 2, intB = 3;
//        long longA = 2, longB = 3;
//        System.out.println(add(intA, intB));
//        System.out.println(add(longA, longB));
//        System.out.println(add(intA, longB));
        // long 타입 add 메서드 호출 -> intA 를 long으로 암시적 형변환 후 정상 동작
        // 하지만 add(int a, long b) 의 메서드를 만들다면, 이 메서드 사용

        //void -> 반환값이 없음
        //System.out.println("이것도 메서드 입니다!");
        //System.out.println(addTwoInt(10, 20));

        // 테스트
        //int[] nums = {2, 3, 4, 1, 6};
        //System.out.println((fineOneReturn(nums)));
        //System.out.println("------------------------");
        //System.out.println((fineOneBreak(nums)));

    }


}
