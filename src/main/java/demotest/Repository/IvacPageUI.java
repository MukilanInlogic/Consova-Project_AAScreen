package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IvacPageUI {


    protected final WebDriver driver;

    public IvacPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected String strButton = new StringBuilder("//button[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();


    protected String boldFontVerify = new StringBuilder("//strong[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String spanVerify = new StringBuilder("//span[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String accountNoVerify = new StringBuilder("//strong[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.ID, using = "LastName")
    protected WebElement LastNameTxt;

    @FindBy(how = How.ID, using = "ConsovaPIN")
    protected WebElement consovaIDTxt;

    @FindBy(how = How.ID, using = "EmployeeSSN")
    protected WebElement sSNTxt;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    protected WebElement browsePath;
    
    protected String filename = "BirthCertificate.jpg";

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Accept')]")
    protected WebElement acceptButton;

    @FindBy(how = How.XPATH, using = "//span[@class='menu_icon logout_icon']")
    protected WebElement logOffButton;

    @FindBy(how = How.ID, using = "sidebarCollapse")
    protected WebElement sidebarCollapse;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'menu_icon contact_icon')]")
    protected WebElement ContactIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='user_image']")
    protected WebElement ProfileIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Affidavit')]")
    protected List<WebElement> ViewAffidavit;


}