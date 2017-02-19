package pat_5_1;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n, k, perInt, mVal=1000000007;
		n = in.nextInt();
		k = in.nextInt();
		long mul = 1, sum = 0;;
		if(n <= k)
		{
			System.out.println("-1");
			System.exit(0);
		}
		perInt = n/k;
		
		if(n%2 != 0 || k%2 != 0) list.add(perInt); 
		for(int i = 1; i <= k/2; i++)
		{
			if(perInt-i != 0) list.add(perInt-i);
			list.add(perInt+i);
			
		}
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
			mul *= list.get(i);
			mul %= mVal;
		}
		if(mul != 0 && sum == n)
			System.out.println(mul);
		else
			System.out.println("-1");

	}
}
