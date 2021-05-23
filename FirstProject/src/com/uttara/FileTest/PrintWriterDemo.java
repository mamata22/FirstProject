package com.uttara.FileTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter out=new PrintWriter(new FileWriter("c:\\xyz.txt"));
		out.write(100);
		out.write(200);
		out.println(true);
		out.print("true");
		out.flush();
		out.close();

	}

}
