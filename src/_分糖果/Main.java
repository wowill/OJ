package _·ÖÌÇ¹û;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int res = 0, p = 0, t = 0;
		while(true){
			p = 0; t = 0;
			for(int i = 0; i < a.length; i++){
				
				if(i == a.length-1){
					a[i] /= 2;
					t = a[i];
					a[i] += p;
					p = t;
					a[0] += p;
				}
				else{
					a[i] /= 2;
					t = a[i];
					a[i] += p;
					p = t;
				}
			}
			
			boolean flag = true;
			int temp = a[0];
			for(int j = 1; j < a.length; j++){
				if(a[j] != temp){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(res);
				break;
			}
			for(int j = 0; j < a.length; j++){
				if(a[j] % 2 != 0){
					a[j] += 1;
					res++;
				}
			}
		}
	}

}
