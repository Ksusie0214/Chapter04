package com.javaex.ex01;

import java.util.Arrays;

import com.javaex.ex02.Circle;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	
	
	//메소드 g/s
	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos += 1;
		
	}
	
	public int size() {
		
		return crtPos;
	}
	
	public Circle get(int i) {
		
		return cArray[i];
	}


	//메소드 일반
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
