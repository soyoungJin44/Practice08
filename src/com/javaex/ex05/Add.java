package com.javaex.ex05;

public class Add {
    
	//필드
    private int a;
    private int b;
    
    //생성자
    public Add() {
    	super();
    }
    
    public Add(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    //메서드 gsss
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    //메소드 일반
    public int calculate() {
    	return a+b;
    }

}
