package com.dsm.practice11;

import com.dsm.practice13.Data;

public class Host  {
	private final Helper helper = new Helper(); 
	public Data request(final int count, final char c) {
		System.out.println(" request(" + count + "," + c + ") BEGIN");
		new Thread() { 
			public void run() { 
				helper.handle(count, c); 
			}
		}.start();
		System.out.println(" request(" + count + "," + c + ") END");
	}
}
