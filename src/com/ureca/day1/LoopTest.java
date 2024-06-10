package com.ureca.day1;

public class LoopTest {

	public static void main(String[] args) {
		
		int j = 1;
		
		while (j<=5) {
			System.out.println("j : "+j+" ");
			j++;
		}
		
		
		for (int i = 1; i<=5; i++) {
			System.out.println("i : "+i+" ");
		}
		
		
		int k = 10;
		do {
			System.out.print("k: "+k);
			k++;
		}while(k<10);
		
		
		
		fir : for (int u = 0; u<19; u++) {
			sec : for (int l = 0; l<10; l++) {
				thir : for (int	 j1 = 0; j1<10; j1++) {
					if(j1 ==7) {
						break fir;
					}
					System.out.println(u+" "+l+" "+j1);
				}
			}
		}


	}

}
