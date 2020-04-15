package com.syntax.class21;
/* Write program: userClass  that has a constructor 
 * that initializes instance variable name and mobile number. 
 * Create a subclass  userInfo that will have 
 * user address variable and it also being initialized 
 * through constructor call. 
 * Print users name, mobile number and address in 
 * userDetails method. Test your code.
 */

public class userClass {
String name;
int mobileNumber;

public userClass(String name, int mobileNumber) {
	this.name=name;
	this.mobileNumber=mobileNumber;
}
}

class userInfo extends userClass {
	String address;
	public void display() {
		System.out.println(this.address);
	}
		public userInfo (String name, int mobileNumber) {
			super(name, mobileNumber);
			this.address = address;
		
	}

}
class Test{
	public static void mmain (String[] args) {
		userInfo test = new userInfo();
		test.display();
		super.name();
		
	}
}
}