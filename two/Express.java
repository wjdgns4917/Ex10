package com.two;

public class Express extends Trans {

	public Express(String name, int cnt, int dis, int dan, int charge) {
		super(name, cnt, dis, dan, charge);
		
	}

	@Override
	public int getCharge() {
		return cnt*dan;
		
	}

}
