package 贪心之老人真是饿了啊;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int maxn = 50000;
	static int next[] = new int[maxn];
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		
		int c ,n ,m, p = 0, h;
		ArrayList<Rice> list = new ArrayList<>();
		c = nextInt();
		while(c-- > 0)
		{
			n = nextInt();
			m = nextInt();
			for(int i = 0; i < m; i++)
			{
				p = nextInt();
				h = nextInt();
				list.add(new Rice(p, h));
			}
			Collections.sort(list, new Comp());
			double ans = 0;
			int i = 0;
			while(i < list.size())
			{
				if(n - list.get(i).p <= 0)
				{
					
					ans += (float)((float)n/(float)list.get(i).p);
					n = 0; 
					break;
				}
				if(n - list.get(i).p > 0)
				{
					ans += 1.0;
					n -= list.get(i).p;
					list.set(i, new Rice(list.get(i).p, list.get(i).h-1));
				}
				if(list.get(i).h == 0)
					i++;
			}
			System.out.println(String.format("%.2f", ans));
			list.clear();
		}
		
		
	}
}

class Rice{
	int p;
	int h;
	public Rice(int p, int h) {
		this.p = p;
		this.h = h;
	}
}
class Comp implements Comparator<Rice>{

	@Override
	public int compare(Rice o1, Rice o2) {
		if(o1.p < o2.p) return -1;
		else if(o1.p > o2.p) return 1;
		else
		{
			if(o1.h < o2.h) return 1;
			else return -1;
		}
	}
	
}

/*



1
7 2
3 3
4 4


1
7 2
3 1
4 4



*/