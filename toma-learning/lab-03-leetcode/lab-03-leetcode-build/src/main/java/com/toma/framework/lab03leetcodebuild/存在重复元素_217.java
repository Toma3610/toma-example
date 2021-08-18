package com.toma.framework.lab03leetcodebuild;

import java.util.Arrays;

/**
 * 给定一个数组 找出里面是否存在连续重复的数字
 *
 * @author Toma
 * @version 1.0
 * @since 2021/8/16
 */
public class 存在重复元素_217 {

    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 2, 7, 5, 4, 7};
//        int arr[] = new int[]{1,2,3,4,5};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate_2(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        long count = Arrays.stream(nums).distinct().count();
        return count == nums.length ? false : true;
    }

    public static boolean containsDuplicate_2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


}
