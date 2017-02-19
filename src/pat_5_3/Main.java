package pat_5_3;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int a[] = {6,2,5,5,4,5,6,3,7,6};
		Set<String> set = new HashSet<String>();
		int n;
		n = in.nextInt();
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				for(int k = 0; k < 10; k++)
				{
					if(a[i] + a[j] + a[k] == n-4 && i + j == k)
					{
						set.add(a[i]+"+"+a[j]+"="+a[k]);
						System.out.println(i+"("+a[i]+")" +" + " + j+"("+a[j]+")" + " = " +k+"("+a[k]+")" );
					}
				}
			}
		}
		System.out.println(set.size());
	}
}

/*


*/