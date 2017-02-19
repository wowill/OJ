package _µØ¹¬È¡±¦;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static int map[][], d[][][][], n, m, k, N = 1000000007;
	private static int dfs(int x,int y,int num,int max)
    {
        if(d[x][y][num][max+1]!=-1)
        {
            return d[x][y][num][max+1];
        }
        if(x==n&&y==m)
        {
            if(num==k)
                return d[x][y][num][max+1]=1;
            else if(num==k-1&&max<map[x][y])
                return d[x][y][num][max+1]=1;
            else
                return d[x][y][num][max+1]=0;
        }
        long s=0;
        if(x+1<=n)
        {
            if(max<map[x][y])
            {
                s+=dfs(x+1,y,num+1,map[x][y]);
                s=s%N;
            }
            s+=dfs(x+1,y,num,max);
            s=s%N;
        }
        if(y+1<=m)
        {
            if(max<map[x][y])
            {
                s+=dfs(x,y+1,num+1,map[x][y]);
                s=s%N;
            }
            s+=dfs(x,y+1,num,max);
            s=s%N;
        }
        return d[x][y][num][max+1]=(int) (s%N);
    }
	public static void main(String[] args) throws IOException {
		map = new int[55][55];
		d = new int[55][55][13][14];
		int i,j;
	    while(st.nextToken() != StreamTokenizer.TT_EOF){
	    	n = (int)st.nval;
	    	m = nextInt();
	    	k = nextInt();
	        for(i = 1; i <= n; i++)
	            for(j = 1; j <= m; j++)
	                map[i][j] = nextInt();
	        for(int i2 = 0; i2 < 52; i2++){
	        	for (int j2 = 0; j2 < 55; j2++) {
					for (int k = 0; k < 13; k++) {
						for (int k2 = 0; k2 < 14; k2++) {
							d[i2][j2][k][k2] = -1;
						}
					}
				}
	        }
	        System.out.println(dfs(1,1,0,-1));
	    }
	}
}
