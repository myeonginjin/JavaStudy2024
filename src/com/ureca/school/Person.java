package com.ureca.school;


//이거 만든 이유? 학생 선생 종업원에 중복되는 코드 부분들이 많다, 이를 통합해서 코드를 줄일 수도 잇고 무엇보다 한꺼번에 세 타입의 클래스를 수정해버릴 수 있다
public class Person extends Object {

	protected String name = "아무개";
	protected int age;

	public Person(String name, int age) {
		//super(); 이건 컴파일러가 자동으로 넣음. 내가 작성안해
		setName(name);
		setAge(age);
	}
	public Person(String name) {
		this(name,99);
	}
	
	public Person() {
		this("모모지리리",99);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//잘못된 나이 값이 들어오는 것을 방지
		cheakAge(age);
	}

	private void cheakAge(int age) {
		if(age < 1 || age >99) {
			System.out.println("invalid age(1~99): "+age);
			System.exit(0);
		}
		else {
			this.age = age;
		}
	}
	
	//최상위 객체 Objects의 메소드 오버라이딩하기
	public String toString() {
		return getName()+"\t"+getAge()+"\t    success";
	}
	
	public void printAll() {
		System.out.print(getName()+"\t"+getAge()+"\t");
	}

}