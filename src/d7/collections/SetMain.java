package d7.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> skillSet = new HashSet<>();
        // add를 사용해 원소를 추가하는 건 동일
        skillSet.add("md");
        skillSet.add("git");
        skillSet.add("java");
        skillSet.add("oop");
        //중복되는 데이터는 추가가 안됨
        skillSet.add("java");
        //또한 데이터의 순서를 보장하지 않음
        System.out.println("skillSet : " + skillSet);

        List<String> skillList = new ArrayList<>();
        skillList.add("java");
        skillList.add("kotlin");
        skillList.add("android");
        skillList.add("flutter");
        skillList.add("react");
        skillList.add("git");

        // 다른 Collection의 원소를 전부 추가 시도
        // addAll : 내가 없는 원소들을 선별해 추가한다.
        // 하나라도 추가하면 true 반환
        System.out.println("skillList : " + skillList);
        System.out.println("하나라도 추가했는가? : " + skillSet.addAll(skillList));
        System.out.println("skillList 추가 후 skillSet : " + skillSet);

        List<String> thirdSkills = new ArrayList<>();
        thirdSkills.add("javascript");
        thirdSkills.add("typescript");
        thirdSkills.add("python");
        thirdSkills.add("java");
        thirdSkills.add("react");

        // 아이템 제거하기 - 인덱스로는 불가능하다.
        thirdSkills.remove("typescript");
        System.out.println(skillSet.removeAll(thirdSkills)); // true 가 나온다. (잘 제거 되었다)
        System.out.println("skillSet 에서 thirdSkill 를 뺸 결과 : " + skillSet);
        skillSet.clear();
        System.out.println("집합 비우기 결과 : " + skillSet);


        // Pigeon 을 만들고
        List<Pigeon> listHoles = new ArrayList<>();
        Set<Pigeon> setHoles = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            // 0 ~ 9 살까지 두 비둘기씩 생성
            Pigeon pigeon = new Pigeon(i % 10);
            listHoles.add(pigeon); // 하나는 리스트에 넣고
            setHoles.add(pigeon); // 하나는 집합에 넣기
        }


        System.out.println("리스트의 비둘기 : " + listHoles.size());
        System.out.println("집합의 비둘기 : " + setHoles.size());

















    }
}
