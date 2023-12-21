@regression
Feature: Job search feature
  As a user I want to verify the job search using different data set

  @author_Sandip @smoke @sanity
  Scenario Outline: Verify job search results using different data
    Given When I am on homepage
    When I accept cookies on home page
    And   I enter job title "<JobTitle>"
    And   I enter Location "<Location>"
    And   I select distance "<Distance>"
    And   I click on moreSearchOptionsLink
    And   I enter salaryMin "<SalaryMin>"
    And   I enter salaryMax "<SalaryMax>"
    And   I select salaryType "<Salary Type>"
    And   I select jobType "<JobType>"
    And   I click on Find Jobs button
    Then  I  verify the result "<result>"




    Examples:
      | JobTitle             | Location               | Distance  | SalaryMin | SalaryMax | Salary Type | JobType        | result                                            |
      | Tester               | Harrow, Greater London | 5 miles   | 30000     | 500000    | Per annum   | Permanent      | Permanent Tester jobs in Harrow                   |
      | Accounts Assistant   | Watford, Hertfordshire | 7 miles   | 1000      | 10000     | Per month   | Contract       | Contract Accounts Assistant jobs in Watford       |
      | Javascript Developer | London                 | 100 miles | 300       | 5000      | Per week    | Part Time      | Part Time Javascript Developer jobs in London     |
      | Qa Engineer          | Milton Keynes          | 25 miles  | 200       | 1200      | Per day     | Temporary      | Temporary Qa Engineer jobs in Milton Keynes       |
      | Manual Tester        | Birmingham             | 50 miles  | 25000     | 60000     | Per annum   | Permanent      | Permanent Manual Tester jobs in Birmingham        |
      | Developer            | Bristol (County)       | 35 miles  | 15        | 500       | Per hour    | Apprenticeship | Apprenticeship Developer jobs in Bristol (County) |