package com.ureca.school;


//여기는 변수를 선언할 수 없음 자동으로 다 final static이 붙음 다 상수임
public interface IManager {

	//파라미터를 최상위 클래스로 했기에 학생, 종업원, 선생 다 받아들일 수 있음 
	void add(Person p);

	Person[] search();

	Person search(String name);

	void update(Person p);

	void delete(String name);

	void printAll();

}