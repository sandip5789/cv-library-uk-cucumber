package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("When I am on homepage")
    public void whenIAmOnHomepage() {
    }

    @When("I accept cookies on home page")
    public void iAcceptCookiesOnHomePage() {
        new HomePage().acceptCookies();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I  verify the result {string}")
    public void iVerifyTheResult(String result) {
        new ResultPage().verifyTheResults(result);


    }

}
