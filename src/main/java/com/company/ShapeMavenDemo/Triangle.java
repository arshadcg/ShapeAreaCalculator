package com.company.ShapeMavenDemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component

public class Triangle 
{

	Scanner scan = new Scanner(System.in);
	double side1;
	double side2;
	double side3;
	double area;
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void area()
	{
		System.out.println("Ente the value of side1 of Triangle: ");
		side1 =scan.nextDouble();
		System.out.println("Ente the value of side2 of Triangle: ");
		side2 =scan.nextDouble();
		System.out.println("Ente the value of side3 of Triangle: ");
		side3 =scan.nextDouble();
		double sp = (side1+side2+side3)/2;
		area =  Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
		System.out.println("Area of the Triangle with given sides is: "+ area + " SQM");
		scan.close();
		
	}
}

