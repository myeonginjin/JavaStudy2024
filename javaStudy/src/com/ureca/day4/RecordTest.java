package com.ureca.day4;




public class RecordTest {
	
	//다른 파일에 Member클래스 만들기 위해서 얘는 그냥 중첩 클래스로 만들어버리기 얘는 사실상 RecordTest.Member의 이름을 가짐
	record Member(String id, String name , int age) {
		
	}

	public static void main(String[] args) {
		Member m1 = new Member("Winter","눈송이",25);
		System.out.println(m1.id()+" "+m1.name()+" "+m1.age());
		System.out.println(m1);
		System.out.println(m1.toString());
		
		Member m2 = new Member("Winter", "눈송이",25);
		System.out.println(m1.toString());
		
		System.out.println(m1.hashCode()+" "+m2.hashCode());
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}

}
