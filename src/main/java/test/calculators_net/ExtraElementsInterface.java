package test.calculators_net;

import org.openqa.selenium.By;

public interface ExtraElementsInterface extends DriverInterface {


    
    default void extraelement() throws InterruptedException {
    	
    	// PI
    	
    	driver.findElement(By.xpath("//span[text()='π']")).click();
    	driver.findElement(By.xpath("//span[text()='/']")).click();
    	driver.findElement(By.xpath("//span[text()='2']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	
    	
    	Thread.sleep(3000);
    	// Exponient
    	
    	driver.findElement(By.xpath("//span[text()='4']")).click();
    	driver.findElement(By.xpath("//span[text()='+']")).click();
    	driver.findElement(By.xpath("//span[text()='e']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	
    	
    	Thread.sleep(3000);
    	// Power 
    	
    	driver.findElement(By.xpath("//span[text()='2']")).click();

    	driver.findElement(By.xpath("//span[contains(@onclick,'pow')]")).click();

    	driver.findElement(By.xpath("//span[text()='3']")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	
    	
    	Thread.sleep(3000);
    	
    	
    	// square root
    	driver.findElement(By.xpath("//span[contains(@onclick,'sqrt')]")).click();

    	driver.findElement(By.xpath("//span[text()='2']")).click();

    	driver.findElement(By.xpath("//span[text()='5']")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	Thread.sleep(3000);
    	
    	
    	
    	// exponential 
    	
    	driver.findElement(By.xpath("//span[text()='1']")).click();

    	driver.findElement(By.xpath("//span[text()='EXP']")).click();

    	driver.findElement(By.xpath("//span[text()='3']")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);   
    	
    	
    	
    	// squre 

    	driver.findElement(By.xpath("//span[text()='3']")).click();
    	//driver.findElement(By.xpath("//span[text()='x2']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'x2')]")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	
    	
    	// ex
    	driver.findElement(By.xpath("//span[text()='4']")).click();
    	//driver.findElement(By.xpath("//span[text()='ex']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'ex')]")).click();
    	driver.findElement(By.xpath("//span[text()='2']")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();

    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	
    	// 10 ^ x
    	
    	driver.findElement(By.xpath("//span[text()='5']")).click();
//    	driver.findElement(By.xpath("//span[text()='10x']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'10x')]")).click();
    	driver.findElement(By.xpath("//span[text()='2']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	

    	// pow 
    	driver.findElement(By.xpath("//span[text()='7']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'apow')]")).click();
    	driver.findElement(By.xpath("//span[text()='2']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	


    	// 3x
    	driver.findElement(By.xpath("//span[text()='9']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'3x')]")).click();
    	driver.findElement(By.xpath("//span[text()='3']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	
    	// LOG
    	driver.findElement(By.xpath("//span[text()='4']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'log')]")).click(); 
    	driver.findElement(By.xpath("//span[text()='3']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	
    	// IN
    	
    	driver.findElement(By.xpath("//span[text()='6']")).click();
    	driver.findElement(By.xpath("//span[contains(@onclick,'ln')]")).click();
    	driver.findElement(By.xpath("//span[text()='2']")).click();
    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='AC']")).click(); 
    	Thread.sleep(3000);
    	
    	
    	//  Single paranthisis 
    	
    	driver.findElement(By.xpath("//span[contains(@onclick,'(')]")).click();

    	driver.findElement(By.xpath("//span[text()='2']")).click();
    	driver.findElement(By.xpath("//span[text()='+']")).click();
    	driver.findElement(By.xpath("//span[text()='5']")).click();

    	driver.findElement(By.xpath("//span[contains(@onclick,')')]")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();
    	Thread.sleep(3000);
    	
    	

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
    	Thread.sleep(3000);
    	
    	

    	
    	 // Degree

    	driver.findElement(By.xpath("//span[text()='4']")).click();

    	driver.findElement(By.id("scirdsettingd")).click();
    	
    	driver.findElement(By.xpath("//span[text()='4']")).click();

    	driver.findElement(By.xpath("//span[text()='=']")).click();

    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	Thread.sleep(3000);
    	
    	
    	// Switch to Radian mode
    	try {

    	    driver.findElement(By.id("scirdsettingr")).click();

    	    driver.findElement(By.xpath("//span[contains(@onclick,'sin')]")).click();

    	    driver.findElement(By.xpath("//span[contains(text(),'π')]")).click();
    	    
    	    driver.findElement(By.xpath("//span[text()='/']")).click();
    	    
    	        	driver.findElement(By.xpath("//span[text()='2']")).click();
    	        	driver.findElement(By.xpath("//span[text()='=']")).click();
    	    
    	        	Thread.sleep(2000);
    	    
    	        	driver.findElement(By.xpath("//span[text()='AC']")).click();

    	} catch (Exception e) {

    	    System.out.println("Error is: " + e);
    	}
    	
    	
//    	driver.findElement(By.id("scirdsettingr")).click();
//
//
//    	driver.findElement(By.xpath("//span[contains(@onclick,'sin')]")).click();
//
//    	driver.findElement(By.xpath("//span[contains(text(),'π')]")).click();
//
//    	driver.findElement(By.xpath("//span[text()='/']")).click();
//
//    	driver.findElement(By.xpath("//span[text()='2']")).click();
//    	driver.findElement(By.xpath("//span[text()='=']")).click();
//
//    	Thread.sleep(2000);
//
//    	driver.findElement(By.xpath("//span[text()='AC']")).click();
    	Thread.sleep(3000);
    }
    	

}