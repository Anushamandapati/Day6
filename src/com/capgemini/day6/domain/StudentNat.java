package com.capgemini.day6.domain;

public class StudentNat implements Comparable<StudentNat>
{
	private String name;
	private int rollno;
	public StudentNat()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentNat(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "StudentNat [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int compareTo(StudentNat arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}
	
}
