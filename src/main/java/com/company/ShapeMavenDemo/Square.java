package com.company.ShapeMavenDemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Square 
{
	Scanner scan = new Scanner(System.in);	
	double side;
	double area;
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void area()
	
	{
		System.out.println("Enter the value of side: ");
		side = scan.nextDouble();
		area = side*side;
		System.out.println("Area of square of given side is:" +area );
		scan.close();
	}
	
}
