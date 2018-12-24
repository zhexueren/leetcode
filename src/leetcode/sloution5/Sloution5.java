package leetcode.sloution5;
/**
 * 
 * @Filename   :Sloution5.java
 * @author     :Liu_f
 * @Data       :2018年12月24日_下午9:12:49
 * @Descpriber :实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class Sloution5
{
    public String toLowerCase(String str) 
    {
        char[] data = new char[str.length()];
        for(int i = 0;i<str.length();i++)
        {
        	char ch = str.charAt(i);
        	if(ch>='A'&&ch<='Z')
        	{
        		ch = (char) (ch +32);
        	}
        	data[i]=ch;
        }
        
        return new String(data);
        
    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sloution5 an = new Sloution5();
		//Test Case1
		String ret = an.toLowerCase("");
		System.out.println(ret);

	}

}
