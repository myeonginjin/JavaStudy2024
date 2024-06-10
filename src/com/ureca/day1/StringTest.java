package com.ureca.day1;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		String t1 = new String("홍길동");
		String t2 = new String("홍길동");
		
		System.out.println(s1==s2);
		System.out.println(t1==s1);
		System.out.println(t1==s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(t2));
		
		
		StringBuilder sb = new StringBuilder("홍길동");
		sb.append("홍길동동동");
		sb.append(" ").append("d").append("dd");
		
		
		String s = """
				
		{
		"id": "winter",
		"name": "눈송이",
		"age": 20
		}
		""";
		sb.append(s);
		System.out.println(sb);
		
		
	}

}
