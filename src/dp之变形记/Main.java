package dp之变形记;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static char nextChar() throws IOException {st.nextToken(); return (char) st.ttype;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	static boolean flag = false;
	static int book[];
	static Vector<Character> start = new Vector<>(), end = new Vector<>();
	public static void main(String[] args) throws IOException {
		String str;
		book = new int[start.size()];
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			if(st.ttype == StreamTokenizer.TT_NUMBER)
			{
				book = new int[start.size()];
				if(start.size() > 0)
					dfs('b');
				
				System.out.println(flag ? "Yes." : "No.");
				start.clear();
				end.clear();
				flag = false;
				continue;
			}
			
			str = st.sval;
			start.add(str.charAt(0));
			end.add(str.charAt(str.length()-1));
		}
	}
	
	static void dfs(char pre_suffix)
	{
		if(pre_suffix == 'm')
		{
			flag = true;
			return ;
		}
		for(int i = 0; i < start.size(); i++)
		{
			if(flag) break;
			if(book[i] == 0 &&  start.get(i) == pre_suffix)
			{
				book[i] = 1;
				dfs(end.get(i));
				book[i] = 0;
			}
		}
		return ;
	}

}


/*

so
soon
river
goes
them
got
moon
begin
big
0

bbs
son
ndb
0

*/