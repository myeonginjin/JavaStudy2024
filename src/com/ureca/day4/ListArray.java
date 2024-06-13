package com.ureca.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {
		int[] ia = new int[3];
		ia[0] = 'A';
		System.out.println(Arrays.toString(ia));
		System.out.println();
		
		List<Integer>[] la = new List[3]; //new List<>[3] x 
		
		System.out.println(Arrays.toString(la));
		
		//la[0].add(123); 아래 for문을 하기 전에 이렇게 하면 널포인트에셉션 왜? la 배열안이 지금 null이야 
		
		for(int i = 0; i<la.length; i++) la[i] = new ArrayList<>(); // 각 원소에 객체 넣어주기
		
		la[0].add(123);
		
		System.out.println(la[0]);
		System.out.println(Arrays.toString(la));
		
		
	}
}
