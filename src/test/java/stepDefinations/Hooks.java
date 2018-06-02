package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobileTest(){
		System.out.println("\n Before mobile test");
	}
	
	@After("@MobileTest")
	public void afterMobileTest(){
		System.out.println("\n After mobile test");
	}
	
	@Before("@RegressionTest")
	public void beforeRegTest(){
		System.out.println("\n Before Regression test");
	}
	
	@After("@RegressionTest")
	public void afterRegTest(){
		System.out.println("\n After Regression test");
	}


}
