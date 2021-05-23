package com.uttara.test;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<StringBuffer> t= new TreeSet<StringBuffer>(new MyComparator2<Object>());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("k"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
		

	}

}
