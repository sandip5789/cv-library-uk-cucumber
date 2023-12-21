package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utility;


public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected){
        log.info("Getting Text   : " + resultText.toString());
        String expectedText = expected;
        String actualText = getTextFromElement(resultText);
        Assert.assertEquals(actualText, expectedText, "Verify Results Title");
    }
}
