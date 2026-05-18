package test.calculators_net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	ChromeDriver driver;
	
	void calculatorsLunch() {
		 

		driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
	}
	
	void numbers() throws InterruptedException {
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



	void sin() throws InterruptedException {
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
				
	}
	
	void cos() throws InterruptedException {
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
	}
		
	
	void tan() throws InterruptedException {
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
		
	}
	
	
	
	
	void arcsin() throws InterruptedException {
		
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
		
	
	}
	

	void arccos() throws InterruptedException {
		
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
	}
	
void arctan() throws InterruptedException {
		
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
	}
void extraelement() throws InterruptedException {
	
	// PI
	
	driver.findElement(By.xpath("//span[text()='π']")).click();
	driver.findElement(By.xpath("//span[text()='/']")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	
	// Exponient
	
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[text()='+']")).click();
	driver.findElement(By.xpath("//span[text()='e']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	
	// Power 
	
	driver.findElement(By.xpath("//span[text()='2']")).click();

	driver.findElement(By.xpath("//span[contains(@onclick,'pow')]")).click();

	driver.findElement(By.xpath("//span[text()='3']")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	
	// square root
	driver.findElement(By.xpath("//span[contains(@onclick,'sqrt')]")).click();

	driver.findElement(By.xpath("//span[text()='2']")).click();

	driver.findElement(By.xpath("//span[text()='5']")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='AC']")).click();
	
	// exponential 
	
	driver.findElement(By.xpath("//span[text()='1']")).click();

	driver.findElement(By.xpath("//span[text()='EXP']")).click();

	driver.findElement(By.xpath("//span[text()='3']")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	// squre 

	driver.findElement(By.xpath("//span[text()='3']")).click();
	//driver.findElement(By.xpath("//span[text()='x2']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'x2')]")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	
	// ex
	driver.findElement(By.xpath("//span[text()='4']")).click();
	//driver.findElement(By.xpath("//span[text()='ex']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'ex')]")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	// 10 ^ x
	
	driver.findElement(By.xpath("//span[text()='5']")).click();
//	driver.findElement(By.xpath("//span[text()='10x']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'10x')]")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	

	// pow 
	driver.findElement(By.xpath("//span[text()='7']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'apow')]")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	


	// 3x
	driver.findElement(By.xpath("//span[text()='9']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'3x')]")).click();
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	
	// LOG
	driver.findElement(By.xpath("//span[text()='4']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'log')]")).click(); 
	driver.findElement(By.xpath("//span[text()='3']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	
	// IN
	
	driver.findElement(By.xpath("//span[text()='6']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'ln')]")).click();
	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	
	//  Single paranthisis 
	
	driver.findElement(By.xpath("//span[contains(@onclick,'(')]")).click();

	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='+']")).click();
	driver.findElement(By.xpath("//span[text()='5']")).click();

	driver.findElement(By.xpath("//span[contains(@onclick,')')]")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();

// 1/x	
	
	driver.findElement(By.xpath("//span[text()='6']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'1/x')]")).click();  
	driver.findElement(By.xpath("//span[text()='2']")).click();
	     
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	
	//n!
	
	driver.findElement(By.xpath("//span[text()='6']")).click();
	driver.findElement(By.xpath("//span[contains(@onclick,'n!')]")).click();  
	driver.findElement(By.xpath("//span[text()='2']")).click();
	     
	driver.findElement(By.xpath("//span[text()='=']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
	

	
	 // Degree

	driver.findElement(By.xpath("//span[text()='4']")).click();

	driver.findElement(By.id("scirdsettingd")).click();
	
	driver.findElement(By.xpath("//span[text()='4']")).click();

	driver.findElement(By.xpath("//span[text()='=']")).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[text()='AC']")).click();
	
	
	// Switch to Radian mode
	
	
	driver.findElement(By.id("scirdsettingr")).click();


	driver.findElement(By.xpath("//span[contains(@onclick,'sin')]")).click();

	driver.findElement(By.xpath("//span[contains(text(),'π')]")).click();

	driver.findElement(By.xpath("//span[text()='/']")).click();

	driver.findElement(By.xpath("//span[text()='2']")).click();
	driver.findElement(By.xpath("//span[text()='=']")).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[text()='AC']")).click();
}
	

	
	void quickLinks() throws InterruptedException {
		
		driver.findElement(By.linkText("Mortgage Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Loan Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Auto Loan Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Interest Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Payment Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Retirement Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Investment Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Inflation Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Finance Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Income Tax Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Salary Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Interest Rate Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sales Tax Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("BMI Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Calorie Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Body Fat Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("BMR Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
			
		driver.findElement(By.linkText("Ideal Weight Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pace Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pregnancy Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pregnancy Conception Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("Due Date Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("Scientific Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Fraction Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Percentage Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("Random Number Generator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Triangle Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Standard Deviation Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Age Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Date Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Time Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Hours Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("GPA Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Grade Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Concrete Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Subnet Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Password Generator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Conversion Calculator")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	} 
	
	void footer() throws InterruptedException {
		
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
	}
    public static void main( String[] args ) throws InterruptedException
    {
        App app = new App();
       app.calculatorsLunch();
        app.numbers();
        app.sin();   
        app.cos();
        app.tan();
        app.arcsin();
        app.arccos();
        app.arctan();
        app.extraelement();
       
       app.quickLinks();
       
       app.footer();
        
    }
}
