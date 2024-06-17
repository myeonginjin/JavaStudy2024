package com.ureca.day2;

import java.util.Arrays;

public class Array9 {
	
	static final int[] di = {-1,0,1,0};
	static final int[] dj = {0,1,0,-1};
	
	public static void main(String[] args) {

		// 좌우탐색 + dfs or bfs 
		
		int[][] ia = {
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,9,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
		};
		
	
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
		
		//4방+탐색:    상 하 좌 우 찍기   + bfs
//		for (int i = 0; i<ia.length; i++) {
//			for (int j = 0; j<ia[i].length; j++) {
//				if(ia[i][j]==9) {
//
//					for (int k = 1; k<=3; k++) {
//						for (int d = 0; d<4; d++) {
//							int ni = i + di[d]*k;
//							int nj = j + dj[d]*k;
//							
//							if ((ni >= 0 && ni < n) && (nj >= 0 && nj < m)) {
//								ia[ni][nj] = k;
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		for(int[] a : ia) System.out.println(Arrays.toString(a)); System.out.println("===");
		
		//4방+탐색:    상 하 좌 우 찍기   + Dfs
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==9) {
					for (int d = 0; d<4; d++) {
						for (int k = 1; k<=3; k++) {
							int ni = i + di[d]*k;
							int nj = j + dj[d]*k;
							
							if ((ni >= 0 && ni < n) && (nj >= 0 && nj < m)) {
								ia[ni][nj] = k;
								for(int[] a : ia) System.out.println(Arrays.toString(a)); System.out.println("===");
							}
						}
					}
				}
			}
		}
		
		System.out.println("===");
		System.out.println("===");
		
		for(int[] a : ia) System.out.println(Arrays.toString(a)); System.out.println("===");
		

	}

}
