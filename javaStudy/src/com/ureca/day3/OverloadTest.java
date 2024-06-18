package com.ureca.day3;

class OverloadTest2 {
//	static float add(float x, float y) {
//		System.out.println("static int add만야(float "+x+",float "+y+")");
//		return x+y;
//	}
	private static double add(double x, double y) {
		System.out.println("private int add(double "+x+",double "+y+")");
		return x+y;
	}

}

public class OverloadTest {
	
	//static이 아니라면 main메소드에서 OverloadTest 객체를 선언한 뒤 그 오브젝트를 통해 메소드를 호출해야됨
	public static int add(int x, int y) {
		System.out.println("public int add(int "+x+",int "+y+")");
		return x+y;
	}
	
	//아래는 메소드 오버로딩 중복정의 접근 지정자 상관x , 이때 파라미터와 정확하게 매칭되는 타입이 없다면 프로모션으로 대체 가능한 (더 넓은 범위의 파라미터를 가진) 메소드를 호출 
	 //예를들어, int add(int x, int y)가 없다면 add(20,40)은 long add(long x, long y) 메소드를 호출함
	protected static long add(long x, long y) {
		System.out.println("protected int add(long "+x+",long "+y+")");
		return x+y;
	}
	static float add(float x, float y) {
		System.out.println("static int add만야(float "+x+",float "+y+")");
		return x+y;
	}
	private static double add(double x, double y) {
		System.out.println("private int add(double "+x+",double "+y+")");
		return x+y;
	}

	public static void main(String[] args) {
		
		//메소드가 static으로 선언되어있지않았다면 아래처럼 해야함 왜? run할때 해당 클래스가 메소드 영역에 올라가지만 오브젝트 메소드를 실행할 오브젝트 자체가 메모리 할당되는 것은 아님, 스태틱 변수들만 할당되고 메인 메소드가 실행됨 p.247
		// 그렇다면 스태틱 변수는 왜 선언해주나? 모든 오브젝트들이 같은 값을 공유해야할 때 즉 단 하나의 변수만이 메모리에 할당되어 이 주소값을 오브젝트들이 공유해야할 때 
		
		//OverloadTest o = new OverloadTest()
		//System.out.println(o.add(20, 23));
		
//		OverloadTest2 o2 = new OverloadTest2();
//		System.out.println(o2.add(20, 23));
//		System.out.println(o2.add(20L, 23L));
		
		
		System.out.println(add(20, 23));
		System.out.println(add(20L, 23L));
		System.out.println(add(20.1F, 23.2F));
		System.out.println(add(20.1, 23.5));
		
		
		// 2024.06.12 pull test

	}

}
