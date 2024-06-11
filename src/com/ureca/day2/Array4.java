package com.ureca.day2;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {

		//사방 탐색 
		
		int[][] ia = {{1,2,3},{4,5,6},{7,8,9}};
		
	
		for(int[] a : ia) System.out.println(Arrays.toString(a)); System.out.println("===");
//
//		for (int i = 0; i<ia.length; i++) {
//			for (int j = 0; j<ia[i].length; j++) {
//				System.out.print("ia["+i+"]["+j+"]="+ia[i][j]+"  ");
//			}
//			System.out.println();
//		}
		
		
		//1방 탐색: 5 
		
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i+0][j+0]); //5
					System.out.println("===");
					
					int[] di = {0};
					int[] dj = {0};
					for (int d = 0; d<1; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}
		System.out.println();
		System.out.println();
		
		//2방 탐색: 6 4    우 좌 찍기
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i+0][j+1]); //6
					System.out.println(ia[i+0][j-1]); //4
					System.out.println("===");
					
					int[] di = {0,0};
					int[] dj = {1,-1};
					for (int d = 0; d<2; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}
		System.out.println();
		System.out.println();
		
		//2방 탐색: 2 8   상 하 찍기
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i-1][j+0]); //2
					System.out.println(ia[i+1][j+0]); //8
					System.out.println("===");
					
					int[] di = {-1,1};
					int[] dj = {0,0};
					for (int d = 0; d<2; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}
		System.out.println();
		System.out.println();
				
		//4방 탐색:    상 하 좌 우 찍기
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i-1][j+0]); 
					System.out.println(ia[i+0][j+1]);
					System.out.println(ia[i+1][j+0]); 
					System.out.println(ia[i+0][j-1]); 
					System.out.println("===");
					
					int[] di = {-1,0,1,0};
					int[] dj = {0,1,0,-1};
					for (int d = 0; d<4; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		//4방 탐색:    엑스칼리버
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i-1][j+1]); 
					System.out.println(ia[i+1][j+1]);
					System.out.println(ia[i+1][j-1]); 
					System.out.println(ia[i-1][j-1]); 
					System.out.println("===");
					
					int[] di = {-1,1,1,-1};
					int[] dj = {1,1,-1,-1};
					for (int d = 0; d<4; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		//4방 탐색:   8방탐색 
		for (int i = 0; i<ia.length; i++) {
			for (int j = 0; j<ia[i].length; j++) {
				if(ia[i][j]==5) {
					System.out.println(ia[i-1][j+0]); 
					System.out.println(ia[i-1][j+1]);
					System.out.println(ia[i+0][j+1]); 
					System.out.println(ia[i+1][j+1]); 
					System.out.println(ia[i+1][j+0]); 
					System.out.println(ia[i+1][j-1]);
					System.out.println(ia[i+0][j-1]); 
					System.out.println(ia[i-1][j-1]);
					System.out.println("===");
					
					int[] di = {-1,-1,0,1,1,1,0,-1};
					int[] dj = {0,1,1,1,0,-1,-1,-1};
					for (int d = 0; d<8; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.print(ia[ni][nj]+" ");
					}
				}
			}
		}

		
	}

}
