package com.ureca.day2;

import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		int[] ia = {90,80,100};
		//ia[3] = 95; //ArrayIndexOutOfBundsException
		
		//ia={90,80,100,95};
		ia = new int[] {90,80,100,95};
		ia[3] = 85;
		System.out.println(Arrays.toString(ia));
		
		int[] ib = new int[4];
		
		
		//이게 FOR문 돌리는거보다 빠름 왜? 타고들어가봐 네이티브 코드임 씨나 씨쁠쁠
		System.arraycopy(ia, 0, ib, 0, ia.length);
		System.out.println(Arrays.toString(ib));
		
		//1차원 배열은 copy하면 깊은 복사 !!!
		
		int[] ic = Arrays.copyOf(ib, ia.length);
		System.out.println(Arrays.toString(ic));
		
		
		// 2차원 배열의 복사
		
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		System.out.println(Arrays.toString(a));
		
		int[][] b = Arrays.copyOf(a, a.length);
		
		a[0][0] = 11;
		b[1][1] = 55;
		
		for(int[]a1:a) System.out.println(Arrays.toString(a1));
		for(int[]b1:a) System.out.println(Arrays.toString(b1));
		// 보면 알겠지만 이 방법으로는 얕은 복사임 !!
		
		// 그래서 걍 무식하게 FOR 문돌여야됨
		
		int[][] c = new int[3][3];
		for(int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				c[i][j] = a[i][j];
			}
		}
		
		// 깊은 복사 이뤄졋음
		for(int[]c1:c) System.out.println(Arrays.toString(c1));
		c[2][2] = 99;
		for(int[]a1:a) System.out.println(Arrays.toString(a1));
		for(int[]c1:c) System.out.println(Arrays.toString(c1));

	}

}
