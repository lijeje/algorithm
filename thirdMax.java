package Main;

import java.util.Arrays;

public class thirdMax {

    public static void main(String []arg){
        int[] nums = {3,5,2,8,6,2};
        doSelectionSort(nums);
//        int result = thirdMax(nums);

    }
    public static int thirdMax(int[] nums) {
        int result = 0;
        int [] sortNums = doSelectionSort(nums);
        System.out.println(Arrays.toString(sortNums));
        return result;
    }

    //선택정렬
    public static int[] doSelectionSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 나보다 작은게 있으면 치환
            if (min != i) {
                arr[min] = arr[min] + arr[i];
                arr[i] = arr[min] - arr[i];
                arr[min] = arr[min] - arr[i];
            }
            // 과정 출력
            System.out.print((i+1)+"번쨰 과정  : ");
            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();
        }
        return arr;
    }
}
