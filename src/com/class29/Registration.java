package com.class29;

public class Registration {
	
//	 Create Registration Class in which you would have variables as 
//	email, userName and password that have an access scope only within its own class. 
//	After creating an object of the class user should be able to call methods and in each method separately 
//	pass values to set users email, username and password.
//	Requirements:
//	Valid email consider to be only gmail
//	Valid userName and password cannot be empty and should be of length larger than 6 characters.
//	Also valid password cannot contain userName. 
	
	
	private String email;
	private String userName;
	private String password;
	
	
	public void setEmail(String email) {
		if(email.contains("gmail")) {
			
			this.email=email;
		}else {
			System.out.println("Please only provide gmail");
		}
	}
		public void setUserName(String userName) {
		if ((!userName.isEmpty())) {
			if (userName.length()>6) {
				this.userName=userName;
			} else {
				System.out.println("User name should be more than 6 characters");
			}
		}else {
			System.out.println("User name cannot be empty");
		}
		}
		
		public void setPassword(String password) {
			if ((!password.isEmpty())) {
				if  (password.length()>6) {
					if (!password.contains(userName)) {
						this.password=password;
					}else {
						System.out.println("Password cannot have user name");
					}
				}else {
					System.out.println("password should be more than 6 characters");
				}
			}else {
					System.out.println("Password cannot be empty");
				}
			}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
