package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		//포인트 관리
		
		MyList pList = new MyList();
		Point p01 = new Point(2,2);
		Point p02 = new Point(10, 10);
		Point p03 = new Point(5,5);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList);
		
		//원 관리
		
		MyList cList = new MyList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList);
		

	}

}
