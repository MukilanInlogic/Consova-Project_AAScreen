package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.HomePageUI;
import demotest.Repository.TestPageUI;
import org.openqa.selenium.WebDriver;

public class TestPageActions extends TestPageUI {
    public TestPageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyHomePage() {
        boolean isVerified = false;
        Sync.Delay(30000);
        if (lblConsovaPage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean enterUR(String url) {
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

    public boolean EnterFirstName(String FirstName) {
        boolean isEntred = false;
        Sync.Delay(3000);
        if (firstName.isDisplayed()) {
            Textbox.enterValue(driver,firstName,FirstName);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterLastName(String LastName) {
        boolean isEntred = false;
        if (lastName.isDisplayed()) {
            Textbox.enterValue(driver,lastName,LastName);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterUserName(String UserName) {
        boolean isEntred = false;
        if (userName.isDisplayed()) {
            Textbox.enterValue(driver,userName,UserName);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterPhoneNumber(String PhoneNumber) {
        boolean isEntred = false;
        if (phoneNumber.isDisplayed()) {
            Textbox.enterValue(driver,phoneNumber,PhoneNumber);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterEmailAddress(String email) {
        boolean isEntred = false;
        if (emailAddress.isDisplayed()) {
            Textbox.enterValue(driver,emailAddress,email);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterWorkLocation(String WorkLocation) {
        boolean isEntred = false;
        if (workLocation.isDisplayed()) {
            Textbox.enterValue(driver,workLocation,WorkLocation);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterDepartmentName(String department) {
        boolean isEntred = false;
        if (departmentName.isDisplayed()) {
            Textbox.enterValue(driver,departmentName,department);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterRandomPercentage(String RandomPercentage) {
        boolean isEntred = false;
        if (randomPercentage.isDisplayed()) {
            Textbox.enterValue(driver,randomPercentage,RandomPercentage);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean verifySubmitButton() {
        boolean isVerified = false;
        Sync.Delay(30000);
        if (disabledSubmitButton.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
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

    public boolean clientConfiguration() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (clientConfiguration.isDisplayed()){
            Element.click(driver,clientConfiguration);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addClientButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (addClientButton.isDisplayed()){
            Element.click(driver,addClientButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clientNameTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (clientName.isDisplayed()) {
            Textbox.enterValue(driver,clientName,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clientSiteLinkTxtBox(String ClientName) {
        boolean isEntered = false;
        if (clientSiteLink.isDisplayed()) {
            Textbox.enterValue(driver,clientSiteLink,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clientLogoutUrlTxtBox(String ClientName) {
        boolean isEntered = false;
        if (clientLogoutUrl.isDisplayed()) {
            Textbox.enterValue(driver,clientLogoutUrl,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean wikiLinkTxtBox(String ClientName) {
        boolean isEntered = false;
        if (wikiLink.isDisplayed()) {
            Textbox.enterValue(driver,wikiLink,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clientPhoneNoTxtBox(String ClientName) {
        boolean isEntered = false;
        if (clientPhoneNo.isDisplayed()) {
            Textbox.enterValue(driver,clientPhoneNo,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clientPhoneIdTxtBox(String ClientName) {
        boolean isEntered = false;
        if (clientPhoneId.isDisplayed()) {
            Textbox.enterValue(driver,clientPhoneId,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodFromTxtBox(String ClientName) {
        boolean isEntered = false;
        if (assignedPeriodFrom.isDisplayed()) {
            Textbox.enterValue(driver,assignedPeriodFrom,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodToTxtBox(String ClientName) {
        boolean isEntered = false;
        if (assignedPeriodTo.isDisplayed()) {
            Textbox.enterValue(driver,assignedPeriodTo,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean logoUpload() {
        boolean isClicked = false;
        if (logoUpload.isDisplayed()){
            logoUpload.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_Core\\resources\\UploadFilesAndImages\\"+ClientLogo);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addButton() {
        boolean isClicked = false;
        if (addButton.isDisplayed()){
            Element.click(driver,addButton);
            isClicked = true;
        }
        return isClicked;
    }



}