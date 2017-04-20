package com.thethim.search;

import java.util.Random;

public class InterpolationSearch {

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
			
			mid = low + ((high - low) / (data.data[high] - data.data[low])) * (search - data.data[low]);
			
			if (data.data[mid] == search) {
				System.out.println("Number is found after " + data.numberOfTry + " tries.");
				break;
			} if ( data.data[mid] < search ) {
				low = mid + 1;
				
			} if ( data.data[mid] > search) {
				high = mid - 1;
			}
			
			data.numberOfTry++;
		}

	
	}

}
