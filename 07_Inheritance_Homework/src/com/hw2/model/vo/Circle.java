package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		radius = 0;

	}

	public int getRadius() {
		return radius;
	}

	public void setRaduis(int raduis) {
		this.radius = raduis;
	}

	public void draw() {
		super.draw();
		System.out.println("면적 : " + ((Math.PI) * radius * radius));
		System.out.println("둘레 : " + ((Math.PI) * radius * 2));
	}
}
