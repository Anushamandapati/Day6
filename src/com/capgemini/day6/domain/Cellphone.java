package com.capgemini.day6.domain;

import java.util.ArrayList;

public class Cellphone
{
	private String company;
	private String model;
	private String description;
	private String operatingsystem;
	private int price;
	public Cellphone()
	{
		super();
	}
	public Cellphone(String company, String model, String description, String operatingsystem, int price) 
	{
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingsystem = operatingsystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingsystem() {
		return operatingsystem;
	}
	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
