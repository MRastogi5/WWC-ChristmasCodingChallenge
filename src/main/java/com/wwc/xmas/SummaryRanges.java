package com.wwc.xmas;

import java.util.*;


// Day 2 of WWD- Christmas Coding Challenge
// https://leetcode.com/problems/summary-ranges/

public class SummaryRanges {
    public static void main(String[] s){
        List<String> result = summaryRanges(new int[]{0,1,2,4,5,7});
        //List<String> result = summaryRanges(new int[]{0,2,3,4,6,7,8});
        //List<String> result = summaryRanges(new int[]{0,2,3,4,6,8,9});
        // 123456
        //System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        //System.out.println(summaryRanges(new int[]{0,2,3,4,6,7,8}));
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7,9,10,12,14,15,16,27,28}));
        //System.out.println(result);
    }
    public static List<String>  summaryRanges(int[] nums) {

        if(nums.length<=0){
            return new ArrayList<>();
        }
        List<String> rangeArr = new ArrayList<>();
        Map<Integer, Integer> values = new LinkedHashMap();
        int x = nums[0];
        values.put(x, nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (nums[i - 1] + 1 == current) {
                if (i + 1 == nums.length) {
                    values.put(x, current);
                }
                continue;
            } else if (nums[i - 1] + 1 != current) {
                values.put(x, nums[i - 1]);
                x = current;
                if (i + 1 == nums.length) {
                    values.put(x, current);
                }
            }
        }

        for (int i : values.keySet()) {
            int j = values.get(i);
            if (i == j) {
                rangeArr.add(i + "");
            } else rangeArr.add(i + "->" + j);
        }
        return rangeArr;
    }
}
