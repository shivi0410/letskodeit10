package functions;

import mainFunction.UtilClass;
import xpath.HomePage;

public class HomePageFunction extends UtilClass {
	
	HomePage hp = new HomePage();
	public void clickPracticeLink() {
		
		clickElement(hp.practiceLink);
	}

}
