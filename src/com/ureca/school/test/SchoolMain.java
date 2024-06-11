package com.ureca.school.test;

import com.ureca.school.Employee;
import com.ureca.school.ManagerImpl;
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
		ManagerImpl m = ManagerImpl.getInstance();
		m.add(new Student("홍길동",20,1202));
		m.add(new Employee("홍길",30,'U'));
		m.add(new Teacher("진학생",40,"wh"));
		m.printAll();
		
		System.out.println();
		Person p3 = m.search("진학생");
		System.out.println(p3);
		
		System.out.println();
		
		p3 = new Student("진학생",77, 244442);
		m.update(p3);
		System.out.println("=====");
		for (Person p : m.search()) p.printAll();
			
		System.out.println();
		m.delete("진학생");
		m.printAll();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		// clone test ! 
		
		
		
		
		
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
