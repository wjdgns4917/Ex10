package com.paint3;

public abstract class Paint {
	//부모클래스로 사용
	public void doPaint(String name) {
		System.out.println("회화도구 준비");
		System.out.println(name+"밑그림 작업");
	}
	
	public abstract void drawPic();
}
