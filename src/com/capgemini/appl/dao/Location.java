package com.capgemini.appl.dao;

public class Location {
	String locationid;
	String city;
	String hstate;
	String zip;
	public Location(String locationID, String city, String hstate, String zip) {
		super();
		locationid = locationID;
		this.city = city;
		this.hstate = hstate;
		this.zip = zip;
	}
	public String getLocationID() {
		return locationid;
	}
	public void setLocationID(String locationID) {
		locationid = locationID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHstate() {
		return hstate;
	}
	public void setHstate(String hstate) {
		this.hstate = hstate;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Location [LocationID=" + locationid + ", city=" + city
				+ ", hstate=" + hstate + ", zip=" + zip + "]";
	}
	

}
