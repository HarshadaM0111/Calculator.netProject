package test.calculators_net;

import org.openqa.selenium.By;

public interface BasicOperationsInterface extends DriverInterface{
	
	
	default void numbers() throws InterruptedException {
		// Addition 
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		driver.findElement(By.xpath("//span[text()='+']")).click();
		
		driver.findElement(By.xpath("//span[text()='5']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
//		WebElement result = driver.findElement(By.id("sciOutPut"));
//		String output = result.getText();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		Thread.sleep(2000);
		
		
		// Substraction
		
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();

		driver.findElement(By.xpath("//span[text()='–']")).click();
		
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		// multiplication
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();

		driver.findElement(By.xpath("//span[text()='×']")).click();
		
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		// division
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();

		driver.findElement(By.xpath("//span[text()='/']")).click();
		
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
	}

}