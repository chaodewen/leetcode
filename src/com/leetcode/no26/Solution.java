package com.leetcode.no26;

/**
 * Created by Dewayne on 2016/10/18.
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i ++)
            if(i > cnt && nums[i] != nums[cnt])
                nums[++ cnt] = nums[i];
        return nums.length > 0 ? cnt + 1 : 0;
    }
}