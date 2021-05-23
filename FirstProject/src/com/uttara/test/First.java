package com.uttara.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class First {

	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw = new FileWriter("abcs.txt");
		fw.write(100);
		fw.write('\n');
		fw.write(200);
		char[] ch1={'a','b','c','d'};
		
		System.out.println(" ch "+Arrays.toString(ch1));
		fw.write(ch1);
		fw.flush();
		fw.close();
		

	}

}
