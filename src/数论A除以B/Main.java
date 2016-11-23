package ÊýÂÛA³ýÒÔB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main {
	static int maxn = 1001;
	static int next[] = new int[maxn];
//	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
//	static String next() throws IOException{in.nextToken(); return (String)in.sval;}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t, n, b;
		t = in.nextInt();
		while(t-- > 0)
		{
			int i = 1;
			n = in.nextInt();
			b = in.nextInt();
			for(; i < 9973; i++)
			{
				if(n == (b%9973) * (i%9973)%9973)
				{
					break;
				}
			}
			System.out.println(i);
		}
	}
}



/*


n = a%9973
a/b = x
gcd(b,9973) = 1;


n = (bx)%9973
n  == (b%9973 * x%9973 )%9973






*/