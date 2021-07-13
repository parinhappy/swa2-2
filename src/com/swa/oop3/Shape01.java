package com.swa.oop3;

public class Shape01 {
	public static void main(String[] args)
	{
		Shape02 shape;
		
		Square square = new Square();
		shape = square;
		
		square.setValues(7, 11);
		System.out.println("Area = " + shape.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setValues(12, 23);
		shape = triangle;
		System.out.println("Area = " + shape.getArea());
		
		Circle circle = new Circle();
		circle .setValues(5);
		shape = circle;
		System.out.println("Area = " + shape.getArea());
	}
}
