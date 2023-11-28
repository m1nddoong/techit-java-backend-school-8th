package d7.generics;


/*
이름과 나이를 속성으로 가지고
모든 인자를 받는 생성자
각 속성의 Getter
 */
public class Person implements Comparable<Person> { // 타입 파라미터를 받을 수 있는 인터페이스
    private String name;
    private int age;

    // 구현하는 인테페이스에 타입 파라미터를 전달하면
    // 오버라이딩 하는 메서드에서 타입을 명시하기 좋다.
    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    public Person() {} // 비어있는 생성자

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
