package com.swa.oop3;

public class Triangle extends Shape02{
	private double base;
	private double height;
	
	public void setValues(double base, double height) {
		this.height = height;
		this.base = base;
	}
	
	public double getArea() {
		this.area = (this.height * this.base) / 2;
		return this.area;
	}
}