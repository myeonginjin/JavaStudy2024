package com.ureca.day4;

import java.util.Objects;

public class Car {
	String name;
	int year;
	
	Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, year);
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

	//객체의 주소값이 출력되지않고 아래 출력값처럼 출력되도록
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}
	
	
	
	

}
