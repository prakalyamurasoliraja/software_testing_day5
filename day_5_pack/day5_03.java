package day_5_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_03 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customer=driver.findElement(By.name("cusid"));
		customer.sendKeys("401");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();
		customer.clear();
		customer.sendKeys("402");
		
		submit.click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.accept();
		Alert alert3 =driver.switchTo().alert();
		String txt=alert3.getText();
		Thread.sleep(3000);
		alert3.accept();
		System.out.println(txt);
	}
}
