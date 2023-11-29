package d7.optional;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        // 에러가 될수도 안될수도 있다..
//        // System.out.println(nullOrString().length());
//        String nullable = nullOrString();
//        if (nullable == null) System.out.println("got: null");
//        else System.out.println(nullable);
//
//        Optional<String> optionalString = Optional.ofNullable(nullOrString());
//        if (optionalString.isPresent()) {
//            System.out.println(optionalString.get());
//        } else {
//            System.out.println("got: null");
//        }
//
//        String result = Optional.ofNullable(nullOrString()).orElse("got: null");
//        System.out.println(result);
//
//        //제네릭의 대표적의 예시로 Optional 이고
//        //null 예외처리를 대비할 수 있는 방법중에 하나 이다.
        String result = nullOrString(); // null 이 될 가능성이 존재하는 문자열이다.
        // System.out.println(result.length()); // 이렇게 되면 실행시 문제가 발생할 가능성이 높다

        // < 조건문을 통한 null 체크 >
        // 따라서 if else 로 null 일떄와 null 이 아닐때를 구분지어 분기할 수 있다.
        // 하지만 if 에서 null 임을 확인하고 있는 것보다
        // 동등연산자를 사용하지 않고 null 을 관리하고자 하는 방법이 Optional 인 것이다!
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("got: null");
        }

        // 어떤 메서드든 Optional.ofNullable() 메서드를 통해서 결과를 반환하게 한다.
        // 아래 처럼 null 일 수 있다는 것을 Optional로 덮어주어 코드로써 문제 해결.
        // 새로운 Optional 객체 optionalResult -> 정적 팩토리 (정적 메서드인데 안에서 객체를 만들어주는 형태이다)
        Optional<String> optionalResult = Optional.ofNullable(nullOrString());

        // isPresent : null이 아닌 값이 들어올떄 true
        // isEmpty : null일때 true
        // 꼭 Present 든 Empty 든 확인하고 나서 get() 으로 가져와주기
        if (optionalResult.isPresent()) {
            System.out.println(optionalResult.isPresent());
            System.out.println(optionalResult.isEmpty());
            System.out.println(optionalResult.get());
        } else {
            System.out.println(optionalResult.isPresent());
            System.out.println(optionalResult.isEmpty());
            System.out.println("got: null");
        }

        // 결과를 Optional로 받았으면, orElse라는 메서드를 통해
        // 결과가 null 일떄 기본값을 설정할 수 있다.
        // Optional.ofNullable(nullOrString()) 의 결과가 Opntaionl 이니까
        // Optional 의 orElse() 를 사용할 수 있다 (자주 사용할 예정)
        String resultOrElse = Optional.ofNullable(nullOrString())
                // null 이 아니면 그 값이,
                // null 이면 인자로 전달한 값이
                .orElse("got: null from orElse");
        System.out.println(resultOrElse);


        // 메서드에서 직접 온 Optional을 다루자.
        String resultFromOptional = nullOrOpt()
                .orElse("got: null from orElse method");
        System.out.println(resultFromOptional);
    }


    public static Optional<String> nullOrOpt() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            // Optional.of 로 Optional을 만든다
            // null 이 아닐때 다음 내용 출력
            return Optional.of("Concrete String");
        // null 결과는 Optional.empty()
        else return Optional.empty();
    }

    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            return "not null string";
        else return null;
    }
}
