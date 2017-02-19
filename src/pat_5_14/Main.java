package pat_5_14;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		List<String> list = new LinkedList<String>();
		String str, s;
		boolean flag = false;
		ListIterator<String> it;
		str = in.nextLine();
		while(!str.equals("#"))
		{
			it = list.listIterator();
			while(it.hasNext())
			{
				s = it.next();
				if(s.length() > str.length())
				{
					it.previous();
					it.add(str);
					flag = true;
					break;
				}
			}
			if(!flag) list.add(str);
			flag = false;
			str = in.nextLine();
		}
		it = list.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
			
	}
}

/*


*/