package com.ureca.day4;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			String s = null; //로컬변수는 초기화 필수 String s; 이건 선언만하는거
			System.out.println(s.length()); // NullPointerException 임 
			
			System.out.println("여기는 출력하고 싶다!");
			//System.in.read(); // IOException 임
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("NullPointerException: "+e.getMessage());
		}
		
		System.out.println("end");

	}

}
