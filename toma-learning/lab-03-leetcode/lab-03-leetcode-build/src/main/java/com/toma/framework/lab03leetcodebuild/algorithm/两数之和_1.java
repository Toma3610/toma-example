package com.toma.framework.lab03leetcodebuild.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
 * 算法
 *
 * @author Toma
 * @version 1.0
 * @since 2021/8/19
 */
public class 两数之和_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 5, 1, 1};
//        int[] nums = new int[]{2, 5, 5};
//        int[] ints = twoSum(nums, 10);
        int[] ints = twoSum2(nums, 10);
        IntStream stream = Arrays.stream(ints);
        stream.forEach(System.out::println);
    }

    // 暴力遍历
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[]{};
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int num = nums[i] + nums[j];
                if (num == target) {
                    return new int[]{i, j};
                }
            }
        }
        return res;
    }

    // 充分使用Hash 结构查询复杂度低特性
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>(2);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return res;
    }

}
