package com.dsm.practice4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>(); 
		new WriterThread(list).start();
		new ReaderThread(list).start();
	}
}
