package com.leetcode.no167;

//public class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int index1, index2 = 0;
//        for(index1 = 0; index1 < numbers.length - 1; index1 ++) {
//            if((index2 = binarySearch(index1, numbers, target)) != -1)
//                break;
//        }
//        return new int[] {index1 + 1, index2 + 1};
//    }
//    private int binarySearch(int index, int[] numbers, int target) {
//        if(index == numbers.length - 1)
//            return -1;
//        int low = index + 1, high = numbers.length - 1;
//        while(low <= high) {
//            int mid = (low + high) / 2, temp = numbers[mid] + numbers[index];
//            if(temp == target)
//                return mid;
//            else if(temp > target)
//                high = mid - 1;
//            else
//                low = mid + 1;
//        }
//        return -1;
//    }
//}
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while(low <= high) {
            int sum = numbers[low] + numbers[high];
            if(sum == target)
                break;
            else if(sum > target)
                high --;
            else
                low ++;
        }
        return new int[] {low + 1, high + 1};
    }
}