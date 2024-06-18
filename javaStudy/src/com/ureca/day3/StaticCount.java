package com.ureca.day3;


class Count {
	public static int si;
	public    	  int ii;
	
	static {
		si = 1;
		System.out.println("static{1} "+si);
	}
	public static int getSi() {
		return si;
	}
	static {
		si = 2;
		System.out.println("static{2} "+si);
	}
}


class Count2 {
	public static int si;
	public    	  int ii;
	
	static {
		si = 1;
		System.out.println("static{1} "+si);
	}
	public static int getSi() {
		return si;
	}
	static {
		si = 2;
		System.out.println("static{2} "+si);
	}
}


//실행되면 main메소드를 실행해야하기에, main메소드가 있는 클래스는 public이어야 함.


//작동과정 설명 해볼까? run버튼 누르면 클래스 로더 로딩 시작 ! 우선 public class StaticCount! 클래스가 할당되고 {} 안에 있는 static들 살펴봄 그다음 main메소드 실행 이떄 ! 힙영역과 스텍 영역은 비워져있음
//그리고 메인 메소드가 시작 근데 new로 COunt 인스턴스 만들기 전에은 단 Count클래스의 static변수와 메소드만 실행됨 당연히 오브젝트가 아닌 클래스만 있으니까. 
//클래스와 오브젝트를 헷갈리지말자 

public class StaticCount {
	
	static {
		System.out.println("main보다 먼저 ㅋ");
	}

	public static void main(String[] args) {
		
		System.out.println(Count.si+" main 시작");
//		System.out.println(Count2.si+" main 시작");
		
		System.out.println("main() start");
		//Sstem.out.println(Count.ii); 이건 에러다 왜? ii는 인스턴스 변수니까 ! 인스턴수 변수,메서드,this,super,non-static등 인스턴스가 할당되어야되는 것들 사용불가
		System.out.println(Count.si);
		System.out.println();
		
		Count c1 = new Count();
		c1.si++;
		
		System.out.println(c1.ii);
		
		//스테틱이 붙은 것들은 아래 두 문장보다는 
		System.out.println(c1.si);
		System.out.println(c1.getSi());
		
		//이렇게 하는걸 선호함
		System.out.println(Count.si);
		System.out.println(Count.getSi());
		
		System.out.println();
		System.out.println();
		
		Count c2 = new Count();
		c2.si++;
		
		System.out.println(c2.ii);
		System.out.println(c2.si);
		System.out.println(c2.getSi());
		System.out.println(Count.si);
		System.out.println(Count.getSi());
		
		System.out.println();
		System.out.println();
		
		System.out.println(c1.si);
		System.out.println(c1.getSi());
		
		
	}
	


}
