package leetcode.sloution7;

import java.util.ArrayList;

/**
 * 
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2019��1��1��_����10:42:03
 * @Descpriber :����һ���Ǹ����� num������ 0 �� i �� num ��Χ�е�ÿ������ i ����������������е� 1 ����Ŀ����������Ϊ���鷵�ء�
 * 				ʾ�� 1:
 *					����: 2
 *					���: [0,1,1]
 *				ʾ�� 2:
 *					����: 5
 *					���: [0,1,1,2,1,2]
 */
public class Solution
{
	private int countNumBits(int num)
	{
		int count =0;
		while (num!=0)
		{
			num &=num-1;
			count++;
		}
		return count;
	}
    public int[] countBits(int num)
    {
    	if(num<0)
    	{
    		throw new IllegalArgumentException("num is low compare zero");
    	}
        int[] data = new int[num+1];
        
        for(int i = 0 ;i<=num;i++)
        {
        	int count = countNumBits(i);
        	data[i] = count;
        }
        
        return data;
    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Test Case
		Solution ans = new Solution();
		int[] data1 = ans.countBits(5);
		int[] data2 = ans.countBits(0);
		//int[] data3 = ans.countBits(-1);
		System.out.println(data1);
	}

}
