package com.capgemini.day6.domain;

public class Television 
{
	private String company;
	private String type;
	private String threedenabled;
	private int price;
	public Television()
	{
		super();
	}
	public Television(String company, String type, String threedenabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.threedenabled = threedenabled;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getThreedenabled() {
		return threedenabled;
	}
	public void setThreedenabled(String threedenabled) {
		this.threedenabled = threedenabled;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
