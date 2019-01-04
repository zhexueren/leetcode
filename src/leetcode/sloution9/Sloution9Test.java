package leetcode.sloution9;

import junit.framework.TestCase;

public class Sloution9Test extends TestCase
{
	ListNode node11 = new ListNode(2);
	ListNode node12 = new ListNode(4);
	ListNode node13 = new ListNode(3);
	
	ListNode node21 = new ListNode(5);
	ListNode node22 = new ListNode(6);
	ListNode node23 = new ListNode(4);
	

	boolean ListNodeCompare(ListNode execpt,ListNode actual)
	{
		while(execpt != null && actual != null)
		{
			//存在不相的值，直接进行return false
			if(execpt.val != actual.val)
			{
				return false;
			}
			
			execpt = execpt.next;
			actual = actual.next;
		}
		
		//素组长度不想等，直接返回false
		if(execpt != null || actual != null)
		{
			return false;
		}
		
		return true;
	}
	
	public void testAddTwoNumbers1()
	{
		Sloution9 obj = new Sloution9();
		
		node11.next = node12;
		node12.next = node13;
		
		node21.next = node22;
		node22.next = node23;
		
		ListNode node31 = new ListNode(7);
		ListNode node32 = new ListNode(0);
		ListNode node33 = new ListNode(8);
		
		node31.next = node32;
		node32.next = node33;
		ListNode ret = obj.addTwoNumbers(node11, node21);
		assertTrue(ListNodeCompare(node31, ret));
	}
	
	public void testAddTwoNumbers2()
	{
		Sloution9 obj = new Sloution9();
		ListNode l1 = null;;
		
		node21.next = node22;
		node22.next = node23;
		
		ListNode ret = obj.addTwoNumbers(l1, node21);
		assertTrue(ListNodeCompare(node21, ret));
	}
	
	public void testAddTwoNumbers3()
	{
		Sloution9 obj = new Sloution9();
		ListNode l1 = null;;
		
		node21.next = node22;
		node22.next = node23;
		
		ListNode ret = obj.addTwoNumbers(node21, l1);
		assertTrue(ListNodeCompare(node21, ret));
	}
	
	public void testAddTwoNumbers4()
	{
		Sloution9 obj = new Sloution9();
		
		node11.next = node12;
		
		node21.next = node22;
		node22.next = node23;
		
		ListNode node31 = new ListNode(7);
		ListNode node32 = new ListNode(0);
		ListNode node33 = new ListNode(5);
		
		node31.next = node32;
		node32.next = node33;
		ListNode ret = obj.addTwoNumbers(node11, node21);
		assertTrue(ListNodeCompare(node31, ret));
	}
	
	public void testAddTwoNumbers5()
	{
		Sloution9 obj = new Sloution9();
		
		node11.next = node12;
		node12.next = node13;
		
		node21.next = node22;
		
		ListNode node31 = new ListNode(7);
		ListNode node32 = new ListNode(0);
		ListNode node33 = new ListNode(4);
		
		node31.next = node32;
		node32.next = node33;
		ListNode ret = obj.addTwoNumbers(node11, node21);
		assertTrue(ListNodeCompare(node31, ret));
	}
	
	public void testAddTwoNumbers6()
	{
		Sloution9 obj = new Sloution9();
		
		
		ListNode node31 = new ListNode(0);
		ListNode node32 = new ListNode(1);
		
		node31.next = node32;
		ListNode ret = obj.addTwoNumbers(node12, node22);
		assertTrue(ListNodeCompare(node31, ret));
	}

}
