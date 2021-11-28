package com.toma.framework.lab03leetcodebuild.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/20
 */
public class 杨辉三角_118 {


    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            res.add(new ArrayList<>(row));
        }
        return res;
    }


}
