package com.swa.oop3;

public class Square extends Shape02{
	private double width;
	private double height;
	
	public void setValues(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		this.area = this.height * this.width;
		return this.area;
	}
}
