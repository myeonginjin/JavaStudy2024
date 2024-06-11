package com.ureca.school.test;

import com.ureca.school.Employee;
import com.ureca.school.Person;
import com.ureca.school.Student;
import com.ureca.school.Teacher;

public class SchoolTest {

	public static void main(String[] args) {
		
		
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		t1.printAll();
		
		//어떻게 작동되는걸까? 일단 s1이 스텍에 만들어지고 아직은 주소가 할당이안됨 > 힙영역에 객체가 메모리 할당됨 이때, 우선 가장 최상위 부모 클래스의 데이터값을 가지고 주소도 가지고 한 뒤, 
		// 하위 클래스만 가지고 있는 값들을 또 가짐 펄슨 다 가졋으면 스튜던트 그리고 또 잇다면 또 가짐 암튼 모든 데이터값 주소값들을 다 가지게되었다면 이 전체 값을 가진 객체의 주소값이 스텍 영역에 있는 s1이 들고 있게됨 
		s1.printAll();
		
		
		e1.printAll();
		
		
		//다형성 고 !
		Person p = null;
		p = new Student("홍길동",20,202411);
		p = new Teacher("zzz", 21, "heh");
		p = new Employee("zez", 21, 'T');
		// 상위클래스로 선언햇으면 하위 클래스는 아무거나 집어 넣을 수 있다 ~
		
		p.printAll();
		
		Teacher t2 = new Teacher("zz222z", 21, "heh");
		Employee e2 = new Employee("ze222z", 21, 'T');
		Student s2 = new Student("dddd",22,23913);
		
		//toString 오버라이드한 펄슨의 메서드 호출
		System.out.println(t2.toString());
		System.out.println(e2.toString());
		
		//펄슨의 toString 오버라이드한 스튜던트의 메서드 호출
		System.out.println(s2.toString());

	}

}
