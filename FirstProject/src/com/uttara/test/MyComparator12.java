package com.uttara.test;

import java.util.Comparator;

public class MyComparator12<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		
		
		return s1.compareTo(s2);
	}

}
