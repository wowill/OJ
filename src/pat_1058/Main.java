package pat_1058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	
	public static void main(String[] args) throws IOException {
		int gradePb[], gradePs = 0, n, m, wrongCnt[];
		int maxCnt = 0;
		String str, ansStr[];
		StringBuilder sb = new StringBuilder();
		char ch;
		n = nextInt();
		m = nextInt();
		gradePb = new int[m];
		wrongCnt = new int[m];
		ansStr = new  String[m];
		
		int a, b, c, ttemp;
		for(int i = 0; i < m; i++)
	    {
			a = nextInt();
			b = nextInt();
			c = nextInt();
			ttemp = c;
			sb.append(c);
			while(ttemp-- > 0)
			{
				str = next();
				sb.append(str);
			}
	      ansStr[i] = sb.toString();
	      gradePb[i] = a;
	      sb.delete(0, sb.length());
	      
	    }
		for(int i = 0; i < n; i++)
		{		
			for(int j = 0; j < m; j++)
			{
				in.nextToken();
				while((char)in.ttype != ')')
				{
					if(in.ttype == StreamTokenizer.TT_NUMBER) sb.append((int)in.nval);
					if(in.ttype == StreamTokenizer.TT_WORD) sb.append(in.sval);
					in.nextToken();
					
				}
				str = sb.toString();
				sb.delete(0, sb.length());
				if(ansStr[j].equals(str)) gradePs+=gradePb[j];
				else wrongCnt[j]++;
			}
			System.out.println(gradePs);
			gradePs = 0;
		}
		for(int i = 0; i < m; i++)
		{
			if(maxCnt < wrongCnt[i]) maxCnt = wrongCnt[i];
		}
		if(maxCnt > 0)
		{
			System.out.print(maxCnt);
			for(int i = 1; i <= m; i++)
			{
				if(wrongCnt[i-1] == maxCnt)
					System.out.print(" "+i);
			}
		}
		else
		{
			System.out.print("Too simple");
		}
//		System.out.println("all time is :"+(end-start)+"ms");
	}
}




/*


3 4 
3 4 2 a c
2 5 1 b
5 3 2 b c
1 5 4 a b d e
(2 a c) (2 b d) (2 a c) (3 a b e)
(2 a c) (1 b) (2 a b) (4 a b d e)
(2 b d) (1 e) (2 b c) (4 a b c d)





1 3
5 4 2 a b
3 4 2 b c
1 4 1 a
(2 a)(2 bc)(1 a)



5 3
5 4 2 a b
4 4 2 b c
3 2 1 a
(0) (2 a c) (1 c)
(1 a) (0) (1 b)
(1 b) (2 a c) (0)
(1 a) (0) (1 c)
(1 a) (2 a c) (1 a)

5 2
5 4 2 a b
3 3 1 a
(1 a) (1 a)
(1 a) (0)
(1 a) (0)
(2 a b) (0)
(1 a) (2 a b)



3 4 
3 4 2 a c
2 5 1 b
5 3 2 b c
1 5 4 a b d e
(2 a c) (2 b d) (2 a c) (3 a b e)
(2 a c) (1 b) (2 a b) (4 a b d e)
(2 b d) (1 e) (2 b c) (4 a b c d e)

3 4 
3 4 2 a c
2 5 1 b
5 3 2 b c
1 5 4 a b d e
(2 ac)(2 bd)(2 ac)(3 abe)
(2 ac)(1 b)(2 ab)(4 abde)
(2 bd)(1 e)(2 bc)(4 abcd)


 * */