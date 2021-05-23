package com.uttara.FileTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Second {

	
	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("c:\\xyz.txt"));
			   String line =br.readLine();
			   
			   
			  
			while(line!=null)
			   {
				   System.out.println(line);
				   line=br.readLine();
			   }
			   
			    
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		BufferedReader br=null;
		try
		{
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		}
	}
}
		
		
		

	


