package leetcode.sloution1;
import java.util.HashMap;

 /**
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2018年12月18日_下午8:14:07
 * @Descpriber :给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
				你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
				Input: nums = [2, 7, 11, 15], target = 9
				OutPut: [0, 1]
 */
public class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
    	HashMap<Integer,Integer> hashData = new HashMap<Integer,Integer>();
    	
    	for(int i = 0;i<nums.length;i++)
    	{
    		hashData.put(nums[i], i);
    	}
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		int complete = target - nums[i];
    		if(hashData.containsKey(complete)&&i!=hashData.get(complete))
    		{
    			return new int[] {i,hashData.get(complete)};
    		}
    	}
    	
    	throw new IllegalArgumentException("No two sum solution");
    	
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution ans = new Solution();
		//test case1
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		int[] result = new int[2];
		result = ans.twoSum(nums, target);
		
		System.out.println("TestCase1:");
		for(int i =0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}

}
