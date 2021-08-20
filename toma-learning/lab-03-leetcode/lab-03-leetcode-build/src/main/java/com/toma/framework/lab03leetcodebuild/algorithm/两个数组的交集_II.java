package com.toma.framework.lab03leetcodebuild.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/19
 */
public class 两个数组的交集_II {


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2, 3};
//        int[] intersect = intersect(nums1, nums2);
        int[] intersect = intersect02(nums1, nums2);
        Arrays.stream(intersect).forEach(System.out::println);
    }

    public static int[] intersect02(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length, len2 = nums2.length;
        int[] result = new int[Math.min(len1, len2)];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // k 加入新的数组
                result[k] = nums1[i];
                // 自加到下一下标数
                k++;
                // i j 同时右移动一位
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }


}
