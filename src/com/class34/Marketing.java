package com.class34;

public class Marketing {
//	Create a class called Marketing with fields of employeeName, productName,
//    * and saleAmount. In your Test class have a collection of 10 marketing
//    * employees and print those who achieved more than $3000 in sales.
//    *
	
	private String employeeName;
	private String productName;
	private int saleAmount;
	
	public Marketing(String employeeName, String productName, int saleAmount) {
		super();
		this.employeeName = employeeName;
		this.productName = productName;
		this.saleAmount = saleAmount;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
		
		
	}

	

	public static void main(String[] args) {	

	}

}
