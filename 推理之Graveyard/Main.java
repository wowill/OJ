package Õ∆¿Ì÷ÆGraveyard;

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
		
		int n, m;
		double ans;
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			n = (int) st.nval;
			m = nextInt();
			ans = 0.0;
			for(int i = 1; i < n; i++)
			{
				double pos = (double) i / n * (n + m);
				ans += Math.abs(pos - Math.floor(pos + 0.5)) / (n + m);
			}
			
			System.out.println(String.format("%.4f", ans*10000));
		}
	}
}
/*


2 1
2 3
3 1
10 10


*/