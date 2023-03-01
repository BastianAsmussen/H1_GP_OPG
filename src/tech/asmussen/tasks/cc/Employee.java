package tech.asmussen.tasks.cc;

public class Employee {

	private final int age;
	private final int yearsEmployed;
	
	private final boolean isRetired;
	
	public Employee(int age, int yearsEmployed, boolean isRetired) {
		
		this.age = age;
		this.yearsEmployed = yearsEmployed;
		
		this.isRetired = isRetired;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public int getYearsEmployed() {
		
		return yearsEmployed;
	}
	
	public boolean isRetired() {
		
		return isRetired;
	}
}
