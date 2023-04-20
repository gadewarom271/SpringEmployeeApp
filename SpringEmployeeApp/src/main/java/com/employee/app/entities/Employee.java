package com.employee.app.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private long  id;
	
	private String fristName;
	
	private String lastName;
	
	private String email;
	
	private int age;

	public Employee() {
		
	}

	public Employee(long id, String fristName, String lastName, String email, int age) {
	
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}
	
	
	
	
	

}
	