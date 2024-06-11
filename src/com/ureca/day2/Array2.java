package com.ureca.day2;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		
		//1선언
		
		//int[][] ia;  int ia[][];   int[] ia[];   셋다 가능
		
		// ia = new int[3][3];     ia = int[3][5];   ia = new int[3][];
		
		//  ia = new int[3][]; 이건 NULL을 원소로 한 크기 3짜리 일차원배열이라 생각하면됨. 
		// ia[1] = new int[1];  ia[2] = new int[2]; 이런식으로 각 인덱스에 null값을 다시 1차원 배열(크기가 서로 다른)로 채워줄 수 있음. 그럼 인덱스 1 행에는 방금 만든 1차원 배열의 주소값을 원소로 할 것.
		
		
		//패스바이 벨류 패스바이 레퍼런스 구분하기
		
		int[][] ia = {{10,0,0},{0,2,3},{2,4,6}};   //ok
		int[][] iaa = new int[][]{{10,0,0},{0,2,3},{2,4,6}};   //ok
 		
		/*
		 * int[][] ia;
		 * ia = {{10,0,0},{0,2,3},{2,4,6}}; 이렇게는 에러 
 		 */
		
		
		
		
		System.out.println(ia);
		System.out.println(Arrays.toString(ia));
		
		//원소로 잇는 각 배열의 크기가 다른 경우
		int[][] iae = {{0},{0,2},{2,4,6}};
		
		
		//제발 이걸 써라
		for (int[] a:iae) System.out.println(Arrays.toString(a) +"  !!!");
		
		System.out.println(iae[0].length);
		System.out.println(iae[1].length);
		System.out.println(iae[2].length);
		
		for (int i = 0; i<iae.length; i++) {
			for (int j = 0; j<iae[i].length; j++) {
				System.out.print("ia["+i+"]["+j+"]="+iae[i][j]+"");
			}
			System.out.println();
		}
		
		
		for(int[] a:iae) {
			for (int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
