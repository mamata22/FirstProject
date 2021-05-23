package com.uttara.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("c");
		al.add(100);
		al.add(200);
		al.add('c');
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(2, 'c');
		System.out.println(al);
	    al.get(1);
	    System.out.println(al);
	    
	    LinkedList l1=new LinkedList();
	    l1.add("mamata");
	    l1.add(30);
	    l1.add(null);
	    l1.set(1, "nishy");
	    l1.addFirst("ccc");
	    l1.remove(0);
	    System.out.println(l1);
	    
	    HashSet h=new HashSet();
	    h.add("B");
	    h.add("A");
	    h.add('c');
	    h.add("B");
	    System.out.println(h);
	    
	    LinkedHashSet l2=new LinkedHashSet();
	    l2.add('h');
	    l2.add('A');
	    l2.add("b");
	    l2.add("c");
	    System.out.println(l2);
	    
	    TreeSet t=new TreeSet();//default natural sorting order
	    t.add("A");
	    t.add("B");
	    t.add("D");
	    t.add("c");
	    
	    System.out.println(t);
	    
	   /* TreeSet  t1=new TreeSet();
	    t1.add(new StringBuffer("A"));
	    t1.add(new StringBuffer("B"));
	    System.out.println(t1);//classcast exception only the String and wrapper class will be implimented the comparable interface*/
	    
	    
	    
	   /* System.out.println("A".compareTo("B"));
	    System.out.println("B".compareTo("A"));
	    System.out.println("A".compareTo("A"));//internally the jvm will be the compareTo method */
	    
	    
	    TreeSet t2= new TreeSet();
	    
	    t2.add("B");
	    t2.add("C");
	    t2.add("A");
	    System.out.println(t2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}
