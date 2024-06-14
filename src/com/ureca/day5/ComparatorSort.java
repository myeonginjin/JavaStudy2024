package com.ureca.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {
		int[] ia = {123,987,456};
		System.out.println(ia);
		System.out.println(Arrays.toString(ia));
		Arrays.sort(ia);
		System.out.println(Arrays.toString(ia));
		System.out.println();
		
		Book[] ba =  {
				new Book("123","자바",2000),
				new Book("987","알고",8000),
				new Book("456","가곡",1000),
		};
		System.out.println(ba);
		System.out.println(Arrays.toString(ba));
		
		Arrays.sort(ba);  // CompareTO 인터페이스 상속 안했으면 에러 
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		
		Arrays.sort(ba, Collections.reverseOrder());
		System.out.println(Arrays.toString(ba));
		
		System.out.println("=======");
		
		
		// 익명 클래스 사용해서 정렬
		Arrays.sort(ba, new Comparator<Book>() {
			
			public int compare(Book f, Book s) {
				return f.getPrice() - s.getPrice();
			}	
		});
		
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","컴구",8000));
		bl.add(new Book("456","네웤",1000));
		
		//리스트는 Collections로 정렬
		Collections.sort(bl);
		System.out.println(bl.toString());
		System.out.println("=======");
		
		Collections.sort(bl, Collections.reverseOrder());
		System.out.println(bl.toString());
		System.out.println("=======");
		
		Collections.sort(bl, new Comparator<Book>() {
			public int compare(Book f, Book s) {
				return f.price - s.price;
			}
		});
		System.out.println(bl.toString());
		
		
	}

}
