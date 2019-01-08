package com.dsm.practice;

public class HelloWorld {
	private int money;
	private String name;
	
	public HelloWorld(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public synchronized void deposit (int m) {
		money +=m; 
	}
	
	public synchronized boolean withdraw(int m) {
		if (money >= m) {
			money -=m;
			return true; 
		}else {
			return false; 
		}
	}	
	public String getName() {
		
			return name;
		}
} 