package com.ureca.day4;

public class EqualsTest {
	public static void main(String[] args) {
//		String s1 = new String("홍길동");
//		String s2 = new String("홍길동");
//		
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println();
		
		Car c1 = new Car("자동차",2024);
		Car c2 = new Car("자동차",2024);
		
//		Car c3 = c1;
//		System.out.println(c3==c1);
		
		System.out.println(c1==c2);
		
		//car클래스의 equals를 오버라이드함으로써 이름과 년도가 같으면 같다고 출력하도록했음
		System.out.println(c1.equals(c2));
		
	}

	
}
