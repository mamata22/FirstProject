package com.uttara.test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
             System.out.println(i);
			itr.remove();
			
		}
		System.out.println(l);
	}

}
