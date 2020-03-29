package com.zp.demo.beans;

public class Location {

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	String city;
	String province;
	
	@Override
	public String toString() {
		return "Location [city=" + city + ", province=" + province + "]";
	}
	
	
}