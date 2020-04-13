package com.two;

public class RegularEmployee extends Employee {
	private int bonus;
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus=bonus;
	}
	@Override
	public double getMonthPay() {
//		¿¬ºÀ/12 + º¸³Ê½º
		return (pay/(double)12)+bonus;
	}
}
