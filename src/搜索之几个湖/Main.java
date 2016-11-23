package ËÑË÷Ö®¼¸¸öºþ;
 
import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	static int t, n, m, num, book[][];
	static char a[][];
	static void dfs(int x, int y, char color)
	{
		int next[][] = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
		int tx, ty;
		a[x][y] = color;
		for(int k = 0; k < 8; k++)
		{
			tx = x + next[k][0];
			ty = y + next[k][1];
			if(tx < 0 || tx > n-1 || ty < 0 || ty > m-1)
				continue;
			if(a[tx][ty] == 'W' && book[tx][ty] == 0)
			{
				book[tx][ty] = 1;
				dfs(tx,ty,color);
			}
		}
		return ;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		n = in.nextInt();
		m = in.nextInt();
		in.nextLine();
		a = new char[101][101];
		book = new int[101][101];
		num = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextLine().toCharArray();
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(a[i][j] == 'W')
				{
					num--;
					book[i][j] = 1;
					dfs(i, j, '#');	
				}
			}
		}
		System.out.println(-num);
	}
}
        