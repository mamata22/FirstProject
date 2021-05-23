package com.uttara.test;

import java.util.TreeSet;

public class Emp1 {

	public static void main(String[] args) {
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("chiru",50);
		Employee e3=new Employee("kar",150);
		
		TreeSet t= new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		
		/*TreeSet t= new TreeSet(new MyComparator12());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);*/
		

	}

}
