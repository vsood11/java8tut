package com.varun.streams;

/**
 * Created by Varun_Sudan on 1/26/2017.
 */
public class Person {

	private String fName;
	private String lName;
	private int age;

	public Person(String lName, String fName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				", age=" + age +
				'}';
	}
}
