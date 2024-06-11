package com.ureca.day1;

import java.util.Random;
import java.util.Scanner;

public class IfSwitchTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(6)+1;
		System.out.print(n);
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch (score/10) {
		 case 10,9 -> {
			 System.out.print('A');
		 }
		 case 8 -> {
			 System.out.print('A');
		 }
		 case 7,6 -> {
			 System.out.print('A');
		 }
		 default -> {
			 System.out.print('F');
		 }
		}
		
		System.out.println("test");
	}

}
