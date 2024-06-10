package com.ureca.day1;

import java.util.Scanner;

public class GugudanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("단(2~9)?");
		int n = sc.nextInt();
		
		fir : for (int i = 1; i<=9; i++) {
			for (int j = 2; j<=n; j++) {
				//System.out.print(j+"x"+i+"="+(i*j)+"\t");
				System.out.printf("%dx%d=%d\t",j,i,i*j);
				if(i==7 && j ==3) break fir;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
