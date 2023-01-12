package com.ssafy.io;

import java.util.Scanner;

//import java.util.Scanner;

public class Scanner_test {
//	public static void main()
	public static void main(String[] args) {
		//표준 키보드 입력 스트림 객체 생성
		Scanner scn = new Scanner(System.in);
//		System.out.print("1.문자열 입력>> ");
//		String s1 = scn.next();
//		System.out.println(s1);
//		
//		System.out.print("2.문자열 입력>> ");
//		char s2 = scn.next().charAt(0); // string => char 하는법. 입력값중 맨 앞값만 출력한다.
//		System.out.println(s2);
//		
//		System.out.print("3.문자열 입력(넥스트라인)>> ");
//		String s3 = scn.nextLine(); 
//		System.out.println(s3);
		
		System.out.print("4.정수 입력>> ");
		int d1 = scn.nextInt(); 
		System.out.println(d1*30);
		
		System.out.print("5.실수 입력>> ");
		int d2 = scn.nextInt(); 
		System.out.println(d2*10);
	}

}
