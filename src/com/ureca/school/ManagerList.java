package com.ureca.school;

import java.util.*;

public class ManagerList implements IManager {
	private List<Person> pa;
	
	//아래 세 메소드는 인캡슐레이션이 잘되어있음 +싱글톤 디자인패턴
	private static IManager instance = new ManagerList();
	
	private ManagerList(int size) {
		pa = new ArrayList<>(size);
	}
	private ManagerList() {
		this(10);
	}
	
	public static IManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Person p) throws DuplicatedException {
		try {
			search(p.getName());
			throw new DuplicatedException(p.getName()+" 중복입니다");
		} catch (NotFoundException e) {
			pa.add(p);
		}

	}

	@Override
	public Person[] search() {
		//이건 배열의 주소값만 넘기면되기때문에 [1] [2] 뭐 상관없음 리스트를 배열로 만들어주는 한문장
		return pa.toArray(new Person[0]);
	}

	@Override
	public Person search(String name) throws NotFoundException {
		for (Person p:pa) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		throw new NotFoundException(name+" 없습니다");
	}

	@Override
	public void update(Person p) throws NotFoundException {
		Person t = search(p.getName());
		pa.set(pa.indexOf(t),p);

	}

	@Override
	public void delete(String name) throws NotFoundException {
		Person t  = search(name);
		pa.remove(t);
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub

	}

}
