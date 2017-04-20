package com.thethim.sort;

public class BubbleSorting {
	
	static void BubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,15,13,10,16,18,1};
		System.out.println("Before Start");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		
		System.out.println();
		
		BubbleSort(arr);
		
		System.out.println("After Sort"+ "\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		

	}

}
