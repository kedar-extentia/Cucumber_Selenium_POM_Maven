package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SF_DashboardPage;
import pages.SF_LoginPage;
import utils.BrowserFactory;

import java.net.MalformedURLException;

import static utils.AutomationConstants.*;
import static utils.BrowserFactory.driver;

public class Salesforce {

    @Given("I launch SF login URL")
    public void iLaunchSFLoginURL() {
//        driver.get(SF_URL);
        try {
            BrowserFactory.StartBrowser(BROWSER_TYPE, SF_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Salesforce Login URL Launched");
    }

    @When("I login as Automation User")
    public void iLoginAsAutomationUser() {
        SF_LoginPage page = new SF_LoginPage(driver);
        page.Login(SF_USERNAME, SF_PASSWORD);
        page.ClickLogin();
    }

    @Then("Login Successful")
    public void loginSuccessful() {
        System.out.println("------------******-------------------");
        SF_DashboardPage page = new SF_DashboardPage(driver);
//        page.HomePageLoaded();

    }

    @Given("I am on Home screen")
    public void iAmOnHomeScreen() {

        System.out.println("------------******-------------------");

    }

    @And("I navigate to Account")
    public void iNavigateToAccount() {
        SF_DashboardPage page = new SF_DashboardPage(driver);
        driver.navigate().to("https://cunning-moose-373600-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent");
//        page.navigateToAccounts();
        System.out.println("Navigated to Accounts Successfully");

    }

    @When("I click New Button")
    public void iClickNewButton() {
        SF_DashboardPage dashpage = new SF_DashboardPage(driver);
        dashpage.newButton.click();
        System.out.println("------------******-------------------");

    }

    @Then("Account screen loaded with New button")
    public void accountScreenLoadedWithNewButton() {
        SF_DashboardPage dashpage = new SF_DashboardPage(driver);
        dashpage.newAcountModal.isDisplayed();
        System.out.println("------------******-------------------");

    }

    @And("New button is clickable")
    public void newButtonIsClickable() {
        System.out.println("------------******-------------------");

    }

    @When("I Click on new button")
    public void iClickOnNewButton() {
        System.out.println("------------******-------------------");

    }

    @Then("Account Creation modal displayed with fields as below")
    public void accountCreationModalDisplayedWithFieldsAsBelow() {
        System.out.println("------------******-------------------");

    }

    @When("I fill details as below")
    public void iFillDetailsAsBelow() {
        System.out.println("------------******-------------------");

    }

    @And("I click Save button")
    public void iClickSaveButton() {
        System.out.println("------------******-------------------");

    }

    @Then("Account created successfully")
    public void accountCreatedSuccessfully() {
        System.out.println("------------******-------------------");

    }

    @And("I logout Salesforce")
    public void iLogoutSalesforce() {
        SF_DashboardPage page = new SF_DashboardPage(driver);
        page.Logout();
    }
}
