package com.uttara.test;

import java.util.TreeSet;

public class TreeDemo1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Roja");
		t.add("Kiran");
		t.add("Ragu");
		t.add("Radha");
		System.out.println(t);

	}

}
