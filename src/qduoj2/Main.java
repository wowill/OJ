package qduoj2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern pat[];
		Matcher matcher;
		String user;
		String temp = null;
		String res[];
		int T;
		int n, m;
		T = in.nextInt();
		for(int k = 1; k <= T; k++)
		{
			boolean tb = false;
			n = in.nextInt();
			m = in.nextInt();
			pat = new Pattern[n];
			res = new String[m];
			String enter = in.nextLine();
			for(int i = 0; i < n; i++)
			{
				temp = in.nextLine();
				temp = temp.replaceAll("\\*", ".*");
				temp = temp.replaceAll("\\?", ".?");
				pat[i] = Pattern.compile(temp);
			}
			
			for(int i = 0; i < m; i++)
			{
				tb = false;
				user = in.nextLine();
				for(int j = 0; j < n; j++)
				{
					matcher = pat[j].matcher(user);
					if(matcher.matches())
					{
						tb = true;
						res[i] = "1";
						break;
					}
					if(tb) break;
				}
				if(!tb) res[i] = "0";
			}
			System.out.println("Case #"+k+":");
			for(int i = 0; i < res.length; i++) System.out.print(res[i]);
			System.out.println();
		}
	}

}
