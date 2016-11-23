package ÊýÂÛÖ®SpreadingTheWealth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int maxn = (int) 1e6;
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		long a[], M, c[], tot;
		int n;
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			tot = 0;
			n = (int) st.nval;
			a = new long[n];
			c = new long[n];
			for(int i = 0; i < n; i++)
			{
				a[i] = nextInt();
				tot += a[i];
			}
			M = tot/n;
			c[0] = 0;
			for(int i = 1; i < n; i++) c[i] = c[i-1] + a[i] - M;
			Arrays.sort(c);
			long x1 = c[n/2], ans = 0;
			for(int i = 0; i < n; i++) ans += Math.abs(x1 - c[i]);
			System.out.println(ans);
		}
	}
}


/*

3
100
100
100
4
1
2
5
4

*/