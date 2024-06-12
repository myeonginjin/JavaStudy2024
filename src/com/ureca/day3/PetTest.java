package com.ureca.day3;

import java.io.Serializable;
import java.rmi.Remote;

import com.ureca.day1.initTest;

class A {
	
}
class B {
	
}

abstract class Pet extends A implements Serializable, Remote {
	private String name; 
	
	public Pet(String name) {
		setName(name);
	}
	public Pet() {
		this("펫");
	}
	
	//펫의 짖는 소리가 공통적이지 않으니 기본값을 설정하기 어려움. 그러므로 상속받는 애들이 알아서 올바른 짖는 소리를 구현하다록 추상 메서드로 구현 
	//추상 메소드가 하나라도 있으면 해당 클래스는 추상 클래스가 되어야함 그리고 이 클래스는 인스턴스를 만들 수 없게됨
	public abstract void speak(); //이 클래스를 상속받는 클래스는 이 추상메소드를 꼭 오버라이드하여 몸체 부분을 구현하라.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Cat extends Pet {

	@Override
	public void speak() {
		System.out.println("야용");
		
	}
}

class Dog extends Pet {

	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Duck extends Pet {

	@Override
	public void speak() {
		System.out.println("꽥꽥");
		
	}
	
}


public class PetTest {
	public static void main(String[] args) {
		
		//Pet p = new Pet(); 추상클래스는 인스턴스를 만들 수 없음
		
		Pet p = new Cat();
		p.speak();
		System.out.println(p);
		
		//다형성
		Pet[] pa = new Pet[3];
		pa[0] = p;
		pa[1] = new Dog();
		pa[2] = new Duck();
		
		for (Pet i :pa) i.speak();
	}
}
