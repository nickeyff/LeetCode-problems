/*基础知识+写优秀高效的代码*/

/*Maximum Distance in Arrays
给定n（n大于等于2）个整型非空数组，
找出不同数组之间数字差值绝对值的最大值,
每个数组内部的值都是递增的*/

import java.lang.Math;

public int maxDistance(int[][] arrays)
{
	int distance = Integer.MIN_VALUE;
	int max = arrays[0][arrays[0].length - 1];
	int min = arrays[0][0];

	//从第二个数组开始，遍历剩下的数组
	for(int i = 1; i < arrays.length; i++)
	{
		distance = Math.max(distance, Math.abs(max - arrays[i][0]));
		distance = Math.max(distance, Math.abs(min - arrays[i][arrays[i].length-1]));
		//找出前i个数组的最大值和最小值，便于下次计算
		max = Math.max(max, arrays[i][arrays[i].length-1]);
		min = Math.min(min, arrays[i][0]);
	}
	
	return distance;
}