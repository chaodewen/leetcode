package com.leetcode.no278;

import com.leetcode.VersionControl;

/**
 * Created by Dewayne on 2016/10/7.
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid))
                if(mid == 1 || !isBadVersion(mid - 1))
                    return mid;
                else
                    high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}