package com.service;

import java.util.List;

import com.data.AccountData;
import com.data.CustomerData;
import com.data.TransactionData;
import com.logic.Account;
import com.logic.Customer;
import com.logic.Transaction;
import com.logic.TransactionUpdate;

public class BankWSDL {
	
	public CustomerData getCustomerDetails(int customer_id) {
		return Customer.fetchCustomerDataByID(customer_id);
	}
	
	public List<CustomerData> getAllCustomerDetails() {
		return Customer.fetchAllCustomerData();
	}
	public AccountData getAccountDetails(int account_id) {
		return Account.fetchAccountDataByID(account_id);
	}

	public List<AccountData> getAllAccountDetails() {
		return Account.fetchAllAccountData();
	}
	public TransactionData getTransactionDetails(int transaction_id) {
		return Transaction.fetchTransactionDataByID(transaction_id);
	}

	public List<TransactionData> getAllTransactionDetails() {
		return Transaction.fetchAllTransactionData();
	}
	public TransactionData doDeposit(int account_id, float amount) {
		return TransactionUpdate.deposit(account_id, amount);
	}
	public TransactionData doWithdraw(int account_id, float amount) {
		return TransactionUpdate.withdraw(account_id, amount);
	}
	public List<TransactionData> doFundsTransfer(int fromAccountID, int toAccountID, float amount) {
		return TransactionUpdate.fundsTransfer(fromAccountID,toAccountID, amount);
	}

}
