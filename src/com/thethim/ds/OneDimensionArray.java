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
	}

}
