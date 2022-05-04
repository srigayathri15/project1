package SeleMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.id("searchInput")).click();
		driver.findElement(By.id("searchInput")).sendKeys("india");
		driver.findElement(By.id("searchButton")).click();
		
		driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div[1]/table[1]/tbody/tr[4]/td/div/div/div/div[2]/div[6]/span")).click();
	
		driver.findElement(By.id("searchInput")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Australia");
		driver.findElement(By.id("searchButton")).click();		  
	}

}
