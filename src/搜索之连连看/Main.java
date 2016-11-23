package 搜索之连连看;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	static int e[][] = new int[1001][1001], n, m, endX, endY;
	static boolean flag = false;
	
//	int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
//	String next() throws IOException{in.nextToken(); return in.sval;}
	
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        int q, startX, startY;
        in.nextToken();n = (int) in.nval;
        in.nextToken();m = (int) in.nval;
        while(n != 0 && m != 0)
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= m; j++)
                {
                	in.nextToken();e[i][j] = (int) in.nval;
                }
            }
            in.nextToken();q = (int) in.nval;
            for(int i = 0; i < q; i++)
            {
            	in.nextToken();startX = (int) in.nval;
            	in.nextToken();startY = (int) in.nval;
            	in.nextToken();endX = (int) in.nval;
            	in.nextToken();endY = (int) in.nval;
                if(e[startX][startY] != e[endX][endY] || e[startX][startY] == 0 || e[endX][endY] == 0)
                {
                    System.out.println("NO");
                    continue;
                }
                if(startX == endX && startY == endY)
                {
                    System.out.println("NO");
                    continue;
                }
                main.dfs(startX, startY, 0, startX, startY);
                if(flag) System.out.println("YES");
                flag = false;
            }
            in.nextToken();n = (int) in.nval;
            in.nextToken();m = (int) in.nval;
        }
    }
    void dfs(int curX, int curY, int step, int preX, int preY)
    {
//        System.out.println(curX+"       ||       "+curY+ "    ****     "+ step);
        if(step > 2) return ;
        if(curX == endX && curY == endY)
        {
            flag = true;
            return ;
        }
        int tx, ty;
        int next[][] = {{-1, 0}, {0, 1}, {1, 0}, {-1, 0}};
        for(int i = 0; i < 4; i++)
        {
            tx = curX + next[i][0];
            ty = curY + next[i][1];
            if(tx < 1 || tx > n || ty < 1 || ty > m)
                continue;
            if((tx == endX && ty == endY)  || e[tx][ty] == 0)
            {
                if(preX != tx && preY != ty )
                {
                    preX = tx;
                    preY = ty;
                    step += 1;
                }
                dfs(tx, ty, step, preX, preY);
                if(flag || step > 2) return; 
            }
        }
        return ;
    }
}

/*
3 4
1 2 3 4
0 0 0 0
4 3 2 1
4
1 1 3 4
1 1 2 4
1 1 3 3
2 1 2 4
3 4
0 1 4 3
0 2 4 1
0 0 0 0
2
1 1 2 4
1 3 2 3
0 0

*/
