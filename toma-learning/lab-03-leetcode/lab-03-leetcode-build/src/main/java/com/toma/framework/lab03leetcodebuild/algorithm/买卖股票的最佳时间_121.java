package com.toma.framework.lab03leetcodebuild.algorithm;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/8/20
 */
public class 买卖股票的最佳时间_121 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 8};
//        int maxProfit = maxProfit(nums1);
//        int maxProfit = maxProfit02(nums1);
        int maxProfit = maxProfit03(nums1);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > result) {
                    result = profit;
                }
            }
        }
        return result;
    }

    public static int maxProfit02(int[] prices) {
        int maxProfit = 0;
        int minProfit = prices[0];
        for (int i = 0; i < prices.length; i++) {
            // 当前价格与最低价格比较
            minProfit = Math.min(minProfit, prices[i]);
            //  当前价格减去最低价格 与最高价格比较 得到最高
            maxProfit = Math.max(prices[i] - minProfit, maxProfit);
        }
        return maxProfit;
    }

    public static int maxProfit03(int[] prices) {
        int i = 0, j = 0, res = 0;
        while (j != prices.length) {
            res = Math.max(prices[j] - prices[i], res);
            if (prices[i] > prices[j]) {
                j = i;
            }
            j++;
        }
        return res;
    }
}
