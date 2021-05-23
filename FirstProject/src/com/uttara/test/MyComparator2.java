package com.uttara.test;

import java.util.Comparator;

public class MyComparator2<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		String s1=o1.toString();
		String s2=o1.toString();
		return s1.compareTo(s2);
	}

}
