package com.ureca.day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map<String,Integer> m = null;
		
		//비순서
		m = new HashMap<>();
		m.put("홍길동",4);
		m.put("손오공",2);
		m.put("강호동",1);
		m.put("홍길동",3);
		System.out.println(m);
		
		//순서가 있는 얘
		m = new LinkedHashMap<>();
		m.put("홍길동",4);
		m.put("손오공",2);
		m.put("강호동",1);
		m.put("홍길동",5);
		System.out.println(m);
		
		//정렬 (오름차순)
		m = new TreeMap<>();
		m.put("홍길동",4);
		m.put("손오공",2);
		m.put("강호동",1);
		m.put("홍길동",3);
		System.out.println(m);
		
		for(Map.Entry<String, Integer> e :m.entrySet()) System.out.println(e); //보통 이렇게 안함
		
		for(String key:m.keySet()) System.out.println(m.get(key)); //키들을 꺼내 반복문 들고 이 키값으로 벨류들을 출력
		for(Integer v : m.values()) System.out.println(v); //벨류 목록들을 끄내 반복문으로 반복 출력
		
		

	}

}
