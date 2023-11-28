package d6.object;

import java.util.Objects;

/*
이름과 나이를 속성으로 가지고
모든 인자를 받는 생성자
각 속성의 Getter
 */
public class Person { // Object를 상속받고 있음 -> Object 가 갖고 있는 toString() 을 오버라이딩 할 수 있다
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

        @Override
    public boolean equals(Object o) {
        // 1. 실제로 두 변수의 값(할당된 주소)이 동일하냐
        if (this == o) return true; // Person alex = alex2 이므로 이런식으로 비교
        // 2. null 이거나, 둘이 다른 클래스인가
//        if (o == null || getClass() != o.getClass())
//            return false;

        // 서로 다른 자식클래스가 일치하게 하고 싶다면
        if (o instanceof Person) return false;
        // 3. 나머지 속성을 비교하자
        Person other = (Person) o; // 다운캐스팅
        return
                this.age == other.age && // 내 나이랑 쟤 나이랑 동일하다
                this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}






