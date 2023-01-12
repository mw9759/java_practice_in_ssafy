package com.ssafy.basic;

public class step02_If_Switch {

	public static void main(String[] args) {
		/*
		 * 성적에 따른 등급을 출력하는 프로그램을 구현해보세여
		 * 	
		 * 1.	성적은 0~100점
		 * 		성적 입력은 변수 이용, 입력이용 (선택), Random 성적 발생 이용
		 * 2.	100~90점 등급 A
		 *		89~80점 등급 B
		 * 		79~70점 등급 C
		 * 		69~60점 등급 D
		 * 		59~0점 등급 F
		 * 3.	출력형식
		 * 			"00 점수는 등급 00 입니다"
		 * 
		 * 4.	if ~ else if 구문이용
		 * 5.	switch ~case 구문이용
		 */
		
		//성적변수
//		Scanner scn = new Scanner(System.in);
//		System.out.println("성정을 입력하세요");
//		        
//		int grade = scn.nextInt();
		int grade = 99;//변수이용
		
		switch(grade/10){
			case 10: 
			case 9: 
				System.out.println(grade + " 점수는 등급 " + "A" + " 입니다.");
				break; 
			case 8: 
				System.out.println(grade + " 점수는 등급 " + "B" + " 입니다.");
				break;
			case 7: 
				System.out.println(grade + " 점수는 등급 " + "C" + " 입니다.");
				break;
			case 6: 
				System.out.println(grade + " 점수는 등급 " + "D" + " 입니다.");
				break;
			default :
				System.out.println(grade + " 점수는 등급 " + "F" + " 입니다.");
		}
		
		//IF문
		char score = 'F';
		if (grade >= 0 && grade <= 100) {
			if(grade >= 90) {
				score = 'A';
			} else if(grade >= 80) {
				score = 'B';
			} else if(grade >= 70) {
				score = 'C';
			} else if(grade >= 60) {
				score = 'D';
			} else {
				score = 'F';
			} 
			System.out.println(grade + " 점수는 등급 " + score + " 입니다.");
		} else {
			System.out.println("오류 다시입력");
		}
	}

}
