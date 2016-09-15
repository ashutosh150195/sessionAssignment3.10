package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a student result processing system.
public class Student {
	
	private static BufferedReader br ;
	private static Student[] student = new Student[3];
	private String name , marks ;
	
	public Student(String name, String marks, int i) {
		// TODO Auto-generated constructor stub
		this.marks = (Integer.parseInt(marks) >= 40 ? passDisplay() : failDisplay());
		this.name = name;
	}

	private String failDisplay() {
		// TODO Auto-generated method stub
		return "fail";
	}

	private String passDisplay() {
		// TODO Auto-generated method stub
		return "pass";
	}

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String name , marks ;
		System.out.println("Enter the details : ");
		for (int i = 0; i < student.length; i++) {
			System.out.print("Enter Name : ");
			name = br.readLine();
			System.out.print("Enter Marks : ");
			marks = br.readLine();
			
			student[i] = new Student(name , marks , i);
		}
		
		System.out.println("Display result : ");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + " "+ student[i].marks);
		}
	}
}
