package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		oArray = (T[]) new Object[3];
		crtPos = 0;
	}
	
	//메소드 g/s
	
	public void add(T o) {
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
