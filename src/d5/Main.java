package d5;

import HMethods.H4Methods;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("민수");
        for (int i = 0; i < 40; i++) {
            me.age();
        }
        System.out.println(me.getAge());
        me.sayHello();
    }
}
