package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle[] size = new Circle[2];

		size[0] = new Circle(1, 2, 3);
		size[1] = new Circle(3, 3, 4);

		for (int i = 0; i < size.length; i++) {

			size[i].draw();

		}

		Rectangle[] size1 = new Rectangle[2];

		size1[0] = new Rectangle(-1, -2, 5, 2);
		size1[1] = new Rectangle(-2, 5, 2, 8);

		for (int i = 0; i < size.length; i++) {

			size1[i].draw();
		}

	}

}
