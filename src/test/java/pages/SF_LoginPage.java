package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SF_LoginPage {

    public SF_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "username") public WebElement userName;
    @FindBy(id= "password") public WebElement passWord;
    @FindBy(id = "Login") public WebElement loginButton;
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
