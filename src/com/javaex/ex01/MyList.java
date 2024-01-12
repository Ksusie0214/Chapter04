package com.javaex.ex01;

import com.javaex.ex02.Circle;

public class MyList {

	public static void main(String[] args) {
		
		/*
		Point[] pArray = new Point[3];	//갯수를 확정해야 한다
		Point p1 = new Point(2,2);
		Point p2 = new Point(12,13);
		Point p3 = new Point(22,23);
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		
		for(int i = 0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		
		
		//원 관리
		
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.toString());
		
		
		
		
		
		
		
		
		
	}

}
