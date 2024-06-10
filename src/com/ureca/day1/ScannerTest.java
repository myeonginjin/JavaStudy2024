package com.ureca.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String args[]) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/input.txt"));
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int  age =  sc.nextInt();
		double pi = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.println(name+" "+age+" "+pi+" "+ch);	
		
		sc.nextLine();
		String line = sc.nextLine();
		String[] sa = line.split(" ");
		
		name = sa[0];
		age = Integer.parseInt(sa[1]);
		pi = Double.parseDouble(sa[2]);
		ch = sa[3].charAt(0);
		
		System.out.println(name+" "+age+" "+pi+" "+ch);	
		

		
		
		sc.close(); 
	}
}

