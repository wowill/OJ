package _蓝桥杯回形取数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) {
		
		int m, n;
		StringBuilder sb = new StringBuilder();
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int book[][] = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int r = m-1, c = 0;
		while(r >= 0 && c < n){
			
			for(int i = 0; i <= r; i++){
				if(book[i][c] == 0){
					sb.append(a[i][c]+" ");
					book[i][c] = 1;
				}
			}
			for(int j = 0; j < n; j++){
				if(book[r][j] == 0){
					sb.append(a[r][j]+" ");
					book[r][j] = 1;
				}
			}
			for(int i = r; i >= 0; i--){
				if(book[i][n-1-c] == 0){
					sb.append(a[i][n-1-c]+" ");
					book[i][n-1-c] = 1;
				}
			}
			for(int j = n-1; j >= 0; j--){
				if(book[m-r-1][j] == 0){
					sb.append(a[m-r-1][j]+" ");
					book[m-r-1][j] = 1;
				}
			}
			r--;
			c++;
		}
		System.out.println(sb.toString().trim());
	}

}
