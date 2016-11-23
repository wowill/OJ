package ËÑË÷Ö®»¬Ñ©;
 
import java.io.BufferedInputStream;
import java.util.Scanner;



public class Main {
	static int t, m, n, num, maxn = 0, ans[][];
	static int a[][];
	static int dfs(int x, int y)
	{
		if(ans[x][y] != 0) 
		{
			return ans[x][y];
		}
		int tx, ty;
		int next[][] = {{1,0},{0,1},{-1,0},{0,-1}};
		for(int i = 0; i < 4; i++)
		{
			tx = x + next[i][0];
			ty = y + next[i][1];
			if(tx < 0 || tx > n-1 || ty < 0 || ty > m-1)
				continue;
			if(a[tx][ty] < a[x][y])
			{
				ans[x][y] = Math.max(ans[x][y], dfs(tx, ty)+1);
			}
		}
		return ans[x][y];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		maxn = 1;
		n = in.nextInt();
		m = in.nextInt();
		in.nextLine();
		a = new int[101][101];
		ans = new int[101][101];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				a[i][j] = in.nextInt();
				
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				ans[i][j] = dfs(i, j);
				maxn = Math.max(maxn, ans[i][j]+1);
			}
			
		}
		
		System.out.println(maxn);
	}
}
       