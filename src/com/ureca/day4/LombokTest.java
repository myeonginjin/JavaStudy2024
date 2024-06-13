package com.ureca.day4;

import lombok.*;

@Setter //여기 태그를 뭘 걸어주냐에 따라서 생성자 메소드를 자동으로 만들어줌 package Expoler에서 확인해보기 p.512 다양한 태그
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
class Member {
	private String id;
	private String name;
	private int age;
	
}

public class LombokTest {
	public static void main(String[] args) {
		Member m1 = new Member("winter","눈송이",25);
		System.out.println(m1);
		System.out.println(m1.toString());
		System.out.println();
		
		Member m2 = Member.builder()
						  .id("winter")
						  .name("눈송이")
						  .age(25)
						  .build();
		System.out.println(m2);
		System.out.println(m2.toString());
	}

}
