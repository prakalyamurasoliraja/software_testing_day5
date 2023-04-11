package day_5_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_04 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement leaving= driver.findElement(By.id("source"));
		leaving.sendKeys("coimbatore",Keys.ENTER);
		WebElement going= driver.findElement(By.id("destination"));
		going.sendKeys("cuddalore",Keys.ENTER);
		WebElement datepicker= driver.findElement(By.id("datepicker1"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','14/12/2003')",datepicker);
}
}
