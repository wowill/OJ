package ¶Ñ1;
 

import java.io.BufferedInputStream;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(1, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2)
					return -1;
				return 1;
			}
		});
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n = in.nextInt();
		in.nextLine();
		String str, order;
		int num;
		Object a[];
		for(int i = 0; i < n; i++)
		{
			str = in.nextLine();
			order = str.split(" ")[0];
			if(order.equals("A"))
			{
				num = Integer.parseInt(str.split(" ")[1]);
				q.add(num);
			}
			if(order.equals("T"))
			{
				System.out.println(q.poll());
				
			}
		}
	}
	
}
       