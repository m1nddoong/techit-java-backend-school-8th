package HMethods;

/*
int[]을 두개 받아,
첫번째 배열의 마지막 원소 뒤에, 두번째 배열의 첫번째 원소가 오도록
두 배열을 연결한 배열을 반환하는 메서드를 작성하시오.
 */

import java.util.Scanner;

public class H5Methods {
    public static int[] concatArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (0 <= i && i <= 4) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - 5];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8 ,9};
        for (int num : concatArr(arr1, arr2)) {
            System.out.print(num + " ");
        }

    }
}
