package leetcode.sloution3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2018��12��23��_����5:10:09
 * @Descpriber : �����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�
 * 				  ����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд��
 *               ���"a"��"A"�ǲ�ͬ���͵�ʯͷ��
 *               
 *               ����: J = "aA", S = "aAAbbbb"
 *				  ���: 3
 *				  ʾ�� 2:
 *				  ����: J = "z", S = "ZZ"
 *				  ���: 0
 *				
 *               ע��:
 *               S �� J ��ຬ��50����ĸ��
 *               J �е��ַ����ظ���
 */
public class Solution
{
    public int numJewelsInStones(String J, String S)
    {
    	int count = 0;
    	if(J.length()>50||S.length()>50)
    	{
    		throw new IllegalArgumentException("Parameter Error!");
    	}
    	
    	if(J.length()<=0||S.length()<=0)
    	{
    		return 0;
    	}
    	
    	HashSet<Character> Jewel = new HashSet<Character>();
    	for(int i=0;i<J.length();i++)
    	{
    		Jewel.add(J.charAt(i));
    	}
    	
    	for(int i=0;i<S.length();i++)
    	{
    		if( Jewel.contains(S.charAt(i)))
    		{
    			count++;
    		}
    	}
    	
        return count;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution ans =new Solution();
		//Test Case1
		System.out.println(ans.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(ans.numJewelsInStones("z", "ZZZ"));
	}

}
