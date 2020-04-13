package com.two;

public class ParttimeEmployee extends Employee {

	private int workDay;
	public ParttimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay=workDay;
		
	}

	@Override
	public double getMonthPay() {
		return pay*workDay;
	}

}
