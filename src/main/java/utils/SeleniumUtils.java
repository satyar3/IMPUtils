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
