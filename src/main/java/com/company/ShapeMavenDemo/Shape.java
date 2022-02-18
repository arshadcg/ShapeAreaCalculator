package com.company.ShapeMavenDemo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shape 
{
	@Autowired
	private Triangle triangle;
	@Autowired
	private Circle circle;
	@Autowired
	private Rectangle rectangle;
	@Autowired
	private Square square;
	
	public Triangle getTriangle() {
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public Circle getCircle() {
		
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
	@Override
	public String toString() {
		return "Shape [triangle=" + triangle + ", circle=" + circle + ", rectangle=" + rectangle + ", square=" + square
				+ "]";
	}
	
	public void getShape()
	{
		System.out.println("Select any one to calculate Area of the following shape");
		System.out.print("Enter 1 for Circle\n"
				+ "Enter 2 for Rectangle\n"
				+ "Enter 3 for Square\n"
				+ "Enter 4 for Triangle\n"
				+ "Your Input: ");
		Scanner scan = new Scanner(System.in);
		for(int i=1;i>0;i++)
		{
		i =scan.nextInt();
		if(i==1)
		{
		
		circle.area();
		}
		else if(i==2)
		{
		rectangle.area();
	
		}
		else if(i==3)
		{
		square.area();	
		}
		else if(i==4)
		{
			triangle.area();
		}
		
		else
		{
			System.out.println("Enter correct Value:");
			continue;
			}
		break;
		}
		scan.close();
		
	} 
}