package com.ssafy.basic;

public class step03_GuGuDan {

	public static void main(String[] args) {
		/*
		 * 반복문을 이용한 구구단 출력 프로그램 구현
		 * 2단 === 3단 === 4단 ====,,, 9단 ===
		 * 2*1 = 2	3*1 = 3 ,,,
		 * ,,
		 * 2*9 = 18	,,,,,,,,9*9 = 81
		 * 공백라인출력: System.out.println();
		 * 데이터 출력(라인이동하지 않음): System.out.print(data);
		 * 일정간격 띄우기 : "\t"
		 */
		System.out.println("-----for 구문 구구단-----");
		System.out.println("2단"+"\t" + "3단"+"\t" + "4단"+"\t" + "5단"+"\t" + "6단"+"\t" + "7단"+"\t" + "8단"+"\t" + "9단"+"\t");
		int answer = 0;
		for (int i = 1; i <10; i++ ) {
			for(int j = 2; j < 10; j++) {
				answer = j*i;
				System.out.print(j+"x"+i + "="+ answer + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-----while 구문 구구단-----");
		System.out.println("2단"+"\t" + "3단"+"\t" + "4단"+"\t" + "5단"+"\t" + "6단"+"\t" + "7단"+"\t" + "8단"+"\t" + "9단"+"\t");
		int k = 2;
		int l = 1;
		while(l<10) {
			answer = k*l;
			System.out.print(k+"x"+ l + "="+ answer + "\t");
			k++;
			if(k == 10) {
				k = 2;
				l++;
				System.out.println();
			}
		}
		
		System.out.println("-----do~while 구문 구구단-----");
		System.out.println("2단"+"\t" + "3단"+"\t" + "4단"+"\t" + "5단"+"\t" + "6단"+"\t" + "7단"+"\t" + "8단"+"\t" + "9단"+"\t");
		int n = 2;
		int m = 1;
		do {
			answer = n*m;
			System.out.print(n+"x"+ m + "="+ answer + "\t");
			n++;
			if(n == 10) {
				n = 2;
				m++;
				System.out.println();
			}
		}while(m<10);
	}

}
