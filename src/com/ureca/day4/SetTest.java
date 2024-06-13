package com.ureca.day4;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> s = null;
				
		//비순서
		s = new HashSet<>();
		s.add("홍길동");
		s.add("손오공");
		s.add("강호동");
		s.add("강호동"); // 중복 허용하지않기에 들어가지않음
		System.out.println(s);
		
		//순서가 있는 얘
		s = new LinkedHashSet<>();
		s.add("홍길동");
		s.add("손오공");
		s.add("강호동");
		s.add("강호동"); // 중복 허용하지않지만, 순서가 변경된 것을 확인 할 수 있음
		System.out.println(s);
		
		//정렬 (오름차순)
		s = new TreeSet<>();
		s.add("홍길동");
		s.add("손오공");
		s.add("강호동");
		s.add("홍길동"); 
		System.out.println(s);
		
		for(String t:s) System.out.println(t);
		
	}

}
