package d7.generics;

// <T>를 해주면 T를 타입처럼 쓸 수 있다.

import java.io.Serializable;

// T가 제네릭 타입 파라미터라고 부른다.(T를 전달해야지 이 클래스를 만들 수 있다)
// extend 로 Comparable 을 붙여줘서 비교가 가능한 애 라고 명시해준다.
// 이렇게 해주면 어떤 특정 타입들만 이 클래스를 사용할 수 있도록 해주는 것?
// 띠리서 아래의 compareTO 를 사용해서 비교 가능해진다?
public class ArrayWrapper<T extends Number & Comparable<T> & Serializable> {
    private final T[] array;

    public ArrayWrapper(T[] array) {
        if (array == null) //배열 예외 처리
            throw new IllegalArgumentException(
                    "null array provided");
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    // T 는 원시타입은 못쓴다
    public boolean contains(T target) {
        for (T item : this.array) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        }
        return false;
    }

    // 최댓값, 최솟값은 어떻게 구하지?
    public T max() {
        T max = this.array[0];
        for (T item : this.array) {
            if (item == null) continue;
            if (max == null) max = item;
            // 비교는 어떻게...?
            else if (item.compareTo(max) > 0) max = item;

        }
        return max;
    }
}
