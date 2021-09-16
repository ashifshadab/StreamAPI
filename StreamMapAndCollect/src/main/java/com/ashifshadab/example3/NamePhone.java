package com.ashifshadab.example3;

public class NamePhone {

	String name;
	String phone;
	
	public NamePhone(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "NamePhone [name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
