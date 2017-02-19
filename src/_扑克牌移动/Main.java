package _ÆË¿ËÅÆÒÆ¶¯;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
	

	public static List moveCard(List src)
	{
		if(src==null) return null;
		
		List dst = new Vector();
		for(;;)
		{
			if(src.size() <= 0) break;  // Ìî¿Õ
			src.add(src.remove(0));

			dst.add(src.remove(0));  // Ìî¿Õ
		}
		
		return dst;
	}
		

	public static void main(String[] args)
	{
		List a = new Vector();
		a.addAll(Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K"));
//		a.addAll(Arrays.asList("K","Q","J","10","9","8","7","6","5","4","3","2","A"));
		System.out.println(moveCard(a).toString().replace(" ", ""));
	}
}


/*
 
7,A,5,9,K,2,4,6,8,10,Q,J,3
 
*/
