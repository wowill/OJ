package _蓝桥杯之大臣的旅费;

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
		int n, m, map[][], a, b, q;
		n = nextInt();
		
		map = new int[n+1][n+1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				map[i][j] = 9999999;
			}
		}
		for (int i = 1; i < n; i++) {
			a = nextInt();
			b = nextInt();
			q = nextInt();
			map[a][b] = q;
			map[b][a] = q;
			
		}
		int max = 0, sum = 0;
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(i != j && map[i][j] > map[i][k]+map[k][j]){
						map[i][j] = map[i][k]+map[k][j];
					}
					if(map[i][j] < 9999999){
						max = map[i][j] > max ? map[i][j] : max;
					}
				}
			}
		}
		
		for(int i = 1; i <= max; i++){
			sum += (i+10);
		}
		System.out.println(sum);
	}

}
