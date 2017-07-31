package com.gawain.WebSpider;

//public class Test {
//
//}

import java.awt.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {
	public static void main(String[] args) throws Exception {
		// prepare input data
		String[] tickerList = new String[] { "MDLOX", "MSFT" };
		int[] amountList = new int[] { 1000, 1000 };
		// open Chrome web browser
//		System.setProperty("webdriver.chrome.driver","C:/AutoCampus/SeleniumTest/chromedriver/chromedriver.exe");
		//web driver	
//		File directory = new File(".");
		// open Chrome web browser
		System.setProperty("webdriver.chrome.driver",new File(".").getCanonicalPath() + "/web_drivers/chrome/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Test111!!!");
		//input url
		driver.get("https://www.baidu.com/");
		//input text
		driver.findElement(By.id("kw")).sendKeys("hohoho");;
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Google 搜尋")).click();
//		driver.findElement(By.id("s_search_submitwrap")).click();
		
		
		
		Thread.sleep(20000);
		
		//get url result after run js
		String reString = driver.findElement(By.id("1")).getAttribute("innerHTML");	
		System.out.println(reString);
		System.out.println("Test222!!!");
		
		
//		// navigate to login url
//		driver.get("https://awsstgmain.morningstar.com/advisor/login/instlgn.asp?instid=SBDEMO&login=Support_1&pwd=Support_1");
//		// navigate to PA tool URL
//		driver.get("https://awrduat.morningstar.com/SBT/Tools/PA/Default.aspx");
//		// rotation input ticker and amount
//		for (int i = 0; i < tickerList.length; i++) {
//			driver.findElement(By.id("input-secname-" + i + "_acInput"))
//					.sendKeys(tickerList[i]);
//			driver.findElement(By.id("Investmenttable-input-Amount" + i))
//					.sendKeys(Integer.toString(amountList[i]));
//		}
//		// wait 2 seconds, then click preview button
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Preview >>")).click();
//		// wait 20 seconds, then verify AssetAllocation_lblHeader text
//		Thread.sleep(20000);
//		if (driver.findElement(By.id("AssetAllocation_lblHeader")).getText() != "Asset Allocation") {
//			System.out.println("[Error]preview/AssetAllocation_lblHeader");
//		}
	}
}
