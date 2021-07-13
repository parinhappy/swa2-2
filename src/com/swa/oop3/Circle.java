package com.swa.oop3;

public class Circle extends Shape02{
	private double radius;
	
	public void setValues(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
		return this.area;
	}
}