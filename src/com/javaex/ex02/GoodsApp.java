package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods cup = new Goods("�ӱ���", 2000);
		
		camera.setName("����");
		camera.setPrice(400000);
		
		camera.showInfo();
		cup.showInfo();
		
	}

}


