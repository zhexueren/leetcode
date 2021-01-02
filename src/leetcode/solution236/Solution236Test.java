package leetcode.solution236;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Solution236Test
{
	Solution236 obj = null;
	TreeNode root =null;
	TreeNode Obj1 = new TreeNode(3);
	TreeNode Obj2 = new TreeNode(5);
	TreeNode Obj3 = new TreeNode(1);
	TreeNode Obj4 = new TreeNode(6);
	TreeNode Obj5 = new TreeNode(2);
	TreeNode Obj6 = new TreeNode(0);
	TreeNode Obj7 = new TreeNode(8);
	TreeNode Obj8 = new TreeNode(7);
	TreeNode Obj9 = new TreeNode(4);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
		obj = new Solution236();
		root = Obj1;
		Obj1.left = Obj2;
		Obj1.right = Obj3;
		Obj2.left = Obj4;
		Obj2.right = Obj5;
		Obj3.left = Obj6;
		Obj3.right = Obj7;
		Obj5.left = Obj8;
		Obj5.right = Obj9;
	}

	@Test
	public void testLowestCommonAncestor01()
	{
		assertEquals(Obj1,obj.lowestCommonAncestor(root, Obj2, Obj3) );
	}
	@Test
	public void testLowestCommonAncestor02()
	{
		assertEquals(Obj1,obj.lowestCommonAncestor(root, Obj7, Obj8) );
	}

}
