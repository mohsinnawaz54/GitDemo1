package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups = { "smoke" })
	public void WebloginHomeLoan() {
		System.out.println("WebloginHome");

	}

	@Test
	@Parameters({ "URL", "APIKey/usrname" })
	public void MobilLoginHomeLoan(String urlcarloan, String key) {
		System.out.println("MobileloginPersonalLoan");
		System.out.println(urlcarloan);
		System.out.println(key);

	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("ApiLoginHome");

	}
}
