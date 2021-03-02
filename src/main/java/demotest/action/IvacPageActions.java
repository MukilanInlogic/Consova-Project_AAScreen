package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.IvacPageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class IvacPageActions extends IvacPageUI {
    public IvacPageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;

    public boolean lastNameText(String lastName) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (LastNameTxt.isDisplayed()) {
            Textbox.enterValue(driver,LastNameTxt,lastName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean consovaIdText(String consovaID) {
        boolean isEntered = false;
        Sync.Delay(3000);
        if (consovaIDTxt.isDisplayed()) {
            Textbox.enterValue(driver,consovaIDTxt,consovaID);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean ssnText(String sSN) {
        boolean isEntered = false;
        Sync.Delay(3000);
        if (sSNTxt.isDisplayed()) {
            Textbox.enterValue(driver, sSNTxt, sSN);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean browsePath() {
        boolean isEntered = false;
        Sync.Delay(7000);
        browsePath.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_A&AScreen\\resources\\UploadFilesAndImages\\"+filename);
        isEntered = true;
        return isEntered;
    }

    public boolean disclaimerAcceptButton() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (acceptButton.isDisplayed()){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",acceptButton);
            //Element.click(driver,acceptButton);
            isClicked = true;
        }else{
            System.out.println("No disclaimer notice");
        }
        return isClicked;
    }

    public boolean logoffButton() {
        boolean isClicked = false;
        Sync.Delay(7000);
//        Sync.ImplicityDelay(driver,7000);
        if (logOffButton.isDisplayed()){
            Element.click(driver,logOffButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSidebarCollapse() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (sidebarCollapse.isDisplayed()){
            Element.click(driver,sidebarCollapse);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickContactIcon() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (ContactIcon.isDisplayed()){
            Element.click(driver,ContactIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickViewAffidavit() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (ViewAffidavit.size()!=0){
            Element.click(driver,ViewAffidavit.get(ViewAffidavit.size()-1));
            isClicked = true;
        }
        return isClicked;
    }


}