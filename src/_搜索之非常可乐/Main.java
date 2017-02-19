package _搜索之非常可乐;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//class Node{
//	int v[];
//	int deepth;
//	Node(){
//		v = new int[3];
//	}
//}
//public class Main {
//
//	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//	
//	static int s, n, m, capacity[], ans;
//	static boolean vis[][];
//	static Node cur, next;
//	public static int bfs(){
////		if(capacity[0]%2 == 0){
////			return -1;
////		}
//		cur = new Node();
//		next = new Node();
//		vis = new boolean[105][105];
//		cur.v[0] = capacity[0];
//		System.out.println(cur.v[0]);
//		cur.v[1] = 0;
//		cur.v[2] = 0;
//		cur.deepth = 0;
//		vis[0][0] = true;
//		Queue<Node> q = new LinkedList<Node>();
//		q.add(cur);
//		while(!q.isEmpty()){
//			cur = q.poll();
//			if(cur.v[0] == cur.v[1] && cur.v[2] == 0){
//				return cur.deepth;
//			}
//			for(int i = 0; i < 3; i++){
//				for(int j = 0; j < 3; j++){
//					if(i == j)
//						continue;
//					int amount = Math.min(cur.v[i], capacity[j]-cur.v[j]);
//					for(int k = 0; k < 3; k++){
//						next.v[k] = cur.v[k];
//					}
//					next.v[i] = cur.v[i] - amount;
//					next.v[j] = cur.v[j] + amount;
//					if(!vis[next.v[1]][next.v[2]]){
//						vis[next.v[1]][next.v[2]] = true;
//						next.deepth = cur.deepth + 1;
//						q.add(next);
//					}
//					
//				}
//			}
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		
//		capacity = new int[3];
//		while(true){
//			
//			s = sc.nextInt();
//			n = sc.nextInt();
//			m = sc.nextInt();
//			if(s == 0 || m == 0 || n == 0)
//				break;
//			
//			int a = n, b = m;
//			n = Math.max(a, b);
//			m = Math.min(a, b);
//			capacity[0] = s;
//			capacity[1] = n;
//			capacity[2] = m;
//			ans = bfs();
//			if(ans == -1){
//				System.out.println("NO");	
//			}
//			else{
//				System.out.println(ans);
//			}
//		}
//		
//		
//		
//	}
//
//}
