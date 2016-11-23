package dp_约瑟夫问题变形;

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
		int n, k, m, f[] = new int[10010];
		while(true)
		{
			n = nextInt();
			k = nextInt();
			m = nextInt();
			if(n == 0 || k == 0 || m == 0) break;
			Arrays.fill(f, 0);
			f[1] = 0;
			for(int i = 2; i <= n; i++) f[i] = (f[i-1] + k) % i;
			int ans = (m - k + 1 + f[n]) % n;
			if(ans <= 0) ans += n;
			System.out.println(ans);
		}
	}
}
/*

8 5 3
100 9999 98
10000 10000 10000
0 0 0


*/