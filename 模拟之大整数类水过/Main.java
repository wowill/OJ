package 模拟之大整数类水过;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static int maxn = 50000;
	static int next[] = new int[maxn];
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		
		BigInteger a, b;
		int n;
		n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			System.out.println("Case "+i+":");
			System.out.println(a+" + "+b+" = "+a.add(b));
			if(i+1 <= n) System.out.println();
		}
		
		
	}
}



/*



2
1 2
112233445566778899 998877665544332211





*/