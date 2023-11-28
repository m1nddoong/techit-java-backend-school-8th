package d5;

import java.nio.DoubleBuffer;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        // < 나름 유용한 기능들 >
        // 문자열 -> 정수를 변환
        Integer parsedInt = Integer.parseInt("1000");
        System.out.println(parsedInt + 100);

        // 문자열 -> 실수 변환
        Double parsedDouble = Double.parseDouble("1.0");
        System.out.println(parsedDouble);
        parsedDouble = Double.parseDouble("3.141592");
        System.out.println(parsedDouble);

        // 문자열 -> Long 변환
        System.out.println(Long.parseLong("100000000000000000"));

        // 정수 최댓값 - 최솟값 상수
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Long 최댓값 - 최솟값
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // Double
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);

        // String
        String sentence = "Hello, Today is 27th november";
        // 문자열 길이 확인
        System.out.println(sentence.length());
        // 문자열 자르기 (인덱스로)
        System.out.println(sentence.substring(10)); // (10번째 -> 0~9 : 'a' 부터 나옴)
        System.out.println(sentence.substring(7, 12)); // 'Today' 출력
        // 문자열 자르기 (특정한 문자를 기준으로)
        String[] strArray = sentence.split(" "); // 공백문자를 기준으로 문자열 쪼개기
        // regex : 정규표현식이라고 부르며, 패턴 내용을 의미한다.
        for (String str : strArray) {
            System.out.println(str);
        }

        String email = "alstjsdlr990321@gmail.com";
        String[] emailSplit = email.split("@");
        for (String str : emailSplit) {
            System.out.println(str);
        }

        //  특정 문자열 찾기
        String source = "https://google.com/search?q=";
        System.out.println(source.indexOf("google")); //google 이라는 단어가 시작되는 인덱스를 반환

        // 문자열 한글자씩 확인하는 방법
        // 1. fori 반복
        source = "abc12";
        for (int i = 0; i < source.length(); i++) {
            // 문자열을 배열 취급해서 i번째 가져오기
            System.out.println(source.charAt(i));
        }
        System.out.println();

        // 2. String.toCharArray()
        for (char letter : source.toCharArray()) {
            // 문자열 내부에 저장된 문자 배열 반환하기
            System.out.println(letter);
        }

        // 각 글자가 영문인지 숫자인지 확인하기
        source = "오늘 날씨가 4도";
        for (char letter : source.toCharArray()) {
            // 문자가 숫자를 나타내는 문자인지 확인
            if (Character.isDigit(letter)) {
                System.out.println(String.format("digit: %c", letter));
            }
            // 문자가 인간의 문자를 나타내는 문자인지 확인
            if (Character.isLetter(letter)) {
                System.out.println(String.format("letter: %c", letter));
            }
        }
    }
}
