package com.uttara.test;

import java.util.Comparator;

public class MyComparator1<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		String s1=o1.toString();
		String s2=(String)o2;
		
		
		return s2.compareTo(s1);
	}

}
