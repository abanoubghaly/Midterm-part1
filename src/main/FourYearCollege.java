package main;

import org.springframework.beans.factory.annotation.Autowired;

public class FourYearCollege {
	
	private University university;
	
	@Autowired
	private Person president;

	public Person getPresident() {
		return president;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public void setPresident(Person president) {
		this.president = president;
	}
	
	public String getUniversityName() {
		return university.getUniversityName();
	}
	
	public String getPresidentName() {
		return president.getPersonName();
	}



}
