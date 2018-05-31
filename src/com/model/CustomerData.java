package com.model;

public class CustomerData {
	private int customer_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	
	public CustomerData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerData(int customer_id, String first_name, String middle_name, String last_name, String street,
			String city, String state, String zip, String phone, String email) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAll () {
		return this.getCustomer_id() +"\t\t"+ this.getFirst_name()+"\t\t"+ 
				this.getMiddle_name()+"\t\t"+ this.getLast_name()+"\t\t"+ 
				this.getStreet()+"\t\t"+ this.getCity()+"\t\t"+ 
				this.getState()+"\t\t"+ this.getZip()+"\t\t"+ 
				this.getPhone()+"\t\t"+ this.getEmail();
	}
	
}
