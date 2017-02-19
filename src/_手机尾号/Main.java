package _ÊÖ»úÎ²ºÅ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n, grade;
		String str = "";
		ArrayList<String> list = new ArrayList<String>();
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			grade = 0;
			str = sc.next();
			char c[] = str.toCharArray();
			if(c[0]-c[1] == 1 && c[1]-c[2] == 1 && c[2]-c[3] == 1){
				grade += 5;
			}
			if(c[0]-c[1] == -1 && c[1]-c[2] == -1 && c[2]-c[3] == -1){
				grade += 5;
			}
			
			if(c[0] == c[1] && c[1] == c[2]){
				grade += 3;
			}
			if(c[1] == c[2] && c[2] == c[3]){
				grade += 3;
			}
			String s1 = String.valueOf(c[0]+c[1]);
			String s2 = String.valueOf(c[2]+c[3]);
			if(!s1.equals(s2) && c[0] == c[1] && c[2] == c[3]){
				grade += 1;
			}
			if(s1.equals(s2) && c[0] != c[1] && c[2] != c[3]){
				grade += 1;
			}
			if(s1.equals(s2) && c[0] == c[1] && c[2] == c[3]){
				grade += 1;
			}
			if(s1.equals(s2) && c[0] == c[1] && c[2] == c[3] && c[1] == c[2]){
				grade += 1;
			}
			
			for(int j = 0; j < 4; j++){
				if(c[j] == '6') grade += 1;
				if(c[j] == '8') grade += 1;
				if(c[j] == '9') grade += 1;
			}
			System.out.println(grade);
		}
		
	}	

}
