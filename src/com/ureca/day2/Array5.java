package com.ureca.day2;

import java.util.Arrays;

public class Array5 {
	
	static final int[] di = {-1,0,1,0};
	static final int[] dj = {0,1,0,-1};
	
	public static void main(String[] args) {

		// 사방 탐색 + 아웃오브 인덱스 검사 
		
		int[][] ia = {{1,2,3},{4,5,6},{7,8,9}};
		
	
		for(int[] a : ia) System.out.println(Arrays.toString(a)); System.out.println("===");
//
//		for (int i = 0; i<ia.length; i++) {
//			for (int j = 0; j<ia[i].length; j++) {
//				System.out.print("ia["+i+"]["+j+"]="+ia[i][j]+"  ");
//			}
//			System.out.println();
//		}
		
		
		int n = ia.length;
		int m = ia[0].length;
		
		//4방+탐색:    상 하 좌 우 찍기
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==8) {

					
					
					//아웃오브 인덱스 검사해주어야함 !
					for (int d = 0; d<4; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						
						if ((ni >= 0 && ni < n) && (nj >= 0 && nj < m)) {
							System.out.print(ia[ni][nj]+" ");
						}
						
					}
				}
			}
		}
		

	}

}
