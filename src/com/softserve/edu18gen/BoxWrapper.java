package com.softserve.edu18gen;

public class BoxWrapper {
	private Box box;

	public BoxWrapper() {
		box = new Box();
	}

	public String get() {
		return (String) box.get(); // Object
	}

	public void set(String obj) {
		box.set(obj);
	}
}