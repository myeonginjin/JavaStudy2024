package com.ureca.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
	public static void main(String[] args) {
		
		Book[] ba =  {
				new Book("123","자바",9000),
				new Book("987","자바",8000),
				new Book("456","가곡",1000),
		};
		System.out.println(ba);
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		
		//이 익명 클래스를 람다로 표현해볼 것
		Arrays.sort(ba, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
	
				return o1.title.compareTo(o2.title);
			}
		});
		
		//람다 표현식 
		Arrays.sort(ba, (Book o1, Book o2)->{ return o1.title.compareTo(o2.title); } );
		//파라미터 타입 생략 가능
		Arrays.sort(ba, ( o1,  o2)->{ return o1.title.compareTo(o2.title); } );
		//return 생략 가능
		Arrays.sort(ba, ( o1,  o2) -> o1.title.compareTo(o2.title));
		
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println("=======");
		
		//이런 방법도 있긴 함
		Arrays.sort(ba, Comparator.comparing(t -> t.title));
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println("=======");
		

		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","네웤",1900));
		bl.add(new Book("456","네웤",1000));
		
		//람다 () -> {} 
		//Collections.sort(bl, (o1,o2) -> {return Integer.compare(o1.price,o2.price); } );
		Collections.sort(bl, (o1,o2) -> o1.title.compareTo(o2.title));
		System.out.println(bl.toString());
		
	}
}
