package d6;

/*
연료가 얼마나 들었는지에 대한 정보
연료가 얼마나 남았는지에 대한 정보 반환하는 메서드
연료를 설정하는 메서드
운전하는 메서드 실행 시 `주행거리 / 10(정수)' 만큼 연료 소모
경적을 울리는 'beep'
 */

// 운전할 수 있다.
public class Car implements Beeper, Drivable{ // 자동차는 경적도 울릴 수 있고, 운전도 가능하다
    @Override
    public void beep() {
        System.out.println("빵빵");
    }

    // 연료가 얼마나 들었는지에 대한 정보 (속성 = 멤버변수 = 필드)
    protected int fuel;

    // 연료가 얼마나 남았는지에 대한 정보 반환하는 메서드
    public int getFuel() {
        return fuel;
    }

    // 연료를 설정하는 메서드
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        this.fuel -= kilos / 10;
    }


    public static void main(String[] args) {
        Car car = new Car();
    }
}
