package com.class26;

public class UserClass {
	
	
	public String name;
	public String mobile;
	
	
	UserClass(String name, String mobile) {
		this.name=name;
		 this.mobile=mobile;	
	}
}


 class UserInfo extends UserClass{
	
	
	public String address;
	
	UserInfo(String name, String mobile, String address){
		super(name, mobile);
		this.address=address;
	}
	
	public void userDetails() {
		System.out.println("User name is "+name+" and phone number is "+mobile+" and the address is "+address);
	}
	


}




