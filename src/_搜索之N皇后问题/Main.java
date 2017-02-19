package _搜索之N皇后问题;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	public static int sum = 0, upperlimit = 1;
	public static void compute(int row, int ld, int rd) {  
		if (row != upperlimit) {  
			int pos = upperlimit & ~(row | ld | rd);   	
			while (pos != 0) {  
				int p = pos & -pos;  
				pos -= p;  
				compute(row + p, (ld + p) << 1, (rd + p) >> 1);  
			}
		}
		else  
			sum++;  
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			sum = 0;
			upperlimit = 1;
			if ((n < 1) || (n > 32)) {    
				return;  
			}    
			upperlimit = (upperlimit << n) - 1;  
			compute(0, 0, 0);;  
			System.out.println(sum); 
		}
	}
}

