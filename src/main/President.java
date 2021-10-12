package main;

import org.springframework.stereotype.Component;

@Component
public class President implements Person {

	@Override
	public String getPersonName() {
		return "Dr. Sue Thomas";
	}

}
