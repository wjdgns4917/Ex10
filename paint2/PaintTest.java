package com.paint2;

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {
//		Paint �ر׸� �۾�
//		WaterPaint ��äȭ���� �غ�, ��äȭ ä��, �ϼ�
//		1,2,3�Է� �Էµ� ���� ���� �帣����
//		�ݺ�
		Scanner sc=new Scanner(System.in);
		WaterPaint wp=new WaterPaint();
		OilPaint op=new OilPaint();
		OrientPaint orp=new OrientPaint();
		
		while (true) {
			System.out.println("ȭǳ���� : (1,2,3)");
			int PaintNum=sc.nextInt();
			if (PaintNum==-1) {
				System.out.println("�׸��� ����");
				break;
			}
			switch (PaintNum) {
			case 1:
				wp.doPaint("��äȭ");
//				wp.doWPaint();
				wp.drawPic();
				break;
			case 2:
				op.doPaint("��äȭ");
//				op.doOPaint();
				op.drawPic();
				break;
			case 3:
				orp.doPaint("����ȭ");
//				orp.doOrPaint();
				orp.drawPic();
				break;
			
			default:
				System.out.println("ȭǳ���� ����");
				break;
		
		}
	}
	}
}

