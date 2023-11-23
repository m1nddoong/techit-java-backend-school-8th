package d4prob;


/*
int[]를 인자로 받아,
순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
 */

public class Q5Methods {
    public static int[] reverseArr(int[] intArr) {
        int[] reversedArr = new int[intArr.length]; //intArr 길이만큼 배열 생성
        for (int i = 0; i < intArr.length; i++) {
            // intArr[i]가 reversedArr[]의 어디에? - 마지막에서 i 만큼 앞으로
            // intArr.length - 1 -i
            reversedArr[i] = intArr[intArr.length - 1 - i];
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int num : reverseArr(intArr)) { // 궁금한점 : for each 문은 순서대로 꺼내는건가?
            System.out.println(num);
        }
    }
}
