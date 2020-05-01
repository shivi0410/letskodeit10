package functions;

import org.openqa.selenium.By;

import mainFunction.UtilClass;
import xpath.PracticePage;

public class PracticePageFunction extends UtilClass {

	PracticePage pp = new PracticePage();

	public void clickBmwRadioButton() {

		clickElement(pp.bmwRadioButtonXpath);

	}
	public String getBmwRadioButtonText() {

		return getText(pp.bmwRadioTextXpath);
	}

	public void clickBenzRadioButton() {

		clickElement(pp.benzRadioButtonXpath);
	}
	public String getBenzRadioButtonText() {

		return getText(pp.benzRadioTextXpath);
	}

	public void clickHondaRadioButton() {

		clickElement(pp.hondaRadioButtonXpath);
	}
	public String getHondaRadioButtonText() {

		return getText(pp.hondaRadioTextXpath);
	}


	public void clickBenzDropDown() {

		clickElement(pp.benzDropDownXpath);
	}
	public void getBenzDropDownText() {


	}
	public void clickFruits() {

		clickElement(pp.appleXpath);
	}
	public void clickHondaCheckBox() {

		clickElement(pp.hondaCheckBoxXpath);
	}
}
