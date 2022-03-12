package org.example.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test21 {

    private static int minimumSwaps(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        //排序并记录每个数的正确位置
        Arrays.sort(temp);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            indexMap.put(temp[i], i);
        }
        //记录该位置是否已访问
        boolean[] isVisited = new boolean[temp.length];
        //寻找循环节个数，即循环节内的数依次交换，即可全部回到正确位置
        int loops = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isVisited[i]) {
                continue;
            }
            int j = i;
            while (!isVisited[j]) {
                isVisited[j] = true;
                j = indexMap.get(nums[j]);
            }
            loops++;
        }
        return nums.length - loops;
    }

    static int minimumSwaps2(int[] arr) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr.length; j++) {

                if(arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 1, 5};
        System.out.println(minimumSwaps(arr));
        System.out.println("------------------");
        System.out.println(minimumSwaps2(arr));
    }
}
