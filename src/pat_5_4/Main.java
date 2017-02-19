package pat_5_4;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n;
		String a[] = {".","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String str = "", s2;
		StringBuffer sb;
		n = in.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 1; i <= n; i++)
		{	
			str = "";
			s2 = "";
			for(int j = 1; j <= i; j++)
			{
				str += a[j];
			}
			for(int j = i+1; j <= n-1; j++)
			{
				str += a[i];
			}
			if(i != n)
				s2 += str+a[i];
			else
				s2 = str.substring(0, n-1);
			sb = new StringBuffer(str);
			str = sb.reverse().toString();
			str = s2 + str;
			list.add(str);
			System.out.println(str);
		}
		for(int i = list.size()-2; i >= 0; i--)
		{
			System.out.println(list.get(i));
		}
		
	}
}

/*



*/