package com.project.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
	public static WebDriver driver = null;

	public static void main(String[] args) {

		try {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium-Web\\Selenium Project-1\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();// opens chrome browser
			driver.get("https://seleniumbase.io/demo_page");
			Duration duration = Duration.ofSeconds(50);
			driver.manage().timeouts().implicitlyWait(duration);
			driver.manage().window().maximize();
			Thread.sleep(100);
			driver.findElement(By.id("myTextInput")).sendKeys("Ganesh");
			Thread.sleep(100);
			driver.findElement(By.id("myTextarea")).sendKeys("#,Malagondanahalli,Kadlebalu post,Davanagere");
			Thread.sleep(100);
			driver.findElement(By.name("preText2")).sendKeys("Malagondanahalli_Prabhu");
			Thread.sleep(100);
			driver.findElement(By.id("myButton")).click();
			Thread.sleep(100);
			driver.findElement(By.id("myButton")).click();
			Thread.sleep(100);
			driver.findElement(By.id("placeholderText")).sendKeys("Davanagere");
			Thread.sleep(100);
			driver.findElement(By.tagName("rect")).click();
			Thread.sleep(100);
			driver.findElement(By.tagName("rect")).click();
			Thread.sleep(100);
			driver.findElement(By.name("sliderName")).click();
			Thread.sleep(100);
			Actions action = new Actions(driver);
			WebElement slider1 = driver.findElement(By.className("slider"));
			action.dragAndDropBy(slider1, 50, 0).perform();
			Thread.sleep(100);
			action.dragAndDropBy(slider1, 0, 0).perform();
			Thread.sleep(100);
			WebElement dropDown = driver.findElement(By.name("selectName"));
			System.out.println(dropDown);
			Thread.sleep(100);
			Select select = new Select(dropDown);
			Thread.sleep(100);
			select.selectByVisibleText("Set to 50%");
			Thread.sleep(100);
			select.selectByValue("100%");
			Thread.sleep(100);
			driver.findElement(By.id("radioButton2")).click();
			Thread.sleep(100);
			driver.findElement(By.id("checkBox1")).click();
			Thread.sleep(100);
			driver.findElement(By.id("checkBox2")).click();
			Thread.sleep(100);
			driver.findElement(By.id("checkBox3")).click();
			Thread.sleep(100);
			driver.findElement(By.id("checkBox4")).click();
			Thread.sleep(100);
			WebElement frame = driver.findElement(By.cssSelector("#myFrame3"));
			Thread.sleep(2000);
			driver.switchTo().frame(frame);
			driver.findElement(By.id("checkBox6")).click();
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			driver.findElement(By.id("myLink1")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("SeleniumBase on GitHub")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.findElement(By.id("myLink3")).click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("SeleniumBase Demo Page")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.id("myLink4")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			WebElement e = driver.findElement(By.id("myDropdown"));

			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			actions.moveToElement(e).perform();
			Thread.sleep(2000);
			driver.findElement(By.id("dropOption2")).click();
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (driver != null) {
				driver.close();
				System.out.println("Driver is closed.......");
			} else {
				System.out.println("Driver is not closed......");
			}
		}
	}

}
