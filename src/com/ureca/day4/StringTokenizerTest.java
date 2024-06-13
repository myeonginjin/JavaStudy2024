package com.ureca.day4;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("AA bb cc"," ");
		
		System.out.println(st.countTokens());
		
		
		//while문으로 출력하기
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		System.err.println("====");
		
		//FOR문으로 돌리기 근데 !! 아래 처럼하면 안됨 왜냐? countTokens()값은 nextToken을 통해 값 빼내면 그 수가 줄어듬 따라서
//		for (int i = 0; i<st.countTokens(); i++) {
//			System.out.println(st.nextToken());
//		}
		
		//이렇게 하기
		int n = st.countTokens();
		for (int i = 0; i<n; i++) {
			System.out.println(st.nextToken());
		}
		
	}

}
