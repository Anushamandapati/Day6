package com.capgemini.day6.domain;

public class SetTelevision {
	private String company;
	private String type;
	private String threedenabled;
	private int price;
	
	public SetTelevision(String company, String type, String threedenabled, int price) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((threedenabled == null) ? 0 : threedenabled.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetTelevision other = (SetTelevision) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (threedenabled == null) {
			if (other.threedenabled != null)
				return false;
		} else if (!threedenabled.equals(other.threedenabled))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
