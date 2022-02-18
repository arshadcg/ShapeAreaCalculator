package com.company.ShapeMavenDemo;

import java.util.Scanner;


import org.springframework.stereotype.Component;
@Component
public class Circle {
	/*
	 * double diameter; double area;
	 */
	final String SQM="";
	
	
	public void area()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of diameter of circle in MTS: ");
		double diameter= scan.nextDouble(); 
		
		double area;
		
		area = Math.PI*diameter;
		
		System.out.println("Area of Circle is: " + (double) (Math.round(area*100))/100+ " SQM");
		
		scan.close();
		}
}