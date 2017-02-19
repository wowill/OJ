package 动态规划01背包之饭卡;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, m, w[], dp[];
		while(in.hasNext())
		{
			n = in.nextInt();
			if(n == 0) break;
			w = new int[n+1];
			dp = new int[1001];
			for(int i = 1; i <= n; i++)
				w[i] = in.nextInt();
			m = in.nextInt();
			
			if(m < 5)
			{
				System.out.println(m);
				continue;
				
			}
			Arrays.sort(w, 1, w.length);
			for(int i = 1; i <= n-1; i++)
			{
				for(int j = m-5; j >= w[i]; j--)
				{
					dp[j] = Math.max(dp[j], dp[j-w[i]] + w[i]);
				}
			}
			System.out.println(m-dp[m-5]-w[n]);
		}
	}
}

/*

1
50
5
10
1 2 3 2 1 1 2 3 2 1
50
0


5
1 1 2 2 3
5

10
1 1 1 1 2 2 2 2 3 3
10
10
1 1 1 1 2 2 2 2 3 3
12

*/



