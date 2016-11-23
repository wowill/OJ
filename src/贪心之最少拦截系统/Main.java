package 贪心之最少拦截系统;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn = 50000;
	static int next[] = new int[maxn];
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		int n, w[], ans = 0, num, k = 0, maxn = 30010, a[];
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			n = (int) st.nval;
			w = new int[n+10];
			a = new int[n];
			k = 0; ans = 0;
			Arrays.fill(w, maxn);
			for(int i = 0; i < n; i++)
			{
				a[i] = nextInt();
			}
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j <= i; j++)
				{
					if(a[i] <= w[j])
					{
						w[j] = a[i];
						break;
					}
				}
			}
			while(w[k] != maxn)
			{
				ans++;
				k++;
			}
			System.out.println(ans);
		}
		
		
	}
}


/*

8 389 207 155 300 299 170 158 65
5 100 80 50 60 55 30 40

*/