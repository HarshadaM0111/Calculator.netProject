package test.calculators_net;

import org.openqa.selenium.chrome.ChromeDriver;

public interface LaunchInterface extends DriverInterface {


	
	default void calculatorsLunch() {
		 

		//driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
	}
}