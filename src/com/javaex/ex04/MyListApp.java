package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {
	
	public static void main(String[] args) {
		
		ArrayList <Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString());
		System.out.println(pList.size());
		
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------------------");
		
		
		pList.remove(0);
		
		for(int i = 0; i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-----------------------------------------");
		
		pList.remove(p02);
		
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		System.out.println(pList.toString());
		
		List<Integer> iList = new ArrayList<Integer>();
		Integer i01 = new Integer(3);
		Integer i02 = 5;	//자동 박싱(Boxing)
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		
		
	}

}
