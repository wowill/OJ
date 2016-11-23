package pat_1056_组合数的和;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[];
		String str;
		int index = 0, sum = 0, numT, n;
		
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		String strArray[] = str.split(" ");
		a = new int[Integer.parseInt(strArray[0])];
		for(int i = 1; i < strArray.length; i++)
		{
			a[index] = Integer.parseInt(strArray[i]);
			index++;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			numT = a[i]*10;
			for(int j = 0; j < i; j++)
			{
				sum += numT+a[j];
			}
			for(int j = i+1; j < a.length; j++)
			{
				sum += numT+a[j];
			}
		}
		System.out.println(sum);
	}
}
