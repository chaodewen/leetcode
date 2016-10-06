package com.leetcode.no307;

/**
 * Created by Cc on 16/10/7.
 */

// 使用树状数组（Binary Indexed Tree）解决
// 注意c的下标从1开始，但update和sumRange都需要从0开始
public class NumArray {
    int[] c;
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        c = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i ++)
            plus(i + 1, nums[i]);
    }

    // 将原值变为val
    void update(int i, int val) {
        plus(i + 1, val - nums[i]);
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        return i == 0 ? sum(j + 1) : (sum(j + 1) - sum(i));
    }

    // 使用函数会超时，直接计算AC
    // 计算i末尾有k个0
    // 函数返回2^k
    // private int lowbit(int i) {
    // 	// -i为i取反加一
    // 	return i & (-i);
    // }

    // 前i个和
    private int sum(int i) {
        int sum = 0;
        while(i > 0) {
            sum += c[i];
            // 		i -= lowbit(i);
            i -= i & (-i);
        }
        return sum;
    }

    // 给数组第i个数加val
    private void plus(int i, int val) {
        while(i <= nums.length) {
            c[i] += val;
            // i += lowbit(i);
            i += i & (-i);
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);