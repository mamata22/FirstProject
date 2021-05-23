package com.uttara.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("venky");
		l.add("mamata");
		l.add("Ragu");
		l.add("Vikki");
		System.out.println(l);
		
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("venky"))
				itr.add("chinnu");
			else if(s.equals("Ragu"))
				itr.remove();
			
		}
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		

	}

}
