package d6.object;

import java.sql.PseudoColumnUsage;
import javax.swing.plaf.nimbus.NimbusStyle;

public class Main {
    public static void main(String[] args) {
        // Person alex = new Person("Alex", 25);
        Person alex = new Student("Alex", 25, "CSE");
        Person brad = new Lecturer("Brad", 40, "Generics");
        //alex2 는 alex와 이름, 나이, 전공이 같다 -> 같은 사람일까?
        Person alex2 = new Student("Alex", 25, "CSE");
        Person alex3 = new Lecturer("Alex", 25, "Korean");
        int a = 0;
        // 수많은 계산이 진헹된다.
        // 이후 int a가 얼마인지 확인하려면?
        System.out.println(a);

        // 그렇다면 alex 에 어떤 값이 있는지를 Getter를 쓰겠지만
        // Object 클래스의 toString() 을 Person 에서 오버라이딩
        //  Student, Lecturer 에서 오버라이딩한 toString() 을 또 오버라이딩
        System.out.println(alex);
        System.out.println(brad);

        //출력 결과 : false -> 같으 사람으로 취급되지 않음
        //alex 와 alex2 는 다은 인스턴스므로 == 은 주소를 비교하는 것
        System.out.println(alex == alex2);
        // 따라서 object 클래스의 eqauls 메서드를 오버라이딩
        System.out.println(alex.equals(alex2));
        // Lecturer 생성 후 비교 -> 같은 Person 이지만 둘은 같은 클래스가 아니기 때문에 false 출력
        System.out.println(alex.equals(alex3));


        // null
        Person noName = new Student();
        System.out.println(noName.getAge());
        System.out.println(noName.getName());
        try { // noName.getName()는 null 이 될 가능성이 있다
            System.out.println(noName.getName().equals("Alex"));  //NullPointerException 오류가 발생
        } catch (NullPointerException e) {
            System.out.println("name was null");
            System.out.println(e.getMessage());
        }
        System.out.println("Alex".equals(noName.getName()));
        if (noName.getName() != null) {
            noName.getName().equals(alex.getName());
        }
        // 원시 타입 : 초기값이 들어가면 됨
        // 참조 타입 : 초기값이라는 것이 없고, 초기화되지 않으면 널포인터는 null 을 가리킨다.

    }
}






// toString() 이라는 메서드는 person 의 상속받았고, person 은 다시 오브젝트 상속
// 오브젝트가 갖고 있는 toString() 메서드!
// 이를 오버라이딩사여 자식 클래스에서 사용
