package com.thethim.ds;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] dataArray = new int[3][3];
		
		dataArray[0][0] = 1;
		dataArray[0][1] = 2;
		dataArray[0][2] = 5;
		
		dataArray[1][0] = 12;
		dataArray[1][1] = 2;
		dataArray[1][2] = 54;
		
		dataArray[2][0] = 11;
		dataArray[2][1] = 2;
		dataArray[2][2] = 5;
		
		for (int i = 0; i < dataArray.length; i++) {
			for (int j = 0; j < dataArray.length; j++) {
				System.out.println(dataArray[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("Printing diagnol elements");
		
		for (int i = 0; i < dataArray.length; i++) {
			for (int j = 0; j < dataArray.length; j++) {
				if (i == j) {
					System.out.println(dataArray[i][j]);
				}
			}
			
		}
		
		System.out.println("\n");
		System.out.println("Printing upper elements");
		
		for (int i = 0; i < dataArray.length; i++) {
			for (int j = 0; j < dataArray.length; j++) {
				if ( j > i ) {
					System.out.println(dataArray[i][j] );
				}
			}
		}

	}

}
