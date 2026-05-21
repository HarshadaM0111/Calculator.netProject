package test.calculators_net;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//public interface Setup extends DriverTestNG {

public class Setup implements DriverTestNG{
	@BeforeTest
void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	

		System.out.println("Calculator Website Opened");
	}
	
	
	
	
}
