package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main")
public class AppConfig {
	
	@Bean
	public University truman() 
	{
		return new TrumanState();
	}
	
	@Bean
	public FourYearCollege trumanStateUniversity() 
	{
		FourYearCollege college = new FourYearCollege();
		college.setUniversity(truman());
		return college;
	}
}
