package com.ssafy.basic;

public class step01_DataType {
	//멤버 변수: 인스턴스 변수(객체를 생성한 후에 참조변수를 통해서 접근 가능한 변수)
	public String courseName = "ssafy9기 광주5반";
	//시작 메서드
	
	public static void main(String[] args) {//매개변수
		//지역변수
		String userName = "손민우";
		int age = 27;
		System.out.println("이름: " + userName);
		System.out.println("나이: " + age);
		
		System.out.println("------데이터타입-----");
		//정수형
		int d1 = 10; // int == int
		long d2 = 100L; // long = long
		long d4 = 100; //long = int; ->큰타입 자동형변환 할당 가능
		//실수형
		//float d3 = 3.14;// 오류이유 : float = double => 다른타입(작은타입)
		float d3 = 3.14f; //같은타입: float = float
		//int d5 = d3; //오류: int = float => 다른타입(작은타입)
		int d5 = (int)d3; // 명시적 형변환 실수형(double) => 정수형(int)
		System.out.println("d3 = "+d3);
		System.out.println("d5 = "+d5);
		
		//단일문자형: '단일문자', '특수문자', '\u0000'
		//특수문자: \n 세로운줄, \t tab키 (일정간격띄우기), \', \\",\\,\u0000 ==>이건 유니코드 번호
		
		char c1 = 'A';
	    char c2 = '홈';
	    char c3 = '\t';
	    
	    //char c4 = "홈"; // 오류: char = String => 다른타입
//	    char c4 = (char)"홍"; // 형변환불가오류: 객체타이브이 형변환은 상속을 전제로함
	    char c4 = "홍".charAt(0); // String 객체의 메서드를 이용해서 char 타입 변환 가능 ==> 메서드 : charAt(0)
	    
	    //논리형 : boolean
	    boolean result = (3 != 4);
	    System.out.println(result);
	    
	    // + 중복연산자
	    System.out.println("광주"+ 5 + "반");
	    System.out.println(20 + 23 + "광주" + 5 + "반");
	    System.out.println("광주" + 5 + "반"+20+23);
	    
	    //int 10진수, 8진수, 16진수
	    int n1 = 10;
	    int n2 = 012;
	    int n3 = 0xA;
	    
	    //TYPE CASTING
	    int t1 = '0'; 
	    System.out.println(t1);// A의 아스키 코드는 65이다.
//	    char t2 = t1; // char = int : 다른타입(작은타입)
	    char t2 = (char)t1;
	    System.out.println(t2);
	    
	}

}
