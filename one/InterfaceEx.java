package com.one;

interface PhoneInterface{
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{

	Call call=new Call();
	@Override
	public void sendCall() {
//		System.out.println("띠링띠링!!!!!");
		call.tokCall();
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
	}
}
