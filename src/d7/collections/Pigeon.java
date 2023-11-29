package d7.collections;

/*
[비둘기집 원리]
 비둘기가 들어갈 수 있는 집이 10개인데
 비둘기가 11마리라면
 누군가는 한방에 두마리 이상이 들어간다.
 */

import java.util.Objects;

public class Pigeon {
    private int age;

    public Pigeon(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pigeon pigeon = (Pigeon) o;
        return age == pigeon.age;
    }

    // 원래는 리스트의 비둘기 : 20, 집합의 비둘기 : 20 이였지만
    // 만약 eqauls 와 hashCode 를 추가한다면 (hashCode 메서드만 지우면 다시 20 20 됨)
    // 해시코드값을 기준으로 집합의 원소를 구분할 수 있도록 추가해줌? (이게 왜 이렇게 되는지 모르곘네)
    // 이전에 배웠던 eqauls 와 hashCode 를 다시 복습해야 할 듯 싶다.
    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

}


// set 이 어떻게 중복은 확인하느냐? 를 살펴보기