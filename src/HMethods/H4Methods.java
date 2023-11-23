package HMethods;

/*
int[]을 인자로 받아,

1. 배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
2. 배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
3. 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"

메서드를 각각 작성하시오.
 */

public class H4Methods {
    public static int maxWhere(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int minWhere(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int maxDiff(int[] arr, int maxIndex, int minIndex) {
        int diff = arr[maxIndex] - arr[minIndex];
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 5, 1, 9};
        int maxIndex = maxWhere(arr);
        System.out.println(maxIndex);
        int minIndex = minWhere(arr);
        System.out.println(minIndex);
        System.out.println(maxDiff(arr, maxIndex, minIndex));
    }
}
