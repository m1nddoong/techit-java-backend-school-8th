package d7.optional;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 에러가 될수도 안될수도 있다..
        // System.out.println(nullOrString().length());
        String nullable = nullOrString();
        if (nullable == null) System.out.println("got: null");
        else System.out.println(nullable);

        Optional<String> optionalString = Optional.ofNullable(nullOrString());
        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        } else {
            System.out.println("got: null");
        }

        String result = Optional.ofNullable(nullOrString()).orElse("got: null");
        System.out.println(result);

        //제네릭의 대표적의 예시로 Optional 이고
        //null 예외처리를 대비할 수 있는 방법중에 하나 이다.
    }

    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            return "not null string";
        else return null;
    }
}
