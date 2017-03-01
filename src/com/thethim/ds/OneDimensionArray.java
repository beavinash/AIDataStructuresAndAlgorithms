package com.thethim.ds;

public class OneDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomNumbers = new int[5];
		
		randomNumbers[0] = 10;
		randomNumbers[1] = 1;
		randomNumbers[2] = 100;
		randomNumbers[3] = 120;
		randomNumbers[4] = 19;
		
		System.out.println("The sum of numbers in an array: ");
		
		int sum = 0;
		for (int i=0; i < randomNumbers.length; i++) {
			sum += randomNumbers[i];
		}
		System.out.println(sum);
		System.out.println("\n");
		
		// array of objects
		Student[] students = new Student[3];
		
		students[0] = new Student("Avinash", 24);
		students[1] = new Student("Avinash", 24);
		students[2] = new Student("Avinash", 24);
		// students[3] = new Student("Avinash", 24);
		
//		for (int i=0; i < students.length; i++) {
//			System.out.println("Name: " + students[i].name + " " + "Age: " + students[i].age);
//		}
		
		for (Student student : students) {
			System.out.println("Name: " + student.name + " " + "Age: " + student.age);
		}
	}

}
