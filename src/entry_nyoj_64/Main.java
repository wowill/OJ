package entry_nyoj_64;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, n, m;
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for(int i = 0; i < t; i++)
		{
			flag = false;
			n = in.nextInt();
			m = in.nextInt();
			for(int j = 0; j < 100; j++)
			{
				for(int k = 0; k < 100; k++)
				{
					if(j+k == n && j*2+k*4 == m)
					{
						System.out.println(j+" "+k);
						flag = true;
					}
				}
				if(flag) break;
			}
			if(!flag) System.out.println("No answer");
		}
	}
}
       