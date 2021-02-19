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

//    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    @FindBy(how = How.ID, using = "username")
    protected WebElement TxtBoxUserName;

//    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    @FindBy(how = How.ID, using = "password")
    protected WebElement TxtBoxPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement BtnLoginConsova;

    @FindBy(how = How.XPATH, using = "//img[contains(@class,'userInitial')]")
    protected WebElement profileIconInCore;

    @FindBy(how = How.ID, using = "logout")
    protected WebElement logoffButtonInCore;

    @FindBy(how = How.XPATH, using = "//button[@disabled='']")
    protected WebElement disabledSubmitButton;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-times-circle')]")
    protected WebElement closeButtonInModal;

    protected String elementInSpan = new StringBuilder("//span[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String elementInButton = new StringBuilder("//button[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String elementInList = new StringBuilder("//li[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String elementInDiv = new StringBuilder("//div[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String elementInLabel = new StringBuilder("//label[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String elementInOption = new StringBuilder("//option[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String boldFontVerify = new StringBuilder("//strong[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String TableHeader = new StringBuilder("//th[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String TableData = new StringBuilder("//td[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'text-danger')]")
    protected WebElement WarningMessage;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Filter by')]")
    protected List<WebElement> FilterByTxtbox;

    @FindBy(how = How.XPATH, using = "//button[@disabled='']//strong")
    protected WebElement disabledBoldButton;

    @FindBy(how = How.XPATH, using = "//span[text()='System and Client Configuration']")
    protected WebElement SystemAndClientConfiguration;

    @FindBy(how = How.XPATH, using = "//span[text()='Client Configuration']")
    protected WebElement ClientConfiguration;

    @FindBy(how = How.XPATH, using = "//span[text()='My Inventory']")
    protected WebElement MyInventory;

    @FindBy(how = How.XPATH, using = "//textarea")
    protected WebElement Textarea;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'custom-checkbox')]")
    protected List<WebElement> Checkboxes;

}