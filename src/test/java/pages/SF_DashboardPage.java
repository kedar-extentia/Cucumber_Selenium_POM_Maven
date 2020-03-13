package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;


public class SF_DashboardPage {

    public SF_DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-global-header__item']//div[@class='slds-global-header__logo']") public  WebElement globalHeader;
    @FindBy(xpath ="//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']//span[@class='uiImage']") public WebElement profileIcon;
    @FindBy(xpath= "//a[@class='profile-link-label logout uiOutputURL']") public WebElement logoutButton;
    @FindBy(xpath= "//div[@class='slds-icon-waffle']") public WebElement waffleIcon;

//    @FindBy(xpath = "//input[@placeholder='Search apps and items...']") public WebElement SearchPlaceholder;
    @FindBy(xpath = "//one-app-launcher-search-bar/lightning-input/div/input")  public WebElement SearchPlaceholder;
    @FindBy(name = "Accounts") public WebElement accountLink;
    @FindBy(xpath = "//button[contains(text(),'View All')]") public WebElement viewAllLink;
//    @FindBy(xpath = "//p[contains(text(),'Accounts')]") public WebElement accountLink;
    @FindBy(xpath = "//span[@class='slds-truncate'][contains(text(),'Recently Viewed | Accounts')]") public WebElement AccountTab;
    @FindBy(xpath = "//div[contains(text(),'New')]") public WebElement newButton;
    @FindBy(xpath = "//h2[contains(@class,'inlineTitle slds-p-top--large slds-p-horizontal--medium slds-p-bottom--medium slds-text-heading--medium')]") public WebElement newAcountModal;




    public void HomePageLoaded(){
        Assert.assertTrue(globalHeader.isDisplayed());
    }
    public void Logout(){
        Assert.assertTrue(logoutButton.isDisplayed());
        profileIcon.click();
        logoutButton.click();
        System.out.println("User Loged Out of Salesforce---------");
    }

    public void navigateToAccounts(){

        System.out.println("---------    ");
        waffleIcon.click();

        SearchPlaceholder.click();
        SearchPlaceholder.sendKeys("Accounts");
//        viewAllLink.click();
        accountLink.click();
        System.out.println("Naviagted to Accounts---------    ");
        AccountTab.isDisplayed();
    }

    public void createAccount(){

    }
}
