package com.hw2.model.vo;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void draw() {

		System.out.println("x 의 값 : " + x);
		System.out.println("y 의 값 : " + y);
	}

}
