package com.ureca.day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//class TitleComparator /*extends Objects*/ implements Comparator<Book> {
//	
//	//Comparator 인터페이스 f3타고 들어가서 보니까 equals도 있는데 그건 왜 구현안해도돼? 그건 Objects에 있잖아. 그거 상속받은게 TitleComparator니까 부모 클래스 Objects의 equals로 퉁치는겨
//	
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return o1.title.compareTo(o2.title);
//	}
//}
//
//class PriceComparator /*extends Objects*/ implements Comparator<Book> {
//	
//	//Comparator 인터페이스 f3타고 들어가서 보니까 equals도 있는데 그건 왜 구현안해도돼? 그건 Objects에 있잖아. 그거 상속받은게 TitleComparator니까 부모 클래스 Objects의 equals로 퉁치는겨
//	
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o1.price, o2.price);
//	}
//}
//
//class TitlePricComparator implements Comparator<Book> {
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		
//		//람다식으로 2개 멤버변수 비교 정렬
//		return o1.title.equals(o2.title) ? Integer.compare(o1.price, o2.price) : o1.title.compareTo(o2.title);
//	}
//}

class AnonymousComparator /*extends Objects*/ implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		
		return Integer.compare(o1.price, o2.price);
	}
}


public class AnonymousSort {
	
	public static void main(String[] args) {
		

		Book[] ba =  {
				new Book("123","자바",9000),
				new Book("987","자바",8000),
				new Book("456","가곡",1000),
		};
		System.out.println(ba);
		
		//1. 기본 절차 
		class PriceComparator implements Comparator<Book> {
			public int compare(Book o1, Book o2) {
				return Integer.compare(o1.price, o2.price);
			};
		};
		Comparator pc = new PriceComparator();
		
		Arrays.sort(ba,pc);
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println("=======");
		
		//2. PriceComparator를 익명 클래스로 전환
		Comparator pc2 = new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return -Integer.compare(o1.price, o2.price);
			};
		};
		Arrays.sort(ba,pc2);
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println("=======");
		
		//3. Comparator까지 익명 클래스로 전환 
		Arrays.sort(ba, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
	
				return o1.title.compareTo(o2.title);
			}
		});
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println("=======");
		

		Arrays.sort(ba, pc);
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","네웤",1900));
		bl.add(new Book("456","네웤",1000));
		
		
		
		System.out.println(Arrays.toString(ba));
		System.out.println("=======");
		System.out.println(bl.toString());
		
		

		
	}

}

