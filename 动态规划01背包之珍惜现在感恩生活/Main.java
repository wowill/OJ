package 动态规划01背包之珍惜现在感恩生活;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, m, c[], dp[], p[], h[];
		int t;
		t = in.nextInt();
		while(t-- > 0)
		{
			n = in.nextInt();
			m = in.nextInt();
			dp = new int[101];
			c = new int[m+1];
			p = new int[m+1];
			h = new int[m+1];
			for(int i = 0; i < m; i++)
			{
				p[i] = in.nextInt();
				h[i] = in.nextInt();
				c[i] = in.nextInt();
			}
			
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < c[i]; j++)
				{
					for(int k = n; k >= p[i]; k--)
					{
						dp[k] = Math.max(dp[k], dp[k-p[i]]+ h[i]);
					}
				}
			}
			System.out.println(dp[n]);
		}
	}
}

/*

1
8 2
2 100 4
4 100 2


1
8 3
1 100 1
1 50 1
1 70 1



*/



