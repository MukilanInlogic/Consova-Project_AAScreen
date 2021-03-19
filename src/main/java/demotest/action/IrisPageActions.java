package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.IrisPageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrisPageActions extends IrisPageUI {


    public IrisPageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;

    public boolean verifySearchBar() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (SearchBar.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean EnterSearchBar(String accNo) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (SearchBar.isDisplayed()){
            Textbox.enterValue(driver,SearchBar,accNo);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyInclinedRemoveAudit() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (InclinedRemoveAudit.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyInclinedAuditOver() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (InclinedAuditOver.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyRemovedReasonDangerFont() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (RemovedReasonDangerFont.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAdminTicketIcon() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (AdminTicketIcon.isDisplayed()){
            Element.click(driver,AdminTicketIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean office365username(String email) {
        boolean isEntered = false;
        if (usernameInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, usernameInOutlook, email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean office365password(String password) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (passwordInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, passwordInOutlook, password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean nextButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (nextButtonInOutlook.isEnabled()) {
            Element.click(driver,nextButtonInOutlook);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean outlookIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (outlookIcon.isEnabled()) {
            Element.click(driver,outlookIcon);
            isClicked = true;
        }
        return isClicked;
    }


    public boolean loginButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (loginButtonInOutlook.isEnabled()) {
            Element.click(driver,loginButtonInOutlook);
            Element.click(driver,yesFromPopupInOutlook);
            isClicked = true;
        }
        return isClicked;
    }



    public boolean clickAdminTicketEmail() {
        boolean isClicked = false;
        Sync.Delay(15000);
        if (AdminTicketEmail.size()!=0) {
            Element.click(driver,AdminTicketEmail.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickClickHereLink() {
        boolean isClicked = false;
        Sync.Delay(15000);
        if (ClickHereLink.size()!=0) {
            Element.click(driver,ClickHereLink.get(0));
            isClicked = true;
        }
        return isClicked;
    }

}