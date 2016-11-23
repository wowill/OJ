package Ê÷×´Êý×é;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static char nextChar() throws IOException {st.nextToken(); return (char) st.ttype;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	static int C[], n;
	
	public static void main(String[] args) throws IOException {
		int t;
		t = nextInt();
		for(int i = 0; i < t; i++)
		{
			n = nextInt();
			C = new int[n<<2 + 10];
			for(int j = 1; j <= n; j++)
			{
				int x = nextInt();
				add(i, x);
			}
			System.out.println();
			System.out.println("Case "+(i+1)+":");
			while(st.nextToken() != StreamTokenizer.TT_EOF)
			{
				int a = nextInt();
				int b = nextInt();
				
				if(st.sval.charAt(0) == 'Q') System.out.println(sum(b) - sum(a));
				else if(st.sval.charAt(0) == 'A') add(a, b);
				else if(st.sval.charAt(0) == 'S') sub(a, b);
				else break;
			}
		}
	}
	
	static int sum(int x)
	{
		int ret = 0;
		while(x > 0)
		{
			ret += C[x];
			x -= (x&-x);
		}
		return ret;
	}
	
	static void add(int x, int d)
	{
		while(x <= n)
		{
			C[x] += d;
			x += (x&-x);
		}
	}
	static void sub(int x, int d)
	{
		while(x <= n)
		{
			C[x] -= d;
			x += (x&-x);
		}
	}
}


/*
1
10
1 2 3 4 5 6 7 8 9 10
Query 1 3
Add 3 6
Query 2 7
Sub 10 2
Add 6 3
Query 3 10
End


*/