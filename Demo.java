package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		List<String>students = new ArrayList<String>();
		students.add("aaa");
		students.add("bbb");
		students.add("ccc");
		students.add("ddd");
		
		System.out.println(students.get(0));
		System.out.println(students);
		
		Set<String>students1 = new HashSet<>();
		students1.add("aaa");
		students1.add("bbb");
		students1.add("ccc");
		students1.add("ddd");
		
		System.out.println(students1);
		
		Iterator<String> itr = students1.iterator();
		String s1 = itr.next();
		String s2 = itr.next();
		String s3 = itr.next();
		String s4 = itr.next();
		
		System.out.println(s1 + s2 + s3 + s4);
	}

}
