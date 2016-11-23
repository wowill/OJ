package PAT¼×¼¶_1005_SpellItRight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		BigInteger a = BigInteger.ZERO;
		String s[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String str;
		st.nextToken();
		while(st.ttype == StreamTokenizer.TT_NUMBER)
		{
			System.out.print(BigInteger.valueOf((long) st.nval)+"  ||  ");
			a = a.add(BigInteger.valueOf((long) st.nval));
			st.nextToken();
		}
		str = a.toString();
		System.out.println(str);
		for(int i = 0; i< str.length(); i++)
		{
			int x = str.charAt(i) - '0';
			if(i == str.length()-1)
				System.out.println(s[x]);
			else
				System.out.print(s[x]+" ");
		}
		
	}

}
