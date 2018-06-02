package com.model;

public class CustomerAccountArray {
	private int customer_id;
	public AccountData[] accountDataArray;
	public CustomerAccountArray() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerAccountArray(int customer_id, AccountData[] accountDataArray) {
		super();
		this.customer_id = customer_id;
		this.accountDataArray = accountDataArray;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public AccountData[] getAccountDataArray() {
		return accountDataArray;
	}
	public void setAccountDataArray(AccountData[] accountDataArray) {
		this.accountDataArray = accountDataArray;
	}
	public String displayAll() {
		String result = "";
		for (int i = 0; i < this.accountDataArray.length; i++) {
			result = result + this.customer_id + "\t" + accountDataArray[i].displayAll() +"\n";
		}
		return result ;
	}
	
}
