package com.java;

public class Access1 {
	private void Student_Name() {
		System.out.println("Mohammed Saqib");

	}
	protected void Blood_group() {
		System.out.println("O Positive");

	}
	public void student_age() {
		System.out.println("27");
		
	}
	void Student_address() {
System.out.println("no 1 xyz chennai");
	}
	public static void main(String[] args) {
		Access1 std = new Access1();
		std.Student_Name();
		std.Blood_group();
		std.student_age();
		std.Student_address();
	}
	
}
