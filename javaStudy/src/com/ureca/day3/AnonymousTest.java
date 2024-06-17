package com.ureca.day3;

interface Run {
	void go();
	void stop();
}

//class Car implements Run {
//
//	@Override
//	public void go() {
//		System.out.println("go()");
//	}
//	@Override
//	public void stop() {
//		System.out.println("stop()");
//	}
//	
//}



public class AnonymousTest {
	
	//이 car는 AnonymousTest안에서만 사용하라고 이렇게 내부에 선언하는 것임. 내부적으로 프라이빗하게 사용할 때 이렇게 구현. 중첩 클래스
	static class Car implements Run {
		@Override
		public void go() {
			System.out.println("go()");
		}
		@Override
		public void stop() {
			System.out.println("stop()");
		}
		
	}
	
	public static void main(String[] args) {
		Run r1 = new Car();
		//r1.go();
		
		//System.out.println(r1.getClass().getName());
		//System.out.println();
		
		
		//이름이 없는 클래스 구현  
		/*
		 class ? implements Run {
		 	@Override
			public void go() {
				System.out.println("go()");
			}
			@Override
			public void stop() {
				System.out.println("stop()");
			}
		 };
		 
		 Run r2 = new ?();
		 
		 위의 원리를 따르기 위한거라 생각하면 됨 
		 
		 */
		
		//인터페이스인데 어떻게 객체가 만들어지지? 사실 Run인터페이스를 임플리먼츠하는 익명의 객체를 만든거임 sys찍어보면 $n 이렇게 되어있음 
		Run r2 = new Run() {
			@Override
			public void go() {
				System.out.println("go !!!! ");
			}
			@Override
			public void stop() {
				System.out.println("stop !!!! ");
			}
		};
		
		r2.go();
		r2.stop();
		System.out.println(r2.getClass().getName());
		
		Run r3 = new Run() {
			@Override
			public void go() {
				System.out.println("go()");
			}
			@Override
			public void stop() {System.out.println("test");}
		};
		r3.go();
		r3.stop();
		System.out.println(r3.getClass().getName());
		
		
		//아래처럼 쓰는 경우도 많음. 그냥 Run을 인플리먼츠하는 객체의 go메서드만 한번 실행하면되면 그냥 이렇게 일회성으로 객체 생성하고 메서드 호출후 바로 버려버리게.. 이름 지어줄 필요도 없고 객체를 변수화할 필요도 없는겨 
		new Run() {
			@Override
			public void go() {
				System.out.println("go ?????");
			}
			@Override
			public void stop() {System.out.println("test");}
		}.go();
		
		
	}

}
