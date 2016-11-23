package pat_1104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer st = new StreamTokenizer(bf);
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(bf);
	
	public static void main(String[] args) throws IOException {
		int n;
		n = nextInt();
		int k = n;
		double num, sum = 0.0;
		for(int i = 1; i <= n; i++)
		{
			num = nextDouble();
			sum += num * i * (k--);
		}
		System.out.println(String.format("%.2f", sum));
	}
}




/*

1 2 3 4


1 12 123 1234
2 23 24
3 34
4

*/