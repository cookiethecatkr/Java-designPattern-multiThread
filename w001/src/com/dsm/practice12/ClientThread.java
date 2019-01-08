package com.dsm.practice12;

import java.util.Random;

public class ClientThread extends Thread {
	
	//private final ExecutorService executorService;    concurrent
	private final Channel channel; 
	private static final Random random = new Random(); 
	public ClientThread(String name, Channel channel) { 
		super(name);
		this.channel=channel;
	}
	
	public void run() { 
		try {
			for (int i = 0; true; i++) {
				Request request = new Request(getName(), i);
				channel.putRequest(request);
				//executorService.execute(request);  concurrent
				Thread.sleep(random.nextInt(1000));
			}
		} catch (InterruptedException e) {
			
		}
	}
}
	
