package com.toma.framework.lab03leetcodebuild.algorithm;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/20
 */
public class 重塑矩阵_566 {

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2,}, {3, 4}};
        int coll = 1, row = 4;
        int[][] ints = matrixReshape(mat, coll, row);
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int x = nums.length;
        int y = nums[0].length;
        if (x * y != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < x * y; i++) {
            res[i / c][i % c] = nums[i / y][i % y];
        }
        return res;
    }
}
