package com.uttara.test;

import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(30);
		System.out.println(t);
		
		
		
		

	}

}
