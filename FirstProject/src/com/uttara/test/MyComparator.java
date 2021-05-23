package com.uttara.test;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {

	
	public int compare(T o1, T o2) {
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		if(I1<I2)
			return -1;
		else if(I1>I2)
			return +1;
		else
			
		
		return 0;
	}
	
	

}
