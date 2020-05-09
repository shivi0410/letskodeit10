package functions;

import mainFunction.UtilClass;
import xpath.HomePageXpath;

public class HomePageFunction extends UtilClass {
	
	HomePageXpath hp = new HomePageXpath();
	public void clickPracticeLink() {
		
		clickElement(hp.practiceLink);
	}
	
	public void clickEnrollNowLink() {
		
		clickElement(hp.enrollNowLink);
	}

}
