package d8.file;

import java.util.Objects;

// Plain Old Java Object (POJO)
// Person 클래스는 데이터를 들고 있는 Java 객체이다!
public class Person {
    // people.csv 의 쉼표로 구분된 데이터를 나타내기
    private String name;
    private String email;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(email,
                person.email) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
