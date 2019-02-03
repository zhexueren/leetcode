package leetcode.sloution11;
/**
 * 
 * @Filename   :Sloution11.java
 * @author     :Liu_f
 * @Data       :2019年2月3日_下午9:11:36
 * @Descpriber :给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度
 * 				输入:
 *				A: [1,2,3,2,1]
 *				B: [3,2,1,4,7]
 *				输出: 3
 *				解释: 
 *				长度最长的公共子数组是 [3, 2, 1]。
 */
public class Sloution11
{
    public int findLength(int[] A, int[] B) 
    {
        int lenA = A.length;
        int lenB = B.length;
        if(lenA<1||lenB<1||lenA>1000||lenB>1000)
        {
        	return 0;
        }
        
        int[][] data = new int[lenA+1][lenB+1];
        
        //数组初始化
        for(int i =0;i<lenA;i++)
        {
        	data[i][0] = 0;
        }
        for(int i =0;i<lenB;i++)
        {
        	data[0][i] = 0;
        }
        
        //计算
        int maxVal = 0;
        for(int i = 1; i<=lenA;i++)
        {
        	for(int j =1 ;j<=lenB;j++)
        	{
        		if(A[i-1]==B[j-1])
        		{
        			data[i][j]=data[i-1][j-1]+1;
        			maxVal = Math.max(data[i][j], maxVal);
        		}
        		else 
        		{
        			data[i][j] = 0;
        		}
        	}
        }
        
        return maxVal;

    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
