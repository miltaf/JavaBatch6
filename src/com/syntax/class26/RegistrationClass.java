package com.syntax.class26;

public class RegistrationClass {

	long account_no;
	String name;
	String email;
	double amount;

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getAmount() {
		return amount;
	}

	public long getAccount_no() {
		return account_no;
	}

}