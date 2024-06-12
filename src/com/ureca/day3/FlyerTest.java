package com.ureca.day3;

import java.io.Serializable;

interface IA{
	
}
interface IB{
	
}


//인터페이스는 c의 헤더로 생각하면됨 
// 그럼 abstract와 인터페이스의 차이점은? 추상은 클래스다. 인터페이스는 인터페이스다 일단 키워드가 다름
// 단 둘다 객체를 생성하지 못하는건 똑같음. 인터페이스는 api를 만들고 다중 상속을 지원하기 위해 존재하는 거임 
interface IFlyer extends IA, IB {
	public static final int i = 11;
 /*컴파일러가 자동으로 붙여줌*/int j = 12;
	
	    public abstract void fly();
/*컴파일러가 자동으로 붙여줌*/void land();
/*컴파일러가 자동으로 붙여줌*/void takeOff();
}

class Airplane implements IFlyer {

	@Override
	public void fly() {
		System.out.println("비행기가 난다");
		
	}

	@Override
	public void land() {}

	@Override
	public void takeOff() {}
	
}

class Superman implements IFlyer {

	@Override
	public void fly() {
		System.out.println("슈퍼맨이 난다");
		
	}

	@Override
	public void land() {}

	@Override
	public void takeOff() {}
	
}

class Bird implements IFlyer {

	@Override //원형메서드
	public void fly() {
		System.out.println("새 난다");
		
	}

	@Override
	public void land() {}

	@Override
	public void takeOff() {}
	
}

public class FlyerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스는 객체 생성이 불가
		//IFlyer f = new IFlyer();
		
		
		// 어? 인터페이스는 객체 못 만든다고 했는데 왜 된거지? {} 이거 때문에 그럼 s는 Serializable 인터페이스를 상속받은 익명 객체임
//		Serializable s = new Serializable(){};
//		System.out.println(s);
		
		//다형성 조지기
		IFlyer f = new Airplane();
		f.fly();
		
		IFlyer[] ia = new IFlyer[3];
		ia[0] = f;
		ia[1] = new Superman();
		ia[2] = new Bird();
		
		for (IFlyer i : ia) i.fly(); System.out.println();
	}
		

}
