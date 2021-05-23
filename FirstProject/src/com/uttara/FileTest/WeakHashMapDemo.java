package com.uttara.FileTest;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t, "mamata");
	     t=null;
	     System.gc();
	     Thread.sleep(5000);
	     System.out.println(m);
	}

}

class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void Finalize()
	{
		System.out.println("Finalize method called");
	}
}
