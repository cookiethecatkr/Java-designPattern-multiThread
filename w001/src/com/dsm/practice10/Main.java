package com.dsm.practice10;

public class Main {
	public static void main(String[] args) {
		Data data = new Data(10); 
		new ReaderThread(data).start(); 
		new ReaderThread(data).start(); 
		new ReaderThread(data).start(); 
		new ReaderThread(data).start(); 
		new ReaderThread(data).start(); 
		new ReaderThread(data).start(); 
		new WriterThread(data, "ABCDEFGHIJKLMNOPQRTSTUVWXYZ").start();
		new WriterThread(data, "abcdefghijklmnopqrstuvwxyz").start(); 
	}
}
