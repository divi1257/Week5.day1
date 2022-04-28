package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testcase.BaseLead;

public class CreateLead extends BaseLead {
@Test
	public  void runCreateLead() throws InterruptedException {
		
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		Thread.sleep(3000);
}
}






