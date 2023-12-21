package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobButton;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    public void enterJobTitle(String jobTitle){
        log.info("Sending text to : " + jobTitleField.toString());
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location){
        log.info("Sending text to : " + locationField.toString());
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance){
        log.info("Clicking on  : " + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        log.info("Clicking on  : " + moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        log.info("Sending text to : " + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        log.info("Sending text to : " + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        log.info("Clicking on  : " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        log.info("Clicking on  : " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        log.info("Clicking on  : " + findJobButton.toString());
        clickOnElement(findJobButton);
    }
    public void acceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
}
