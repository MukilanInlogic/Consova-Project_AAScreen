package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageUI {


    protected final WebDriver driver;

    public HomePageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    protected String strLeftPaneHeaderLocator = new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    protected WebElement TxtBoxUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    protected WebElement TxtBoxPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement BtnLoginConsova;

    @FindBy(how = How.XPATH, using = "//img[contains(@class,'userInitial')]")
    protected WebElement profileIconInCore;

    @FindBy(how = How.ID, using = "logout")
    protected WebElement logoffButtonInCore;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']//@disabled")
    protected WebElement disabledSubmitButton1;

    @FindBy(how = How.XPATH, using = "//button[@disabled='']")
    protected WebElement disabledSubmitButton;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//span[text()='System and Data Configuration']")
    protected WebElement systemAndDataConfiguration;

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    protected WebElement addButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
    protected WebElement cancelButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Edit']")
    protected WebElement editButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Update']")
    protected WebElement updateButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Create']")
    protected WebElement createButton;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-times-circle')]")
    protected WebElement closeButtonInModal;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
    protected WebElement saveButton;


}