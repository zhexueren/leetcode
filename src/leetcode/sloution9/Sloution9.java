package leetcode.sloution9;


/**
 * 
 * @Filename   :Sloution9.java
 * @author     :Liu_f
 * @Data       :2019年1月4日_下午9:27:44
 * @Descpriber :给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *              如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *				您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *				示例：			
 *				输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *				输出：7 -> 0 -> 8
 *				原因：342 + 465 = 807
 */
class ListNode 
 {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Sloution9
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode data;
		ListNode ret = l1;
		if(null == l1)
		{
			return l2;
		}
		if(null == l2)
		{
			return l1;
		}
		
		
		int addOneFlag = 0;
		do
		{
			l1.val += l2.val+addOneFlag;
			addOneFlag = 0;
			if(l1.val>9)
			{
				l1.val = l1.val -10;
				addOneFlag++;
			}
			data = l1;
			
			l1 = l1.next;
			l2 = l2.next;
		} while (l1!= null&&l2 != null);
		
		if(l2 == null)
		{
			while(l1 != null)
			{
				l1.val += addOneFlag;
				addOneFlag = 0;
				if(l1.val>9)
				{
					l1.val = l1.val -10;
					addOneFlag++;
				}
				data = l1;
				l1 = l1.next;
			}
		}
		else if (l1 == null)
		{
			
			while(l2 != null)
			{
				l2.val += addOneFlag;
				addOneFlag = 0;
				if(l2.val>9)
				{
					l2.val = l2.val -10;
					addOneFlag++;
				}
				data.next = l2;
				
				data = l2;
				l2 = l2.next;
			}
		}
		
		if(addOneFlag != 0)
		{
			ListNode newNode = new ListNode(addOneFlag);
			data.next = newNode;
		}
		
		return ret;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sloution9 obj = new Sloution9();
		ListNode node11 = new ListNode(2);
		ListNode node12 = new ListNode(4);
		ListNode node13 = new ListNode(3);
		
		node11.next = node12;
		node12.next = node13;
		
		ListNode node21 = new ListNode(5);
		ListNode node22 = new ListNode(6);
		ListNode node23 = new ListNode(4);
		
		node21.next = node22;
		node22.next = node23;
		
		ListNode ret = obj.addTwoNumbers(node11, node21);
	}

}
