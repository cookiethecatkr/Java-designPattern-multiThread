package com.dsm.practice;



public class Main {

	public static void main(String[] args)  {

		System.out.println("Testing Gate");
		Gate gate = new Gate();
		new UserThread(gate,"Alce","Alaska").start();
		new UserThread(gate,"Bobby","Brazil").start();
		new UserThread(gate,"Chris","Canada").start();
	}
}
