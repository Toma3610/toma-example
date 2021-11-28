package com.toma.framework.lab03leetcodebuild.algorithm;

import java.util.Arrays;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/19
 */
public class 合并两个有序数组_88 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 2;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        Arrays.stream(nums1).forEach(System.out::println);
    }

}
