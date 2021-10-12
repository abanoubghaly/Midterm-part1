package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		FourYearCollege truman = context.getBean("trumanStateUniversity", FourYearCollege.class);
		
		System.out.println("University: " + truman.getUniversityName());
		System.out.println("President:" + truman.getPresidentName());
		
		context.close();
	}

}
