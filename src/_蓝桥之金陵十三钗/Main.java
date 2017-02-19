package _蓝桥之金陵十三钗;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
public class Main {
	static int n, like[][], dp[], br[], ans = 0;
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	public static void main(String[] args) throws IOException{
		
		like = new int[13][13];
		br = new int[13];
		dp = new int[14];
		n = nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				like[i][j] = nextInt();
			}
		}
		dfs(0);
		System.out.println(ans);
	}
	
	public static void dfs(int step){
		if(step >= n){
			ans = Math.max(dp[n], ans);
			return ;
		}
		for (int i = 0; i < n; i++) {
			if(br[i] == 0){
				br[i] = 1;
				dp[step+1] = dp[step]+like[i][step];
				dfs(step+1);
				br[i] = 0;
				if(step == n)
					break;
			}
		}
		return ;
	
	}
	
}
