package com.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Samp {

	public static void main(String[] args) throws IOException, AWTException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.onetravel.com/");
		
		driver.navigate().back();

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	
	Alert al = driver.switchTo().alert();
	
	al.accept();
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
		
	
	
	
		
			
			
		
	 

	}
}
