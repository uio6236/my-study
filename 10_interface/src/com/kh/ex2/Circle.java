package com.kh.ex2;

public class Circle implements Shape{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	@Override
	public double calculateArea() {
		double result = r * r * Math.PI;
		return result;
	}
	
}
