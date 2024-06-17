package com.ureca.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> nums = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
		System.out.println(nums);
		
		nums.stream()
			.filter(num->num%2==0)
			.map(num->num*num)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}

}
