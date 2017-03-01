package com.thethim.ds;

public class DynamicArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray<Integer> dArray = new DynamicArray<Integer>();
		dArray.put(11);
		System.out.println(dArray.getSize());
		dArray.put(12);
		System.out.println(dArray.getSize());
		dArray.put(13);
		System.out.println(dArray.getSize());
		dArray.put(14);
		System.out.println(dArray.getSize());
		dArray.put(12);
		System.out.println(dArray.getSize());
		
		System.out.println("\n");
		
		for (int i = 0; i < dArray.getSize(); i++) {
			System.out.println(dArray.get(i));
		}
	}
	
	

}
