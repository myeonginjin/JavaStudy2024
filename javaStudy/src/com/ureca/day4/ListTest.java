package com.ureca.day4;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
//		List list = new ArrayList();
////		List list = new Vector();
////		List list = new LinkedList();
//		
//		list.add(new Object());
//		System.out.println(list.size()+" "+list.toString());
//		list.add("홍길동");
//		System.out.println(list.size()+" "+list.toString());
//		list.add(3.14);
//		System.out.println(list.size()+" "+list.toString());
//		list.add(2,123);
//		list.remove("홍길동");
//		System.out.println(list.size()+" "+list.toString());
//		list.set(2, 3.1415923);
//		
//		
//		System.out.println("====");
//		for(Object o:list) System.out.println(o);
		
		
		List<String> list = new ArrayList<>(); //LinkedList$ListIterator
////	List list = new Vector(); //VectorItr
////	List list = new LinkedList(); 
		
		list.add("홍길동");
		System.out.println(list.indexOf("홍길동"));
		System.out.println(list);
		System.out.println();
		
		list.add("사오정");
		System.out.println(list.indexOf("사오정"));
		System.out.println(list.get(1));
		System.out.println(list);
		System.out.println();
		
		list.set(1, "손오공");
		System.out.println(list);
		System.out.println();
		
		list.remove(1);
		System.out.println(list.size());
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (String s:list) {
			System.out.println(s);
		}
		
		
//		//이제는 안 쓰는 방법
//		Iterator<String> it = list.iterator();
//		//System.out.println(it); java.util.ArrayList$Itr@6504e3b2 ArrayList의 중첩클래스 list를 LinkedList로 선언하면 LinkedList의 중첩클래스로
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println();
		
	}
}
