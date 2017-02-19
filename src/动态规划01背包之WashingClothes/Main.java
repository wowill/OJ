package 动态规划01背包之WashingClothes;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.util.TreeMap;
import java.util.TreeSet;

class Color{
	int time[];
	String color;
	int sum;
	int no;
	public Color(String color) {
		this.color = color;
		time = new int[105];
	}
	public Color()
	{
		
	}
}

public class Main {
	static int type = 0, n;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, m, time, dp[] = new int[100000+10], num, ans;
		Color col[];
		String color;
		while(in.hasNext())
		{
			ans = 0;
			n = in.nextInt();
			m = in.nextInt();
			if(m == 0 || n == 0) break;
			col = new Color[n];
//			in.nextLine();
			for(int i = 0; i < n; i++)
			{
				color = in.next();
				col[i] = new Color(color);
			}
			
			for(int i = 0; i < m; i++)
			{
				time = in.nextInt();
				color = in.next();
				for(int j = 0; j < n; j++)
				{
					if(col[j].color.equals(color))
					{
						col[j].time[col[j].no] = time;
						col[j].sum += time;
						col[j].no++;
					}
					
				}
			}
			
			int maxV;
			for(int i = 0; i < n; i++)
			{
				maxV = col[i].sum/2;
				for(int j = 0; j < col[i].no; j++)
				{
					for(int k = maxV; k >= col[i].time[j]; k--)
					{
						
						dp[k] = Math.max(dp[k], dp[k-col[i].time[j]]+col[i].time[j]);
					}
				}
				ans += Math.max(dp[maxV], col[i].sum-dp[maxV]);
				Arrays.fill(dp, 0);
			}
			

			System.out.println(ans);
		}
		
	}
}

/*



3 4
red blue yellow
2 red
3 blue
4 blue
6 red
0 0

10
8
6
2

*/