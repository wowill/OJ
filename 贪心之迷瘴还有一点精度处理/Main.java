package 贪心之迷瘴还有一点精度处理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		
		int t, n, v, w;
		double p[];
		t = nextInt();
		while(t-- > 0)
		{
			n = nextInt();
			v = nextInt();
			w = nextInt();
			p = new double[n];
			for(int i = 0; i < n; i++)
			{
				p[i] = nextDouble();
			}
			Arrays.sort(p);
			int volume = 0;
			double ans = 0.0;
			
			for(int i = 0; i < n; i++)
			{
				if((ans*volume + p[i]*v)/(volume+v) <=  w*1.0)
				{
					ans = (ans*volume + p[i]*v)/(volume+v);
					volume += v;
				}
				else 
					break;
				
			}
			System.out.println(volume+" "+String.format("%.2f", ans*0.01));
			
		}
		
	}
}


/*


3
1 100 10
100
2 100 24
20 30
3 100 24
20 20 30

1
4 100 24
20 20 30 5


*/