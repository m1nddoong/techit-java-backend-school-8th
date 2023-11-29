package d7.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ItCoMain {
    public static void main(String[] args) {
        /*
        < Iterator 부분 >
         */

        // Iterable 또는 Collection 또는 List 또는 Set
        // 전부 순회 가능하다.
        // List 와 Set 모두 Iterable이다. 서로 바꾸기 가능
        // List<String> skillList = new ArrayList<>();
        Set<String> skillList = new HashSet<>();
        skillList.add("Java");
        skillList.add("git");
        skillList.add("md");
        skillList.add("python");
        skillList.add("aws");
        skillList.add("linux");

        for (String skill : skillList) {
            System.out.println(skill);

            // 왜 굳이 iterator 를 쓸까?
            // 순회중 중간에 하나를 제거하고자 한다면 -> 예외 발생할 수 있다.
            // 하나씩 꺼내다 출력하는 건데 중간에 삭제 불가
            // skillList.remove("python");
        }

        // Iterator 객체 : Iterable(모두가 상속받음) 을 한칸씩 측정하는 센서같은 느낌
        // 두개의 메서드로 순회 가능
        // boolean hasNext() : 다음 대상이 있느냐? -> true 인 동안
        // T next() : 다음 대상 가져오기 -> 호출
        Iterator<String> iter = skillList.iterator(); // iterator() 메서드는 순회를 위한 interator 를 반환해줌
        while (iter.hasNext()) {
            String skill = iter.next();
            System.out.println(skill);

            // 하지만 iter.remove 를 쓴다면, 순회중 안전하게 제거가 가능하다.
            if ("python".equals(skill)) {
                iter.remove();
            }
        }
        System.out.println(skillList);

        /*
        < Collection >
         */
        List<String> listCollection = new ArrayList<>();
        Set<String> setCollection = new HashSet<>();
        // List 든 Set 이 든 데이터를 모아서 관리한다는 점에서 비슷 -> 메서드들도 비슷하다.

        // List의 Collection 메서드들
        System.out.println(listCollection.size());
        System.out.println(listCollection.isEmpty());
        System.out.println(listCollection.contains(""));
        System.out.println(listCollection.containsAll(setCollection));
        // Set의 Collection 의 메서드들
        System.out.println(setCollection.size());
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.contains(""));
        System.out.println(setCollection.containsAll(listCollection));


        // Collection의 문서를 보면
        // Collection 인터페이스를 구현하는 클래스는
        // 1. 아무것도 없는 기본 생성자와
        // 2. 다른 Collection 을 받아서 그 모든 원소를 가지는 생성자를
        // 만듦이 마땅하다 (서로 필요할 때 바꿔가면서 사용하라는 차원)
        // 즉, 위 두개의 생성자는 꼭 만들어 달라!는 의미
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");

        Set<String> setNoDups = new HashSet<>(listCollection); // 방금 만든 리스트를 넣어줄 수 있다.
        // 즉, 이처럼 List와 Set은 상호호한이 된다.
        System.out.println(setNoDups);



    }
}
