package leetcode.sloution11;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sloution11Test
{

	@Test
	public void testFindLength1()
	{
		int[] A = {1,2,3,2,1};
		int[] B = {3,2,1,4,7};
		
		Sloution11 ret = new Sloution11();
		int Val = ret.findLength(A, B);
		
		assertEquals(3, Val);
	}
	@Test
	public void testFindLength2()
	{
		int[] A = {1,2,3};
		int[] B = {1,2,3};
		
		Sloution11 ret = new Sloution11();
		int Val = ret.findLength(A, B);
		
		assertEquals(3, Val);
	}
	@Test
	public void testFindLength3()
	{
		int[] A = {1,2,3};
		int[] B = {1,2,3};
		
		Sloution11 ret = new Sloution11();
		int Val = ret.findLength(A, B);
		
		assertEquals(3, Val);
	}
}
