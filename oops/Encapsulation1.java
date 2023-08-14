package com.oops;

public class Encapsulation1 
{
	private int id;
	private String name;
	private String city;
	private long  mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Encapsulation1 [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}
	
	
	
}
