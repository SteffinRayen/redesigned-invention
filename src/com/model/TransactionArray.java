package com.model;

public class TransactionArray {
	public TransactionData[] transactionDataArray;
	
	

	public TransactionArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionArray(TransactionData[] transactionDataArray) {
		super();
		this.transactionDataArray = transactionDataArray;
	}

	public TransactionData[] getTransactionDataArray() {
		return transactionDataArray;
	}

	public void setTransactionDataArray(TransactionData[] transactionDataArray) {
		this.transactionDataArray = transactionDataArray;
	}
	
}
