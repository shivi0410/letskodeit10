package testNGTest;


import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;

import functions.CoursePageFunction;
import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.UtilClass;

public class VerifyWindows extends UtilClass {
	
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	CoursePageFunction cpf = new CoursePageFunction();
	
	//@Test
	public void testWindows() {
		
		openBrowser("chrome");
		hpf.clickPracticeLink();
		String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        ppf.clickNewWindowButton();
        
        Set<String> windowHandles = driver.getWindowHandles();   //capturing all window's id.
        
        for(String i:windowHandles) {
        	
        	System.out.println(i);
        	
        	if(!i.equals(windowHandle)) {
        		
        		driver.switchTo().window(i);
        	}
         	
        }
        		
		String windowHandle2 = driver.getWindowHandle();
		System.out.println(windowHandle2);
		
		cpf.clickLogin();
	
		
	}
	
	@Test
	public void alternateWayToHandleWindows() {
		
		openBrowser("chrome");
		hpf.clickPracticeLink();
		ppf.clickNewWindowButton();
		
		
		Set<String> windowids = driver.getWindowHandles();
		
		Iterator<String> iterate = windowids.iterator();
		
		String parentId = iterate.next();
		String childId = iterate.next();
		
		driver.switchTo().window(childId);
		cpf.clickLogin();
		sleep(5000);
		driver.close();
		driver.switchTo().window(parentId);
		sleep(5000);
		ppf.clickColor();
		sleep(5000);
		driver.quit();
		
	}
	

	
	

}
