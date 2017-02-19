package _基础O人见人爱A减B;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Set<Integer> set = new TreeSet<Integer>();
		int n, m, t;
		n = in.nextInt();
		m = in.nextInt();
		while(n != 0 || m != 0)
		{
			set.clear();
			for(int i = 0; i < n; i++)
			{
				t = in.nextInt();
				set.add(t);
			}
			for(int i = 0; i < m; i++)
			{
				t = in.nextInt();
				if(set.contains(t)) set.remove(t);

			}
			if(!set.isEmpty())
			{
				for(Integer i : set)
				{
					System.out.print(i + " ");
				}
				System.out.println();
			}
			else
				System.out.println("NULL");
			
			n = in.nextInt();
			m = in.nextInt();
		}
	}
}

/*

3 3 1 2 3 1 4 7
3 7 2 5 8 2 3 4 5 6 7 8 
0 0

*/