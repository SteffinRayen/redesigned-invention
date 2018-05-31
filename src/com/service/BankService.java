package com.service;

import com.model.*;
import java.util.List;
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

	public CustomerData getCustomerDataByID (int customerID) {
		return CustomerDetails.getByID(customerID);
	}
	public CustomerArray getAllCustomerData () {
		List<CustomerData> data= CustomerDetails.getAll();
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByFirstName (String first_name) {
		List<CustomerData> data= CustomerDetails.getByFirstName(first_name);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByLastName (String last_name) {
		List<CustomerData> data= CustomerDetails.getByLastName(last_name);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByMiddleName (String middle_name) {
		List<CustomerData> data= CustomerDetails.getByMiddleName(middle_name);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByStreet (String street) {
		List<CustomerData> data= CustomerDetails.getByStreet(street);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByCity (String city) {
		List<CustomerData> data= CustomerDetails.getByCity(city);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByState (String state) {
		List<CustomerData> data= CustomerDetails.getByState(state);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByZip (String zip) {
		List<CustomerData> data= CustomerDetails.getByZip(zip);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByPhone (String phone) {
		List<CustomerData> data= CustomerDetails.getByPhone(phone);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	public CustomerArray getCustomerDataByEmail (String email) {
		List<CustomerData> data= CustomerDetails.getByEmail(email);
		CustomerData[] dataArray= new CustomerData[data.size()];
		dataArray = data.toArray(dataArray);
		CustomerArray result = new CustomerArray(dataArray);
		return result;
	}
	
	public AccountData getAccountDataByID (int accountID) {
		return AccountDetails.getByID(accountID);
	}
	public AccountArray getAllAccountData () {
		List<AccountData> data= AccountDetails.getAll();
		AccountData[] dataArray= new AccountData[data.size()];
		dataArray = data.toArray(dataArray);
		AccountArray result = new AccountArray(dataArray);
		return result;
	}
	public AccountArray getAccountDataByType (String account_type) {
		List<AccountData> data= AccountDetails.getByType(account_type);
		AccountData[] dataArray= new AccountData[data.size()];
		dataArray = data.toArray(dataArray);
		AccountArray result = new AccountArray(dataArray);
		return result;
	}
	public AccountArray getAccountDataByBalance (float balance) {
		List<AccountData> data= AccountDetails.getByBalance(balance);
		AccountData[] dataArray= new AccountData[data.size()];
		dataArray = data.toArray(dataArray);
		AccountArray result = new AccountArray(dataArray);
		return result;
	}
	
	public TransactionData getTransactionDataByID (int transactionID) {
		return TransactionDetails.getByID(transactionID);
	}
	public TransactionArray getAllTransactionData () {
		List<TransactionData> data= TransactionDetails.getAll();
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionArray getByAccountID (int account_id) {
		List<TransactionData> data= TransactionDetails.getByAccountID(account_id);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionArray getByTimeStamp (String time_stamp) {
		List<TransactionData> data= TransactionDetails.getByTimeStamp(time_stamp);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionArray getByAmount (float amount) {
		List<TransactionData> data= TransactionDetails.getByAmount(amount);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionArray getByBalance (float balance) {
		List<TransactionData> data= TransactionDetails.getByBalance(balance);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public TransactionArray getByDescription (String description) {
		List<TransactionData> data= TransactionDetails.getByDescription(description);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
	}
	public static TransactionData doDeposit (int account_id, float amount) {
		return Transactions.deposit(account_id, amount);
	}
	public static TransactionData doWithdraw(int account_id, float amount) {
		return Transactions.withdraw(account_id, amount);
	}
	public static TransactionArray doFundsTransfer(int fromAccountID, int toAccountID, float amount) {
		List<TransactionData> data = Transactions.fundsTransfer(fromAccountID, toAccountID, amount);
		TransactionData[] dataArray= new TransactionData[data.size()];
		dataArray = data.toArray(dataArray);
		TransactionArray result = new TransactionArray(dataArray);
		return result;
		
	}
	
}