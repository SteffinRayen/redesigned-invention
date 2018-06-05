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

	public TransactionArray(TransactionData transactionData) {
		// TODO Auto-generated constructor stub
		this.transactionDataArray[0] = transactionData;
	}

	public TransactionData[] getTransactionDataArray() {
		return transactionDataArray;
	}

	public void setTransactionDataArray(TransactionData[] transactionDataArray) {
		this.transactionDataArray = transactionDataArray;
	}
	
}
