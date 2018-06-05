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

	public CustomerArray(CustomerData customerData) {
		// TODO Auto-generated constructor stub
		this.customerDataArray[0] = customerData;
	}

	public CustomerData[] getCustomerDataArray() {
		return customerDataArray;
	}

	public void setCustomerDataArray(CustomerData[] customerDataArray) {
		this.customerDataArray = customerDataArray;
	}
	
}
