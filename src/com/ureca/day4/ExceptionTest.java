package com.ureca.day4;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		String s = null; //로컬변수는 초기화 필수 String s; 이건 선언만하는거
		System.out.println(s.length()); //NullPointerException임 
		
		System.out.println("end");

	}

}
