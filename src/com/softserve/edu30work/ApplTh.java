package com.softserve.edu30work;

public class ApplTh {
	public static void main(String[] args) {
		DialogTime dt = new DialogTime();
		dt.setVisible(true);
		System.out.println("Appl: Thread ID = " + Thread.currentThread().getId());
	}
}