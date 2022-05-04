package SeleMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public abstract class HRMEmployeee {

	private static final String BY = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
       // driver.switchTo().frame("mainMenu");
        driver.findElement(By.xpath("//*[text()='PIM']")).click();
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("odis");
        driver.findElement(By.id("searchBtn")).click();
        String expectedResult="odis";
        String actualResult=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(expectedResult,actualResult);
        }
	}