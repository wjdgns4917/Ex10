package com.two;

public class CityBus extends Trans{

	public CityBus(String name, int cnt, int dis, int dan, int charge) {
		super(name, cnt, dis, dan, charge);
		
	}

	@Override
	public int getCharge() {
		return cnt*dan;
		
	}

}
