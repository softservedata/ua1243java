package com.softserve.edu16inn;

public class AppPerson {
	public static void main(String[] args) {
		/*-
		Person p1 = new Person("Ivan", "Ivanov", 25);
		Person p2 = new Person("Petro", "Petrov", 30);
		System.out.println(p1);
		System.out.println(p2);
		*/
		/*-
		//Person p3 = new Person();
		Person p3 = new Person("Petro", "Petrov", 30);
		System.out.println("1. p3 = " + p3);
		// Person.FullName fn = new Person().new FullName("Ivan", "Ivanov");
		Person.FullName fn = p3.new FullName("Ivan", "Ivanov");
		System.out.println("2. p3 = " + p3);
		System.out.println("fn = " + fn);
		*/
		// /*-
		Person p4 = new Person("Petro", "Petrov", 30);
		System.out.println("p4 = " + p4);
		p4.run();
		System.out.println("p4 = " + p4);
		if (p4.local != null) {
			System.out.println("p4.local = " + p4.local); // p4.local.toString();
		}
		// */
	}
}
