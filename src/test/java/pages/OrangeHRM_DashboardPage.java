package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_DashboardPage {

    public OrangeHRM_DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//a[contains(text(),'Logout')]") public WebElement logoutButton;
    @FindBy(id = "companyLogoHeader") public  WebElement globalHeader;
    @FindBy(xpath = "//li[contains(text(),'Welcome Admin')]") public  WebElement WelcomeUserLink;
    @FindBy(xpath = "//span[contains(text(),'Performance')]") public  WebElement PerformanceLink;

    public void HomePageLoaded(){
        Assert.assertTrue(globalHeader.isDisplayed());
    }
    public void Logout(){
        Assert.assertTrue(logoutButton.isDisplayed());
        logoutButton.click();
    }
    public void dashboardLoaded(){
        Assert.assertTrue(WelcomeUserLink.isDisplayed());
    }
    public void navigatePerformanceTab(){
        Assert.assertTrue(PerformanceLink.isDisplayed());
        PerformanceLink.click();
    }

}
