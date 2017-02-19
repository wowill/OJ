package Ì°ÐÄÖ®CommandoWar;

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
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		int n, b, j, ans, s, kase = 1;
		ArrayList<War> list = new ArrayList<>();
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			ans = 0; s= 0;
			n = (int) st.nval;
			if(n == 0) break;
			for(int i = 0; i < n; i++)
			{
				b = nextInt();
				j = nextInt();
				list.add(new War(b, j));
			}
			Collections.sort(list, new Comp());
			for(int i = 0; i < list.size(); i++)
			{
				s += list.get(i).b;
				ans = Math.max(ans, s+list.get(i).j);
			}
			System.out.println("Case " + (kase++) + ": " + ans);
			list.clear();
		}
	}
}

class War{
	int b;
	int j;
	public War(int b, int j)
	{
		this.b = b;
		this.j = j;
	}
}
class Comp implements Comparator<War>{
	@Override
	public int compare(War o1, War o2) {
		if(o1.j < o2.j) return 1;
		return -1;
	}
}


/*

3
2 5
3 2
2 1
3
3 3
4 4
5 5
0


*/