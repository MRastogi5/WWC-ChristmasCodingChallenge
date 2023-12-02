package com.wwc.xmas;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {


    public static void main(String[] s){
        List<String> result = summaryRanges(new int[]{0,1,2,4,5,7});
        System.out.println(result);
    }
    //Input: nums = [0,1,2,4,5,7]
    //Output: ["0->2","4->5","7"]
    public static List<String>  summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int x=nums[0];
        int y = 0;
        for(int i=0; i<nums.length-1;i++){
            //y=nums[i];
            if ((i+1)== nums.length-1 && (nums[i]+1)!=nums[i+1] ){
                ranges.add(x+"->"+nums[i]);
                x=nums[i+1];
            } else if ((nums[i]+1)!=nums[i+1] ){
                ranges.add(x+"->"+nums[i]);
                x=nums[i+1];
            }
        }
        return ranges;
    }
}
