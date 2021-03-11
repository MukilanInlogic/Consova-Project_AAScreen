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

}