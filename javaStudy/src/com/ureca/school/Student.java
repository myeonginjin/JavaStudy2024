package com.ureca.school;


//클래스를 전체를 프라이빗으로 감싸라 -> 그럼 사용이 불가능해
// 그렇기에 정말 최소한만을 공개하는거야 데이터 대부분을 프라이빗으로 감싸고 이 값을 변경 혹은 가져오는 메서드를 만들어서 활용할 수 있도록
// 유지보수를 위함임. 인캡슐레이션이 중요 !  왜냐? 개발자는 프라이빗 영역을 수정하고 새로 개발하면서 유지보수를 용이하도록 함, 애초에 공개되지않는 영역이기에 혼란도 피함 



class AA{
	
}



//final를 써도됨 NON- 이거말고
public non-sealed class Student extends Person  /* ,AA  이건 안됨, 자바는 단일 상속만 가능! 인터페이스는 가능 인터페이스는 다중 상속을 지원하기 위해 만듦 C의 헤더와 같은 원리*/ {
	
	//클래스 변수, 생성자 메서드 등 모두 프라이빗으로 감싸야해
//	public String name = "아무개"; 
//	public int age;
//	public int stuid;
	
	private int stuid;
	
	
	//생성자 메서드
	
	//하지만 이렇게 하면 잘못된 값이 입력되엇는지 확인이 불가
//	public Student(String name, int age, int stuid) {
//		this.name = name;
//		this.age = age;
//		this.stuid = stuid;
//	}

	public Student(String name, int age, int stuid) {
		
		
		//잠만 ! 아래처럼 한다면 부모 클래스 생성자 메소드에 내가 모르는 검사 로직같은게 있을 수도 있다. 그러므로 부모 클래스 세터 메서드를 바로 실행시키기보다는 부모 클래스의 생성자 메서드를 호출한다
		//setName(name);  이거 super.setNmae(name) this.setName(name) 여기까지 세줄 다 됨 단, 만약 setName를 오버라이드했다면 이때 super.setNmae(name)와 this.setName(name)는 다른 메서드를 가르키게됨 !
		//앞에거는 Person의 메서드 뒤에거는 오버라이드한 메서드를 호출함  
		
		//setAge(age);
		super(name,age);
		
		//얘는 학생한테만 잇는거니까 상관 없음 
		setStuid(stuid);
	}
	
	//위 생성자 메서드를 직접 만들시 기본으로 있던 디폴트 생성자는 더이상 기능을 하지 않음 만들어줘야함
	public Student() {
		this.name = "모지리";
		this.age = 29;
		this.stuid = 2222;
	}
	
	//이름은 안 밝히는 사람 용 생성자 오버로딩 ! 상황에 맞춰 적절한 메서드가 호출이되도록 편리하게 오버로딩 ! 중복정리 ! 
//	public Student(String name, int stuid) {
//		setName(name);
//		setAge(99);
//		setStuid(stuid);
//	}// 근데 이렇게 하다보니 생성자 메소드가 늘어날수록 코드가 너무 길어짐 이걸 줄여주자 
	
	public Student(String name, int stuid) {
		this(name,99,stuid); // 이렇게 줄여주기  이때, 다른 생성자 메서드들 다 가능
	}
	
	public Student(String name) {
		this(name, 77, 2391);
	}
	
	public int getStuid() {
		return stuid;
	}
	
	public void setStuid(int stuid) {
		this.stuid = stuid; //이건 로컬변수와 다른 Student의 멤버변수임을 알리기 위해 this를 붙임
	}

	//아무것도 안 붙이면 같는 패키지내에서 사용 가능, 퍼블릭은 ~~ 프라이베이트는 ~~
	
//	public void printAll() {
//		System.out.println(this.name);
//		System.out.println(age);
//		System.out.println(stuid);
//	}
//	
	//부모클래스 메서드를 오버리이딩할경우, 접근자와 타입을 조건에 맞춰 따라야함 
	@Override //이거 붙여주기 없어도되긴 해 이제 그냥 컴파일러한테 알려주는 용도임 이제는 왜냐면 내가 무슨 문제인지 컴파일 이전에 알 수 잇거든  
	public void printAll() {
		
		//이름하고 나이는 부모클래스가 다 가지고 잇어서 부모가 출력해주고 학생은 지만 잇는 학번만 추가 출력
		//System.out.println(name+"\t"+age+"\t"+stuid);
		
		super.printAll();
		System.out.println(stuid);
	}
	
	//Objects의 toString메서드를 오버라이드한 Person의 메서드를 또다시 오버라이드 
	public String toString() {
		return super.toString()+getStuid()+" wow";   //여기 super를 붙여주는 이유는 없으면 this가 디폴트인데 그러면 무한루프가됨 toString 메서드가 본인을 또 호출하니까
	}

}
