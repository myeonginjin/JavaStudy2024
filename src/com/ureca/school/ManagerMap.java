package com.ureca.school;

import java.lang.module.InvalidModuleDescriptorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerMap implements IManager{
	private Map<String,Person> pa;
	
	//아래 세 메소드는 인캡슐레이션이 잘되어있음 +싱글톤 디자인패턴
	private static IManager instance = new ManagerMap();
	
	private ManagerMap(int size) {
		pa = new HashMap<>(size);
	}
	private ManagerMap() {
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
			// TODO Auto-generated catch block
			pa.putIfAbsent(p.getName(), p);
		}
		
	}

	@Override
	public Person[] search() {
		return pa.values().toArray(new Person[0]);
	}

	@Override
	public Person search(String name) throws NotFoundException {
		Person p =  pa.get(name); //어차피 맵에서 없으면NULL넘어가서 예외처리 할 필요 x
		
		if(p == null) {
			throw new NotFoundException(name + " 없습니다 이거 해시맵");
		}
		return p;
	}

	@Override
	public void update(Person p) throws NotFoundException {
		search(p.getName());
		
		pa.put(p.getName(), p);

	}

	@Override
	public void delete(String name) throws NotFoundException {
		search(name);
		pa.remove(name);
	}

	@Override
	public void printAll() {
		for(Person p : pa.values()) p.printAll();

	}

}
