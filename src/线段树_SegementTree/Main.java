package Ïß¶ÎÊ÷_SegementTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	static int maxn = 50000, n;
	static int sum[] = new int[maxn<<2];
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	
	public static void main(String[] args) throws IOException {
		
		int t, x, q, k = 1;
		String str, s;
		t = nextInt();
		while(t-- > 0)
		{
			n = nextInt();
			Build(1, n, 1);
			System.out.println("Case "+(k++)+":");
			int a, b;
			str = next();
			while(str.charAt(0) != 'E')
			{
				a = nextInt();
				b = nextInt();
				if(str.charAt(0) == 'A')
				{
					Update(a, b, 1, n, 1);
				}
				else if(str.charAt(0) == 'S')
				{
					Update(a, -b, 1, n, 1);
				}
				else
				{
					int temp = Query(a, b, 1, n, 1);
					System.out.println(temp);
				}
				str = next();
			}
			
		}
	}
	static void Build(int l, int r, int node) throws IOException
	{
		if(l == r)
		{
			sum[node] = nextInt();
			return ; 
		}
		int mid = (l + r) >> 1;
		Build(l, mid, node<<1);
		Build(mid+1, r, node<<1|1);
		pushUp(node);
	}
	static void pushUp(int node)
	{
		sum[node] = sum[node<<1] + sum[node<<1|1];
	}
	static void Update(int p, int value, int l, int r, int node)
	{
		if(l == r)
		{
			sum[node] += value;
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
		if(L<=l && R>=r) return sum[node];
		
		int mid = (l + r)>>1, total=0;
		if(L<=mid) total+=Query(L, R, l, mid, node<<1);
		if(R>mid) total+=Query(L, R, mid+1, r, (node<<1)|1);
		
		return total;
	}
}



/*

1
10
1 2 3 4 5 6 7 8 9 10
Query 1 3
Add 3 6
Query 2 7
Sub 10 2
Add 6 3
Query 3 10
End 








*/