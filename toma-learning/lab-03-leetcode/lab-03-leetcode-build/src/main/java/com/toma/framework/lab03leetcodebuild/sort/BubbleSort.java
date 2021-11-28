package com.toma.framework.lab03leetcodebuild.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author Toma
 * @version 1.0
 * @since 2021/5/11
 */
public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 69, 2, 1, 56, 89};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }


}
