package com.leetcode.no140;

import java.util.HashMap;

class Point {
	int x, y;
	Point() {
		x = 0;
		y = 0;
	}
	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class Solution {
	public int maxPoints(Point[] points) {
		int len = points.length;
		if(len == 0) {
			return 0;
		}
		else if(len <= 2){
			return len;
		}
		else {
			int result = 0;
			for(int i = 0; i < len; i ++) {
				HashMap<Double, Integer> hm = new HashMap<Double, Integer>();
				int samex = 0;
				int samep = 0;
				for(int j = 0; j < len; j ++) {
					if(i != j) {
						if(points[i].x == points[j].x && points[i].y == points[j].y) {
							samep ++;
						}
						if(points[i].x == points[j].x) {
							samex ++;
							continue;
						}
						double k = ((double) (points[j].y - points[i].y)) 
								/ ((double) (points[j].x - points[i].x));
						if(hm.containsKey(k)) {
							hm.put(k, hm.get(k) + 1);
						}
						else {
							hm.put(k, 2);
						}
						// 保存K存在时的最多点数
						result = Math.max(result, hm.get(k) + samep);
					}
				}
				// 考虑K不存在时的情况
				result = Math.max(result, samex + 1);
			}
			return result;
		}
	}
	public static void main(String[] args) {
//		System.out.println(new Solution().maxPoints(
//				new Point[]{new Point(0, 9), new Point(138, 429), new Point(115, 359), new Point(115, 359), new Point(-30, -102)
//						, new Point(230, 709), new Point(-150, -686), new Point(-135, -613), new Point(-60, -248)
//						, new Point(-161, -481), new Point(207, 639), new Point(23, 79), new Point(-230, -691)
//						, new Point(-115, -341), new Point(92, 289), new Point(60, 336), new Point(-105, -467)
//						, new Point(135, 701), new Point(-90, -394), new Point(-184, -551), new Point(150, 774)}));
		System.out.println(new Solution().maxPoints(new Point[]{new Point(0, 0), new Point(1, 1)
				, new Point(1, 1), new Point(2, 2), new Point(1, 2)}));
	}
}