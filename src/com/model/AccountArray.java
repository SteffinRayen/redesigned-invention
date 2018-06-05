package com.model;

public class AccountArray {
	public AccountData[] accountDataArray;
	

	public AccountArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountArray(AccountData[] accountDataArray) {
		super();
		this.accountDataArray = accountDataArray;
	}

	public AccountArray(AccountData accountData) {
		// TODO Auto-generated constructor stub
		this.accountDataArray[0] = accountData;
	}

	public AccountData[] getAccountDataArray() {
		return accountDataArray;
	}

	public void setAccountDataArray(AccountData[] accountDataArray) {
		this.accountDataArray = accountDataArray;
	}
	
}
