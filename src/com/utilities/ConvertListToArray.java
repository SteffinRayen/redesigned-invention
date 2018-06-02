package com.utilities;

import java.util.List;

import com.model.*;

public class ConvertListToArray {
	public static CustomerArray customerDetails(List<CustomerData> customerList) {
		CustomerData[] customerArray= new CustomerData[customerList.size()];
		customerArray = customerList.toArray(customerArray);
		CustomerArray result = new CustomerArray(customerArray);
		return result;
	}
	public static AccountArray accountDetails(List<AccountData> accountList) {
		AccountData[] accountArray= new AccountData[accountList.size()];
		accountArray = accountList.toArray(accountArray);
		AccountArray result = new AccountArray(accountArray);
		return result;
	}
	public static TransactionArray transactionDetails(List<TransactionData> transactionList) {
		TransactionData[] transactionArray= new TransactionData[transactionList.size()];
		transactionArray = transactionList.toArray(transactionArray);
		TransactionArray result = new TransactionArray(transactionArray);
		return result;
	}
}
