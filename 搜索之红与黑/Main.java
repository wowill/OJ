package ËÑË÷Ö®ºìÓëºÚ;
 
import java.io.BufferedInputStream;
import java.util.Scanner;


import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static int t, m, n, num, book[][], cnt = 0;
	static char a[][];
	static void dfs(int x, int y, char color)
	{
		int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
		int tx, ty;
		a[x][y] = color;
		for(int k = 0; k < 4; k++)
		{
			tx = x + next[k][0];
			ty = y + next[k][1];
			if(tx < 0 || tx > n-1 || ty < 0 || ty > m-1)
				continue;
			if(a[tx][ty] == '.' && book[tx][ty] == 0)
			{
				cnt++;
				book[tx][ty] = 1;
				dfs(tx,ty,color);
			}
		}
		return ;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
		{
			cnt = 0;
			m = in.nextInt();
			n = in.nextInt();
			if(n == 0 || m == 0) break;
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
					if(a[i][j] == '@')
					{
						num--;
						book[i][j] = 1;
						dfs(i, j, '*');	
					}
				}
			}
			
			System.out.println(cnt+1);
		}
		
			
	}
}
       