package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.AutomationConstants;

public class OrangeHRM_LoginPage {

    public OrangeHRM_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername") public WebElement userName;
    @FindBy(id= "txtPassword") public WebElement passWord;
    @FindBy(id = "btnLogin") public WebElement loginButton;
    @FindBy(xpath= "logInPanelHeading") public WebElement loginPanel;


    public void Login(String user, String psw){
//        Assert.assertTrue(loginPanel.isDisplayed());
        userName.sendKeys(user);
        passWord.sendKeys(psw);
    }

    public void ClickLogin(){
        loginButton.click();
    }
}
