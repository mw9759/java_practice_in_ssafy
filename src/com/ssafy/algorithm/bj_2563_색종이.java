package com.ssafy.algorithm;

import java.io.StringReader;
import java.util.Scanner;
import java.io.FileInputStream;
/**
 * <pre>
 * 코딩테스트 응시 언어: 파이썬
 * 
 * 문제1: 풀이 시간:
 * 
 * 알고리즘 문제 풀이 기술:
 * --
 * --
 *
 * </pre>
 * @author 손민우
 * @since jdk1.8
 * @version ver.1.0
 *
 */
public class bj_2563_색종이 {
	//-- 입력 파일 읽어오기
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 3 읽어오기
		int[][] arr = new int[N][2];
		int answer = 10000;
		
		for(int index = 0; index < N; index++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[index][0] = x;
			arr[index][1] = y;
		}
		
		
		
	}
	
	static String str = "3\r\n" + 
			"3 7\r\n" + 
			"15 7\r\n" + 
			"5 2";
	public static void main2(String[] args) {
		Scanner sc = new Scanner(new StringReader(str));
		int N = sc.nextInt(); // 3 읽어오기
		int[][] arr = new int[N][2];
		int answer = 100;
		
		for(int index = 0; index < N; index++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[index][0] = x;
			arr[index][1] = y;
		}
		
		
				
		
		System.out.println(arr[0][0]);
		
	}
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 3 읽어오기
		
		for(int index = 0; index < N; index++) {
			System.out.println("#"+1);
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			System.out.println(no1 + ", " + no2);
		}
	}

}
