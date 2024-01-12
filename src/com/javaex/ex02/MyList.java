package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	
	//메소드 g/s
	
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos += 1;
	}
	
	public int size() {
		
		return crtPos;
	}
	
	public Object get(int i ) {
		
		return oArray[i];
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
