package com.ureca.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeBook {

	public static void main(String[] args) throws ClassNotFoundException {
		Book b = new Book("123","자바",2000);
		
		List<Book> bl = new ArrayList<>();
		bl.add(new Book("123","데베",2000));
		bl.add(new Book("987","네웤",1900));
		bl.add(new Book("456","네웤",1000));
		
		//객체 쓰기
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/ureca/day5/book.dat"));
				) {
			oos.writeObject(bl);
			
			//oos.flush(); //용도 뭐지?
			
			
			System.out.println("write ok");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//객체 읽기 
		//여기는 UnSerializeBook이라할 수 있음 
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/ureca/day5/book.dat"));
				) {
			//Book b2 = (Book) ois.readObject();  // cast 해줘야함. 안그럼 하라고 뜸
			List<Book> bl2 = (List<Book>) ois.readObject();
			for(Book b2 : bl2) System.out.println(b2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}

}
