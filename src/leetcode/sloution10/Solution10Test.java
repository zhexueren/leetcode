package leetcode.sloution10;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution10Test
{

	@Test
	public void test()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("abc");
		assertEquals(ans, 3);
	}
	@Test
	public void test1()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("aaaaaa");
		assertEquals(ans, 1);
	}
	@Test
	public void test2()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("pwwkew");
		assertEquals(ans, 3);
	}
	@Test
	public void test3()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("abcabcbb");
		assertEquals(ans, 3);
	}
	@Test
	public void test4()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("");
		assertEquals(ans, 0);
	}
	@Test
	public void test5()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("abcbca");
		assertEquals(ans, 3);
	}
	@Test
	public void test6()
	{
		Sloution10 ansSloution10 = new Sloution10();
		int ans = ansSloution10.lengthOfLongestSubstring("abcbadef");
		assertEquals(ans,6);
	}

}
