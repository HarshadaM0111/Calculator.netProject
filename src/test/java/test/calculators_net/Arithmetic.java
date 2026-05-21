package test.calculators_net;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Arithmetic extends Setup {

    @Test(priority = 1)
    public void add() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='2']")).click();

        driver.findElement(By.xpath("//span[text()='+']")).click();

        driver.findElement(By.xpath("//span[text()='5']")).click();

        driver.findElement(By.xpath("//span[text()='=']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='AC']")).click();

        System.out.println("Addition Completed");
    }

    @Test(priority = 2)
    public void sub() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='6']")).click();

        driver.findElement(By.xpath("//span[text()='9']")).click();

        driver.findElement(By.xpath("//span[text()='–']")).click();

        driver.findElement(By.xpath("//span[text()='4']")).click();

        driver.findElement(By.xpath("//span[text()='3']")).click();

        driver.findElement(By.xpath("//span[text()='=']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='AC']")).click();

        System.out.println("Subtraction Completed");
    }

    @Test(priority = 3)
    public void mult() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='1']")).click();

        driver.findElement(By.xpath("//span[text()='4']")).click();

        driver.findElement(By.xpath("//span[text()='×']")).click();

        driver.findElement(By.xpath("//span[text()='3']")).click();

        driver.findElement(By.xpath("//span[text()='2']")).click();

        driver.findElement(By.xpath("//span[text()='=']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='AC']")).click();

        System.out.println("Multiplication Completed");
    }

    @Test(priority = 4)
    public void div() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='7']")).click();

        driver.findElement(By.xpath("//span[text()='4']")).click();

        driver.findElement(By.xpath("//span[text()='2']")).click();

        driver.findElement(By.xpath("//span[text()='/']")).click();

        driver.findElement(By.xpath("//span[text()='2']")).click();

        driver.findElement(By.xpath("//span[text()='4']")).click();

        driver.findElement(By.xpath("//span[text()='=']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='AC']")).click();

        System.out.println("Division Completed");
    }
}