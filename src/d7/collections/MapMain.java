package d7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        // Map : Key - Value
        // 연락처 : 이름 - 전화번호
        Map<String, String> contactBook = new HashMap<>();
        // Map에 연락처 저장
        contactBook.put("Alex", "010-ALEX-ALEX");
        contactBook.put("Brad", "010-BRAD-BRAD");
        contactBook.put("Chad", "010-CHAD-CHAD");
        contactBook.put("Eric", "010-ERIC-ERIC");

        // Map에서 연락처 찾아오기
        System.out.println(contactBook.get("Alex"));
        System.out.println(contactBook.get("Chad"));
        System.out.println(contactBook.get("Brad"));
        // 1. 없는 데이터를 가져올 대는 null 이 된다.
        System.out.println(contactBook.get("Dave"));
        // 2. 있는 데이터를 넣을 떄는 덮어씌운다.
        contactBook.put("Eric", "010-IM-GONE");
        System.out.println(contactBook.get("Eric"));

        // 전공생 수
        // CSE = 10
        // EE - 20
        // ME - 15
        // BA - 10
        Map<String, Integer> majorCount = new HashMap<>();
        majorCount.put("CSE", 10);
        majorCount.put("EE", 20);
        majorCount.put("ME", 15);
        majorCount.put("BA", 10);

        System.out.println(majorCount); // 순서를 보장해주지 않는 출력

        // 만약 데이터를 넣어야 되는 상황에, 새로운 전공이 생기면?
        // 1. majorCount.get("major") == null
        String newMajor = "ENG";
        if (majorCount.get(newMajor) == null) { // 새로운 전공이 없다면? null 이면
            majorCount.put(newMajor, 1); // 그 전공을 추가
        } else { // 기존 전공이 있다면
            int before = majorCount.get(newMajor); // 기존에 있던 전공을 get 으로 얻어와서
            majorCount.put(newMajor, before + 1); // 그 개수를 하나 늘려주고 다시 업데이트
        }

        // 2. putIfAbsent
        Integer before = majorCount.putIfAbsent(newMajor, 1); // 존재한다면
        if (before != null) { //
            majorCount.put(newMajor, before + 1);
        }

        // 전공 - 전공생들 (수 X) 을 다룰 떄는 어떻게 해야할까?
        // {CSE = [Alex, Brad, Chad]}
        // String, Set<String> ?
        Map<String, List<String>> majorStudents = new HashMap<>();
        majorStudents.put("CSE", new ArrayList<>());
        // majorStudents.get("CSE") 의 결과가 List 가 나오기 때문에 add 가능
        List<String> cseStudents = majorStudents.get("CSE");
        cseStudents.add("Alex");
        cseStudents.add("Brad");
        cseStudents.add("Chad");
        System.out.println(majorStudents);


        // keySet(), entrySet()
        // Map 을 순회 하고 싶으면 둘중 하나 선택할 수 있다.
        // keySet() - key 로만 구성된 Set
        Set<String> keySet = contactBook.keySet();
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(contactBook.get(key));
        }

        // entrySet() - key, value 쌍으로 구성된 Set
        // Map 내부에 정의되어있는 Entry 클래스는 Key와 Value를 쌍을 조회할 수 있는 메서드를 가지고 있다.
        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
