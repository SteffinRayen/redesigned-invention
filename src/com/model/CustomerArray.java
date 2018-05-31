package com.model;

public class CustomerArray {
	public CustomerData[] customerDataArray;
	

	public CustomerArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerArray(CustomerData[] customerDataArray) {
		super();
		this.customerDataArray = customerDataArray;
	}

	public CustomerData[] getCustomerDataArray() {
		return customerDataArray;
	}

	public void setCustomerDataArray(CustomerData[] customerDataArray) {
		this.customerDataArray = customerDataArray;
	}
	
}
