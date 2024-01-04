package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranghosh\\eclipse-workspace\\Actions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		
		//to find webelement for bank
		WebElement bankSrc = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		//to find webelement for debit side account
		WebElement debitSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankSrc, debitSide).perform();
		
		//to find webelements for sales
		WebElement saleSrc = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		//to find webelements for credit side account
		WebElement creditSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(saleSrc, creditSide).perform();
		
		//to find webelement for debit side amount
		WebElement bankAmt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		//to find webelement for debit side amount account
		WebElement bankAcnt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankAmt, bankAcnt).perform();
		
		Thread.sleep(3000);
		
		//to find webelement for credit side account
		WebElement salesAmt = driver.findElement(By.xpath("//a[text()=' 5000']"));  
		
		//to find webelement for credit side amount
		WebElement creditAct = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(salesAmt, creditAct).perform();  
		
		
		
		
	}

}
