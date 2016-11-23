package pat_1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	String s[] = {"Mystery Award", "Minion", "Chocolate", "Checked", "Are you kidding?"};
	void isGift(int index, String val, int flag)
	{
		if(flag == 0)
		{
			if(index == 1)
			{
				System.out.println(val+": "+s[0]);
			}
			else if(index != 2 && isPrime(index))
			{
				System.out.println(val+": "+s[1]);
			}
			else
			{
				System.out.println(val+": "+s[2]);
			}
		}
		else
		{
			System.out.println(val+": "+s[3]);
		}
//		System.out.println(index+"|"+val+"|"+flag);
	}
	boolean isPrime(int num)
	{
		if(num < 2) return false;
		else if(num == 2) return true;
		else
		{
			for(int i = 2; i < Math.sqrt(num); i++)
			{
				if(num % i == 0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		Main e = new Main();
		ArrayList<String> list = new ArrayList<String>();
		int n;
		String str;
		int m[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		n = Integer.valueOf(str);
		m = new int[n];
		for(int i = 0; i < n; i++)
		{
			str = br.readLine();
			list.add(str);
		}
		str = br.readLine();
		n = Integer.valueOf(str);
		for(int i = 0; i < n; i++)
		{
			str = br.readLine();
			int index = list.indexOf(str);
			if(index >= 0 && index < n)
			{
				
				e.isGift(index+1, str, m[index]);
				m[index]++;
			}
			else
				System.out.println(str+": Are you kidding?");
			
		}
	}
	
}
