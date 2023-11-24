package HClass;

/*
### Q1
`Person` 클래스를 만들어보자.

1. `Person`은 이름, 나이에 대한 정보를 가졌다.
2. 이름을 인자로 받는 생성자가 있으며, 나이는 `0`으로 초기화된다.
3. `Person`은 인사를 하는 메서드를 가지고 있으며,
   나이가 5살 이상이면
   ```
   Hello, I'm <이름>!
   ```
   와 같은 출력을, 아니면
   ```
   응애응애
   ```
   를 출력한다.
4. `Person`은 `age()`라는 메서드를 가지고 있으며, 호출되면 나이 정보가 +1 되며 새로운 나이가 반환된다.
5. 이름, 나이 정보를 반환하는 메서드를 각각 가지고 있다.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public void age() {
        age += 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void SayHello() {
        if (age >= 5) {
            System.out.println(String.format("Hello, I'am %s!", name));
        } else {
            System.out.println("응애응애");
        }
    }
}
