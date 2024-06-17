package com.ureca.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyException extends Exception {

	public MyException() {
		this("MyException");
	}

	public MyException(String message) {
		super(message);
	}
	
}


public class ExceptionTest {

	public static void main(String[] args) throws MyException /*여기서 예외처리하는건 뭐가 다른건지 정리 필요*/{
		
		System.out.println("start");
		
		try {
			//String s = null; //로컬변수는 초기화 필수 String s; 이건 선언만하는거
			//System.out.println(s.length()); // NullPointerException 임 
			//System.in.read(); // IOException 임
			//int i = 10/0;
			
			//if(true) return; //이래도 파이널리는 실행됨 파이널리는 정상적이든 비정상적이든 리턴되든 무조건 실행됨 단,
			//System.exit(0); //이 경우에만 파이널리 실행안됨 단, 위에서 에러가 걸려서 아래 있는 이 문장이 실행안되고 바로 catch문으로 가면 종료안되니 파이널리가 실행됨
			
			
			//Exception e = new MyException(); //원래 에러가 발생하면 이렇게 예외 객체가 생겨나는 거임
			//throw e;  //하지만 예외 객체가 생겨나기만 해서 catch로 가는 것은 아님, 이렇게 던줘져야함.
			throw new MyException(); // 이렇게 한 문장으로 작성도 가능. 이러면 양치기소년임 실제로 시스템은 아무 문제없는데 내가 임의적으로 에러난 상황이라 하고 예외처리를 하는 것 
			
			//System.out.println("여기는 출력하고 싶다!");
		} catch (NullPointerException e) {   //여기도 다형성 가능, RuntimeException이나 Throwable도 가능 
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("NullPointerException: "+e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: "+e.getMessage());
//		} catch (RuntimeException e) {  //위에서 걸렸으면 아래는 내려오지않음. 따라서 아래가 예외처리의 슈퍼클래스가 와야하고 역순은 아래 하위 클래스 코드들이 의미없는 코드가 됨 
//			System.out.println("RuntimeException: "+e.getMessage());
//		} catch (Exception e) {
//			System.out.println("Exception: "+e.getMessage()); //throw new MyException는 여기에 걸림  MyException가 Exception를 상속받았었기에 
//		} catch (Throwable e) {
//			System.out.println("Throwable: "+e.getMessage());
		} finally { //catch문 뺴고 트라이랑 파이널리만으로 작성해도됨 대신 에러나면 예외처리 안됨 근데 파이널리 몸체 부분은 실행됨
			System.out.println("finally");
		}
		
		//너무 긴 방법 
//		FileInputStream fis = null; //접근 범위 스코프때문에 이렇게 선언 해야됨 final에서 종료시키러면
//		try {
//			fis = new FileInputStream("res/input.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(fis!=null) fis.close(); //fis때문에 널포인트이셉션 발생할 수도 있어서
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//간결한 방법 아래 방법은 fis알아서 close시켜줌
		try(FileInputStream fis = new FileInputStream("res/input.txt")) {
			//...
		} catch(IOException e) {
			e.printStackTrace();
		}

		
		System.out.println("end");

	}

}
