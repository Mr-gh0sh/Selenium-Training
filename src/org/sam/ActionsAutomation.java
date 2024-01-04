package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranghosh\\eclipse-workspace\\Actions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();
		
		//object for action class
		Actions a = new Actions(driver);
		
		//to find courses button webelement
		WebElement courses = driver.findElement(By.id("navbarDropdown"));
		
		//to move the cursor to courses
		a.moveToElement(courses).perform();
		
		//to find software testing webelement
		WebElement st = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		
		//to move the cursor to software testing
		a.moveToElement(st).perform();
		
		
		//to find software testing master web element
		WebElement stMaster = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
		stMaster.click();
		
		
	}

}
