package d5;

// 자동차 클래스

public class Car {
    // 총 도로를 달리고 있는 자동차의 갯수
    private static int count = 0;
    private String brand; // 브랜드
    private String name; // 차종 -> 클래스 내부의 특정 메서드들만 접근 가능
    private int fuel;   // 주유 상태

    // 생성자가 없으면 기본 생성자를 만들어줌 (아무것도 받지 않는)
    // 생성자 : 객체를 만들 때 호출되는 메서드
    public Car() {  // 기본적으로 이런 형태로 만들것이다.
        count++;
        this.name = "Sonata";
        this.brand = "Hyundai";
        this.fuel = 72;
    }

    // 생성자 오버로딩
    public Car(String brand, String name, int fuel) {
        count++;
        this.brand = brand;
        this.name = name;
        this.fuel = fuel;
    }


    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public int getFuel() {
        return fuel;
    }

    // Getter 매서드
    public String getBrand() {
        return brand;
    }

    // Setter 메서드
    public void setFuel(int fuel) {
        this.fuel = fuel;  // this : 이 메서드를 호출한 객체의 인스턴
    }

    // 경적을 울리는 기능
    public void beep() {
        System.out.println("빠아아아앙");
    }

    // 가진 정보를 출력하는 기능
    public void printInfo() {
        System.out.println(String.format("name:\t%s", name));
        System.out.println(String.format("brand:\t%s", brand));
        System.out.println(String.format("fuel:\t%d", fuel));
    }

    // 특정 거리를 이동하는 기능
    public void drive(int kilo) {
        fuel -= kilo / 2;
        System.out.println(String.format("Moved : %d km, Fuel: %d", kilo, fuel));

    }

}
