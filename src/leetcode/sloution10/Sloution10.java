package leetcode.sloution10;

import java.util.HashMap;

import org.junit.experimental.max.MaxCore;

/**
 * 
 * @Filename   :Sloution10.java
 * @author     :Liu_f
 * @Data       :2019��2��3��_����6:41:39
 * @Descpriber :����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 */
public class Sloution10
{
    public int lengthOfLongestSubstring(String s)
    {
        int len =s.length();
        int ans = 0;
        HashMap<Character, Integer> data=new HashMap<Character,Integer>();
        for(int i=0,j=0;j<len;j++)
        {
        	if(data.containsKey(s.charAt(j)))
        	{
        		i = Math.max(i,data.get(s.charAt(j))+1);
        	}
        	data.put(s.charAt(j), j);
        	ans=Math.max(ans, j-i+1);
        }
        return ans;
       
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
