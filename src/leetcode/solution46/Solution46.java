package leetcode.solution46;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution46
{
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> ret = new ArrayList<>();
    	int len = nums.length;
    	if(nums == null ||len<=0) {
    		return ret;
    	}
    	Deque<Integer> path = new LinkedList<>();
    	boolean[] used = new boolean[len];
    	
    	dfs(nums,used,path,0,ret);
    	return ret;
    }

	private void dfs(int[] nums, boolean[] used, Deque<Integer> path, int i,List<List<Integer>> ret         )
	{
		// TODO Auto-generated method stub
		if(path.size() == nums.length) {
			ret.add(new ArrayList(path));
			return;
		}
		
		for (int j = 0; j < nums.length; j++)
		{
			if(used[j] == true) {
				continue;
			}
			path.addLast(nums[j]);
			used[j] = false;
			dfs(nums,used,path,i+1,ret);
			path.removeLast();
			used[j] = true;
		}
	}
}
