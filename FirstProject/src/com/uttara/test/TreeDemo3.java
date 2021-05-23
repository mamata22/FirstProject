package com.uttara.test;

import java.util.TreeSet;

public class TreeDemo3 {

	public static void main(String[] args) {
		
		
		TreeSet t=new TreeSet(new MyComparator11());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
		
		
		

	}

}
