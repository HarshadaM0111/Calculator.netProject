package test.calculators_net;

import org.openqa.selenium.By;

public interface InverseTrigonometryInterface extends DriverInterface {

	
	default void arcsin() throws InterruptedException {
		
		// sin Inverse 30
		
//		driver.findElement(By.xpath("//span[@onclick='r(\"asin\")']")).click();
	//	driver.findElement(By.xpath("//span[@class='scifunc' and @onclick='r(\"asin\")']")).click();
		
//		driver.findElement(By.xpath("//span[contains(text(),'sin')]")).click();
		
		driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='.']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		// Sin Inverse 45
		
		driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='.']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
	// sin Inverse 60
		
		driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='.']")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		// Sin Inverse 90
		
		driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		Thread.sleep(3000);
		
	
	}
	

	default void arccos() throws InterruptedException {
		
		// cos Inverse 0
		
				driver.findElement(By.xpath("//span[contains(@onclick,'acos')]")).click();
				driver.findElement(By.xpath("//span[text()='1']")).click();
//				driver.findElement(By.xpath("//span[text()='.']")).click();
//				driver.findElement(By.xpath("//span[text()='5']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
		
	// cos Inverse 30
				
				driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='.']")).click();
				driver.findElement(By.xpath("//span[text()='8']")).click();
				driver.findElement(By.xpath("//span[text()='6']")).click();
				driver.findElement(By.xpath("//span[text()='6']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
		
	// COs Inverse 45
				
				driver.findElement(By.xpath("//span[contains(@onclick,'asin')]")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='.']")).click();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
		// cos Inverse 60
		
		driver.findElement(By.xpath("//span[contains(@onclick,'acos')]")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='.']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		// cos Inverse 90
		
				driver.findElement(By.xpath("//span[contains(@onclick,'acos')]")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				Thread.sleep(3000);
	}
	
default void arctan() throws InterruptedException {
		
		// tan Inverse 0
		
				driver.findElement(By.xpath("//span[contains(@onclick,'atan')]")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
		
	// tan Inverse 30
				
				driver.findElement(By.xpath("//span[contains(@onclick,'atan')]")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				driver.findElement(By.xpath("//span[text()='.']")).click();
				driver.findElement(By.xpath("//span[text()='5']")).click();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				
		// tan Inverse 45
		
		driver.findElement(By.xpath("//span[contains(@onclick,'atan')]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		// tan Inverse 60
		
				driver.findElement(By.xpath("//span[contains(@onclick,'atan')]")).click();
				driver.findElement(By.xpath("//span[text()='1']")).click();
				driver.findElement(By.xpath("//span[text()='.']")).click();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				driver.findElement(By.xpath("//span[text()='3']")).click();
				driver.findElement(By.xpath("//span[text()='2']")).click();
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				
				
				Thread.sleep(3000);
	}
}