package functions;

import mainFunction.UtilClass;
import xpath.CoursePageXpath;

public class CoursePageFunction extends UtilClass {
	
	CoursePageXpath cp = new CoursePageXpath();
	
	public void clickLogin() {
		
		clickElement(cp.loginButton);
	}

}
