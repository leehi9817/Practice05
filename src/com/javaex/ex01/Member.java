package com.javaex.ex01;

public class Member {

	//�ʵ�
	private String id;
	private String name;
	private int point;
	
	//������
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	//�޼ҵ� - g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//�޼ҵ� - �Ϲ�
	public void showInfo() {
		System.out.println("ȸ������: " + name + "(" + id + "), " + point + "��");
	}
	
}
