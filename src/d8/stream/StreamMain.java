package d8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 1. Stream 만들기
// 2. Stream에 적용할 작업 고르기 -> n번 반복
// 3. Stream의 결과 수합
public class StreamMain {
    public static void main(String[] args) {
        String[] nameArray = {
                "Alex",
                "Dave",
                "Chad",
                "Brad"
        };
        // Stream 도 제네릭이 적용된 객체이다.
        // Stream<T> 는 데이터가 흘러감을 나타내는 객체
        // nameArray 가 어떻게 Stream 으로 전달되느냐
        Stream<String> nameArrayStream = Arrays.stream(nameArray);

        // 문자열 배열은 그렇다 치고 숫자 배열은 어떤가?
        // 원시 타입 스트림
        int[] intArray = {1, 23, 14, 53, 22, 15, 10, 6};
        // 얘를 Stream 으로 바꾸는건 왜 문제가 될 수 있을까?
        // -> Wrapper 클래스가 아니라서!
        // 이럴 경우에는 다른 Stream 을 제공함 -> IntStream
        IntStream intStream = Arrays.stream(intArray);

        //문자열을 문자 스트림
        String email = "m1nddoong0321@gmail.com";
        // 문자열도 IntStream 으로 (m,1,n .. 하나씩 나오는 데이터의 흐름)
        IntStream charStream = email.chars();

        // Collection도 Stream 으로 만들 수 있다.
        // Collection 내부에 Collection.stream() 메서드가 내장되어있다!
        List<String> nameList = new ArrayList<>();
        nameList.add("Alex");
        nameList.add("Dave");
        nameList.add("Chad");
        nameList.add("Brad");
        Stream<String> nameListStream = nameList.stream();


        // --------------------- 1. Stream 만들기 끝 -------------------------

        // 이렇게하면 더 깔끔하다!
        // 메소드를 호출해서 그 결과를 바로 그냥 할당해준다

        /*
        Stream<String> nameStream1 = nameListStream.filter(name -> name.contains("d"));
        Stream<String> nameStream2 = nameStream1.map(name -> name.toLowerCase());
        Stream<String> nameStream3 = nameStream2.sorted(Comparator.reverseOrder());
         */


        // 어떤 데이터를 선별하거나 어떤 데이터를 정렬한다 등과 같은 작업들
        // 가장 간단한 작업은 선별(filter) 작업이다. - 데이터중에서 어떤 애들이 있는지 선별

        // 1. 중간작업(intermediate Operation) : 새로운 데이터 모음
        // 데이터가 준비된건 알겠어 그러면 여기에 작업할 데이터만 넣어줘! 라는 것?
        // 데이터의 일부분의 작업들을 선별하겠다
        nameListStream
                // -------------------------------------------
                // < filter() : 선별하고>
                // 데이터를 선별하는데 선별하는 기준을 전달해야 한다. (내부에 함수가 전달되어야 함)
                // 형식은 : 매개변수 -> 화살표 -> 결과
                // name 이라는 매개변수, 화살표 : name 을 가지고 작업을 하겠다?
                // name 이 a를 포함하는지 선별을 한다.
                // 참이면 남기고 거짓이면 버린다.
                // filter : 전달받은 함수를 호출함으로서 참인 데이터들만 남기는 Stream
                .filter(name -> name.contains("d"))
                // ------------------------------------------
                // < map() : 가공하고 >
                .map(name -> name.toLowerCase());
                // 데이터를 받아 새로운 데이터를 반환한다.
                // 그렇다면은 map 에 들어가는 함수는 데이터를 받아 데이터를 반환하는 함수가 들어간다.
                //.forEach(System.out::println);
                // .map(name -> {
                //    String nameLower = name.toLowerCase();
                //    String nameUpper = name.toUpperCase();
                //    return nameLower + nameUpper;
                // })
                // .map(name -> name.length()) // 이렇게 하면 되긴 되자만 반환형이 바뀐다
                //.forEach(System.out::println);
                // -------------------------------------------
                // < sorted() : 정렬을 한다. -> 이런걸 메서드 체이닝>
                // .sorted() // 정렬
                // .sorted(Comparator.reverseOrder()) // 데이터를 받아 전달받은 기준으로 반대로 정렬
                // -------------------------------------------
                // 타입은 불분명 하지만 3개 모두 Stream 객체가 반환되는 메서드들이기 때문에
                // 얘네들이 동시에 다 작업이 된다.
                //
                // 2. 종결 작업 : 새로운 데이터 모음을 가지고 결론을 내리는 끝 단계
                //forEach : 남은 데이터를 각각 전달받은 함수의 인자로 전달
                // .forEach(name -> System.out.println(name)); 과 동일
                // .forEach(System.out::println); // 결과 chad, brad
                //
                // < toList() > : 데이터를 새로운 리스트로 만들어서 반환
                // 리스트로 받아줘야 하기 때문에 Stream 을 List<String> newList = 로 변경
                // .toList()
                // 전달받은 함수를 바탕으로, 1. 전체가 참인지, 2. 하나라도 참인지, 3. 전혀 참이 없는지
                // .allMatch(name -> name.length() >= 4)
                // .anyMatch(name -> name.length() > 5)
                // .noenMatch(name -> name.length() < 3);



        // 종결 작업 이후엔 다시 호출 불가
        /*
        nameListStream
                 .filter(name -> name.contains("a"))
                 .forEach(System.out::println); // 오류
        */

        // Stream 작업은 원본에는 영향이 없다.
        // 새로운 데이터의 모음을 만드는 것일 뿐
        // System.out.println(nameList);  // 출력 결과 : [Alex, Dave, Chad, Brad]

        // 예제)
        nameListStream = nameList.stream();
        // 이름들 중에서
        // 길이는 4이상이며
        // 대문자 A가 들어가는
        // 모든 이름에 d가 포함이 안되어 있는지?
        boolean result = nameListStream
                // 길이는 4이상이며
                .filter(name -> name.length() >= 4)
                // 대문자 A가 들어가는
                .filter(name -> name.contains("A"))
                .noneMatch(name -> name.contains("d"));
        System.out.println(result); // true


        // 모든 숫자들 중에서
        // 홀수 이면서
        // 10 이상인 숫자들이
        // 3의 배수가 아닌지?
        // int[] intArray = {1, 23, 14, 53, 22, 15, 10, 6};
        boolean result2 = intStream
                .filter(num -> num % 2 == 1) // 홀수이면서
                .filter(num -> num >= 10) // 10 이상인 숫자들이
                .noneMatch(num -> num % 3 == 0); // 3의 배수가 아닌지?
        System.out.println(result2); // 출력 : false


        // 숫자들 중에서
        // 홀수인 수에
        // * 2를 한 숫자가
        // 전부 4의 배수인지?
        intStream = Arrays.stream(intArray); // 받아오기

        boolean result3 = intStream
                .filter(num -> num % 2 == 1)
                .map(num -> num * 2)
                .allMatch(num -> num % 4 == 0);
        System.out.println(result3); // 출력 : false

        // 총합
        intStream = Arrays.stream(intArray);
        int sum = intStream.sum();

        // 갯수
        intStream = Arrays.stream(intArray);
        long count = intStream.count();

        // 평균, 최소, 최대
        intStream = Arrays.stream(intArray);
        double avg = intStream.average()
                .orElse(0.0); // Optional.orELse()
        System.out.println(avg);

    }

    // 이런 함수를 람다로 만들어줘야한다.
    public String toUpper(String input) {
        return input.toUpperCase();
    }


    // 입력은 무엇이며 결과는 무엇일까?
    // 데이터를 선별하는데에 있어서 함수의 모양은 어떨까?

    // 데이터를 받았을 때 얘가 맞다 아니다를 판단할것.
    // List 를 들고있는 각각의 데이터는 String 이기 때문에 받는 데이터는 String
    public boolean predicate(String input) {
        // 문자열의 a가 포함되었는지 판단하는 메서드
        // return input.contains("a");
        // 문자열의 길이가 4이상인지 판단하는 메서드
        return input.length() >= 4;
        // 위 모양을 잘 기억해서 filter 안을 채워보자
    }

}
