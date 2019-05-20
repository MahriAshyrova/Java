package com.class30;

//A university department consists of professors and secretaries. 
//Each professor and each secretary has a name, a salary, and a hire date. 
//Use inheritance and polymorphism to create an application that represents 
//the department and its professors and secretaries as objects, and provides a test class that
//creates 3 professors and 2 secretaries, and then outputs the combined total of all of their salaries.


public abstract class Department {

	private String name;
	private String address;
	private int salary;
	private String vehicleType; 
	private String hireDate;
	private String tellNum;
	
	
	Department(String name, String address, int salary, String vehicleType, String hireDate, String tellNum) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.vehicleType = vehicleType;
        this.hireDate = hireDate;
        this.tellNum = tellNum;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getHireDate() {
		return hireDate;
	}


	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}


	public String getTellNum() {
		return tellNum;
	}


	public void setTellNum(String tellNum) {
		this.tellNum = tellNum;
	}
//	abstract String getVehicleType();
//	abstract String getName();
//	abstract String getAddress();
//	abstract String  getTellNum();
//	abstract int getSalary();		
}
 
 class Professor extends Department{
	 
	 public Professor (String name, String address, int salary, String vehicleType, String hireDate, String tellNum) {
	        super(name, address, salary, vehicleType, hireDate, tellNum);
	    }
	 
	@Override
	public String getVehicleType() {
		return super.getVehicleType();
	}

	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public String getAddress() {
		return super.getAddress();
	}
	@Override
	public String getTellNum() {
		return super.getTellNum();
	}
	@Override
	public int getSalary() {
		return super.getSalary();
	} 
 }
 
 class Secretary extends Department {
	 
	 public Secretary (String name, String address, int salary, String vehicleType, String hireDate, String tellNum) {
	        super(name, address, salary, vehicleType, hireDate, tellNum);
	    }
	 
	 @Override
		public String getVehicleType() {
			return super.getVehicleType();
		}

		@Override
		public String getName() {
			return super.getName();
		}
		@Override
		public String getAddress() {
			return super.getAddress();
		}
		@Override
		public String getTellNum() {
			return super.getTellNum();
		}
		@Override
		public int getSalary() {
			return super.getSalary();
		} 
	 }
	 