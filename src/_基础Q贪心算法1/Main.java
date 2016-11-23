package _»ù´¡QÌ°ÐÄËã·¨1;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.sound.sampled.Line;

public class Main {
	static int type = 0, n;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, x, y;
		ArrayList<Point> list = new ArrayList<Point>();
		while(in.hasNext())
		{
			n = in.nextInt();
			if(n == 0) break;
			list.clear();
			Point point[] = new Point[n];
			for(int i = 0; i < n; i++)
			{
				x = in.nextInt();
				y = in.nextInt();
				point[i] = new Point(x, y);
				list.add(point[i]);
			}
			System.out.println(getArea(list));
		}
		
	}
	
	static double getArea(ArrayList<Point> list)
	{
		double area = 0.00;
		for(int i = 0; i < list.size(); i++)
		{
			if(i < list.size() - 1)
			{
				Point p1 = list.get(i);
				Point p2 = list.get(i+1);
				area += p1.getX() * p2.getY() - p2.getX() * p1.getY();
			}
			else
			{
				Point pn = list.get(i);
				Point p0 = list.get(0);
				area += pn.getX() * p0.getY() - p0.getX() * pn.getY();
			}
		}
		area /= 2.00;
		return area;
		
	}
}


/*

3 0 0 1 0 0 1
4 1 0 0 1 -1 0 0 -1
0


*/