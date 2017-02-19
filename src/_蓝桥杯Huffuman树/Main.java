package _À¶ÇÅ±­HuffumanÊ÷;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		int n, res = 0;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			pqueue.add(sc.nextInt());
		}
		while(pqueue.size() != 1){
			int x, y;
			x = pqueue.poll();
			y = pqueue.poll();
			pqueue.add(x+y);
			res += x+y;
		}
		System.out.println(res);
	}
}
