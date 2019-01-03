package leetcode.sloution8;
/**
 * 
 * @Filename   :Sloution8.java
 * @author     :Liu_f
 * @Data       :2019年1月3日_下午10:40:27
 * @Descpriber :在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。
 *               高度 0 也被认为是建筑物。最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。 城
 *               市的天际线是从远处观看时，由所有建筑物形成的矩形的外部轮廓。 请看下面的例子。建筑物高度可以增加的最大总和是多少？
 *				  例子：
 *				 输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
 *				输出： 35
 *				解释： 
 *				The grid is:
 *				[ [3, 0, 8, 4], 
 *				  [2, 4, 5, 7],
 *				  [9, 2, 6, 3],
 *				  [0, 3, 1, 0] ]
 *
 *				从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]
 *				从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]
 *
 *				在不影响天际线的情况下对建筑物进行增高后，新数组如下：
 *				
 *				gridNew = [ [8, 4, 8, 7],
 *				            [7, 4, 7, 7],
 *				            [9, 4, 8, 7],
 *				            [3, 3, 3, 3] ]
 *				说明: 
 *				1 < grid.length = grid[0].length <= 50。
 *				 grid[i][j] 的高度范围是： [0, 100]。
 *				一座建筑物占据一个grid[i][j]：换言之，它们是 1 x 1 x grid[i][j] 的长方体。
 */
public class Sloution8
{
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
    	int rows = grid.length;
    	int cols = grid[0].length;
    	
    	int sum = 0;
    	/*构造水平天际线*/
    	int [] horizontal = new int[rows];
    	/*构造竖直天际线*/
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
