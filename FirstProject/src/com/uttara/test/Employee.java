package com.uttara.test;

public class Employee<T> implements Comparable<T> {
	
	String name;
	int eid;
	
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"..."+eid;
	}

		
	
	@Override
	public int compareTo(T o) {
	int eid1=this.eid;
	Employee e=(Employee)o;
	int eid2=e.eid;
	if(eid1<eid2)
	{
		return +1;
		
	}
	else if(eid1>eid2)
		{
		return -1;
		}
	else
		return 0;
		
	
	}
	


}
