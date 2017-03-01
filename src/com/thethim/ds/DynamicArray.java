package com.thethim.ds;

import java.util.Arrays;

public class DynamicArray<T> { // here <T> is the datatype for Object data
	
	Object[] data;
	
	int size;

	public DynamicArray() {
		// TODO Auto-generated constructor stub
		size = 0;
		data = new Object[1];
	}
	
	public int getSize(){
		return data.length;
	} 
	
	public T get(int index) {
		return (T) data[index];
	}
	
	public void put(T element) { // you can use "Object" by replacing "T"
		checkCapacity(size + 1);
		data[size++] = element;
	}
	
	public void checkCapacity(int minCapacity) {
		int previousCapacity = getSize();
		
		if (minCapacity > previousCapacity) {
			int newCapacity = previousCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			data = Arrays.copyOf(data, newCapacity);
		}
	}

}
