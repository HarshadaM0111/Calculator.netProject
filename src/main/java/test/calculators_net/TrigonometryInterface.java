package test.calculators_net;

import org.openqa.selenium.By;

public interface TrigonometryInterface extends DriverInterface {


	default void sin() throws InterruptedException {
		// sin 0

				driver.findElement(By.xpath("//span[text()='sin']")).click();
				
				driver.findElement(By.xpath("//span[text()='0']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				// sin 30
				driver.findElement(By.xpath("//span[text()='sin']")).click();
				driver.findElement(By.xpath("//span[text()='3']")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				
				// sin 45
				driver.findElement(By.xpath("//span[text()='sin']")).click();
				driver.findElement(By.xpath("//span[text()='4']")).click();
				driver.findElement(By.xpath("//span[text()='5']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				
				//sin 60
				driver.findElement(By.xpath("//span[text()='sin']")).click();
				driver.findElement(By.xpath("//span[text()='6']")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				//sin 90
						driver.findElement(By.xpath("//span[text()='sin']")).click();
						driver.findElement(By.xpath("//span[text()='9']")).click();
						driver.findElement(By.xpath("//span[text()='0']")).click();
						
						driver.findElement(By.xpath("//span[text()='=']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//span[text()='AC']")).click();
				
						
						Thread.sleep(3000);
	}
	
	
	
	default void cos() throws InterruptedException {
		// cos 0

		driver.findElement(By.xpath("//span[text()='cos']")).click();
		
		driver.findElement(By.xpath("//span[text()='0']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		// cos 30
		
			driver.findElement(By.xpath("//span[text()='cos']")).click();
			
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='0']")).click();
			
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='AC']")).click();
			
			// cos 45
			
				driver.findElement(By.xpath("//span[text()='cos']")).click();
				
				driver.findElement(By.xpath("//span[text()='4']")).click();
				driver.findElement(By.xpath("//span[text()='5']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
			
			// cos 60
			
				driver.findElement(By.xpath("//span[text()='cos']")).click();
				
				driver.findElement(By.xpath("//span[text()='6']")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		// cos 90
				
				driver.findElement(By.xpath("//span[text()='cos']")).click();
				
				driver.findElement(By.xpath("//span[text()='9']")).click();
				driver.findElement(By.xpath("//span[text()='0']")).click();
				
				driver.findElement(By.xpath("//span[text()='=']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='AC']")).click();
				
				
				Thread.sleep(3000);
	}
		
	
	default void tan() throws InterruptedException {
		//tan 0
		
		driver.findElement(By.xpath("//span[text()='tan']")).click();
	
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		//tan 30
		
			driver.findElement(By.xpath("//span[text()='tan']")).click();
			
			driver.findElement(By.xpath("//span[text()='3']")).click();
			driver.findElement(By.xpath("//span[text()='0']")).click();
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='AC']")).click();
			
	//tan 45
			
			driver.findElement(By.xpath("//span[text()='tan']")).click();
			
			driver.findElement(By.xpath("//span[text()='4']")).click();
			driver.findElement(By.xpath("//span[text()='5']")).click();
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='AC']")).click();
			
	//tan 60
			
			driver.findElement(By.xpath("//span[text()='tan']")).click();
		
			driver.findElement(By.xpath("//span[text()='6']")).click();
			driver.findElement(By.xpath("//span[text()='0']")).click();
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='AC']")).click();
			
//tan 90
			
			driver.findElement(By.xpath("//span[text()='tan']")).click();
		
			driver.findElement(By.xpath("//span[text()='9']")).click();
			driver.findElement(By.xpath("//span[text()='0']")).click();
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='AC']")).click();
		
			
			Thread.sleep(3000);
	}
	
	
	
}