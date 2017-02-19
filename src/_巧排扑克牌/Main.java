package _ÇÉÅÅÆË¿ËÅÆ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0, r = 1;
		int a[] = new int[100];
		a[0] = 13;
		for(int i = 12; i > 0; i--){
			a[r++] = i;
			a[r++] = a[f++];
		}
		for(int i = r-1; i >= f; i--){
			if(a[i] == 11){
				System.out.print("J ");
			}
			else if(a[i] == 12){
				System.out.print("Q ");
			}
			else if(a[i] == 13){
				System.out.print("K ");
			}
			else if(a[i] == 1){
				System.out.print("A ");
			}
			else
				System.out.print(a[i]+" ");
		}
	}

}
