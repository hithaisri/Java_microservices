package com.cts.project7.entity;

public class Customer {

	private String name;
	
	private long accountNumber;
	
	private long balance;
	
	

	public Customer(String name, long accountNumber, long balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
