package com.ureca.school;

public non-sealed class Employee extends Person {
	private String name;
	private int age;
	private char dept;
	
	public Employee(String name, int age, char dept) {
		setName(name);
		setAge(age);
		setDept(dept);
	}
	
	public Employee(String name,char dept) {
		this(name, 99, dept);
	}
	public Employee(char dept) {
		this("아무개", 99, dept);
	}
	public Employee() {
		this("아무개", 99, 'U');
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
		cheakAge(age);
	}
	public void cheakAge(int age) {
		if(age < 1 || age > 99) {
			System.out.println("error!");
		}
		else {
			this.age = age;
		}
	}
	public char getDept() {
		return dept;
	}
	public void setDept(char dept) {
		this.dept = dept;
	}

	public void printAll() {
		System.out.println(this.name+"\t"+this.age+"\t"+this.dept);
	}
}
