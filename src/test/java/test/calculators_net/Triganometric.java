package test.calculators_net;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Triganometric extends Setup{

	@Test(priority=1)
	void sin() throws InterruptedException {
		// sin 30
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
	}
	
	@Test(priority=2)
	void cos() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		
		driver.findElement(By.xpath("//span[text()='0']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
	}
	@Test(priority = 3)
	void tan() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		
		System.out.println("Trignometric Completed");
	}
}
