package leetcode.sloution5;
/**
 * 
 * @Filename   :Sloution5.java
 * @author     :Liu_f
 * @Data       :2018��12��24��_����9:12:49
 * @Descpriber :ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����
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
