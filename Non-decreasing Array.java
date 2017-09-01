/*基础知识+写优秀高效的代码*/

/*Non-decrease Array
一个数组有n个整数，在只能修改一个以内元素的
条件下，判断这个数组，在修改后能否成为一个
非递减的数组。*/
public boolean check(int[] nums)
{
    int count = 0;
    for(i = 1; i < nums.length() && count <= 1; i++)
    {
        if(nums[i-1] > nums[i])
        {
            count++;
            if(i == 1 || nums[i-2] < nums[i])
                nums[i-1] = nums[i];
            else
                nums[i] = nums[i-1];
        }
    }
    return count <= 1;
}