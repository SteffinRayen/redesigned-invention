package com.model;

public class AccountData {
	private int account_id;
	private String account_type;
	private float balance;
	
	public AccountData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountData(int account_id, String account_type, float balance) {
		super();
		this.account_id = account_id;
		this.account_type = (account_type.equals("S") || account_type.equals("C"))?
				((account_type.equals("S"))?
						"Savings Account":"Credit Account")
				:"Error";
		this.balance = balance;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = (account_type.equals("S") || account_type.equals("C"))?
				((account_type.equals("S"))?
						"Savings Account":"Credit Account")
				:"Error";
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String displayAll() {
		return this.getAccount_id() + "\t\t" + this.getAccount_type()+ "\t\t" + this.getBalance();
	}
	

}
