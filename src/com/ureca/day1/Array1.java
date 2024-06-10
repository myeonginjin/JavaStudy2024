package com.ureca.day1;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//1선언
		int[] ia; // int ia[];
		
		//2생성
		ia = new int[3];
		
		int[] iaa = new int[3];
		iaa[0] = 10;
		
		
		//3사용
		
		int[] iaaa = {10,20,39};
		
		int[] iaaaa = new int[] {11,22,334,53};
		
		//4출력
		System.out.println(ia.toString());
		
		System.out.println(Arrays.toString(iaaaa));
		
		
//		for (int i = 0; i<iaaaa.length; i++) {
//			System.out.println(iaaaa[i]);
//		}
//		
		for (int a : iaaaa) System.out.println(a);
		
	}
}
