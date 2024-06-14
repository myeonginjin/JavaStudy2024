package com.ureca.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class TitleComparator /*extends Objects*/ implements Comparator<Book> {
	
	//Comparator 인터페이스 f3타고 들어가서 보니까 equals도 있는데 그건 왜 구현안해도돼? 그건 Objects에 있잖아. 그거 상속받은게 TitleComparator니까 부모 클래스 Objects의 equals로 퉁치는겨
	
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}
}

class PriceComparator /*extends Objects*/ implements Comparator<Book> {
	
	//Comparator 인터페이스 f3타고 들어가서 보니까 equals도 있는데 그건 왜 구현안해도돼? 그건 Objects에 있잖아. 그거 상속받은게 TitleComparator니까 부모 클래스 Objects의 equals로 퉁치는겨
	
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.price, o2.price);
	}
}

class TitlePricComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		
		//람다식으로 2개 멤버변수 비교 정렬
		return o1.title.equals(o2.title) ? Integer.compare(o1.price, o2.price) : o1.title.compareTo(o2.title);
	}
}


public class ComparatorSort {
	
	public static void main(String[] args) {
		
		Comparator tc = new TitleComparator();
		Comparator pc = new PriceComparator();
		Comparator tpc = new TitlePricComparator();

		Book[] ba =  {
				new Book("123","자바",9000),
				new Book("987","자바",8000),
				new Book("456","가곡",1000),
		};
		System.out.println(ba);

		//Compator 객체로 정렬하기
		Arrays.sort(ba, tc);
		System.out.println(Arrays.toString(ba));

		System.out.println("=======");
		
		Arrays.sort(ba, pc);
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","네웤",1900));
		bl.add(new Book("456","네웤",1000));
		
		
		Collections.sort(bl, tc);
		System.out.println(bl.toString());
		System.out.println("=======");
		
		Collections.sort(bl, pc);
		System.out.println(bl.toString());
		System.out.println("=======");
		
		
		Arrays.sort(ba,tpc);
		Collections.sort(bl,tpc);
		
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println(bl.toString());
		
		

		
	}

}
