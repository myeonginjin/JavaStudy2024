package com.ureca.school;

import java.util.Arrays;

//싱클톤 디자인 패턴
public class ManagerImpl implements IManager {
	private Person[] pa;
	private int index;
	
	//2
	private static IManager instance = new ManagerImpl();
	//1
	private ManagerImpl(int size) {
		pa = new Person[size];
	}
	private ManagerImpl() {
		this(10);
	}
	//3 
	public static IManager getInstance() {
		return instance; //스태틱 매서드는 스태틱 변수만 사용 가능 
	}
	
	//파라미터를 최상위 클래스로 했기에 학생, 종업원, 선생 다 받아들일 수 있음 
	@Override
	public void add(Person p) {
		pa[index++] = p;
	}
	
	@Override
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}
	
	@Override
	public Person search(String name) {
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) return pa[i];
		}
		return null;
	}
	
	@Override
	public void update(Person p) {
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(p.getName())) {
				pa[i] = p;
				return;
			}
		}
	}
	
	@Override
	public void delete(String name) {
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) {
				index--;
				pa[i] = pa[index];
				pa[index] = null;
				return;
			}
		}
	}
	
	@Override
	public void printAll() {
		for (int i = 0; i<index; i++) pa[i].printAll();
	}
	
}
