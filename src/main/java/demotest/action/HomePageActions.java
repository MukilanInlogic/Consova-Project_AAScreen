package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.HomePageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Date;

import static commonpage.util.DateUtil.*;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;
    public ArrayList<String> tabs_windows;

    public boolean enterURL(String url) {
        boolean isEntered = false;
//        Sync.Delay(5000);
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
        Sync.Delay(3000);
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
            js.executeScript("arguments[0].click();",profileIconInCore);
//            Element.click(driver,profileIconInCore);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean logoffButtonInCore(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(logoffButtonInCore.isDisplayed()){
            js.executeScript("arguments[0].click();",logoffButtonInCore);
//            Element.click(driver,logoffButtonInCore);
            isClicked=true;
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

    public boolean verifyDisabledBoldButton() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (disabledBoldButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean closeTheModal() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (closeButtonInModal.isDisplayed()){
            Element.click(driver,closeButtonInModal);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyTableHeader(String header){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,TableHeader,header);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyTableData(String data){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,TableData,data);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickTableData(String data){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,TableData,data);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickInSpan(String inSpan){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,elementInSpan,inSpan);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickInButton(String inButton){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,elementInButton,inButton);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickInLabel(String inLabel){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,elementInLabel,inLabel);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyInButton(String inButton){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,elementInButton,inButton);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyInLabel(String inLabel){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,elementInLabel,inLabel);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickInList(String inList){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,elementInList,inList);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyWarningMessage() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (WarningMessage.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyInSpan(String InSpan) {
        boolean isVerified = false;
        Sync.Delay(1000);
        if (driver!=null){
            Element.verifyElements(driver,elementInSpan,InSpan);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyInDiv(String InDiv) {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (driver!=null){
            Element.verifyElements(driver,elementInDiv,InDiv);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickInDiv(String InDiv) {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (driver!=null){
            Element.click(driver,elementInDiv,InDiv);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean DelaySometime() {
        boolean isClicked = false;
        Sync.Delay(25000);
        if (driver!=null){
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ThirdFilterBy(String filterItem){
        boolean isEntered = false;
        Sync.Delay(3000);
        if(FilterByTxtbox.size()!=0){
            Textbox.enterValue(driver,FilterByTxtbox.get(2),filterItem);
            isEntered=true;
        }
        return isEntered;
    }

    public boolean FirstFilterBy(String filterItem){
        boolean isEntered = false;
        Sync.Delay(3000);
        if(FilterByTxtbox.size()!=0){
            Textbox.enterValue(driver,FilterByTxtbox.get(0),filterItem);
            isEntered=true;
        }
        return isEntered;
    }

    public boolean clickInOption(String inOption){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,elementInOption,inOption);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyInOption(String inOption){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,elementInOption,inOption);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyInBold(String inBold){
        boolean isVerified = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,boldFontVerify,inBold);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickInBold(String inBold){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,boldFontVerify,inBold);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean NotVerifyElementInDisplay(String NotVerify){
        boolean isClicked = false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.notVerifyElements(driver,elementInOption,NotVerify);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSystemAndClientConfiguration() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (SystemAndClientConfiguration.isDisplayed()){
            js.executeScript("arguments[0].click();",SystemAndClientConfiguration);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickClientConfiguration() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (SystemAndClientConfiguration.isDisplayed()){
            js.executeScript("arguments[0].click();",ClientConfiguration);
          isClicked = true;
        }
        return isClicked;
    }

    public boolean clickMyInventory() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (MyInventory.isDisplayed()){
            js.executeScript("arguments[0].click();",MyInventory);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean navigateToNewTab() {
        boolean isDisplayed = false;
        Sync.Delay(3000);
        if (driver!=null) {
            tabs_windows = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs_windows.get(1));
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public boolean closeCurrentTab() {
        boolean isClosed = false;
        Sync.ImplicityDelay(driver,3000);
        if (driver!=null){
            driver.close();
            driver.switchTo().window(tabs_windows.get(0));
            isClosed = true;
        }
        return isClosed;
    }

    public boolean EnterCommentInTextarea(String Comment) {
        boolean isEntred = false;
        if (Textarea.isDisplayed()) {
            Textbox.enterValue(driver,Textarea,Comment);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean SelectCheckbox() {
        boolean isEntred = false;
        Sync.Delay(3000);
        if (Checkboxes.size()!=0) {
            Element.click(driver,Checkboxes.get(0));
            isEntred = true;
        }
        return isEntred;
    }

}