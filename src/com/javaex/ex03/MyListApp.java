package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//포인트 관리
		
		MyList<Point> pList= new MyList<Point>();
		Point p01 = new Point(2,2);
		Point p02 = new Point(12,12);
		Point p03 = new Point(22,22);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString());
		
		//원 관리
		
		MyList<Circle> cList = new MyList<Circle>();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.toString());
		
	}

}
