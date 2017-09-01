/*基础知识+写优秀高效的代码*/

/*Maximum Average Subarray
给定由n个整数组成的数组，
找到长度等于k的连续子阵列，
使其具有最大平均值，并输出最大平均值。*/

//import java.lang.Math;
public double findMaxAverage(int[] nums, int k)
{
    long sum = 0;
    for(int i = 0; i < k; i++)
    {
        sum += nums[i];
    }

    long max = sum;
    for(i = k; i < nums.length; i++)
    {
        sum += nums[k] - nums[i-k];
        //max = Math.max(max, sum);
        max = sum > max ? sum : max;
    }

    return (double)max / k;
}