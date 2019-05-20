package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver wd1= new ChromeDriver();
		wd1.openBrowser();
		wd1.closeBrowser();
		wd1.maximizeWindow();
		wd1.findElement();
		wd1.execute();
		TakesScreenShot.m1();
		wd1.takesScreenShot();
		wd1.m2();
		System.out.println(TakesScreenShot.fileExtension);
		
		System.out.println();
		
		WebDriver wd2= new FirefoxDriver();
		wd2.openBrowser();
		wd2.closeBrowser();
		wd2.maximizeWindow();
		wd2.findElement();
		wd2.execute();
		TakesScreenShot.m1();
		wd2.takesScreenShot();
		wd2.m2();
		

	}

}
