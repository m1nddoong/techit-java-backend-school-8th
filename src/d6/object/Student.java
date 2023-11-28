package d6.object;

public class Student extends Person {
    private String major;

    public Student() {} // 기본 생성자

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {  // Object 클래스의 toString() 오버리이딩
        return super.toString() + ", Student";
    }
}
