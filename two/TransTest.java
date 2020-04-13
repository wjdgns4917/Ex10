package com.two;

public class TransTest {
	public static void main(String[] args) {
//	사람인원:cnt
//	거리:dis
//	단가:dan
//	요금:charge
//	추상메소드:getCharge()
		Trans[] trs=new Trans[4];
		trs[0]=new Train("기차",200, 100, 200, 20000);
		trs[1]=new Express("지하철",100, 20, 60, 1200);
		trs[2]=new CityBus("시내버스",30, 15, 80, 1200);
		trs[3]=new Taxi("택시",2, 10, 1000, 10000);
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
