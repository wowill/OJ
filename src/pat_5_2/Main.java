package pat_5_2;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		long l1, r1, l2, r2, k;
		l1 = in.nextInt();
		r1 = in.nextInt();
		l2 = in.nextInt();
		r2 = in.nextInt();
		k = in.nextInt();
		
		long len = 0;
		if(k >= l2 && k <= r1 && k >= l1)
			len = r1 - l2;
		else 
			len = r1 - l2 >= 0 ? r1 - l2 + 1 : 0;

		System.out.println(len);
	}
}

/*

1 10 5 20 8

1 10 9 20 1

1 10 9 20 9

1 10 10 20 1

10 10 9 20 10

*/