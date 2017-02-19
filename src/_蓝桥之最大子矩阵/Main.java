package _蓝桥之最大子矩阵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[][] map = null;
		int n, m;
		n = nextInt();
		m = nextInt();
		map = new int[501][501];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = nextInt();
				map[i][j] = map[i][j] + map[i-1][j];
			}
		}
		Main main = new Main();
		int ans = main.subMaxMatrix(map, n, m);
		System.out.println(ans);
	}
	
	public int subMaxMatrix(int[][] map, int n, int m){
		
		int v, i, j, max, temp, k;
		for(i = 1, v = map[1][0]; i <= n; i++){
			for(j = i; j <= n; j++){  
                for(k = max = 0; k < m; k++){  
                    temp = map[j][k] - map[i-1][k];  
                    max = (max >= 0 ? max : 0) + temp;  
                    v = max > v ? max : v;  
                }  
            }
		}
		return v;
	}
}
