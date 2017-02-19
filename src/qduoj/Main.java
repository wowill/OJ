package qduoj;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	boolean isPrime(int num)
	{
		if(num < 2) return false;
		else if(num == 2) return true;
		else
		{
			for(int i = 2; i <= Math.sqrt(num); i++)
			{
				if(num % i == 0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Main main = new Main();
		int l, r, temp;
		String str;
		ArrayList<Integer> list = new ArrayList<>();
//		Scanner in = new Scanner(new BufferedInputStream(new FileInputStream("D:\\Data.txt")));
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		while(in.hasNextLine())
		{
			int maxDis = 0, minDis = Integer.MAX_VALUE;
			int a = -1, b = -1, c = -1, d = -1;
			l = in.nextInt();
			r = in.nextInt();
			if(l == r)
			{
				System.out.println(l+","+l +" are closest, "+l+","+l+" are most distant.");
				continue;
			}
			for(int i = l; i <= r; i++)
			{
				if(main.isPrime(i))
				{
					list.add(i);
					temp = list.size()-1;
					if(temp != 0 && minDis > list.get(temp)-list.get(temp-1))
					{
						minDis = list.get(temp)-list.get(temp-1);
						a = list.get(temp-1);
						b = list.get(temp);	
					}
					if(temp != 0 && maxDis < list.get(temp)-list.get(temp-1))
					{
						maxDis = list.get(temp)-list.get(temp-1);
						c = list.get(temp-1);
						d = list.get(temp);
					}
				}
			}
			if(a == -1 && c == -1)
			{
				System.out.println("There are no adjacent primes.");
			}
			else
				System.out.println(a+","+b +" are closest, "+c+","+d+" are most distant.");
			list.clear();
		}
	}
}

/*

2 17
14 17


*/