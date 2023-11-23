package d4prob;
/*
String 배열을 인자로 받아 배열의 각 값을
한줄씩 출력하는 메소드 "printAll" 을 작성하시오
 */


public class Q2Methods {
    public static void printAll(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Alex", "Brad", "Chad"};
        printAll(names);
        String[] fruits = {"Apple", "Banana", "Pear"};
        printAll(fruits);
    }
}
