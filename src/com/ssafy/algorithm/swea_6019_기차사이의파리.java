package com.ssafy.algorithm;
import java.util.Scanner;
import java.io.FileInputStream;

/**
 * <pre>
 * 코딩테스트 응시 언어: 파이썬
 * 
 * 문제2: 풀이 시간: 20분
 * 
 * 알고리즘 문제 풀이 기술: 
 * 문제출처: https://swexpertacademy.com/main/code/problem/problemDetail.do
 * --
 * --
 *ddd
 * </pre>
 * @author 손민우
 * @since jdk1.8
 * @version ver.1.0
 *
 */
public class swea_6019_기차사이의파리 {

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input_6019.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int d = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int f = sc.nextInt();
			
			//거리 = 속력 * 시간
			//시간 = 거리 / 속력
			double time = d/(a+b);
			//파리의 이동거리 = 파리속력 * 시간(기차가 부딪친)
			double answer = f*time;
			System.out.println("#"+test_case+" "+answer);
			
			
		}
	}

}
