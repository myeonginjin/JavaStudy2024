package com.ureca.day1;

public class PromotionTest {

	
	//폴로폴리즘?? 가다 가다
	
	public static void main(String[] args) {
		int i = 11;
		long l = 12L;
		float f = 1.2f;
		double d = 3.14;
		// double >= float >= long >= int >= short >= byte 
		d = f;
		d = l;
		d = i;
		//                                >= char      x
		
		byte by = 1;
		short sh = 2;
		char ch = 'A';
		int k = i; //ch; //sh; //by;
		
		long j = 'A';
		float o = 'B';
		double n = 'C';
		
		
		float f1 = 2000000000000L;    //ok
		//32비트      64비트임에도 형변환이됨 왜? 메모리 용량이 문제인게 아니니까 
		
		System.out.print(f1);
		
		byte b = 1;
		byte b0 = 0;
		byte b2 = -1;
		
		byte b3 = 127;
		byte b4 = -128;
		
		//byte b5 = 128;
		//디모션은 가능한 범위 내에서만 이뤄짐 
		
		byte b7 = (byte)(b2+b3);

		System.out.println(b+" "+ b0+" "+b2+" "+b3+" "+b4);
		
		int k2 = (int)3.14;
		
		System.out.println(k2);
		
		System.out.printf("%.1f%%\n",123.67);
		System.out.println(1/3.0);
		
		System.out.println(1<<2);
		

	}

}
