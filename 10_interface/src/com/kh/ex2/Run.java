package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(3, 4);
		for (Shape s : shape) {
			if (s instanceof Circle) {
				System.out.printf("원의 넓이 : %.2f\n", s.calculateArea());
			} else if (s instanceof Rectangle) {
				System.out.printf("사각형의 넓이 : %.2f\n", s.calculateArea());
			}
		}
	}
}
