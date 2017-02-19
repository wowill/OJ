package Ïß¶ÎÊ÷Ö®I_Hate_It;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	static int maxn = 200000, n;
	static int max[] = new int[maxn<<2];
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	
	public static void main(String[] args) throws IOException {
		
		String str;
		int m, a, b;
		while(in.nextToken() != in.TT_EOF)
		{
			n = (int) in.nval;
			m = nextInt();
			Build(1, n, 1);
			while(m-- > 0)
			{
				str = next();
				a = nextInt();
				b = nextInt();
				if(str.charAt(0) == 'Q')
					System.out.println(Query(a, b, 1, n, 1));
				else
					Update(a, b, 1, n, 1);
			}
			
			
		}
	}
	static void Build(int l, int r, int node) throws IOException
	{
		if(l == r)
		{
			max[node] = nextInt();
			return ; 
		}
		int mid = (l + r) >> 1;
		Build(l, mid, node<<1);
		Build(mid+1, r, node<<1|1);
		pushUp(node);
	}
	static void pushUp(int node)
	{
		max[node] = Math.max(max[node<<1],max[node<<1|1]);
	}
	static void Update(int p, int value, int l, int r, int node)
	{
		if(l == r)
		{
			max[node] = value;
			return ;
		}
		int mid = (l + r) >> 1;
		if(p <= mid)
			Update(p, value, l, mid, node<<1);
		if(p > mid)
			Update(p, value, mid+1, r, node<<1|1);
		
		pushUp(node);
		
	}
	
	static int Query(int L, int R, int l, int r, int node)
	{
		if(L <= l && R >= r) return max[node];
		
		int mid = (l + r)>>1, max=0;
		if(L <= mid) max = Math.max(max, Query(L, R, l, mid, node<<1));
		if(R > mid) max = Math.max(max, Query(L, R, mid+1, r,node<<1|1));
		
		return max;
	}
}



/*

5 6
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 2 9
Q 1 5








*/