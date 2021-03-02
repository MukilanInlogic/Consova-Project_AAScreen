package demotest.action;

import commonpage.toolbox.Alert;
import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import commonpage.util.Testdata;
import demotest.Repository.AccountPageUI;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javax.xml.soap.Text;

public class AccountPageActions extends AccountPageUI {
    public AccountPageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;
    public boolean enterAccountURL(String url,String accountURL) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (driver!=null){
            driver.get(url+accountURL);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean LaunchAudit() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (LaunchAuditIcon.isDisplayed()){
            Element.click(driver,LaunchAuditIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEditButtonOne() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (EditButton.size()!=0){
            Element.click(driver,EditButton.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEditButtonTwo() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (EditButton.size()!=0){
            Element.click(driver,EditButton.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEditButtonThree() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (EditButton.size()!=0){
            Element.click(driver,EditButton.get(2));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterEmailId(String Email) {
        boolean isEntered = false;
//        Sync.Delay(1000);
        if (EmailTxtBox.isDisplayed()){
            Textbox.enterValue(driver,EmailTxtBox,Email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enterMiddleName(String Email) {
        boolean isEntered = false;
//        Sync.Delay(1000);
        if (MiddleNameTxtBox.isDisplayed()){
            Textbox.enterValue(driver,MiddleNameTxtBox,Email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enterAddress(String Email) {
        boolean isEntered = false;
//        Sync.Delay(1000);
        if (AddressTxtBox.isDisplayed()){
            Textbox.enterValue(driver,AddressTxtBox,Email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyActiveDependnetTab() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (ActiveDependentTab.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickInactiveDependentTab() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (InactiveDependentTab.size()!=0){
            Element.click(driver,InactiveDependentTab.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickTaskCheckIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (TaskCheckIcon.size()!=0){
            Element.click(driver,InactiveDependentTab.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyDependentEmployeeCriteria() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (DependentEmployeeCriteria.size()==20){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyDeleteIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (DeleteIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickDeleteIcon() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (DeleteIcon.isDisplayed()){
            Element.click(driver,DeleteIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SelectReasonFromList() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (RemoveReason.size()!=0){
            Element.click(driver,RemoveReason.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean AcceptTheAlert() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (driver!=null){
            Alert.acceptAlert(driver);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickUnlockIcon() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (UnlockIcon.isDisplayed()){
            Element.click(driver,UnlockIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickUnlockIconDependentLvl() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (UnlockIconDependent.size()!=0){
            Element.click(driver,UnlockIconDependent.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyLockIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (LockIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickLockIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (LockIcon.isDisplayed()){
            Element.click(driver,LockIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickDownloadIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (DownloadIcon.isDisplayed()){
            Element.click(driver,DownloadIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickPrinterIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (PrintIcon.isDisplayed()){
            Element.click(driver,PrintIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickClearFilterIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (ClearFilterIcon.isDisplayed()){
            Element.click(driver,ClearFilterIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyAlertsCheckEnabled() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (AlertsCheckEnabled.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickEmployeeAlert() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (EmployeeAlert.isDisplayed()){
            Element.click(driver,EmployeeAlert);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickDependentAlert() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (DependentAlert.isDisplayed()){
            Element.click(driver,DependentAlert);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SelectAlertsList() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AlertsList.size()!=0){
            Element.click(driver,AlertsList.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSaveButtonInDialogBox(String inButton) {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (ButtonInDialogBox.length()!=0){
            Element.click(driver,ButtonInDialogBox,inButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickDeleteButtonInDialogBox() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (DeleteButtonInDialogBox.isDisplayed()){
            Element.click(driver,DeleteButtonInDialogBox);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickRefreshButtonInDialogBox() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (RefreshButtonInDialogBox.isDisplayed()){
            Element.click(driver,RefreshButtonInDialogBox);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickCancelButtonInDialogBox() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (CancelButtonInDialogBox.isDisplayed()){
            Element.click(driver,CancelButtonInDialogBox);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterContactName(String contactNam) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (contactName.isDisplayed()){
            Textbox.enterValue(driver,contactName,contactNam);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean EnterContactNumber(String contactNumbr) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (contactNumber.isDisplayed()){
            Textbox.enterValue(driver,contactNumber,contactNumbr);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyDisabledTypeDiv(String InDiv) {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (driver!=null){
            Element.verifyElements(driver,DisabledTypeDiv,InDiv);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyDisabledTypeInput(String InDiv) {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (driver!=null){
            Element.verifyElements(driver,DisabledTypeInput,InDiv);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean EnterCallerName(String CallerName) {
        boolean isEntered = false;
        Sync.Delay(3000);
        if (CallerNameTxtbox.isDisplayed()){
            Textbox.enterValue(driver, CallerNameTxtbox,CallerName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifySubclientInfo() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (SubclientLogo.isDisplayed()){
            if (SubclientName.isDisplayed()){
                if (SubclientContact.isDisplayed()){
                    if (SubclientFax.isDisplayed()){
                        if (SubclientWiki.isDisplayed()){
                            isVerified=true;
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyTasksHeader() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (TaskHeader.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickEscalationIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (EscalationIcon.isDisplayed()){
            Element.click(driver,EscalationIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyEscalationIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (EscalationIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyRefreshIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (RefreshIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyPencilIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (PencilIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyTrashIcon() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (TrashIcon.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickArrowLeft() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (ArrowLeft.isDisplayed()){
            Element.click(driver,ArrowLeft);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean CompleteFirstTask() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (CheckIcon.size()!=0){
            Element.click(driver,CheckIcon.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean CompleteSecondTask() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (CheckIcon.size()!=0){
            Element.click(driver,CheckIcon.get(1));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickEscalationType() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (EscalationType.isDisplayed()){
            Element.click(driver,EscalationType);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelcetReasonDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (SelcetReason.isDisplayed()){
            Element.click(driver,SelcetReason);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelectType() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (SelectType.isDisplayed()){
            Element.click(driver,SelectType);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddIconSecond() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddIconList.size()!=0){
            Element.click(driver,AddIconList.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddIconSpan() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddIconSpan.size()!=0){
            Element.click(driver,AddIconSpan.get(AddIconSpan.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SelectTaskType() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (TaskTypesCheckbox.size()!=0){
            Element.click(driver,TaskTypesCheckbox.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SelectLastCheckbox() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (TaskTypesCheckbox.size()!=0){
            Element.click(driver,TaskTypesCheckbox.get(TaskTypesCheckbox.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEligibilityList() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (EligibilityList.size()!=0){
            Element.click(driver,EligibilityList.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAuditList() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AuditList.size()!=0){
            Element.click(driver,AuditList.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddEvent() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddEvent.isDisplayed()){
            Element.click(driver,AddEvent);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickCompletedPhoneCallIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (CompletedPhoneCallIcon.isDisplayed()){
            Element.click(driver,CompletedPhoneCallIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyOutcomeIcons() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (WillNotContactIcon.isDisplayed()){
            if (BadNumberIcon.isDisplayed()){
                if (LeftMessageIcon.isDisplayed()){
                    if (CompletedPhoneCallIcon.isDisplayed()){
                        isVerified = true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean clickAddDocIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (PlusIcon.size()!=0){
            Element.click(driver,PlusIcon.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddLastDocIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (PlusIcon.size()!=0){
            Element.click(driver,PlusIcon.get(PlusIcon.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SelectAddedEvents() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddedEvents.size()!=0){
            Element.click(driver,AddedEvents.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ConfirmNotApplicable() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddedEvents.size()==NotApplicableDocument.size()){
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyHistoryHeader() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (HistoryHeader.isDisplayed()){
            Element.click(driver,HistoryHeader);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyFilterBy() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (FilterByTxtbox.size()!=0){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyPagination() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (Pagination.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickViewActivity() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (ViewActivity.size()!=0){
            Element.click(driver,ViewActivity.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickViewDetails() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (ViewDetails.size()!=0){
            Element.click(driver,ViewDetails.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean ThirdFilterTextbox(String filterItem){
        boolean isEntered = false;
        Sync.Delay(3000);
        if(FilterTextbox.size()!=0){
            Textbox.enterValue(driver,FilterTextbox.get(2),filterItem);
            isEntered=true;
        }
        return isEntered;
    }

    public boolean verifyDisabledLinkable() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (DisabledLinkableButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyActiveLinkButton() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (ActiveLinkButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickActiveLinkButton() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (ActiveLinkButton.isDisplayed()){
            Element.click(driver,ActiveLinkButton);
            isClicked = true;
        }
        return isClicked;
    }

}