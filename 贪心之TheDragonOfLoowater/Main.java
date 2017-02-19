package Ì°ÐÄÖ®TheDragonOfLoowater;

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
		int n, m, d[], l[];
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			int ans = 0, i = 0, j = 0;
			n = (int) st.nval;
			m = nextInt();
			if(n == 0 || m == 0) break;
			
			d = new int[n];
			l = new int[m];
			for(i = 0; i < n; i++) d[i] = nextInt();
			for(i = 0; i < m; i++) l[i] = nextInt();
			if(m < n)
			{
				System.out.println("Loowater is doomed!");
				continue;
			}
			Arrays.sort(d);
			Arrays.sort(l);
			i = 0; j = 0;
			while(i < d.length && j < l.length)
			{
				if(l[j] >= d[i])
				{
					ans += l[j];
					j++;
					i++;
				}
				else
				{
					j++;
				}
			}
			if(i != d.length) 
				System.out.println("Loowater is doomed!");
			else
				System.out.println(ans);
		}
	}
}


/*

2 3
5
4
7
8
4
2 1
5
5
10
0 0

*/