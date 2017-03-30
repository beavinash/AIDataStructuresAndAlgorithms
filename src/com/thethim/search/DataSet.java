package com.thethim.search;

public class DataSet {
	
	int[] data;
	int numberOfTry;

	public DataSet(int size) {
		// TODO Auto-generated constructor stub
		
		data = new int[size];
		
		for (int i = 1; i <= size; i++) {
			data[i-1] = i;
		}
		
		numberOfTry = 0;
	}
	
	public int getSize() {
		return data.length;
	}

}
