package com.ureca.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamBook {
	public static void main(String[] args) {
		Book[] ba = {
				new Book("123","자바",2000),
				new Book("985","알고",1000),
				new Book("456","가곡",30000),
		};
		System.out.println(Arrays.toString(ba));
		Arrays.stream(ba).forEach(b-> System.out.println(b));
		Arrays.stream(ba).forEach(System.out::println);
		
		
		double avg = Arrays.stream(ba).mapToInt((b)->{return b.getPrice();}).average().getAsDouble();
		System.out.println(avg);
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","네웤",1900));
		bl.add(new Book("456","네웤",1000));
		
		System.out.println(bl.toString());
		
		
//		bl.stream().forEach(b-> System.out.println(b));
//		bl.stream().forEach(System.out::println);
//		avg = bl.stream().mapToInt((b)->{return b.getPrice();}).average().getAsDouble();
		
		System.out.println("===========");
		
		//p.737 필터링 
		avg = bl.stream()
				.filter((b)->{return !(b.getTitle()
				.equals("네웤"));})
				.mapToInt(b->b.getPrice())
				.average()
				.getAsDouble();
		System.out.println(avg);
		System.out.println("===========");
		
		//정렬 
		avg = bl.stream()
				.filter(b->!(b.getTitle().equals("네웤")))
				.sorted(Comparator.reverseOrder())
				.peek(b->System.out.println(b))
				.sorted(Comparator.reverseOrder())
				.peek(System.out::println)
				.mapToInt(b->b.getPrice())
				.average().getAsDouble();
		
		System.out.println(avg);
		System.out.println("===========");
		
		// 2가지 이상의 조건 정렬 중 가장 빠른 녀석
		avg = bl.stream()
				.filter(b->!(b.getTitle().equals("데베")))
				.sorted(Comparator.reverseOrder())
				.peek(b->System.out.println(b))
				.sorted((o1,o2)-> Integer.compare(o1.price, o2.price))
				.peek(System.out::println)
				.mapToInt(b->b.getPrice())
				.average().getAsDouble();
		
		System.out.println("===========");
		
		
		bl.stream()
		.filter(b->!(b.getTitle().equals("데베")))
		.mapToInt(b->b.getPrice())
		.average().ifPresent(a->System.out.println("펑균:"+a));
		
		
		System.out.println(avg);
		System.out.println("===========");
		
		Map<String, Book> map = bl.stream().collect(Collectors.toMap(b->b.getTitle(), b->b));
		System.out.println(map);
		

	}
}
