package com.ureca.day4;

record Member(String id, String name , int age) {
	
}


public class RecordTest {

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
