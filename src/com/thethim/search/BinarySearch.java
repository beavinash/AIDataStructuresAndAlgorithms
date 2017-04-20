package com.thethim.search;

import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSet data = new DataSet(1000000);
		
		Random rand = new Random();
		
		int search = 999999;
		
		Boolean isFound = false;
		
		int low = 0;
		int high = data.getSize() - 1;
		
		int mid = 0;
		
		while (!isFound) {
			
			if (low > high) {
				System.out.println("Number not found!!!");
				break;
			}
			
			mid = low + ((high - low) / 2);
			
			if (data.data[mid] == search) {
				System.out.println("Number is found after " + data.numberOfTry + " tries.");
				break;
			} else if ( data.data[mid] < search ) {
				low = mid + 1;
				
			} else if ( data.data[mid] > search) {
				high = mid - 1;
			}
			
			data.numberOfTry++;
		}

	}

}
