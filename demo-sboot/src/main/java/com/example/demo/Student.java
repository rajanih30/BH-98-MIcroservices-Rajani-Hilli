package com.example.demo;

public class Student
{
	private long marks;
	private String name;
	public Student(long marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
		
	}
	
	public long getmarks() {
		return marks;
	}
	public void Marks(long marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	
	public void Name(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	String getGrade()
	{
		if(marks>= 90 && marks<=100) 
			return name + " got Grade-A";
		
			if(marks>= 80 && marks<=90) 
			return name +  " got Grade-B";
			
			if(marks>= 70 && marks<=80) 
				return name +  " got Grade-C";
				
				if(marks>= 60 && marks<=70) 
					return name +  " got Grade-D";
			
		return name + " is failed";
		}
	}
	
	
	