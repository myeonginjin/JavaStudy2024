package com.ureca.day4;

import java.util.Objects;

public class Car {
	String name;
	int year;
	
	public static int i = 134;
	
	static {
		System.out.println("나는 차 클래스");
	}
	public static void test() {
		System.out.println("차클래스라니까");
	}
	
	Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name) && year == other.year;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, year);
//	}



	//객체의 주소값이 출력되지않고 아래 출력값처럼 출력되도록
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}
	
	
	
	

}
