package _²Â×ÖÄ¸;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,";
		
		for(int i = 1; i < 106-1; i++){
			s += "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,";
		}
		s += "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s";
		String sa[] = s.split(",");
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < sa.length; i++){
			list.add(sa[i]);
		}
		while(list.size() > 1){
			for(int i = 1; i <= list.size(); i++){
				if(i % 2 != 0){
					list.remove(i-1);
				}
			}
		}
		System.out.println(list.size());
		System.out.println(list.get(0));
	}
}	
