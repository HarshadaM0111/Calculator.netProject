package test.calculators_net;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class footer extends Setup{
	
	@Test
	void links() throws InterruptedException {
		driver.findElement(By.linkText("about us")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("sitemap")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("terms of use")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("privacy policy")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("calculator.net")).click();
		Thread.sleep(2000);
		//driver.navigate().back();
		
		System.out.println("Foter Completed");
	}

}
