package com.utilities;
import java.util.Iterator;
import java.util.List;

import com.model.*;

public class PrintAll {
	
	public static String customer(List<CustomerData> list){
		
		if (list == null) {
			return "No Records to display";
		} else {
			Iterator<CustomerData> i = list.iterator();
			String result = "";
			CustomerData data = null;
			while (i.hasNext()) {
				data = (CustomerData)i.next();
				result = result + data.getAll() + "\n";
			}
			return result;
		}
	}
	public static String account(List<AccountData> list){
		
		if (list == null) {
			return "No Records to display";
		} else {
			Iterator<AccountData> i = list.iterator();
			String result = "";
			AccountData data = null;
			while (i.hasNext()) {
				data = (AccountData)i.next();
				result = result + data.getAll() + "\n";
			}
			return result;
		}
	}
	public static String transaction(List<TransactionData> list){
		
		if (list == null) {
			return "No Records to display";
		} else {
			Iterator<TransactionData> i = list.iterator();
			String result = "";
			TransactionData data = null;
			while (i.hasNext()) {
				data = (TransactionData)i.next();
				result = result + data.getAll() + "\n";
			}
			return result;
		}
	}
}