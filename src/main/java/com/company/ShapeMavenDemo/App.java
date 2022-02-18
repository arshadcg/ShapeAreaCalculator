package com.company.ShapeMavenDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.company.ShapeMavenDemo");
    	
    	Shape shape = context.getBean(Shape.class);
    	
    	shape.getShape();
    	
		((ConfigurableApplicationContext)context).close();
		 
    }
}
