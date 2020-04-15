package com.syntax.class26;

public class TestRegistrationClass {
public static void main (String[] args) {
	
	RegistrationClass register=new RegistrationClass();
	register.setUserName("mahboob");
	System.out.println(register.getUserName());
	register.setEmail("mrdoctor@gmail.com");
	System.out.println(register.getEmail());
	register.setPassword("ch23aract");
	System.out.println(register.getPassword());

}
}
