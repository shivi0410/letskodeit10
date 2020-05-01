package mainFunction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilClass extends MainDriver {

	/*
	public UtilClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	public void takeScreenshot(String filename) {

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File ("C:\\Users\\SHIVI\\Downloads\\Screenshots"+filename+".jpg"));

		}
		catch (Exception R){

			System.out.println("Error Screenshot not taken");

		}

	}

	public void sleep(int mls) {

		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			System.out.println("UGLY WAIT IS NOT WORKING");
			//e.printStackTrace(); //java gives its own message we can delete and give our own as well
		}
	}

	public void clickElement(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public void sendText(String xpath, String value) {

		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public String getText(String xpath) {

	 return driver.findElement(By.xpath(xpath)).getText();
		
	}

	public boolean verifyText(String xpath, String expText) {

		String actText = driver.findElement(By.xpath(xpath)).getText();

		if(actText.equalsIgnoreCase(expText)) {

			System.out.println("Text matches, Test Passed.");
			return true;

		}
		else {
			System.out.println("Text doesn't matched, Test Failed.");
			return false;
		}	

	}

	public boolean notVerifyText(String xpath, String expText) {

		String actText = driver.findElement(By.xpath(xpath)).getText();

		if(actText.equalsIgnoreCase(expText)) {

			System.out.println("Text matches, Test Failed.");
			return false;

		}
		else {
			System.out.println("Text doesn't matched, Test Passed.");
			return true;
		}

	}



}
