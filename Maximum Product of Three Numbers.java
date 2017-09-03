/*基础知识+写优秀高效的代码*/

/*Maximum Product of Three Numbers
给定一个整型数组，找出其中的三个数，
使得这三个数的乘积最大，并输出该值*/

import java.util.Array;

public int maximumProduct(int[] nums)
{
	//将数组中元素按升序排列
	Array.sort(nums);

	int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
	int b = nums[0] * nums[1] * nums[nums.length - 1];
	return a > b ? a : b;
}