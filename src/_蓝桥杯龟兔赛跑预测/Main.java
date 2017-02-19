package _¿∂«≈±≠πÍÕ√»¸≈‹‘§≤‚;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int v1, v2, t, s, l;
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		t = sc.nextInt();
		s = sc.nextInt();
		l = sc.nextInt();
		int dr = 0, dt = 0, d = 0, r_time = 0, t_time = 0;
		while(dr < l && dt < l){
			dr += v1;
			dt += v2;
			r_time++;
			t_time++;
			if(dr - dt >= t && dr < l && dt < l){
				for(int j = 1; j <= s; j++){
					dt += v2;
					t_time++;
					r_time++;
					if(dt >= l){	
						break;
					}
				}
			}
		}
		if(dr >= l && dt < l){
			System.out.println("R\n"+r_time);
		}
		else if(dr < l && dt >= l){
			System.out.println("T\n"+r_time);
		}
		else if(dr >= l && dt >= l){
			System.out.println("D\n"+r_time);
		}

	}

}
