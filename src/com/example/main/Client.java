package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	public static void main(String[] args)
	{
		/*
		MathCheat mathCheat = new MathCheat();
		Student student = new Student();
		student.setMathcheat(mathCheat); 
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("File is getting loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent" , AnotherStudent.class);
		anotherStudent.startCheating();
	}
}
