package com.two;

public abstract class Trans {
	protected String name;
	protected int cnt;
	protected int dis;
	protected int dan;
	protected int charge;
	public Trans(String name, int cnt, int dis, int dan, int charge) {
		this.name=name;
		this.cnt=cnt;
		this.dis=dis;
		this.dan=dan;
		this.charge=charge;

	}
	public abstract int getCharge();
	@Override
	public String toString() {
		return name+" : "+cnt+" : "+dis+" : "+charge;
	}
}
	
