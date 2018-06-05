package com.utilities;

import com.model.AccountArray;
import com.model.AccountCustomerArray;
import com.model.AccountData;
import com.model.CustomerAccountArray;
import com.model.CustomerAccountMapping;
import com.model.CustomerArray;
import com.model.CustomerData;
import com.model.TransactionArray;
import com.model.TransactionData;

public class ErrorStatus {
	public static AccountData errorAccountData = new AccountData(0,"Error",0);
	public static CustomerData errorCustomerData = new CustomerData(0, "Error", "Error", "Error", "Error", "Error", "Error", "Error", "Error", "Error");
	public static TransactionData errorTransactionData = new TransactionData(0, 0, "Error", 0, 0, "Error");
	
	public static CustomerAccountMapping errorCustomerAccountMapping = new CustomerAccountMapping(0,0,errorCustomerData,errorAccountData);
	
	public static AccountArray errorAccountArray = new AccountArray(errorAccountData);
	public static CustomerArray errorCustomerArray = new CustomerArray(errorCustomerData);
	public static TransactionArray errorTransactionArray = new TransactionArray(errorTransactionData);
	
	public static AccountCustomerArray errorAccountCustomerArray = new AccountCustomerArray(0, errorCustomerArray.customerDataArray);
	public static CustomerAccountArray errorCustomerAccountArray = new CustomerAccountArray(0, errorAccountArray.accountDataArray);
}
