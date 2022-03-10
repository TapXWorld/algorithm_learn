package org.example.learn;

import java.util.ArrayList;
import java.util.List;

public class Test18 {

    public static int commonChild(String s1, String s2) {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
            return 0;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int[][] dp = new int[arr1.length][arr2.length];
        dp[0][0] = arr1[0] == arr2[0] ? 1 : 0;
        for (int j = 1; j < arr2.length; j ++){
            dp[0][j] = arr1[0] == arr2[j] ? 1 : dp[0][j - 1];
        }
        for (int i = 1; i < arr1.length; i ++){
            dp[i][0] = arr1[i] == arr2[0] ? 1 : dp[i - 1][0];
        }
        for (int i = 1; i < arr1.length; i++){
            for (int j = 1; j < arr2.length; j++){
                int p1 = dp[i][j - 1];
                int p2 = dp[i - 1][j];
                int p3 = arr1[i] == arr2[j] ? (1 + dp[i - 1][j - 1]) : 0;
                dp[i][j] = Math.max(p1, Math.max(p2, p3));
            }
        }
        //每次比较最后一个是否相同
        return dp[arr1.length-1][arr2.length-1];


    }

    public static void main(String[] args) {
        //System.out.println(commonChild("HARRY", "SALLY"));

        //System.out.println(commonChild("AA", "BB"));
        //N H A
        System.out.println(commonChild("SHINCHAN", "NOHARAAA"));

        System.out.println(commonChild("ABCDEF", "FBDAMN"));
        //N H A
        System.out.println(commonChild("SHINCHAN", "NOHARAAA"));
    }
}
