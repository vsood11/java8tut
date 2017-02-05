package com.varun.streams;

/**
 * Created by Varun_Sudan on 1/26/2017.
 */
public class PersonName {

	private String fullName;

	public PersonName(String fName, String lName) {
		this.fullName = fName + " " + lName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "PersonName{" +
				"fullName='" + fullName + '\'' +
				'}';
	}
}
