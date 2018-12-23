package leetcode.sloution1;
import java.util.HashMap;

 /**
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2018��12��18��_����8:14:07
 * @Descpriber :����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
				����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ��
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
	public static void main1(String[] args)
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
