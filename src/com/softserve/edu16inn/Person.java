package com.softserve.edu16inn;

import java.util.Random;

public class Person {

	// private class FullName {
	public class FullName { // Inner Class
		private String firstName;
		private String lastName;

		public FullName() {
			this.firstName = "";
			this.lastName = "";
		}

		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			// age =123;
			// System.out.println("FullName age = " + age);
			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
		}

	}

	// --------------------

	private FullName fullName; // has-a; Composition
	private int age;
	public Object local = null;

	public Person() {
		fullName = new FullName();
		age = 456;
		System.out.println("Constructor: public Person()");
	}

	public Person(String firsName, String lastName, int age) {
		this();
		fullName.firstName = firsName;
		fullName.lastName = lastName;
		this.age = age;
		System.out.println("Constructor: public Person(String " + firsName
				+ ", String " + lastName + ", int " + age + ")");
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}

	public void run() {
		// final int bound = 100;
		int bound = 100;
		//
		class AgeGenerator {
			private String test = "_empty_";

			void setRandomAge() {
				Random random = new Random();
				// age = random.nextInt(100);
				age = random.nextInt(bound);
				//bound = 20; // Compile Error
				//
				local = this;
			}

			void printRandomNumber() {
				System.out.println("Random Age: " + age + " test = " + test);
				System.out.println("Random bound: " + bound + "  fullName.firstName = " + fullName.firstName);
			}

			@Override
			public String toString() {
				return "AgeGenerator{" +
						"test='" + test + "  " + "Random bound: " + bound +
						'}';
			}
		}
		// int bound = 100; // Compile Error
		// bound = 99;
		//
		AgeGenerator ag = new AgeGenerator();
		ag.test = "_Updated_";
		ag.setRandomAge();
		ag.printRandomNumber();
		// bound = 99;
	}
}
