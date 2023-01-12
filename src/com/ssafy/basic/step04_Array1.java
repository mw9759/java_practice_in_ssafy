package com.ssafy.basic;

public class step04_Array1 {

	public static void main(String[] args) {
		//1차원 배열
		// 5명 학생의 성적: 70, 82, 97, 75, 99
		// 총점, 평균 출력 프로그램
		//1. 선언
		int[] scores;
		//2. 생성: 배열 생성시에 기본값으로 자동 초기화
		scores = new int[5];
		
		//3. 값 할당
		scores[0] = 71;
		scores[1] = 72;
		scores[2] = 73;
		scores[3] = 74;
		scores[4] = 75;
		//4. 요소사용
		int total = 0;
//		double total = 0;
		for(int index = 0; index < scores.length; index++) {
			System.out.println(scores[index] + "\t");
			total += scores[index];
			//total = total + scores[index];
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + total / scores.length); //int / int = int
		System.out.println("평균: " + total / scores.length); //double / int = double
		System.out.println("평균: " + (double)total / scores.length); //double / int = double
	}

}
