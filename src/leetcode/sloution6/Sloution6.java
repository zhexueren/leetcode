package leetcode.sloution6;

import java.util.LinkedList;

/**
 * 
 * @Filename   :Sloution6.java
 * @author     :Liu_f
 * @Data       :2018��12��24��_����10:03:04
 * @Descpriber :����һ���Ǹ��������� A������һ���� A ������ż��Ԫ����ɵ����飬����� A ����������Ԫ�ء�
 * 				����Է���������������κ�������Ϊ�𰸡�
 * 				���룺[3,1,2,4]
 *				�����[2,4,3,1]
 */
public class Sloution6
{
    public int[] sortArrayByParity(int[] A)
    {
        LinkedList<Integer> dataList = new LinkedList<Integer>();
        for(int i = 0;i<A.length;i++)
        {
        	//ż��
        	if(A[i]%2 == 0)
        	{
        		dataList.addFirst(A[i]);
        	}
        	else
        	{
        		dataList.addLast(A[i]);
        	}
        }
        
        int[] array =new int[A.length];
        int i = 0;
        for(Integer data:dataList)
        {
        	array[i]=data;
        	i++;
        }
        return array;
    }
    public int[] sortArrayByParity1(int[] A)
    {
    	int front = 0;
    	int end   = A.length-1;
    	while(front<=end)
    	{
    		while(front<A.length&&A[front]%2 ==0)
    		{
    			front++;
    		}
    		while(end>=0&&A[end]%2==1)
    		{
    			end--;
    		}
    		
    		if(front>end)
    		{
    			return A;
    		}
    		
    		if(front<A.length&&end>=0)
    		{
	    		int temp = A[front];
	    		A[front] = A[end];
	    		A[end]  = temp;
	    		front++;
	    		end--;
    		}
    	}
        
        return A;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sloution6 an =new Sloution6();
		//Test case1;
		int[] src = {0,1};
		int[] ret = an.sortArrayByParity1(src);
		for(int ch:ret)
		System.out.println(ch);
	}

}
