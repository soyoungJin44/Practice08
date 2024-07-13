package com.javaex.ex03;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//일반 메소드
	//toString()을 작성 하세요
	public String toString() {
		return "[포인트] x:" + x + "y:" + y + "입니다.";
	}

}
