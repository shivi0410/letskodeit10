package testNGTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.MainDriver;
import mainFunction.UtilClass;
import xpath.HomePageXpath;
import xpath.PracticePageXpath;

public class VerifyAllTopButtons extends UtilClass {

	/*public VerifyRadioButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/


	PracticePageXpath pp = new PracticePageXpath();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();


	//@Test
	public void testBmwRadioButton() {

		openBrowser("chrome");
		hpf.clickPracticeLink();
		ppf.clickBmwRadioButton();
		System.out.println(ppf.getBmwRadioButtonText());
		assertEquals(verifyText(pp.bmwRadioTextXpath, "bmw"), true);
	}

	//@Test
	public void verifyAllRadioButtons() {

		openBrowser("chrome");
		
		hpf.clickPracticeLink();
		sleep(5000);

		//hpf.clickEnrollNowLink();     //NoSuchElementException
		
		List<WebElement> allRadioButtons = driver.findElements(By.xpath(pp.allRadioButtons));

		for(int i = 0; i<allRadioButtons.size(); i++) {

			allRadioButtons.get(i).click();

		}
		/*
		 * ppf.clickBmwRadioButton(); sleep(2000); ppf.clickHondaRadioButton();
		 * sleep(2000); ppf.clickBenzRadioButton();
		 */
	}

	//@Test
	public void clickAllRadioAndCheckBox() {

		openBrowser("chrome");
		hpf.clickPracticeLink();
		sleep(2000);

		List<WebElement> allRadioCheckboxButtons = driver.findElements(By.xpath(pp.allRadioAndCheckBoxButtons));

		for(int i = 0; i< allRadioCheckboxButtons.size(); i++) {

			allRadioCheckboxButtons.get(i).click();
			
			boolean isSelected = allRadioCheckboxButtons.get(i).isSelected();
			
			if(isSelected == false) {
				
				allRadioCheckboxButtons.get(i).click();
			}

		}

	}

	//@Test
	public void clickDropdown() {

		openBrowser("chrome");
		hpf.clickPracticeLink();
		sleep(2000);
	
		Select dropdownSelect = new Select(driver.findElement(By.xpath(pp.allDropdown)));
		List<WebElement> allDropdown = dropdownSelect.getOptions();

		for(int i = 0; i<allDropdown.size();i++) {

			allDropdown.get(i).click();
			sleep(2000);

		}
	}
	
	//@Test
	public void clickMultipleSelect() {

		openBrowser("chrome");
		hpf.clickPracticeLink();
		sleep(2000);
		
		Select multipleSelect = new Select(driver.findElement(By.xpath(pp.multipleSelect)));
		List<WebElement> allMultipleSelect = multipleSelect.getOptions();

		for(int i = 0; i<allMultipleSelect.size();i++) {

			allMultipleSelect.get(i).click();
			sleep(2000);
			
//			multipleSelect.deselectAll();

		}
		multipleSelect.deselectAll();

}
	
	//@Test
	public void clickAll() {
		
		openBrowser("chrome");
		hpf.clickPracticeLink();
		sleep(2000);
		
		List<WebElement> allRadioCheckboxButtons = driver.findElements(By.xpath(pp.allRadioAndCheckBoxButtons));

		for(int i = 0; i< allRadioCheckboxButtons.size(); i++) {

			allRadioCheckboxButtons.get(i).click();
			sleep(2000);

		}
		
		Select selectDropdown = new Select(driver.findElement(By.tagName("select")));
		List<WebElement> allDropdown = selectDropdown.getOptions();

		for(int i = 0; i<allDropdown.size();i++) {

			allDropdown.get(i).click();
			sleep(2000);

		}
		
		Select multipleSelect = new Select(getWebElement(pp.multipleSelect));
		List<WebElement> allMultipleSelect = multipleSelect.getOptions();

		for(int i = 0; i<allMultipleSelect.size();i++) {

			allMultipleSelect.get(i).click();
			sleep(2000);
			
//			multipleSelect.deselectAll();

		}
	
		driver.quit();

		}
		
	}
	




