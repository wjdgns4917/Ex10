package com.two;

public class TransTest {
	public static void main(String[] args) {
//	����ο�:cnt
//	�Ÿ�:dis
//	�ܰ�:dan
//	���:charge
//	�߻�޼ҵ�:getCharge()
		Trans[] trs=new Trans[4];
		trs[0]=new Train("����",200, 100, 200, 20000);
		trs[1]=new Express("����ö",100, 20, 60, 1200);
		trs[2]=new CityBus("�ó�����",30, 15, 80, 1200);
		trs[3]=new Taxi("�ý�",2, 10, 1000, 10000);
		for (int i = 0; i < trs.length; i++) {
			printCharge(trs[i]);
		}
	}
	public static void printCharge(Trans trs) {
		System.out.println("===================");
		System.out.println(trs);
		System.out.println("-------------------");
		System.out.println(trs.getCharge());
	}
}
