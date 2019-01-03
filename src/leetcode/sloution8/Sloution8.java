package leetcode.sloution8;
/**
 * 
 * @Filename   :Sloution8.java
 * @author     :Liu_f
 * @Data       :2019��1��3��_����10:40:27
 * @Descpriber :�ڶ�ά����grid�У�grid[i][j]����λ��ĳ���Ľ�����ĸ߶ȡ� ���Ǳ����������κ���������ͬ��������������ܲ�ͬ���Ľ�����ĸ߶ȡ�
 *               �߶� 0 Ҳ����Ϊ�ǽ������󣬴�������������ĸ����򣨼��������ײ��������Ҳࣩ�ۿ��ġ�����ߡ�������ԭʼ������������ͬ�� ��
 *               �е�������Ǵ�Զ���ۿ�ʱ�������н������γɵľ��ε��ⲿ������ �뿴��������ӡ�������߶ȿ������ӵ�����ܺ��Ƕ��٣�
 *				  ���ӣ�
 *				 ���룺 grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
 *				����� 35
 *				���ͣ� 
 *				The grid is:
 *				[ [3, 0, 8, 4], 
 *				  [2, 4, 5, 7],
 *				  [9, 2, 6, 3],
 *				  [0, 3, 1, 0] ]
 *
 *				��������ֱ���򣨼��������ײ�����������ߡ��ǣ�[9, 4, 8, 7]
 *				��ˮƽˮƽ���򣨼���࣬�Ҳࣩ��������ߡ��ǣ�[8, 7, 9, 3]
 *
 *				�ڲ�Ӱ������ߵ�����¶Խ�����������ߺ����������£�
 *				
 *				gridNew = [ [8, 4, 8, 7],
 *				            [7, 4, 7, 7],
 *				            [9, 4, 8, 7],
 *				            [3, 3, 3, 3] ]
 *				˵��: 
 *				1 < grid.length = grid[0].length <= 50��
 *				 grid[i][j] �ĸ߶ȷ�Χ�ǣ� [0, 100]��
 *				һ��������ռ��һ��grid[i][j]������֮�������� 1 x 1 x grid[i][j] �ĳ����塣
 */
public class Sloution8
{
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
    	int rows = grid.length;
    	int cols = grid[0].length;
    	
    	int sum = 0;
    	/*����ˮƽ�����*/
    	int [] horizontal = new int[rows];
    	/*������ֱ�����*/
    	int [] vertical  = new int[cols];
    	for(int i = 0;i< rows;i++)
    	{
    		for(int j =0;j<cols ;j++)
    		{
    			sum += grid[i][j];
    			if(horizontal[i]<grid[i][j])
    			{
    				horizontal[i] = grid[i][j];
    			}
    			
    			if(vertical[j]<grid[i][j])
    			{
    				vertical[j] = grid[i][j];
    			}
    		}
    	}
    	
    	int addSum = 0;
    	for(int i = 0; i<rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    			addSum += Math.min(horizontal[i], vertical[j]);
    		}
    	}
    	
    	
        return addSum -sum;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Test Case 1;
		Sloution8 ans = new Sloution8();
		int[][]  data = { {3, 0, 8, 4}, 
		                  {2, 4, 5, 7},
		                  {9, 2, 6, 3},
		                  {0, 3, 1, 0} };
		int ret = ans.maxIncreaseKeepingSkyline(data);
	}

}
