package d7.generics;

import d6.Car;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30};
        ArrayWrapper<Integer> integerArrayWrapper
                = new ArrayWrapper<>(intArray);

        System.out.println(integerArrayWrapper.length());
        System.out.println(integerArrayWrapper.contains(20));
        System.out.println(integerArrayWrapper.contains(30));
        System.out.println(integerArrayWrapper.contains(15));

        Double[] doubleArray = {null, 1.0, 2.3, 4.5};
        ArrayWrapper<Double> doubleArrayWrapper
                = new ArrayWrapper<>(doubleArray);

        System.out.println(doubleArrayWrapper.length());
        System.out.println(doubleArrayWrapper.contains(1.));
        System.out.println(doubleArrayWrapper.contains(2.31));

        System.out.println(contains(doubleArray, 2.3));
        System.out.println(contains(intArray, 25));

        // ArrayWrapper<Car> carArrayWrapper; -> Comparable
        System.out.println(doubleArrayWrapper.max());
        System.out.println(integerArrayWrapper.max()); // ?? 이거 맞는지 필히 검증
    }

    // 매서드에서 사용시 제어자 뒤 반환타입 전 다이아몬드로 T선언
    //
    public static <T> boolean contains(T[] source, T target) {
        for (T item : source) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }
}
