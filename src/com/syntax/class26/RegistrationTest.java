package com.syntax.class26;

public class RegistrationTest {

	public static void main (String[] args){

		RegistrationClass acc=new RegistrationClass();
		acc.setAccount_no(7560504000);
		System.out.print(acc.getAccount_no()+" ");

		acc.setName("Sumair");
		System.out.print(acc.getName()+" ");

		acc.setEmail("sumair@syntax.com");
		System.out.print(acc.getEmail()+" ");

		acc.setAmount(500000.0);
		System.out.print(acc.getAmount()+" ");
		}
		}