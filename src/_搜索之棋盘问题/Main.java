package _À—À˜÷Æ∆Â≈ÃŒ Ã‚;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	static char[][] e;
	static int n, k, ans;
	static boolean book[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		while(true){
			n = sc.nextInt();
			k = sc.nextInt();
			if(n == -1 || k == -1) break;
			e = new char[n][n];
			book = new boolean[n];
			ans = 0;
			for(int i = 0; i < n; i++){
				e[i] = sc.next().toCharArray();
			}
			dfs(0,0);
			System.out.println(ans);
		}
	}
	
	public static void dfs(int cur, int num){
		if(num == k){
			ans++;
			return ;
		}
		for(int i = cur; i < n; i++){
			for(int j = 0; j < n ; j++){
				if(e[i][j] == '#' && !book[j]){
					book[j] = true;
					dfs(i+1, num+1);
					book[j] = false;
				}
			}
		}
	}

}
