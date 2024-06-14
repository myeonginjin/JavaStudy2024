package com.ureca.school.test;

import com.ureca.school.DuplicatedException;
import com.ureca.school.Employee;
import com.ureca.school.IManager;
import com.ureca.school.ManagerImpl;
import com.ureca.school.ManagerList;
import com.ureca.school.ManagerMap;
import com.ureca.school.NotFoundException;
import com.ureca.school.Person;
import com.ureca.school.Student;
import com.ureca.school.Teacher;

public class SchoolMain {
	
	//1 다형성
	Object o = 123; //new Integer(123);
	int i = 'A';
	float f = 123L;
	
	public static void main(String[] args) {
		
		
		
		
		
		//생성자 매서드가 다 프라이빗이기에 이렇게 가져와야함 싱글톤으로 설계되어서 새로운 인스턴스를 만들어내지 못함
		//IManager m = ManagerImpl.getInstance();
		
		IManager m = ManagerList.getInstance();
		
		//IManager m = ManagerMap.getInstance();
		
		//System.out.println(m);
		//위 문장으로 출력해봐도 com.ureca.school.ManagerList@6f2b958e만 나옴 
		//우리는 getInstance에서 어떠한 자료구조 타입을 반한하는지 몰라. 이게 바로 다형성을 적용한 인터페이스 설계.
		// ManagerList 클래스에서 어떤 자료구조 (리스트[백터, 링크드리스트 등등], 배열 중)를 썼는지 모르고 나중에 이  ManagerList에 있는 프라이빗 스태틱 변수의 타입이 바뀌어도 이 스쿨메인 로직에서 에러가 일어나지않아
		//왜? 다형성을 고려해 인터페이스를 설계하였고, 이 인터페이스를 상속해 만든 클래스로 비즈니스 로직을 짰다면, 나중에 인터페이스 바꿔도 가장 윗단계 (사용자에 가까운) 영역은 시스템 잘 돌아가 ~
		//어떤 타입을 받아내는지는 몰라도 어차피 이 클래스에서 구현하는 사람은 m 객체의 add update등등의 오브젝트 메서드만 활용해서 기능을 구현하니까. 추후에 m객체를 만들어내는 상위 클래스와 인터페이스가 변경된다해도 그 번경하는 얘가 실수만 안하면 문제 안나지
		
		
		try {
			m.add(new Student("홍길동",20,1202));
		} catch (DuplicatedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try {
			m.add(new Employee("홍길동",30,'U')); //중복자
		} catch (DuplicatedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			m.add(new Teacher("진학생",40,"wh"));
		} catch (DuplicatedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		//객체 쓰기 시작
		m.save();
		
		
		System.out.println("=========================================");
		m.load();
		System.out.println("=========================================");
		
		m.printAll();
		
		System.out.println();
		
		
		Person p3;
		try {
			p3 = m.search("진학생 없는 학생 검색 ");
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
//		System.out.println(p3);
		
		System.out.println();
		
		p3 = new Student("진학생",77, 244442);
		try {
			m.update(p3);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("=====");
		for (Person p : m.search()) p.printAll();
			
		System.out.println();
		try {
			m.delete("진학생 없는 학생");
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		m.printAll();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		

		
		Person p = new Student("홍길동",20,202411);
		p.setName("손오공"); //ok super
		//p.setStuid(); //err sub    //수퍼에는 없잖아 수퍼를 오버라이딩한 메서드가 아니야 
		p.printAll(); //?ok sub<-override<-inheritance  오버리이팅된 메서드 호출이 가능
		
		
		//Teacher t = (Teacher)p; //classCastException
		
		if (p instanceof Student) {
			Student s = (Student)p;
			s.setStuid(20202);
		}
		
		p.printAll();
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		
		// 여기까지 다다형성의 데피니션!
		
		
		//2 배열 
		int[] ia = new int[3];
		ia[0] = 'A';
		
		Person[] pa = new Person[3];
		pa[0] = new Student("홍길동",20,1202);
		pa[1] = new Employee("홍길",30,'U');
		pa[2] = new Teacher("동",40,"wh");
		
		for(Person p2 : pa) p2.printAll();
		
		
		Object[] oa = new Object[3];
		oa[0] = 123;
		int[] iaa = new int[3];
		iaa[0] = 'A';
		
		
		//3 파라메타 
		//void set(Object o) {
		//void set(Person p){
		//void set(int i){
			//....
		//}
		//set('A'); //set(123);
		// set(new Student("홍길동,20,202411)); //set(new Person("홍길동",20));
	
		/*
		//4 리턴
		//Object get() {
		Person get() {
		//int get() {
		 // ...
		 // return 'A'; //123;
		 //return new Student("홍길동",12,223); 
		
		*/
		
		
		//5 오버라이드 (재정의)
		/*
		Person p = new Student("홍길동",20,202411);
		p.printAll(); //?ok sub<-override<-inheritance  오버리이팅된 메서드 호출이 가능
		 */
	
	}
	
	
}
