package leetcode.sloution2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2018��12��18��_����8:18:57
 * @Descpriber :����һ����������������ڵ�ֵ�Ե����ϵĲ�α����� ��������Ҷ�ӽڵ����ڲ㵽���ڵ����ڵĲ㣬���������ұ�����
 * 				Input:
 * 						    3
						   / \
						  9  20
						    /  \
						   15   7
			   OutPut:
			   			[
						  [15,7],
						  [9,20],
						  [3]
						]
 */

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) 
	{ 
		val = x;
	}
}
 
public class Solution
{
	public List<List<Integer>> levelOrderBottom(TreeNode root)
	{
		List<List<Integer>> retVal = new ArrayList<List<Integer>>();
		if(root == null)
		{
			return retVal;
		}
		/*�����������У�һ��Ϊ���ڵ���У�һ��Ϊ�ӽڵ���У����ӽڵ����Ϊ��ʱ��������������*/
		LinkedList<TreeNode> parentList = new LinkedList<TreeNode>();
		LinkedList<TreeNode> childrenList = new LinkedList<TreeNode>();
		
		Stack<ArrayList<Integer>> result = new Stack<ArrayList<Integer>>();
		
		/*���޽ڵ�����ӽڵ�Ķ�����ȥ*/
		childrenList.add(root);
		while(!childrenList.isEmpty())
		{
			/*�������е�Ԫ����գ����Ӷ��е�Ԫ��ȫ�����븸������ȥ*/
			Iterator<TreeNode> childListIter = childrenList.iterator();
			while(childListIter.hasNext())
			{
				parentList.add(childListIter.next());
			}
			childrenList.clear();
			
			/*�����������е�����*/
			Iterator<TreeNode> partentListIter = parentList.iterator();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			while(partentListIter.hasNext())
			{
				TreeNode tempNode = partentListIter.next();
				temp.add(tempNode.val);
				if(tempNode.left != null)
				{
					childrenList.add(tempNode.left);
				}
				if(tempNode.right != null)
				{
					childrenList.add(tempNode.right);
				}
			}
			parentList.clear();
			result.add(temp);
		}
		
		
		while(result.size()>0)
		{
			ArrayList<Integer> rs = result.pop();
			retVal.add(rs);

		}
		
		return retVal;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//test case1
		TreeNode Node1 = new TreeNode(3);
		TreeNode Node2 = new TreeNode(9);
		TreeNode Node3 = new TreeNode(20);
		TreeNode Node4 = new TreeNode(15);
		TreeNode Node5 = new TreeNode(7);
		
		Node1.left  = Node2;
		Node1.right = Node3;
		
		Node2.left   = null;
		Node2.right  = null;
		
		Node3.left  = Node4;
		Node3.right = Node5;
		
		Node4.left   = null;
		Node4.right  = null;
		
		Node5.left   = null;
		Node5.right  = null;
		
		Solution ans = new Solution();
		List<List<Integer>> temp = ans.levelOrderBottom(Node1);
		System.out.println(temp);
		
	}

}
