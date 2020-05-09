package functions;

import org.openqa.selenium.By;

import mainFunction.UtilClass;
import xpath.PracticePageXpath;

public class PracticePageFunction extends UtilClass {

	PracticePageXpath pp = new PracticePageXpath();

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

	public void clickColor() {

		clickElement(pp.appleXpath);
	}
	public void clickHondaCheckBox() {

		clickElement(pp.hondaCheckBoxXpath);
	}

	public void clickNewWindowButton() {
		clickElement(pp.openWindow);
	}
}
