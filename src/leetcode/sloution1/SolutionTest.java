package leetcode.sloution1;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SolutionTest
{

	@Test
	public void testTwoSum()
	{
		Solution ans = new Solution();
		//test case1
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		int[] result = new int[2];
		result = ans.twoSum(nums, target);
		int[] expecteds = {1,2};
		assertArrayEquals(expecteds, result);
	}
	@Ignore
	public void testTwoSum1()
	{
		Solution ans = new Solution();
		//test case1
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = new int[2];
		result = ans.twoSum(nums, target);
		int[] expecteds = {0,1};
		assertArrayEquals(expecteds, result);
	}

}
