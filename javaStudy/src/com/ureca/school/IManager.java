package com.ureca.school;


//여기는 변수를 선언할 수 없음 자동으로 다 final static이 붙음 다 상수임
public interface IManager {

	//파라미터를 최상위 클래스로 했기에 학생, 종업원, 선생 다 받아들일 수 있음 
	void add(Person p) throws DuplicatedException;

	Person[] search();

	Person search(String name) throws NotFoundException;

	void update(Person p) throws NotFoundException;

	void delete(String name) throws NotFoundException;

	void printAll();

	
	//아래 두 메소드는 개발 다 했다가 후에 붙임거임. 근데 디폴트로 만들지 않으면 이 인터페이스를 상속받아 만든 클래스들이 갑자기 
	// 다 에러 될거임 아래 두 메소드는 오버라이드 안했었으니까. 그래서 구현하지않았어도 원래 시스템이 돌아갈 수 있도록 디폴트 메소드로 선언
	// 이게 좋은거? 이제 인터페이스 개발자가 그냥 너네 오버라이드해서 커스텀하고 싶으면 하고 안해도 에러 안남~ 이러고 새로운 기능을 추가 구현할 수 있음
	default void save() {};
	default void load() {};

}