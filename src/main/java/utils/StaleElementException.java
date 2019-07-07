package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementException
{

	public static void main(String[] args)
	{		
		
	}
	
	public WebElement fetchElement(By elt) {
		WebElement element = CheckUtils.getElement(getTest(), elt);

		if ((ExpectedConditions.stalenessOf(element) == null)) {
			WaitUtils.waitForCondition(getTest(), ExpectedConditions.stalenessOf(element), TIME_OUT);
			element = CheckUtils.getElement(getTest(), elt);
		}
		return element;
	}
	public WebElement fetchElement(WebElement elt) {
		WebElement element = CheckUtils.getElement(getTest(), elt);

		if ((ExpectedConditions.stalenessOf(element) == null)) {
			WaitUtils.waitForCondition(getTest(), ExpectedConditions.stalenessOf(element), TIME_OUT);
			element = CheckUtils.getElement(getTest(), elt);
		}
		return element;
	}
	public List<WebElement> fetchListContent(By elt) {
		List<WebElement> elements = CheckUtils.getElements(getTest(), elt);
		if (ExpectedConditions.stalenessOf(elements.get(0)) == null) {
			WaitUtils.waitForCondition(getTest(), ExpectedConditions.stalenessOf(elements.get(0)), TIME_OUT);
			elements = CheckUtils.getElements(getTest(), elt);
		}
		return elements;
	}
	public WebElement getElement(SeleniumSEPTest test, WebElement referenceElt, By eltLocator) {
	    // retrieve selenium and reporter objects
	    WebDriver driver = test.getDriverInstance();

	    WebElement eltFound = null;
	    if (test.isDebugMode()) {
	      // Debug mode activated
	      Reporter reporter = test.getReporter();
	      try {
	        if (referenceElt == null) {
	          eltFound = driver.findElement(eltLocator);
	        }
	        else {
	          eltFound = referenceElt.findElement(eltLocator);
	        }
	        reporter.debug("Elt found (" + eltLocator.toString() + ")", eltFound);
	        // highlightElement(test, eltFound);
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltFound = null;
	        reporter.debug("Element not found for (" + eltLocator.toString() + ")");
	      }
	    }
	    else {
	      // Debug mode NOT activated
	      try {
	        if (referenceElt == null) {
	          eltFound = driver.findElement(eltLocator);
	        }
	        else {
	          eltFound = referenceElt.findElement(eltLocator);
	        }
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltFound = null;
	      }
	    }
	    return eltFound;
	  }
	
	public WebElement getElement(SeleniumSEPTest test, WebElement eltLocator) {
	    // retrieve selenium and reporter objects
	    WebDriver driver = test.getDriverInstance();

	    WebElement eltFound = null;
	    if (test.isDebugMode()) {
	      // Debug mode activated
	      Reporter reporter = test.getReporter();
	      try {
	          eltFound = eltLocator;
	        reporter.debug("Elt found (" + eltLocator.toString() + ")", eltFound);
	        // highlightElement(test, eltFound);
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltFound = null;
	        reporter.debug("Element not found for (" + eltLocator.toString() + ")");
	      }
	    }
	    else {
	      // Debug mode NOT activated
	      try {
	    	  eltFound = eltLocator;
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltFound = null;
	      }
	    }
	    return eltFound;
	  }
	public List<WebElement> getElements(SeleniumSEPTest test, WebElement referenceElt, By eltLocator) {
	    // retrieve selenium and reporter objects
	    WebDriver driver = test.getDriverInstance();

	    List<WebElement> eltsFound = null;
	    if (test.isDebugMode()) {
	      // Debug mode activated
	      Reporter reporter = test.getReporter();
	      try {
	        if (referenceElt == null) {
	          eltsFound = driver.findElements(eltLocator);
	        }
	        else {
	          eltsFound = referenceElt.findElements(eltLocator);
	        }
	        reporter.debug("Number of elt found (" + eltLocator.toString() + ") = " +
	            (eltsFound != null ? eltsFound.size() : 0));
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltsFound = new ArrayList<WebElement>(0);
	        reporter.debug("No element found for (" + eltLocator.toString() + ")");
	      }
	    }
	    else {
	      // Debug mode NOT activated
	      try {
	        if (referenceElt == null) {
	          eltsFound = driver.findElements(eltLocator);
	        }
	        else {
	          eltsFound = referenceElt.findElements(eltLocator);
	        }
	      }
	      catch (NoSuchElementException e) {
	        // Elt not found
	        eltsFound = new ArrayList<WebElement>(0);
	      }
	    }
	    return eltsFound;
	  }
}
