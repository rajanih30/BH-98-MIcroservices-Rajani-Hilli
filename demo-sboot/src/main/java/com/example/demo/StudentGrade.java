package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "MYUSERNEW")
@Entity
public class StudentGrade {
	

	private @Id @GeneratedValue long id;
	private String name;
	private long marks;
	StudentGrade() {}
	
	public StudentGrade(long id, String name, long marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentGrade [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentGrade other = (StudentGrade) obj;
		return id == other.id && marks == other.marks && Objects.equals(name, other.name);
	}
	
	public String getGrade()
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
