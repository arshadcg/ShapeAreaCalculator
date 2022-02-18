package com.company.ShapeMavenDemo;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component

public class Rectangle 
	{
		Scanner scan =new Scanner(System.in);
		double side1;
		double side2;
		double area;
		String obj ="Rectangle";
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
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		@Override
		public String toString() {
			return "Rectangle [side1=" + side1 + ", side2=" + side2 + ", area=" + area + "]";
		}
		
		void area()
		{
			System.out.println("Enter the values of " + obj + " Side1: ");
			int side1 = scan.nextInt();
			System.out.println("Enter the values of " + obj +"  Side2: ");
			int side2 = scan.nextInt();
			area = side1*side2;
			System.out.println("Area of given Rectangle: " +area+ " SQM");
			
			scan.close();
		}
	
	}
