package com.service;

import com.model.*;
import com.utilities.ConvertListToArray;
import com.logic.*;

public class BankService {
	public CustomerData createCustomer (CustomerData customerData) {
		return CreationDetails.createCustomer(customerData);
	}
	public AccountData createAccount (AccountData accountData) {
		return CreationDetails.createAccount(accountData);
	}
	public TransactionData createTransaction (TransactionData transactionData) {
		return CreationDetails.createTransaction(transactionData);
	}
	public static String createCustomerAccount (int customer_id, int account_id) {
		return CustomerAccount.createCustomerAccountMapping(customer_id, account_id);
	}
	public CustomerData getCustomerDataByID (int customerID) {
		return CustomerDetails.getByID(customerID);
	}
	public CustomerArray getAllCustomerData () {
		return ConvertListToArray.customerDetails(CustomerDetails.getAll());
	}
	public CustomerArray getCustomerDataByFirstName (String first_name) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByFirstName(first_name));
	}
	public CustomerArray getCustomerDataByLastName (String last_name) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByLastName(last_name));
	}
	public CustomerArray getCustomerDataByMiddleName (String middle_name) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByMiddleName(middle_name));
	}
	public CustomerArray getCustomerDataByStreet (String street) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByStreet(street));
	}
	public CustomerArray getCustomerDataByCity (String city) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByCity(city));
	}
	public CustomerArray getCustomerDataByState (String state) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByState(state));
	}
	public CustomerArray getCustomerDataByZip (String zip) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByZip(zip));
	}
	public CustomerArray getCustomerDataByPhone (String phone) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByPhone(phone));
	}
	public CustomerArray getCustomerDataByEmail (String email) {
		return ConvertListToArray.customerDetails(CustomerDetails.getByEmail(email));
	}
	
	public AccountData getAccountDataByID (int accountID) {
		return AccountDetails.getByID(accountID);
	}
	public AccountArray getAllAccountData () {
		return ConvertListToArray.accountDetails(AccountDetails.getAll());
	}
	public AccountArray getAccountDataByType (String account_type) {
		return ConvertListToArray.accountDetails(AccountDetails.getByType(account_type));
	}
	public AccountArray getAccountDataByBalance (float balance) {
		return ConvertListToArray.accountDetails(AccountDetails.getByBalance(balance));
	}
	
	public TransactionData getTransactionDataByID (int transactionID) {
		return TransactionDetails.getByID(transactionID);
	}
	public TransactionArray getAllTransactionData () {
		return ConvertListToArray.transactionDetails(TransactionDetails.getAll());
	}
	public TransactionArray getTransactionDataByAccountID (int account_id) {
		return ConvertListToArray.transactionDetails(TransactionDetails.getByAccountID(account_id));
	}
	public TransactionArray getTransactionDataByTimeStamp (String time_stamp) {
		return ConvertListToArray.transactionDetails(TransactionDetails.getByTimeStamp(time_stamp));
	}
	public TransactionArray getTransactionDataByAmount (float amount) {
		return ConvertListToArray.transactionDetails(TransactionDetails.getByAmount(amount));
	}
	public TransactionArray getTransactionDataByBalance (float balance) {
		return ConvertListToArray.transactionDetails(TransactionDetails.getByBalance(balance));
	}
	public TransactionArray getTransactionDataByDescription (String description) {
		return ConvertListToArray.transactionDetails(TransactionDetails.getByDescription(description));
	}
	public static TransactionData doDeposit (int account_id, float amount) {
		return Transactions.deposit(account_id, amount);
	}
	public static TransactionData doWithdraw(int account_id, float amount) {
		return Transactions.withdraw(account_id, amount);
	}
	public static TransactionArray doFundsTransfer(int fromAccountID, int toAccountID, float amount) {
		return ConvertListToArray.transactionDetails(Transactions.fundsTransfer(fromAccountID, toAccountID, amount));	
	}
	public static AccountCustomerArray getCustomerDetailsByAccountID (int account_id) {
		return CustomerAccount.getCustomerDetailsByAccountID(account_id);
	}
	public static CustomerAccountArray getAccountDetailsByCustomerID (int customer_id) {
		return CustomerAccount.getAccountDetailsByCustomerID(customer_id);
	}
	
	
}