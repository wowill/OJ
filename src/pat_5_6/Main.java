package pat_5_6;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	static int a[], n, book[];
	static int p[]={0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0};
	static boolean flag = false;
	static void dfs(int cur)
	{
		if(cur == n+1 && p[a[cur-1]+a[1]] == 0) return ;
		if(cur == n+1)
		{
			System.out.print(a[1]);
			for(int i = 2; i <= n; i++) System.out.print(" "+a[i]);
			System.out.println();
			flag = true;
			return ;
		}
		for(int i = 2; i <= n; i++)
		{
			if(book[i] == 0 && p[i+a[cur-1]] == 1)
			{
				book[i] = 1;
				a[cur] = i;
				dfs(cur+1);
				book[i] = 0;
			}		
		}
		return ;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int k = 1;
		while(in.hasNext())
		{
			n = in.nextInt();
			flag = false;
			a = new int[n+1];
			book = new int[n+1];
			a[1] = 1;
			System.out.println("Case "+k+":");
			if(n%2 == 0) dfs(2);
			if(n == 1) System.out.println("1");
			k++;
			System.out.println();
		}
	}
}

/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 
0 1 1 0 1 0 1 0 0 0   1 0  1   0  0  0  1 0  1  0   0  0  1  0  0  0  0  0 1  0  1  0  0  0  0  0  1  0  0   
*/