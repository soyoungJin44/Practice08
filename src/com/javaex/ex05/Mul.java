package com.javaex.ex05;

public class Mul {

	//필드
    private int a;
    private int b;
    
    //생성자
    public Mul() {
    	super();
    }
    
    public Mul(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    //메서드 gs
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    //메서드 일반
    public int calculate() {
    	return a/b;
    }

}
