package com.javaex.ex07;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		boolean result;
		Point p = (Point)obj;
		if(this.x == p.x) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
}
