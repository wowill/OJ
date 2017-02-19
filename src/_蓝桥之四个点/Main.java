package _蓝桥之四个点;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(-1, 5);
		Point p2 = new Point(-14, -2);
		Point p3 = new Point(1, -6);
		Point p4 = new Point(2, 0);
		
		List<Point> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		System.out.println(getArae(list));
	}
	
	public static double getArae(List<Point> list){
		
		double ans = 0.00;
		for (int i = 0; i < list.size(); i++) {
			int j = (i + 1) % list.size();
			Point p1 = list.get(i);
			Point p2 = list.get(j);
			ans += p1.getX()*p2.getY()-p2.getX()*p1.getY();
			
		}
		ans = ans/2.00;
		return Math.abs(ans);
	}

}
