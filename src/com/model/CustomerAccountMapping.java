package com.model;

public class CustomerAccountMapping {
	private int customer_id;
	private int account_id;
	private CustomerData customerData;
	private AccountData accountData;
	public CustomerAccountMapping(int customer_id, int account_id, CustomerData customerData, AccountData accountData) {
		super();
		this.customer_id = customer_id;
		this.account_id = account_id;
		this.customerData = customerData;
		this.accountData = accountData;
	}
	public CustomerAccountMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public CustomerData getCusomterData() {
		return customerData;
	}
	public void setCusomterData(CustomerData customerData) {
		this.customerData = customerData;
	}
	public AccountData getAccountData() {
		return accountData;
	}
	public void setAccountData(AccountData accountData) {
		this.accountData = accountData;
	}
	
	
	

}
