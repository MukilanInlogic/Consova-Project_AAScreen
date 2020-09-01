package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.HomePageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;
    public boolean enterURL(String url) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (driver!=null){
            driver.get(url);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean EnterLoginUserName(String strUsername) {
        boolean isEntred = false;
        if (TxtBoxUserName.isDisplayed()) {
            Textbox.enterValue(driver,TxtBoxUserName,strUsername);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterPassword(String strPassword) {
        boolean isEntred = false;
        if (TxtBoxUserName.isDisplayed()) {
            Textbox.enterValue(driver,TxtBoxPassword,strPassword);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean ClickLogin() {
        boolean isClicked = false;
        if (BtnLoginConsova.isDisplayed()){
            Element.click(driver,BtnLoginConsova);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean profileIconInCore(){
        boolean isClicked=false;
        Sync.Delay(10000);
        if(profileIconInCore.isDisplayed()){
            Element.click(driver,profileIconInCore);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean logoffButtonInCore(){
        boolean isClicked=false;
        if(logoffButtonInCore.isDisplayed()){
            Element.click(driver,logoffButtonInCore);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean systemAndDataConfiguration() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (systemAndDataConfiguration.isDisplayed()){
            Element.click(driver,systemAndDataConfiguration);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addButton() {
        boolean isClicked = false;
        if (addButton.isDisplayed()){
            js.executeScript("arguments[0].click();",addButton);
            //Element.click(driver,addButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean cancelButton() {
        boolean isClicked = false;
        if (cancelButton.isDisplayed()){
            Element.click(driver,cancelButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEditButton() {
        boolean isVerified = false;
        if (editButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean editButton() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (editButton.isDisplayed()){
            Element.click(driver,editButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean updateButton() {
        boolean isClicked = false;
        if (updateButton.isDisplayed()){
            Element.click(driver,updateButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean createButton() {
        boolean isClicked = false;
        //Sync.Delay(3000);
        if (createButton.isDisplayed()){
            Element.click(driver,createButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyDisabledSubmitButton() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (disabledSubmitButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean closeTheModal() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (closeButtonInModal.isDisplayed()){
            Element.click(driver,closeButtonInModal);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSaveButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (saveButton.isDisplayed()){
            Element.click(driver,saveButton);
            isClicked = true;
        }
        return isClicked;
    }

}