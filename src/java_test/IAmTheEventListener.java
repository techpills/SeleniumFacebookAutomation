package com.americanexpress.ecm.testing.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class IAmTheEventListener implements WebDriverEventListener{
////////// NAVIGATION RELATED METHODS ////////////////
@Override
public void beforeNavigateTo(String url, WebDriver driver) {
System.out.println("Before Navigate To "+url);
}
@Override
public void afterNavigateTo(String url, WebDriver driver) {
// TODO Auto-generated method stub
}
@Override
public void beforeNavigateBack(WebDriver driver) {
System.out.println("Before Navigate Back. Right now I'm at "+driver.getCurrentUrl());
}
@Override
public void afterNavigateBack(WebDriver driver) {
// TODO Auto-generated method stub
}
@Override
public void beforeNavigateForward(WebDriver driver) {
// TODO Auto-generated method stub
}
@Override
public void afterNavigateForward(WebDriver driver) {
	// TODO Auto-generated method stub
	}
	/////////////////// FINDBY RELATED METHODS ///////////////
	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver
	driver) {
	// TODO Auto-generated method stub
	}
	@Override
	public void afterFindBy(By by, WebElement element, WebDriver
	driver) {
	// TODO Auto-generated method stub
	}
	//////////////////// CLICKON RELATED METHODS ///////////////
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	}
	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	}
	///////////////// CHANGE OF VALUE RELATED METHODS //////////////
	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver
	driver) {
	// TODO Auto-generated method stub
	}
	@Override
	public void afterChangeValueOf(WebElement element, WebDriver
	driver) {
	// TODO Auto-generated method stub
	}
	/////////////// SCRIPT EXECUTION RELATED METHODS ///////////////
	@Override
	
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		}
		@Override
		public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		}
		/////////////// EXCEPTION RELATED METHODS ///////////////////////
		@Override
		public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		}
		@Override
		public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void afterNavigateRefresh(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void beforeNavigateRefresh(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}
		}