package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestPageUI {


    protected final WebDriver driver;

    public TestPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    protected String strLeftPaneHeaderLocator = new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//img[@alt='Consova']")
    protected WebElement lblConsovaPage;

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
    protected WebElement disabledSubmitButton;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement submitButton;

    @FindBy(how = How.NAME, using = "FirstName")
    protected WebElement firstName;

    @FindBy(how = How.NAME, using = "LastName")
    protected WebElement lastName;

    @FindBy(how = How.NAME, using = "UserName")
    protected WebElement userName;

    @FindBy(how = How.NAME, using = "PhoneNumber")
    protected WebElement phoneNumber;

    @FindBy(how = How.NAME, using = "Email")
    protected WebElement emailAddress;

    @FindBy(how = How.NAME, using = "WorkLocation")
    protected WebElement workLocation;

    @FindBy(how = How.NAME, using = "department")
    protected WebElement departmentName;

    @FindBy(how = How.NAME, using = "RandomPercentage")
    protected WebElement randomPercentage;

    @FindBy(how = How.NAME, using = "ManagerId")
    protected WebElement managerId;

    @FindBy(how = How.XPATH, using = "//select[@name='ManagerId']//option")
    protected List<WebElement> managerIdDropdownList;

    @FindBy(how = How.XPATH, using = "//span[@class='slider round']")
    protected List<WebElement> sliderSwitchButton;


    @FindBy(how = How.XPATH, using = "//span[text()='System and Data Configuration']")
    protected WebElement systemAndDataConfiguration;

    @FindBy(how = How.XPATH, using = "//span[text()='Client Configuration']")
    protected WebElement clientConfiguration;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Client']")
    protected WebElement addClientButton;

    @FindBy(how = How.NAME, using = "clientEditName")
    protected WebElement clientName;

    @FindBy(how = How.NAME, using = "clientEditUrl")
    protected WebElement clientSiteLink;

    @FindBy(how = How.NAME, using = "clientEditLogoutUrl")
    protected WebElement clientLogoutUrl;

    @FindBy(how = How.NAME, using = "clientEditWiki")
    protected WebElement wikiLink;

    @FindBy(how = How.NAME, using = "clientEditPhone")
    protected WebElement clientPhoneNo;

    @FindBy(how = How.NAME, using = "phoneId")
    protected WebElement clientPhoneId;

    @FindBy(how = How.NAME, using = "editAssignedPeriodFrom")
    protected WebElement assignedPeriodFrom;

    @FindBy(how = How.NAME, using = "editAssignedPeriodTo")
    protected WebElement assignedPeriodTo;

    @FindBy(how = How.NAME, using = "logoUpload")
    protected WebElement logoUpload;
    protected String ClientLogo="Accenture_Logo";

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    protected WebElement addButton;



}