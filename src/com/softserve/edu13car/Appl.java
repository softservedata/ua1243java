package com.softserve.edu13car;

public class Appl {
	public static void main(String[] args) {
		/*-
		ACar carX6 = new BmwX6();
		carX6.carRides();
		carX6.setMaxSpeed(160);
		if (carX6 instanceof BmwX6) {
			((BmwX6) carX6).lightsShine();
		}
		*/
		// /*-
		ICar carX6mod = new BmwX6mod();
		//ACar carX6mod = new BmwX6mod();
		// carX6mod.maxSpeed = 40;
		//carX6mod.setMaxSpeed(160);
		carX6mod.carRides();
		if (carX6mod instanceof BmwX6) {
			((BmwX6) carX6mod).lightsShine();
		}
		// */
		/*-
		BmwX6 carX6mod2 = new BmwX6mod();
		carX6mod2.carRides();
		carX6mod2.lightsShine();
		*/
	}
}
