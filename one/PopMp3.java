package com.one;

public class PopMp3 implements MyMp3 {

	@Override
	public void playMp3() {
		System.out.println("PopMp3 ����");
		
	}

	@Override
	public void listenFm() {
		System.out.println("Fm����");
		
	}

	@Override
	public void viewPhoto() {
		System.out.println("Image View ����");
		
	}
	public static void main(String[] args) {
		PopMp3 pm=new PopMp3();
		pm.playMp3();
		pm.listenFm();
		pm.viewPhoto();
	}
}
