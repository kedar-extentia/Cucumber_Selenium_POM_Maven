package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.OrangeHRM_DashboardPage;

import static utils.BrowserFactory.driver;

public class OrangeHRM_dashboard {
    OrangeHRM_DashboardPage page = new OrangeHRM_DashboardPage(driver);

    @And("I logout")
    public void iLogout() {
        page.logoutButton.click();
        System.out.println("USER IS LOGGED OUT ORANGE HRM------------");
    }

    @Given("I am on OrangeHRM Dashboard")
    public void iAmOnOrangeHRMDashboard() {
        page.dashboardLoaded();
        System.out.println("------------ORANGEHRM Dashboard Loaded");

    }

    @And("I navigate to Performance KPI List")
    public void iNavigateToPerformanceKPIList() {
        page.navigatePerformanceTab();
        System.out.println("------------ORANGEHRM Performance KPI list loaded");
    }

    @And("I logout and close the browser")
    public void iLogoutAndCloseTheBrowser() {
        page.logoutButton.click();
        System.out.println("USER IS LOGGED OUT ORANGE HRM------------");
        Hooks.closeBrowser();
        System.out.println("-----------BROWSER Closed------------");

    }
}
