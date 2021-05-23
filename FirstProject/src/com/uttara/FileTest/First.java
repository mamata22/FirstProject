package com.uttara.FileTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class First {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter("c:\\xyz.txt"));
			bw.write('a');
			bw.write(100);
			bw.write('b');
			char[] ch={'a','b','c'};
			bw.write(ch);
			System.out.println(ch);
			bw.newLine();
			bw.write("software solution");
			bw.flush();
			bw.close();
			
			
			
			
		} catch (IOException e) 
		{
		
			e.printStackTrace();
		}
		

	}

}
