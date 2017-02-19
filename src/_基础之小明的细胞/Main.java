package _基础之小明的细胞;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		int t, n;
		t = nextInt();
		long a[] = new long[1001];
		long b[] = new long[1001];
		a[0] = 1;
		a[1] = 1;

		for(int i = 2; i <= 1000; i++)
		{	
			a[i] = a[i-1] + a[i-2];
			if(i % 10 == 0)
			{
				a[i] -= a[i-10];
			}
			a[i] %= 10007;
//			System.out.println("a["+i+"] : "+a[i]);
		}

		while(t-- > 0)
		{
			n = nextInt();
			System.out.println(a[2*n]);
		}
	}
}
/*

2+1*2+2*1


1+1    1+2+1+1    1+3+1+2+3+3    1+4 + 1+3 + 3+3*2 + 8+8   1+5 + 1+4 + 3+3*3 + 8+8*2 + 21+21
2      5           13               34                      88





3
1
2
5


1 1 2 3 5 8 13 21 34 55 89 144



没审题，竟然把斐波那契数列给推导出来了！
		long a[] = new long[1001];
		long b[] = new long[1001];
		a[0] = 1;
		a[1] = 2;
		b[1] = 1;
		b[2] = 1; 
		for(int i = 2; i <= 1000; i++)
		{	
			b[i] = a[i-1] - a[i-2];
			for(int j = 1, k = i; j <= i; j++, k--)
			{
				a[i] += b[j] + b[j]*k; 
			}
			
			
			System.out.println("a["+i+"] : "+a[i]);
		}


*/