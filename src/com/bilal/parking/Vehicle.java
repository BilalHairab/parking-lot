package com.bilal.parking;

public class Vehicle {

	String id;
	Size size;
	public Vehicle(String id, Size size) {
		super();
		this.id = id;
		this.size = size;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	
}
