package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebLoginCarLoan() {
		System.out.println("weblloginCarloan");

	}

	@Test(dataProvider = "getData")
	public void MobileSigninCarLoan(String usrname, String password) {
		System.out.println("Mobil Signin");
		System.out.println(usrname);
		System.out.println(password);

	}

//	@BeforeMethod
//	public void beforeevery() {
//		System.out.println("I will execute before every test");
//	}
//
//	@BeforeSuite
//	public void Bfsuite() {
//
//		System.out.println("I am no 1");
//	}
//
////
//	@AfterSuite
//	public void AftSuite() {
//		System.out.println("I am the last 1");
//	}
//
//	@AfterMethod
//	public void Afterevery() {
//		System.out.println("I will execute afetr every test");
//	}

	@Test
	public void APICarLoan() {
		System.out.println("Mobile SignOut");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;

	}

}
