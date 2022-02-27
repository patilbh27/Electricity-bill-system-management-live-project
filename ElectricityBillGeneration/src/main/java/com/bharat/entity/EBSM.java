package com.bharat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EBSM {
	@Id
	private int id;
	private String name;
	private String bill;
	private String address;
	
	public EBSM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EBSM(int id, String name, String bill, String address) {
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
		this.address = address;
	}
	
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
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EBSM [id=" + id + ", name=" + name + ", bill=" + bill + ", address=" + address + "]";
	}
	
}
