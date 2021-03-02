package demotest.action;

import commonpage.toolbox.*;
import demotest.Repository.ClientPageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClientPageActions extends ClientPageUI {
    public ClientPageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;
    public boolean clientConfiguration() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (clientConfiguration.isDisplayed()){
            js.executeScript("arguments[0].click();",clientConfiguration);
            //Element.click(driver,clientConfiguration);
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

    public boolean verifyAddClientButton() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (addClientButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
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

    public boolean assignedPeriodFromTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (assignedPeriodFrom.isDisplayed()) {
            Element.click(driver,assignedPeriodFrom);
            Element.click(driver,TodayInBootstrapCalender);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodToTxtBox() {
        boolean isEntered = false;
        if (assignedPeriodTo.isDisplayed()) {
            Element.click(driver,assignedPeriodTo);
            Element.click(driver,TodayInBootstrapCalender);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean logoUpload() {
        boolean isClicked = false;
        if (logoUpload.isDisplayed()){
            logoUpload.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_Core\\resources\\UploadFilesAndImages\\"+ClientLogo);
            Sync.Delay(7000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clientServiceRepSelect() {
        boolean isSelected = false;
        Sync.Delay(2000);
        if (clientServiceRepDropdown.isDisplayed()){
            Element.click(driver,clientServiceRepDropdown);
            Element.click(driver,clientServiceRep.get(0));
            isSelected = true;
        }
        return isSelected;
    }

    public boolean ivacLanguageSelect() {
        boolean isSelected = false;
        Sync.Delay(2000);
        if (languageSelectDropdown.size()!=0){
            Element.click(driver,languageSelectDropdown.get(0));
            Element.click(driver,languageEnglishSelect);
            Element.click(driver,languageSpanishSelect);
            isSelected = true;
        }
        return isSelected;
    }

    public boolean communicationLanguageSelect() {
        boolean isSelected = false;
        Sync.Delay(2000);
        if (languageSelectDropdown.size()!=0){
            Element.click(driver,languageSelectDropdown.get(1));
            Element.click(driver,languageEnglishSelect);
            Element.click(driver,languageSpanishSelect);
            isSelected = true;
        }
        return isSelected;
    }

    public boolean communicationPrintLanguageSelect() {
        boolean isSelected = false;
        Sync.Delay(2000);
        if (languageSelectDropdown.size()!=0){
            Element.click(driver,languageSelectDropdown.get(2));
            Element.click(driver,languageEnglishSelect);
            Element.click(driver,languageSpanishSelect);
            isSelected = true;
        }
        return isSelected;
    }

    public boolean clientEditEmpTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (clientEditEmp.isDisplayed()) {
            Textbox.enterValue(driver,clientEditEmp,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clientEditDepTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (clientEditDep.isDisplayed()) {
            Textbox.enterValue(driver,clientEditDep,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAddSubClientButton() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (btnAddSubClients.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clientSearchTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (clientSearchTxtBox.isDisplayed()) {
            Textbox.enterValue(driver,clientSearchTxtBox,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyClientSearchTxtBox() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (clientSearchTxtBox.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyClientPage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (txtInClientPage.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAddedClientInClientList() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (clientList.size()!=0){
            Element.click(driver,clientList.get(0));
            isVerified = true;
        }
        Sync.Delay(15000);
        return isVerified;
    }

    public boolean verifyCountInCriteriaFields() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (EmployeeCriteriaFields.size()==10){
            if (DependentCriteriaFields.size()==10) {
                isVerified = true;
            }
        }
        return isVerified;
    }

    public boolean verifySliderRoundCheckboxesTest() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (sliderRoundclientEditiVAC.isDisplayed()){
            if (sliderRoundclientEditiRIS.isDisplayed()){
                if (sliderRoundclientEditGreen.isDisplayed()){
                    if (sliderRoundclientUploadDocuments.isDisplayed()){
                        if (sliderRoundIsActive.isDisplayed()){
                            isVerified=true;
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifySliderRoundCheckboxes() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (sliderRound.size()==8) {
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSliderRoundHideInactive() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (sliderRoundHideInactive.isDisplayed()) {
            Element.click(driver,sliderRoundHideInactive);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyPopupOptions() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (clientConfigurationInList.isDisplayed()) {
            if (projectConfigurationInList.isDisplayed()) {
                isVerified = true;
            }
        }
        return isVerified;
    }

    public boolean clickclientConfigurationInList() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (clientConfigurationInList.isDisplayed()) {
            Element.click(driver,clientConfigurationInList);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyUploadedClientLogo() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (uploadedClientLogo.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyNewUploadClientLogo() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (newUploadClientLogo.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyClientInformation() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (clientInformationInPanel.isDisplayed()){
            if (clientNameInPanel.isDisplayed()){
                if (clientSiteLinkInPanel.isDisplayed()){
                    if (phoneNoInPanel.isDisplayed()){
                        if (clientServiceRepInPanel.isDisplayed()){
                            isVerified = true;
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    /*public boolean verifyClientName(String client) {
        boolean isVerified = false;
        Sync.Delay(5000);
        System.out.println(clientNamed.getText());
        if (clientNamed.getText().contains(client)){
            isVerified = true;
        }
        return isVerified;
    } */

    public boolean clickAddSubClientButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (btnAddSubClients.isDisplayed()){
            Element.click(driver,btnAddSubClients);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean subClientNameTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientName.isDisplayed()) {
            Textbox.enterValue(driver,subClientName,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientPhoneNoTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientPhoneNo.isDisplayed()) {
            Textbox.enterValue(driver,subClientPhoneNo,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientSiteLinkTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientSiteLink.isDisplayed()) {
            Textbox.enterValue(driver,subClientSiteLink,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientCodeTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientCode.isDisplayed()) {
            Textbox.enterValue(driver,subClientCode,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientServiceRepSelect() {
        boolean isSelected = false;
        Sync.Delay(2000);
        if (subClientEditRep.isDisplayed()){
            Element.click(driver,subClientEditRep);
            Element.click(driver,subClientEditRepDropdown.get(0));
            isSelected = true;
        }
        return isSelected;
    }

    public boolean assignedPeriodFromInSubClientTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (subClientPhoneNoFrom.isDisplayed()) {
            Element.click(driver,subClientPhoneNoFrom);
            Element.click(driver,subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodToInSubClientTxtBox() {
        boolean isEntered = false;
        if (subClientPhoneNoTo.isDisplayed()) {
            Element.click(driver,subClientPhoneNoTo);
            Element.click(driver,subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enableAllCheckboxes() {
        boolean isEnabled = false;
        Sync.Delay(5000);
        if (subClientSliders.size()!=0){
            Element.click(driver,subClientSliders.get(1));
            Element.click(driver,subClientSliders.get(2));
            Element.click(driver,subClientSliders.get(3));
            isEnabled = true;
        }
        return isEnabled;
    }

    public boolean subClientPhoneIdTxtBox(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientPhoneId.isDisplayed()) {
            Textbox.enterValue(driver,subClientPhoneId,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyEditSubClientButton() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (editSubClient.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickEditSubClientButton() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (editSubClient.isDisplayed()){
            Element.click(driver,editSubClient);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEditSubClientHeaderInModal() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (editSubClientModalHeader.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean subClientNameTxtBoxInEditModal(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientNameInEditModal.isDisplayed()) {
            Textbox.enterValue(driver,subClientNameInEditModal,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientPhoneNoTxtBoxInEditModal(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientPhoneNoInEditModal.isDisplayed()) {
            Textbox.enterValue(driver,subClientPhoneNoInEditModal,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientSiteLinkTxtBoxInEditModal(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientSiteLinkInEditModal.isDisplayed()) {
            Textbox.enterValue(driver,subClientSiteLinkInEditModal,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientCodeTxtBoxInEditModal(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientCodeInEditModal.isDisplayed()) {
            Textbox.enterValue(driver,subClientCodeInEditModal,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodFromInSubClientTxtBoxInEditModal() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (subClientPhoneNoFromInEditModal.isDisplayed()) {
            Element.click(driver,subClientPhoneNoFromInEditModal);
            Element.click(driver,subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean assignedPeriodToInSubClientTxtBoxInEditModal() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (subClientPhoneNoToInEditModal.isDisplayed()) {
            Element.click(driver,subClientPhoneNoToInEditModal);
            Element.click(driver,subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean subClientPhoneIdTxtBoxInEditModal(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientPhoneIdInEditModal.isDisplayed()) {
            Textbox.enterValue(driver,subClientPhoneIdInEditModal,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyNoSubClientLogoToDisplay() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (noSubClientLogoToDisplay.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickViewSubClientLogo() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (viewSubClientLogo.isDisplayed()){
            Element.click(driver,viewSubClientLogo);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyNoSubClientLogoNotToDisplay() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (viewSubClientLogo.isDisplayed()){
            Element.notVerifyElement(driver,noSubClientLogoToDisplay);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean subClientLogoUpload() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (addSubClientLogoIcon.isDisplayed()){
            Element.click(driver,addSubClientLogoIcon);
//            addSubClientLogoIcon.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_Core\\resources\\UploadFilesAndImages\\"+ClientLogo);
            isClicked = true;
        }
        Sync.Delay(15000);
        return isClicked;
    }

    public boolean verifySubClientElements(String subClientName) {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (subClientInformation.isDisplayed()){
            Element.verifyElements(driver,subClientDetails,subClientName);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickSubClientSite(String subClientName) {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (subClientInformation.isDisplayed()){
            Element.click(driver,subClientDetails,subClientName);
            Sync.Delay(5000);
            //Element.verifyElements(driver,subClientDetails,subClientName);
            driver.navigate().back();
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyViewSubClientLogo() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (viewSubClientLogo.isDisplayed()){
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifySubClientPhoneIdTxtBox() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (subClientPhoneId.isDisplayed()) {
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAssignedPeriodFromInSubClientTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (subClientPhoneNoFrom.isDisplayed()) {
            Element.click(driver,subClientPhoneNoFrom);
            Element.verifyElement(subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAssignedPeriodToInSubClientTxtBox() {
        boolean isEntered = false;
        if (subClientPhoneNoTo.isDisplayed()) {
            Element.click(driver,subClientPhoneNoTo);
            Element.verifyElement(subClientTodayDateInBootstrap);
            Element.click(driver,subClientPhoneId);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifySubClientPhoneIdTxtBoxInEditModal() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (subClientPhoneIdInEditModal.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyAssignedPeriodFromInSubClientTxtBoxInEditModal() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (subClientPhoneNoFromInEditModal.isDisplayed()) {
            Element.click(driver,subClientPhoneNoFromInEditModal);
            Element.verifyElement(subClientTodayDateInBootstrap);
            Element.click(driver,subClientPhoneIdInEditModal);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAssignedPeriodToInSubClientTxtBoxInEditModal() {
        boolean isEntered = false;
        if (subClientPhoneNoToInEditModal.isDisplayed()) {
            Element.click(driver,subClientPhoneNoToInEditModal);
            Element.verifyElement(subClientTodayDateInBootstrap);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyClientPhoneIdTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (clientPhoneId.isDisplayed()) {
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAssignedPeriodFromTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (assignedPeriodFrom.isDisplayed()) {
            Element.click(driver,assignedPeriodFrom);
            Element.verifyElement(TodayInBootstrapCalender);
            Element.click(driver,clientPhoneId);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAssignedPeriodToTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (assignedPeriodTo.isDisplayed()) {
            Element.click(driver,assignedPeriodTo);
            Element.verifyElement(TodayInBootstrapCalender);
            Element.click(driver,clientPhoneId);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickProjectConfigurationInList() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (projectConfigurationInList.isDisplayed()){
            Element.click(driver,projectConfigurationInList);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickNewAuditIcon() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (newAuditIcon.isDisplayed()){
            Element.click(driver,newAuditIcon);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickClientAuditStartDate() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (clientAuditStartDate.isDisplayed()) {
            Element.click(driver,clientAuditStartDate);
            Element.verifyElement(TodayInBootstrapCalender);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickClientAuditEndDate() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (clientAuditEndDate.isDisplayed()) {
            Element.click(driver,clientAuditEndDate);
            Element.verifyElement(TodayInBootstrapCalender);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickCalender() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (calender.size()!=0) {
//            Element.click(driver,calender.get(1));
//            Sync.Delay(2000);
//            Element.click(driver,TodayInBootstrapCalender);
            Element.click(driver,calender.get(2));
            Sync.Delay(2000);
            Element.click(driver,TodayInBootstrapCalender);
            Element.click(driver,calender.get(3));
            Sync.Delay(2000);
            Element.click(driver,TodayInBootstrapCalender);
            Element.click(driver,calender.get(4));
            Sync.Delay(2000);
            Element.click(driver,TodayInBootstrapCalender);
            Element.click(driver,calender.get(5));
            Sync.Delay(2000);
            Element.click(driver,TodayInBootstrapCalender);
//            Element.click(driver,calender.get(6));
//            Sync.Delay(2000);
//            Element.click(driver,TodayInBootstrapCalender);
//            Element.click(driver,calender.get(7));
//            Sync.Delay(2000);
//            Element.click(driver,TodayInBootstrapCalender);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean newAuditNameTxtBox(String auditName) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (newAuditName.isDisplayed()) {
            Element.click(driver,newAuditName);
            Textbox.enterValue(driver,newAuditName,auditName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyCreateAuditIcon() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (createAuditLabel.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAddDeadlineButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (addDeadline.isDisplayed()) {
            Element.click(driver,addDeadline);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectDeadlineTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (dropdownType.isDisplayed()){
            Element.click(driver,dropdownType);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectDeadlineOneDeadlineType() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (DeadlineOneDeadlineType.isDisplayed()){
            Element.click(driver,DeadlineOneDeadlineType);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectInitialLetterDeadlineType() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (InitialLetterDeadlineType.size()!=0){
            Element.click(driver,InitialLetterDeadlineType.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean scheduleRound() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (sliderRound.size()!=0) {
            Element.click(driver,sliderRound.get(6));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickFrequencyTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (frequencyTypeDropdown.isDisplayed()){
            Element.click(driver,frequencyTypeDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickOnceFrequencyTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (onceFrequencyTypeDropdown.isDisplayed()){
            Element.click(driver,onceFrequencyTypeDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickRecurringFrequencyTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (recurringFrequencyTypeDropdown.isDisplayed()){
            Element.click(driver,recurringFrequencyTypeDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean newDeadlineNameTxtBox(String auditName) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (deadlineNameTxtBox.isDisplayed()) {
            Textbox.enterValue(driver,deadlineNameTxtBox,auditName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean startDateDeadlineOne() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (startDate.isDisplayed()){
            Element.click(driver,startDate);
            Element.click(driver,TodayInBootstrapCalender);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean endDateDeadlineOne() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (endDate.isDisplayed()){
            Element.click(driver,endDate);
            js.executeScript("arguments[0].click();",TodayInBootstrapCalender);
            //Element.click(driver,TodayInBootstrapCalender);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean updateButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (updateButton.isDisplayed()){
            Element.click(driver,updateButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyDeadlineNameTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (deadlineNameTxtBox.isDisplayed()) {
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyAuditNameTxtBox() {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (newAuditName.isDisplayed()) {
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifySelectDeadlineTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (dropdownType.isDisplayed()){
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifySelectDeadlineTypeDropdownList() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (dropdownType.isDisplayed()){
            isClicked = true;
        }
        return isClicked;
    }

    public boolean unSelectEnglishLanguageFirst() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (englishLanguage.size()!=0){
            Element.click(driver,englishLanguage.get(2));
            Element.click(driver,spanishLanguage.get(2));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectEnglishLanguage() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (englishLanguage.size()!=0){
            for(int i=2;i<englishLanguage.size();i++){
                Element.click(driver,englishLanguage.get(i));
            }
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectSpanishLanguage() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (spanishLanguage.size()!=0){
            for(int i=2;i<spanishLanguage.size();i++){
                Element.click(driver,spanishLanguage.get(i));
            }
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyTrashButton() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (trashButton.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickTrashButton() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (trashButton.isDisplayed()){
            Element.click(driver,trashButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean systemCodes() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (systemCodes.isDisplayed()){
            Element.click(driver,systemCodes);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyManageIncompleteCodesLbl() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (ManageIncompleteCodesLbl.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyManageIneligibleCodesLbl() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (ManageIneligibleCodesLbl.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyDocumentsLbl() {
        boolean isVerified = false;
        Sync.Delay(10000);
        if (DocumentsLbl.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickManageIncompleteCodesBtn() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (ManageIncompleteCodesBtn.isDisplayed()){
            js.executeScript("arguments[0].click();",ManageIncompleteCodesBtn);
            //Element.click(driver,ManageIncompleteCodesBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickManageIneligibleCodesBtn() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (ManageIneligibleCodesBtn.isDisplayed()){
            js.executeScript("arguments[0].click();",ManageIneligibleCodesBtn);
            //Element.click(driver,ManageIneligibleCodesBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickManageDocumentsBtn() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (ManageDocumentsBtn.isDisplayed()){
            Element.click(driver,ManageDocumentsBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickIncompleteCodeLanguageDropdown() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (IncompleteCodeLanguageDropdown.isDisplayed()){
            Element.click(driver,IncompleteCodeLanguageDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickIncompleteCodeEnglishLanguageDropdown() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (IncompleteCodeEnglishLanguageDropdown.isDisplayed()){
            Element.click(driver,IncompleteCodeEnglishLanguageDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickIncompleteCodeSpanishLanguageDropdown() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (IncompleteCodeSpanishLanguageDropdown.isDisplayed()){
            Element.click(driver,IncompleteCodeSpanishLanguageDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddIncompleteCodesBtn() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (AddIncompleteCodesBtn.isDisplayed()){
            Element.click(driver,AddIncompleteCodesBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddIneligibleCodesBtn() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (AddIneligibleCodesBtn.isDisplayed()){
            js.executeScript("arguments[0].click();",AddIneligibleCodesBtn);
            //Element.click(driver,AddIneligibleCodesBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddManageDocumentsBtn() {
        boolean isClicked = false;
        Sync.Delay(7000);
        if (AddManageDocumentsBtn.isDisplayed()){
            js.executeScript("arguments[0].click();",AddManageDocumentsBtn);
            //Element.click(driver,AddManageDocumentsBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verbiageTxtBox(String verbiagetxt) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (verbiage.isDisplayed()) {
            Textbox.enterValue(driver,verbiage,verbiagetxt);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean actionItemVerbiageTxtBox(String verbiagetxt) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (actionItemVerbiage.isDisplayed()) {
            Textbox.enterValue(driver,actionItemVerbiage,verbiagetxt);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickDocumentTypeChoose() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (documentTypeChoose.isDisplayed()){
            Element.click(driver,documentTypeChoose);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyDocumentTypeChooseSearchTxtBox() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (documentTypeChooseSearchTxtBox.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickDocumentTypeChooseChkBox() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (documentTypeChooseChkBox.size()!=0){
            Element.click(driver,documentTypeChooseChkBox.get(1));
            Element.click(driver,documentTypeChooseChkBox.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddButtonInModal() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (addButton.isDisplayed()){
            Element.click(driver,addButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddButton() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (addButtonInModal.isDisplayed()){
            Element.click(driver,addButtonInModal);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEditIncompleteCodeBtn() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (editIncompleteCodeModal.isDisplayed()){
            Element.click(driver,editIncompleteCodeModal);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyEditIncompleteCodeElementsInModal() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (verbiage.isDisplayed()){
            if (actionItemVerbiage.isDisplayed()){
                if (documentTypeChoose.isDisplayed()){
                    if (IncompleteCodeLanguageDropdown.isDisplayed()){
                        isVerified = true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyEditButton() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (editSubClient.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyFilterSearchInIncompleteModal() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (filterSearch.size()==4){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyTypeFilterSearchInIncompleteModal() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (typeFilter.isDisplayed()) {
            Element.click(driver,typeFilter);
            Element.click(driver,allInTypeFilter);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyHeadersInIncompleteCodes() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (IdHeader.isDisplayed()){
            if (VerbiageHeader.isDisplayed()){
                if (ActionItemVerbiageHeader.isDisplayed()){
                    if (TypeHeader.isDisplayed()){
                        if (LanguageHeader.isDisplayed()){
                            if (IsActiveHeader.isDisplayed()){
                                isVerified=true;
                            }
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean clickDownloadGridIconInIncompleteCodes() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (downloadIcon.size()!=0) {
            Element.click(driver,downloadIcon.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickDownloadGridIconInIneligibleCodes() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (downloadIcon.size()!=0) {
            Element.click(driver,downloadIcon.get(1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickDownloadGridIconInDocuments() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (downloadIcon.size()!=0) {
            Element.click(driver,downloadIcon.get(2));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyHeadersInIneligibleCodes() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (IdHeader.isDisplayed()){
            if (VerbiageHeader.isDisplayed()){
                if (sortablecolumnTypeHeader.isDisplayed()){
                    if (sortablecolumnLanguageHeader.isDisplayed()){
                        isVerified=true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean selectAllDependentTypesInIneligibleModal() {
        boolean isClicked = false;
        Sync.Delay(2000);
//        if (CO.isDisplayed()){
//            js.executeScript("arguments[0].click();",CO);
//            isClicked = true;
//        }
        if (SP.isDisplayed()){
            js.executeScript("arguments[0].click();",SP);
            isClicked = true;
        }
        if (CH.isDisplayed()){
            js.executeScript("arguments[0].click();",CH);
            isClicked = true;
        }
        if (DP.isDisplayed()){
            js.executeScript("arguments[0].click();",DP);
            isClicked = true;
        }
//        if (HD.isDisplayed()){
//            js.executeScript("arguments[0].click();",HD);
//            isClicked = true;
//        }
        return isClicked;
    }

    public boolean clickLastSortIcon() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (SortIcon.size()!=0){
            Element.click(driver,SortIcon.get(SortIcon.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterVersionName(String ClientName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (versionName.isDisplayed()) {
            Textbox.enterValue(driver,versionName,ClientName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyEditIneligibleCodeLabel() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (EditIneligibleCodeLabel.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickDocumentTypeInDocumentModal() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (docType.isDisplayed()){
            Element.click(driver,docType);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickDocumentTypeInDocumentModalList() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (docTypeListInDropDown.size()!=0){
            Element.click(driver,docTypeListInDropDown.get(2));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEditDocumentModal() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (editDocumentModal.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyDocumentsHeaders() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (IdHeader.isDisplayed()){
            if (VerbiageInDocumentModal.isDisplayed()){
                if (DocumentTypeInDocumentModal.isDisplayed()){
                    if (SortableLanguagesInDocumentModal.isDisplayed()){
                        if (RelationshipInDocumentModal.isDisplayed()){
                            if (AffidavitTypeIdInDocumentModal.isDisplayed()){
                                isVerified=true;
                            }
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyClientDefaultPanel() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (clientDefaultLbl.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyTimelineTemplatePanel() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (timelineTemplatesLbl.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyToggleIcons() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (sliderRound.size()==6){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyLanguages() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (LanguagesLbl.isDisplayed()) {
            if (printLanguagesLbl.isDisplayed()) {
                isVerified = true;
            }
        }
        return isVerified;
    }

    public boolean verifyEditIcon() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (editSubClient.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyAddIcon() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (addSubClientLogoIcon.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyNewAuditIcon() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (AddNewAudit.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickConfigureButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (configureButton.isDisplayed()){
            Element.click(driver,configureButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyConfigureDependentSubTypes() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (ConfigureDependentSubTypesLbl.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickAddSubTypeButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddSubTypeButton.isDisplayed()){
            Element.click(driver,AddSubTypeButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelectAllInMultiselector() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (selectAllInMultiselector.isDisplayed()){
            Element.click(driver,selectAllInMultiselector);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyAddedTableInGrid() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (addedTableInGrid.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyProjectInformationHeader() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (projectInformationLbl.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyInactiveAuditToggle() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (inactiveActiveToggle.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyCreateAuditPlusIcon() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (AddNewAudit.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifySuccessfullyLogoUpdatedMessage() {
        boolean isVerified = false;
        //Sync.Delay(1000);
        if (SuccessfullyLogoUpdatedMessage.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyExclamationMark() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (exclamationWarningSymbol.size()==2){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickMapAlternateDocuments() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (mapAlternateDocuments.isDisplayed()){
            Element.click(driver,mapAlternateDocuments);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEditAlternateDocumentsLbl() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (editAlternateDocuments.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean selectAddedDocument(String addedDoc) {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (editAlternateDocuments.isDisplayed()){
            Element.click(driver,addedDoc,spanText);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifySelectedAlternateDocuments() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (selectedAlternateDocuments.size()!=0){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickFileUpload() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (FileUpload.size()!=0){
            Element.click(driver,FileUpload.get(FileUpload.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelectTemplateDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (SelectTemplateDropdown.isDisplayed()){
            Element.click(driver,SelectTemplateDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAddMilestoneTemplate() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (AddMilestoneTemplate.isDisplayed()){
            Element.click(driver,AddMilestoneTemplate);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterMilestoneTemplateName(String TemplateName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (MilestoneTemplateName.isDisplayed()) {
            Textbox.enterValue(driver,MilestoneTemplateName,TemplateName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enterEventDaysOutTxtBox(String TemplateName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (EventDaysOutTxtBox.isDisplayed()) {
            Textbox.enterValue(driver,EventDaysOutTxtBox,TemplateName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickMilestoneTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (MilestoneTypeDropdown.isDisplayed()){
            Element.click(driver,MilestoneTypeDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickInitialLetter() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (clickInitialLetter.isDisplayed()){
            Element.click(driver,clickInitialLetter);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEditButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (EditIcon.size()!=0){
            Element.click(driver,EditIcon.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickEditAuditIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (EditAuditIcon.isDisplayed()){
            Element.click(driver,EditAuditIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectDeadlineDate() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (Calendar.size()!=0){
            Element.click(driver,Calendar.get(2));
            Element.click(driver,DatePick);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectLastDateInMonth() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (LastDateInMonth.size()!=0){
            Element.click(driver,LastDateInMonth.get(LastDateInMonth.size()-1));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectLastCalendarDate() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (LastCalendarDate.size()!=0){
            Element.click(driver,LastCalendarDate.get(LastCalendarDate.size()-3));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean SwitchEmployeeMilestoneSlider() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (LastCalendarDate.size()!=0){
            Element.click(driver,LastCalendarDate.get(LastCalendarDate.size()-3));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickWalmartProjectConfiguration() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (WalmartProjectConfiguration.isDisplayed()){
            Element.click(driver,WalmartProjectConfiguration);
            isClicked = true;
        }
        return isClicked;
    }
}