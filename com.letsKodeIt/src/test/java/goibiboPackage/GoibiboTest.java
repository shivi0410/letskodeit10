package goibiboPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import mainFunction.UtilClass;

public class GoibiboTest extends UtilClass {
	
	String fromTextXpath = "//input[@id = 'gosuggest_inputSrc']";
	String fromList = "//ul[@id= 'react-auotosuggest-1']";
	
	@Test
	public void partialTextSelect() {
		
		openBrowser2("chrome");
		sendText(fromTextXpath, "Jap");
		driver.findElement(By.xpath("//input[@aria-activedescendant = 'react-autosuggest-1-suggestion--4']")).sendKeys(Keys.ENTER);
		
		//System.out.println(fromListResult);
		//String japXpath = "//input[@aria-activedescendant = 'react-autosuggest-1-suggestion--4']";

	}

}
