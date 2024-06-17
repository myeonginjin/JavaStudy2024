package com.ureca.school.test;

import com.ureca.school.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		
		Student s = new Student("홍길동",20,200);
//		s.name = "홍길동";
//		s.age = 20;
//		s.stuid = 202402;
		
		//세터를 통해 설정해주기 
		
//		s.setAge(22, s);
//		s.setName("홍길순", s);
		s.setStuid(202493);
		
		Student s2 = new Student("홍순아", 20009);
		s2.printAll();
		
		
		Student s3 = new Student("test");
		s3.printAll();

		
		
		//아래 코드는 너무 비효율적 출력할 인원이 늘어날 수록 코드가 길어지게됨, 그래서 출력 메서드를 하나 만들어줘야함
//		System.out.println(s.name);
//		System.out.println(s.age);
//		System.out.println(s.stuid);
		
		//이렇게
		s.printAll();
		
	}

}
