package _»ù´¡RÌ°ÐÄËã·¨2;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Smap{
	int s;
	int f;
	public Smap(int s, int f) {
		this.s = s;
		this.f = f;
	}
}

public class Main {
	static int type = 0, n;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		List<Smap> list = new ArrayList<Smap>();
		int n, s[], f[];
		while(in.hasNext())
		{
			
			n = in.nextInt();
			if(n == 0) break;
			list.clear();
			Smap[] map = new Smap[n];
			s = new int[n];
			f = new int[n];
			for(int i = 0; i < n; i++)
			{
				s[i] = in.nextInt();
				f[i] = in.nextInt();
				map[i] = new Smap(s[i], f[i]);
				list.add(map[i]);
			}
			Collections.sort(list, new Comparator<Smap>() {
				@Override
				public int compare(Smap o1, Smap o2) {
					if(o1.f < o2.f)
						return -1;
					else if(o1.f > o2.f)
						return 1;
					else
					{
						if(o1.s < o2.s) return -1;
						else return 1;
					}
				}
			});
			int k = 0;
			Smap tm = null, sm;
			Iterator<Smap> it = list.iterator();
			while(it.hasNext())
			{
				sm = it.next();
				if(k != 0)
				{
					if(sm.s < tm.f) 
					{
						it.remove();
						continue;
					}
				}
				
				tm = new Smap(sm.s, sm.f);
				k++;
			}
			
			System.out.println(list.size());
		}
		
	}
}

/*
12
1 3
3 4
0 7
3 8
15 19
15 20
10 15
8 18
6 12
5 10
4 14
2 9
0



*/