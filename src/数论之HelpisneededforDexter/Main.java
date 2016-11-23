package ÊýÂÛÖ®HelpisneededforDexter;

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
	
	static int f(int n)
	{
		return n == 1 ? 1 : f(n/2) + 1;
		
	}
	
	public static void main(String[] args) throws IOException {
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			int n = (int) st.nval;
			System.out.println(f(n));
		}
	}

}


/*

1
2
3


*/