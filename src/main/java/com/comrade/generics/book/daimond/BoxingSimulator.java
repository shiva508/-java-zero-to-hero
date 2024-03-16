package com.comrade.generics.book.daimond;


import com.comrade.generics.book.GenericMemoryCell;

public class BoxingSimulator {
	public static void main(String[] args) {
		GenericMemoryCell<Integer> memoryCell = new GenericMemoryCell<>();
		memoryCell.write(408);
		System.out.println(memoryCell.read());

		GenericMemoryCell<String> memoryCellMemory = new GenericMemoryCell<>();
		memoryCellMemory.write("Hello");
		System.out.println(memoryCellMemory.read());
	}
}
