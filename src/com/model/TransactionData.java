package com.model;

public class TransactionData {
	private int transaction_id;
	private int account_id;
	private String date;
	private float amount;
	private float balance;
	private String description;
	
	public TransactionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionData(int transaction_id, int account_id, String date, float amount, float balance,
			String description) {
		super();
		this.transaction_id = transaction_id;
		this.account_id = account_id;
		this.date = date;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String displayAll() {
		return this.getTransaction_id() +"\t\t"+ this.getAccount_id() +"\t\t"+ 
				this.getDate() +"\t\t"+ this.getAmount() +"\t\t"+ this.getBalance() +"\t\t"+ 
				this.getDescription();
	}

}
