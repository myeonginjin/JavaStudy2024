package com.ureca.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		
		try (
			FileInputStream fis = new FileInputStream("src/com/ureca/day5/FileCopy.java");   //이렇게 작성하면 final에서 close안해줘도됨 트라이 캐치 벗어나면 알아서 닫아줌
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
				
			FileOutputStream fos = new FileOutputStream("src/com/ureca/day5/FileCopy.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
		){ 
			String line = null;
			while((line= br.readLine()) != null) {
				pw.println(line);
			}
			
			System.out.println("File copy ok!");
		} catch (IOException e) { //FileNotFoundException이랑 IOException이 필요하지만 IOException이 상위 클래스라 이거만 예외처리해주면됨
			e.printStackTrace();
		} 

	}
}
