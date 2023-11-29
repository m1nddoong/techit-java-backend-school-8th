package d7.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        // List 는 인터페이스다, ArrayList 는 실제 그 List 를 구현한 클래스! (호환성 측면에서 List<String>로 선언)

        /* < ArrayList > : 배열을 관리해주는 Collections - List */
        List<String> names = new ArrayList<>();
        // 리스트에 넣기 : add 로 넣기(순서대로 추가된다)
        names.add("Alex");  // 비어있고
        names.add("Brad");  // 1칸 차있고
        names.add("Dave");  // 2칸 차있고
        names.add("Eric");

        // 리스트 데이터 회수
        System.out.println(names.get(0));
        System.out.println(names.get(2));

        // 중간에 넣기 (2가지 방법 - 메서드 오버로딩)
        names.add(2, "Chad");
        System.out.println(names); // 한번에 names 리스트 자체를 출력 가능.
        names.add("Fred");

        // 데이터 위치 찾기
        System.out.println("Chad is at: " + names.indexOf("Chad"));
        // 없을 경우 -1
        System.out.println("Greg is at: " + names.indexOf("Greg"));

        // 데이터 제거하기 (2가지방법 - 메서드 오버로딩)
        // 1. 몇번쨰 인덱스를 제거 -> 그 칸에 무엇이 있었는지 정보를 반환해줌
        System.out.println(names.remove(3)); // 순서를 기준으로
        // 2. 어떤 원소를 제거 -> 이 값이 존재했는지 여부를 모르기 떄문에, 제거의 성공 여부를 boolean 으로 반환해준다.
        System.out.println(names.remove("Eric")); // 값을 기준으로
        System.out.println(names.remove("Eric")); // 값을 기준으로 찾는데 실패 (이미 제거를 한것을 제거하려고 하기 떄문에 false)
        System.out.println(names); // 데이터 제거시 데이터가 앞으로 당겨옴

        // 원시 타입(primitive)은 타입 파라미터에 넣을 수 없다!
        // -> List<int> intList = new ArrayList<>();
        // 대신 Wrapper 를 사용하면 잘 동작한다.
        List<Integer> intList = new ArrayList<>();
        intList.add(123);
        intList.add(10);
        intList.add(20);
        intList.add(439);

        System.out.println(intList);
        // 순서로 제거할 때
        System.out.println(intList.remove(2));
        // 값으로 제거할 때 (객체로)
        System.out.println(intList.remove(Integer.valueOf(20)));

        System.out.println(intList);


        // 배열 리스트나 링크드 리스트나 기능적인 면에서는 별 차이가 업는데
        // sum 이라는 메서드가 매개변수로 ArrayList 만 받으려고 한다면 LinkedList 는 sum 메서드를 사용하지 못함.
        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        sum(intArrayList);
        sum(intLinkedList); // 이 부분의 오류가 나지 않게 하기 위해 sum 메소드에서 List<Integer> 로 매개변수를 수정할 필요가 있다.




//        /* < 일반 배열 > 과 비교 */
//        String[] nameArray = new String[16]; // 차이점 : 초기값을 설정할 필요가 없고, 크기를 지정해주지 않아도 된다!
//        // 일반 배열에 넣기 : 인덱스로 넣기(어디에 넣을 건지 위치를 알고 있어야 한다)
//        nameArray[0] = "Alex";
//        nameArray[1] = "Brad";
//        nameArray[2] = "Dave";
//        nameArray[3] = "Eric";
//
//        // 일반 배열의 데이터 회수
//        System.out.println(nameArray[0]);
//        System.out.println(nameArray[2]);
//
//        // 일반 배열 중간에 Chad 추가
//        // 1. 직접 일일히 뒤로 밀어줘야 하며
//        // 2. 몇개의 원소가 들어갔는지 확인할 도리가 없어서
//        nameArray[4] = nameArray[3];
//        nameArray[3] = nameArray[2];
//        nameArray[2] = "Chad";

    }

    /*
    마음 아픈 코드...  (강조하신 부분)
    */

    // < 구현을 중시하는 방식으로 요구르 하면 기능적 측면의 차이는 없는 클래스는 하나도 못쓴다. >
    // 이렇게 ArrayList 르 쓰지 말고 List<Integer> 로 쓰자
    // public static int sum (ArrayList <Integer> intList) {
    //    return 0;
    // };

    // < 매개변수로 전달할떄는 기능을 중요시 하는 interface 기준으로 매개변수 선언 >
    public static int sum (List <Integer> intList) {
        return 0;
    };

}
