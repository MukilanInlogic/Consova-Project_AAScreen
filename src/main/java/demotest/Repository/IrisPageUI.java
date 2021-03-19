package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IrisPageUI {


    protected final WebDriver driver;

    public IrisPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Consova Id')]")
    protected WebElement SearchBar;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'rotate ')]//span[contains(text(),'Removed from Audit')]")
    protected WebElement InclinedRemoveAudit;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'rotate ')]//span[contains(text(),'Audit Over')]")
    protected WebElement InclinedAuditOver;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'text-danger')]//b[contains(text(),'Removed Reason:')]")
    protected WebElement RemovedReasonDangerFont;

    @FindBy(how = How.XPATH, using = "//span[@class='menu_icon admin_ticket_icon']")
    protected WebElement AdminTicketIcon;

    @FindBy(how = How.XPATH, using = "//input[@name='loginfmt']")
    protected WebElement usernameInOutlook;

    @FindBy(how = How.ID, using = "passwordInput")
    protected WebElement passwordInOutlook;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    protected WebElement nextButtonInOutlook;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'outlookLogo')]")
    protected WebElement outlookIcon;

    @FindBy(how = How.ID, using = "submitButton")
    protected WebElement loginButtonInOutlook;

    @FindBy(how = How.ID, using = "idSIButton9")
    protected WebElement yesFromPopupInOutlook;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iVerifyPro Admin Ticket')]")
    protected List<WebElement> AdminTicketEmail;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Click here')]")
    protected List<WebElement> ClickHereLink;

}