package com.ureca.day3;

public class FinalTest {
	public static final int i = 11; //상수 클래스
	public static 		int j = 12; //변수 클래스 
	public 	      final int k = 13; //상수 heap  이렇게 선언하는 이유는 보통 인스턴스마다 각각 고유한 상수 k 값을 가지도록 하고싶을 때 이렇게 함  
	public 				int l = 14; //변수 인스턴스 
	
	
	public static void main(String[] args) {
		//i,j,k,l을 구별하시오 
		
		// 클래스 영역에 할당되는 것은 ? i,j
		// 값을 변경할 수 없는 것은 ? i, k
		// new를 통해 힙영역에 할당되는 것은? k, l    //인스턴스가 사라지면 같이 해지됨
		
		System.out.println(FinalTest.i+" "+FinalTest.j);
	}
	
}
