package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
//import pages.BasePage;
import pages.OrangeHRM_LoginPage;
import utils.BrowserFactory;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.AutomationConstants.*;
import static utils.BrowserFactory.driver;

public class OrangeHRM_login {

    @Given("I launch OrangeHRM URL")
    public void iLaunchORangeHRMURL() throws Throwable {
        BrowserFactory.StartBrowser(BROWSER_TYPE, OrangeHRMURL);
//        TestBase base = new TestBase();
//        driver.get(OrangeHRMURL);
        System.out.println("By I Launch Login URL step ----into Launch URL");

    }

    @When("I login OrangeHRM")
    public void iLoginOrangeHRM() {
        OrangeHRM_LoginPage page = new OrangeHRM_LoginPage(driver);
        page.Login(OrangeHRMUSERNAME, OrangeHRMPASSWORD);
        page.ClickLogin();
    }


    @And("I login OrangeHRM with ([^\"]*) and ([^\"]*)")
    public void iLoginOrangeHRMWithUsernameAndPassword(String user, String psw) {
        OrangeHRM_LoginPage page = new OrangeHRM_LoginPage(driver);
        page.Login(user, psw);
        page.ClickLogin();

    }


    @And("I login OrangeHRM as user {string} and password {string}")
    public void iLoginOrangeHRMAsUserAndPassword(String user, String psw) {
        OrangeHRM_LoginPage page = new OrangeHRM_LoginPage(driver);
        page.Login(user, psw);
        page.ClickLogin();
    }

    @And("I login OrangeHRM as User from data file")
    public void iLoginOrangeHRMAsUser(String User) {
        OrangeHRM_LoginPage page = new OrangeHRM_LoginPage(driver);
        page.Login(OrangeHRMUSERNAME, OrangeHRMPASSWORD);
        page.ClickLogin();
    }

}
