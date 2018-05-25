package com.service;

import java.util.List;

import com.data.AccountData;
import com.data.CustomerData;
import com.data.TransactionData;
import com.logic.Account;
import com.logic.Customer;
import com.logic.Transaction;

public class Bank {
	public CustomerData getCustomerDataByID (int customerID) {
		return Customer.fetchCustomerDataByID(customerID);
	}
	public List<CustomerData> getAllCustomerData () {
		return Customer.fetchAllCustomerData();
	}
	
	public AccountData getAccountDataByID (int accountID) {
		return Account.fetchAccountDataByID(accountID);
	}
	public List<AccountData> getAllAccountData() {
		return Account.fetchAllAccountData();
	}
	public TransactionData getTransactionDataByID (int transactionID) {
		return Transaction.fetchTransactionDataByID(transactionID);
	}
	public List<TransactionData> getAllTransactionData () {
		return Transaction.fetchAllTransactionData();
	}
	
}
