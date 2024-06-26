package com.ureca.school;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ManagerList implements IManager {
	private List<Person> pa;
	
	//아래 세 메소드는 인캡슐레이션이 잘되어있음 +싱글톤 디자인패턴
	private static IManager instance = new ManagerList();
	
	private ManagerList(int size) {
		pa = new ArrayList<>(size);
		
		//객체 읽기 시작
		load();
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
		for(Person i : pa) System.out.println(i);

	}
	
	
	//아래 두 메서드는 인터페이스의 디폴트 메서드이기때문에 구현하지 않아도 에러가 나지않음
	@Override
	public void save() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("school.dat"))) {
			oos.writeObject(pa);
			oos.flush();
			System.out.println("파일 쓰기 완료");
		} catch (Exception e) {
			System.out.println("파일 쓰기 실패");
		}
	}
	
	@Override
	public void load() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("school.dat"));){
			List<Person> pa = new ArrayList<>(); 
			pa = (List<Person>)ois.readObject();
			System.out.println("파일 읽기 성공");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} {
			
		}
	}

}
