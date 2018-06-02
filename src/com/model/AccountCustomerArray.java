package com.model;

public class AccountCustomerArray {
	private int account_id;
	private CustomerData[] customerDataArray;
	public AccountCustomerArray() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountCustomerArray(int account_id, CustomerData[] customerDataArray) {
		super();
		this.account_id = account_id;
		this.customerDataArray = customerDataArray;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public CustomerData[] getCustomerDataArray() {
		return customerDataArray;
	}
	public void setCustomerDataArray(CustomerData[] customerDataArray) {
		this.customerDataArray = customerDataArray;
	}
	public String displayAll() {
		String result = "";
		for (int i = 0; i < this.customerDataArray.length; i++) {
			result = result + this.account_id + "\t" + customerDataArray[i].displayAll() +"\n";
		}
		return result ;
	}
	
}
