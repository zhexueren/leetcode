package leetcode.sloution3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 
 * @Filename   :Solution.java
 * @author     :Liu_f
 * @Data       :2018年12月23日_下午5:10:09
 * @Descpriber : 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
 * 				  你想知道你拥有的石头中有多少是宝石。J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，
 *               因此"a"和"A"是不同类型的石头。
 *               
 *               输入: J = "aA", S = "aAAbbbb"
 *				  输出: 3
 *				  示例 2:
 *				  输入: J = "z", S = "ZZ"
 *				  输出: 0
 *				
 *               注意:
 *               S 和 J 最多含有50个字母。
 *               J 中的字符不重复。
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
