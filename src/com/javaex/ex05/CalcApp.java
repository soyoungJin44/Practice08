package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		while (true) {
			System.out.print(">>");
			String q = sc.nextLine();
			
			String[] qArray = q.split(" ");
			
			if (q.equals("/q")) {
				System.out.println("시스템을 종료합니다!");
				break;
			}else if(qArray[1].equals("+")) {
				Add result = new Add();
				result.setValue(Integer.parseInt(qArray[0]),(Integer.parseInt(qArray[2])));
				System.out.println(">>" + result.calculate());
			
			}else if(qArray[1].equals("-")) {
				Sub result = new Sub();
				result.setValue(Integer.parseInt(qArray[0]),Integer.parseInt(qArray[2]));
				System.out.println(">>" + result.calculate());
			
			}else if(qArray[1].equals("/")) {
				Mul result = new Mul();
				result.setValue(Integer.parseInt(qArray[0]), Integer.parseInt(qArray[2]));
				System.out.println(">>" + result.calculate());
			
			}else if(qArray[1].equals("*")) {
				Div result = new Div();
				result.setValue(Integer.parseInt(qArray[0]), Integer.parseInt(qArray[2]));
				System.out.println(">>" + result.calculate());
			}else {
				System.out.println("알수없는 연산입니당~~");
			}
			

		}//while
		
	}
}