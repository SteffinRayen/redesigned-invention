package com.service;

import java.util.List;

import com.data.AccountArray;
import com.data.AccountData;
import com.data.CustomerArray;
import com.data.CustomerData;
import com.data.TransactionArray;
import com.data.TransactionData;
import com.logic.Account;
import com.logic.Customer;
import com.logic.Transaction;
import com.logic.TransactionUpdate;

public class Bank {
	public CustomerData getCustomerDataByID (int customerID) {
		return Customer.fetchCustomerDataByID(customerID);
	}
	public CustomerArray getAllCustomerData () {
		List<CustomerData> data= Customer.fetchAllCustomerData();
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	
	public AccountData getAccountDataByID (int accountID) {
		return Account.fetchAccountDataByID(accountID);
	}
	public AccountArray getAllAccountData() {
		List<AccountData> data= Account.fetchAllAccountData();
		AccountData[] dataArray= new AccountData[data.size()];
		dataArray = data.toArray(dataArray);
		AccountArray result = new AccountArray(dataArray);
		return result;
	}
	public TransactionData getTransactionDataByID (int transactionID) {
		return Transaction.fetchTransactionDataByID(transactionID);
	}
	public TransactionArray getAllTransactionData () {
		List<TransactionData> data= Transaction.fetchAllTransactionData();
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionData doDeposit(int accountID, float amount) {
		return TransactionUpdate.deposit(accountID, amount);
	}
	public TransactionData doWithdraw (int account_id, float amount) {
		return TransactionUpdate.withdraw(account_id, amount);
	}
	public TransactionArray fundsTransfer (int fromAccountID, int toAccountID, float amount) {
		List<TransactionData> data= TransactionUpdate.fundsTransfer(fromAccountID, toAccountID, amount);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	
}
