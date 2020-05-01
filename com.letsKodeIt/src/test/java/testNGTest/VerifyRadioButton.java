package testNGTest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.MainDriver;
import mainFunction.UtilClass;
import xpath.HomePage;
import xpath.PracticePage;

public class VerifyRadioButton extends UtilClass {
	
	/*public VerifyRadioButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/


	PracticePage pp = new PracticePage();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	


	@Test
	public void testBmwRadioButton() {
		
	openBrowser("chrome");
	hpf.clickPracticeLink();
	ppf.clickBmwRadioButton();
	System.out.println(ppf.getBmwRadioButtonText());
	assertEquals(verifyText(pp.bmwRadioTextXpath, "bmw"), true);
	}
	
	@Test
	public void verifyAllRadioButtons() {
		
		openBrowser("chrome");
		hpf.clickPracticeLink();
		sleep(2000);
		ppf.clickBmwRadioButton();
		sleep(2000);
		ppf.clickHondaRadioButton();
		sleep(2000);
		ppf.clickBenzRadioButton();	
	}
}
