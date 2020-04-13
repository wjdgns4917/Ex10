package com.two;

public class RegularEmployee extends Employee {
	private int bonus;
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus=bonus;
	}
	@Override
	public double getMonthPay() {
//		����/12 + ���ʽ�
		return (pay/(double)12)+bonus;
	}
}
