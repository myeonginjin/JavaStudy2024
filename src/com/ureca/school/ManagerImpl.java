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
	public void add(Person p) throws DuplicatedException{
		try {
//			Person t = search(p.getName());
//			if(t!=null) throw new DuplicatedException(p.getName()+" 중복입니다.");
			
			search(p.getName());
			throw new DuplicatedException(p.getName()+" 중복입니다.");
			
		}catch (NotFoundException e) {
			pa[index++] = p;
		}
	}
	
	@Override
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}
	
	@Override
	public Person search(String name) throws NullPointerException, ClassCastException, NotFoundException { //인터페이스에서 정의된 예외처리와 그의 하위클래스는 모두 나열가능. 
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) {
				
				System.out.println("debug");
				
				return pa[i];
			}
		}
		//return null;
		throw new NotFoundException(name+" 없는데??"); //여기서 트라이 캐치할 필요없어 여기서는 에러가 발생한것만 알려주고 main에 thorws있으니까 거기서? 처리 
	}
	
	@Override
	public void update(Person p) throws NotFoundException{
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(p.getName())) {
				pa[i] = p;
				return;
			}
		}
		throw new NotFoundException(p.getName()+" 없습니다");
	}
	
	@Override
	public void delete(String name) throws NotFoundException {
		for (int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) {
				index--;
				pa[i] = pa[index];
				pa[index] = null;
				return;
			}
		}
		throw new NotFoundException(name+ " 없습니다");
	}
	
	@Override
	public void printAll() {
		for (int i = 0; i<index; i++) pa[i].printAll();
	}
	
}
