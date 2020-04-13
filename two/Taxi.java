package com.two;

public class Taxi extends Trans {

	public Taxi(String name, int cnt, int dis, int dan, int charge) {
		super(name, cnt, dis, dan, charge);
		
	}

	@Override
	public int getCharge() {
		return dis*dan/cnt;
		
	}

}
