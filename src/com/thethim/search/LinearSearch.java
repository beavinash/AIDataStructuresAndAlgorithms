package com.thethim.search;

import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSet data = new DataSet(1000000);
		
		Random rand = new Random();
		
		int search = rand.nextInt(40) + 1000;
		Boolean isFound = false;
		
		for (int i=0; i < data.getSize(); i++) {
			data.numberOfTry++;
			if ( data.data[i] == search) {
				System.out.println("Search found.");
				System.out.println("Number of Tries: " + data.numberOfTry);
				isFound = true;
				break;
			}
		}
		
		if (isFound == false) {
			System.out.println("Number not found");
		}
	}

}
