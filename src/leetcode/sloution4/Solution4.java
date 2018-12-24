package leetcode.sloution4;

import java.util.HashSet;

/**
 * 
 * @Filename   :Solution4.java
 * @author     :Liu_f
 * @Data       :2018��12��24��_����8:26:35
 * @Descpriber :ÿ������ʼ�����һ���������ƺ�һ��������ɣ��� @ ���ŷָ���
 *				���磬�� alice@leetcode.com�У� alice �Ǳ������ƣ��� leetcode.com ��������
 * 				����Сд��ĸ����Щ�����ʼ������ܰ��� ',' �� '+'������ڵ����ʼ���ַ�ı������Ʋ����е�ĳЩ�ַ�֮����Ӿ�㣨'.'����
 * 				����������ʼ�����ת��������������û�е��ͬһ��ַ�����磬"alice.z@leetcode.com�� �� ��alicez@leetcode.com��
 * 				 ��ת����ͬһ�����ʼ���ַ�� ����ע�⣬�˹���������������������ڱ�����������ӼӺţ�'+'���������Ե�һ���Ӻź�����������ݡ�
 * 				���������ĳЩ�����ʼ������� m.y+name@email.com ��ת���� my@email.com�� ��ͬ�����˹���������������������ͬʱʹ������������
 *				���������ʼ��б� emails�����ǻ����б��е�ÿ����ַ����һ������ʼ���ʵ���յ��ʼ��Ĳ�ͬ��ַ�ж��٣�
 */
public class Solution4
{
    public int numUniqueEmails(String[] emails)
    {
    	HashSet<String> resultString = new HashSet<String>();
    	
    	for(String str:emails)
    	{
    		String[] data = str.split("@");
    		String temp = data[0].replace(".", "").split("\\+")[0];
    		resultString.add(temp+"@"+data[1]);
    		
    	}
        return resultString.size();
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution4 ans = new Solution4();
		//Test Case 1;
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int ret = ans.numUniqueEmails(emails);
		System.out.print(ret);
	}

}
