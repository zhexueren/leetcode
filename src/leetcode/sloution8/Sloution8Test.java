package leetcode.sloution8;

import org.junit.Ignore;

import junit.framework.TestCase;

public class Sloution8Test extends TestCase
{
	
	public void testMaxIncreaseKeepingSkyline1()
	{
		Sloution8 ans = new Sloution8();
		int[][]  data = { {3, 0, 8, 4}, 
			                {2, 4, 5, 7},
			                {9, 2, 6, 3},
			                {0, 3, 1, 0} };
		int ret = ans.maxIncreaseKeepingSkyline(data);
		assertEquals(35, ret);
	}
	
	public void testMaxIncreaseKeepingSkyline2()
	{
		Sloution8 ans = new Sloution8();
		int[][]  data = { {3, 0, 8, 4}, 
			              {2, 4, 5, 7},
			            };
		int ret = ans.maxIncreaseKeepingSkyline(data);
		assertEquals(10, ret);
	}

}
