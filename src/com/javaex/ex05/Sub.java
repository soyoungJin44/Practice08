package com.javaex.ex05;

public class Sub {

	//필드
    private int a;
    private int b;
    
    //생성자
    public Sub() {
    	super();
    }
    
    public Sub(int a, int b) {
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
    
    return a-b;
    }

}
