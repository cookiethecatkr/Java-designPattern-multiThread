package com.dsm.practice12;

public class Main {
	public static void main(String[] args) {
		
		//ExcutorService excutorService = Executors.newFixedThreadPool(5);   concurrent
		
		Channel channel = new Channel(5); // the number of worker threads
		channel.startWorkers();
		new ClientThread("Alice", channel).start(); 
		new ClientThread("Bobby", channel).start(); 
		new ClientThread("Chris", channel).start(); 
	}
}


