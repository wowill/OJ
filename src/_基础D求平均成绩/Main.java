package _基础D求平均成绩;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, m, temp;
		double p[], c[], a[][];
		while(in.hasNext())
		{
			boolean flag = false;
			int cnt = 0;
			n = in.nextInt();
			m = in.nextInt();
			a = new double[n][m];
			p = new double[m+n];
			c = new double[m+n];
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < m; j++)
				{
					a[i][j] = in.nextInt();
					p[i] += a[i][j];
					c[j] += a[i][j];
				}
				p[i] /= m;
			}
			for(int j = 0; j < m; j++)
			{
				c[j] /= n;
			}
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < m; j++)
				{
					if(a[i][j] < c[j]) flag = true;
				}
				if(!flag) cnt++;
				flag = false;
			}
			
			System.out.format("%.2f", p[0]);
			for(int j = 1; j < n; j++)
			{
				System.out.format(" %.2f", p[j]);
			}
			System.out.println();
		
			System.out.format("%.2f", c[0]);
			for(int j = 1; j < m; j++)
			{
				System.out.format(" %.2f", c[j]);
			}
			System.out.println();			
			System.out.println(cnt);
			System.out.println();
			
		}
		
	}
}




/*

2 2
5 10
10 20

2 4
5 10 20 10
10 20 10 20

4 2
5 10
10 20
5 16
20 12

*/
