package leetcode.sloution7;

import java.util.ArrayList;


/**
 * 
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2019年1月1日_上午10:42:03
 * @Descpriber :给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * 				示例 1:
 *					输入: 2
 *					输出: [0,1,1]
 *				示例 2:
 *					输入: 5
 *					输出: [0,1,1,2,1,2]
 */
public class Solution
{
	private int countNumBits(int num)
	{
		int count =0;
		while (0 != num)
		{
			num &=num-1;
			count++;
		}
		return count;
	}
	
	private  int countNumBits_1(int num)
	{
		int count = 0;
		while(0 != num)
		{
			if(0 != (num&0x1) )
			{
				count++;
			}
			num=num>>1;
		}
		
		
		return count;
	}
	
	private  int countNumBits_2(int num)
	{
		int count = 0;
		int mask  = 1;
		int bitNum  = 0;
		
		if(0 == num)
		{
			return 0;
		}
		
		bitNum = (int)(Math.log((double)num)/Math.log((double)2))+1;
		
		for(int i = 0; i<bitNum;i++)
		{
			mask = 1<<i;
			if(0 != (num&mask))
			{
				count++;
			}
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
        	int count = countNumBits_2(i);
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
