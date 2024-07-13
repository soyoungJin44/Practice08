package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Friend[] friends = new Friend[3];
		
		System.out.println("!친구를 3명을 등록해주세요!");
		
		for(int i=0; i<3; i++) {
			String list = sc.nextLine();
			String[] listArray = list.split(" ");
			
			friends[i] = new Friend(listArray[0],listArray[1],listArray[2]);
		}
		
		for(int i=0; i<friends.length; i++) {
			friends[i].showInfo();
		}
		
	sc.close();
	}
}
