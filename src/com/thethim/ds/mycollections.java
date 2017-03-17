package com.thethim.ds;

import java.util.ArrayList;

public class mycollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Developer");
		arrayList.add("iOS");
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.remove(0));
		
		for (String aList : arrayList) {
			System.out.println(aList);
		}
		
		// array for class 
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee("Avi", 22));
		
	}
		
		static class Employee {
			String name;
			int age;
			
			public Employee(String name, int age) {
				this.name = name;
				this.age = age;
			}
		}
	}
