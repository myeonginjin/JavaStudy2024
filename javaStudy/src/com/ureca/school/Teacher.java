package com.ureca.school;

public non-sealed class Teacher extends Person {

	private String name;
	private int age;
	private String subj;
	
	public Teacher(String name, int age, String subj) {
		setName(name);
		setAge(age);
		setSubj(subj);
	}
	
	public Teacher(String name,String subj) {
		this(name, 99, subj);
	}
	public Teacher(String name) {
		this(name, 99, "무전공");
	}
	public Teacher() {
		this("김선생", 99, "무전공");
	}

	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}

	public void printAll() {
		super.printAll();
		
		System.out.println(getSubj()+"   hi T");
	}

	

}
