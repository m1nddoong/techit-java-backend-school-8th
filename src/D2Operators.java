import java.util.HashSet;

public class D2Operators {
    public static void main(String[] args) {
        int plus = 10 * 20;
        int minus = 20 - 10;
        int multiply = 20 * 10;
        int divide = 20 / 10;           // 나눗셈의 결과가 실수일수있기 떄문에 신경써야 함
        int modulo = 15 % 10;

        System.out.println(plus);       // 30
        System.out.println(minus);      // 10
        System.out.println(multiply);   // 200
        System.out.println(divide);     // 2
        System.out.println(modulo);     // 5

        // 사칙연산의 우선순위
        int result = 10 + 5 * 3;
        System.out.println(result);     // 25

        // 괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);     // 45

        // %의 우선순위는?
        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);     // 10

        // 현재 시각이 오전 7시이고,
        // n 시간이 지난다고 할떄
        // 12시가찌 표현되는 시계에서 시침은 어디에 있을까? -> %
        System.out.println(21 / 10);     // 2.1 이 아닌 2

        // 1. 데이터를 받는 애를 int 가 아니라 double로 해보자
        double doubleDivide = 21 / 10;
        System.out.println(doubleDivide);

        // 2. 나누기 전에 실수로 만들어 주자.
        // 피연산자 중 하나라도 double 이면 결과도 double 이다.
        doubleDivide = 21 / 10.0;
        System.out.println(doubleDivide);   // 2.1 로 나옴

        // 피연산자 둘다 정수 변수면?
        // 형변환(Type Casting)
        int intResult = (int)2.1;
        System.out.println(intResult);

        // 선 변환을 통한 나누기 연산
        int left = 21;
        int right = 10;
        double castedResult = (double) left / right;
        System.out.println(castedResult);

        // 명시적 형변환 데이터 손실
        long bigInt = 4294967296L;
        System.out.println((int) bigInt);   // 0 (int 의 범위를 넘어선 만큼 그 이상의 데이터는 날라감)
        // 33칸자리를 32칸에 넣으려니 데이터 손실

        // char 형 변환 (String 은 안됨)
        int asciiA = 65;
        System.out.println((char) asciiA);
        System.out.println((char) asciiA + 10);

        // String 덧셈
        // String concatenation : 문자열 뒤에 10을 덧셈하면 문자열로 표현된 10이 붙여짐
        System.out.println("여기에 10을 입력하시오: " + 10);
        System.out.println(10 + " + " + 10 + " = " + 20); // 문자열로 표현
        String formula = 10 + " + " + 10 + " = " + 20; // 문자열을 String 변수로 담아줄 수 있다.


    }
}
