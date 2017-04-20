package com.leetcode.no108;

import com.leetcode.TreeNode;

public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		if(len == 0) {
			return null;
		}
		else {
			return buildNode(nums, 0, len - 1);
		}
	}
	private TreeNode buildNode(int[] nums, int left, int right) {
		if(left <= right) {
			int mid = (left + right) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = buildNode(nums, left, mid - 1);
			root.right = buildNode(nums, mid + 1, right);
			return root;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		new Solution().sortedArrayToBST(new int[]{1, 3});
	}
}