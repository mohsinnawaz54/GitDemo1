package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
//	@BeforeClass()
//	public void BefClass() {
//		System.out.println("Before executing any methods in class 2");
//	}

//	@AfterClass()
//	public void AftClass() {
//		System.out.println("After executing all the methods in class 2");
//	}
	@Test(groups = { "smoke" })

	public void Ploan() {
		System.out.println("good");
	}

	@BeforeTest

	public void prerequiste() {
		System.out.println("I will execute first");
	}
}
