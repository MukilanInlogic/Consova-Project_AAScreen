package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import demotest.util.ActionContainer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AccountPageSteps {
    private ActionContainer actionContainer;

    public AccountPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I should enter account url (.*) with (.*)$")
    public void iShouldEnterAccountUrlAccountURLWithAccountnumber(String url,String accNo) {
        assertTrue(actionContainer.accountPageActions.enterAccountURL(Testdata.getValue(url),Testdata.getValue(accNo)));
    }

    @And("^I should click on load audit icon$")
    public void iShouldClickOnLoadAuditIcon() {
        assertTrue(actionContainer.accountPageActions.LaunchAudit());
    }

    @And("^I should click on edit button to edit employee Demographics$")
    public void iShouldClickOnEditButtonToEditEmployeeDemographics() {
        assertTrue(actionContainer.accountPageActions.clickEditButtonOne());
    }

    @And("^I should click on edit button to edit employee contact info$")
    public void iShouldClickOnEditButtonToEditEmployeeContactInfo() {
        assertTrue(actionContainer.accountPageActions.clickEditButtonTwo());
    }

    @And("^I should click on edit button to edit dependent Demographics$")
    public void iShouldClickOnEditButtonToEditDependentDemographics() {
        assertTrue(actionContainer.accountPageActions.clickEditButtonThree());
    }

    @And("^I should enter your (.*) in email textbox$")
    public void iShouldEnterYourEmailIdInEmailTextbox(String inBold) {
        assertTrue(actionContainer.accountPageActions.enterEmailId(Testdata.getValue(inBold)));
    }

    @And("^I should enter your (.*) in middle name textbox$")
    public void iShouldEnterYourMiddleNameInMiddleNameTextbox(String inBold) {
        assertTrue(actionContainer.accountPageActions.enterMiddleName(Testdata.getValue(inBold)));
    }

    @And("^I should enter your (.*) in address textbox$")
    public void iShouldEnterYourAddressInAddressTextbox(String inBold) {
        assertTrue(actionContainer.accountPageActions.enterAddress(Testdata.getValue(inBold)));
    }

    @And("^I should verify the active dependent tab with dependent name$")
    public void iShouldVerifyTheActiveDependentTabWithDependentName() {
        assertTrue(actionContainer.accountPageActions.verifyActiveDependnetTab());
    }

    @And("^I should click the second dependent tab$")
    public void iShouldClickTheSecondDependentTab() {
        assertTrue(actionContainer.accountPageActions.clickInactiveDependentTab());
    }

    @And("^I should verify the dependent relation$")
    public void iShouldVerifyTheDependentRelation() {
        
    }

    @And("^I should verify the date in the given format$")
    public void iShouldVerifyTheDateInTheGivenFormat() {
    }

    @And("^I should verify delete audit button in the dependent section$")
    public void iShouldVerifyDeleteAuditButtonInTheDependentSection() {
        assertTrue(actionContainer.accountPageActions.verifyDeleteIcon());
    }

    @And("^I should click delete audit button in the dependent section$")
    public void iShouldClickDeleteAuditButtonInTheDependentSection() {
        assertTrue(actionContainer.accountPageActions.clickDeleteIcon());
    }

    @And("^I should select the reason for remove audit$")
    public void iShouldSelectTheReasonForRemoveAudit() {
        assertTrue(actionContainer.accountPageActions.SelectReasonFromList());
    }

    @And("^I should accept the alert to remove from audit$")
    public void iShouldAcceptTheAlertToRemoveFromAudit() {
        assertTrue(actionContainer.accountPageActions.AcceptTheAlert());
    }

    @And("^I should click on lock icon on the dependent level$")
    public void iShouldClickOnLockIconOnTheDependentLevel() {
        assertTrue(actionContainer.accountPageActions.clickUnlockIcon());
    }

    @And("^I should verify locked icon on the dependent level$")
    public void iShouldVerifyLockedIconOnTheDependentLevel() {
        assertTrue(actionContainer.accountPageActions.verifyLockIcon());
    }

    @And("^I should click on employee alert button$")
    public void iShouldClickOnEmployeeAlertButton() {
        assertTrue(actionContainer.accountPageActions.clickEmployeeAlert());
    }

    @And("^I should click on dependent alert button$")
    public void iShouldClickOnDependentAlertButton() {
        assertTrue(actionContainer.accountPageActions.clickDependentAlert());
    }

    @And("^I should select one alert$")
    public void iShouldSelectOneAlert() {
        assertTrue(actionContainer.accountPageActions.SelectAlertsList());
    }

    @And("^I should verify the enabled alert$")
    public void iShouldVerifyTheEnabledAlert() {

    }

    @And("^I should click on (.*) button in dialog box$")
    public void iShouldClickOnSaveButtonInDialogBox(String inButton) {
        assertTrue(actionContainer.accountPageActions.clickSaveButtonInDialogBox(Testdata.getValue(inButton)));
    }

    @And("^I should click on delete icon in dialog box$")
    public void iShouldClickOnDeleteIconInDialogBox() {
        assertTrue(actionContainer.accountPageActions.clickDeleteButtonInDialogBox());
    }

    @And("^I should click on refresh icon in dialog box$")
    public void iShouldClickOnRefreshIconInDialogBox() {
        assertTrue(actionContainer.accountPageActions.clickRefreshButtonInDialogBox());
    }

    @And("^I should click on Cancel button in dialog box$")
    public void iShouldClickOnCancelButtonInDialogBox() {
        assertTrue(actionContainer.accountPageActions.clickCancelButtonInDialogBox());
    }

    @And("^I should enter (.*) in contact name textbox$")
    public void iShouldEnterContactNameInContactNameTextbox(String contactName) {
        assertTrue(actionContainer.accountPageActions.EnterContactName(Testdata.getValue(contactName)));
    }

    @And("^I should enter (.*) in contact number textbox$")
    public void iShouldEnterContactNumberInContactNumberTextbox(String contactNumber) {
        assertTrue(actionContainer.accountPageActions.EnterContactNumber(Testdata.getValue(contactNumber)));
    }

    @And("^I should verify (.*) text in disabled type div$")
    public void iShouldVerifyEmployeeTextInDisabledTypeDiv(String contactNumber) {
        assertTrue(actionContainer.accountPageActions.verifyDisabledTypeDiv(Testdata.getValue(contactNumber)));
    }

    @And("^I should verify (.*) text in disabled type input$")
    public void iShouldVerifyEmployeeTextInDisabledTypeInput(String contactNumber) {
        assertTrue(actionContainer.accountPageActions.verifyDisabledTypeInput(Testdata.getValue(contactNumber)));
    }

    @And("^I should enter (.*) in caller name textbox$")
    public void iShouldEnterCallerNameInCallerNameTextbox(String callerName) {
        assertTrue(actionContainer.accountPageActions.EnterCallerName(Testdata.getValue(callerName)));
    }

    @And("^I should verify sub client info on the account screen$")
    public void iShouldVerifySubClientInfoOnTheAccountScreen() {
        assertTrue(actionContainer.accountPageActions.verifySubclientInfo());
    }

    @And("^I should verify tasks header$")
    public void iShouldVerifyTasksHeader() {
        assertTrue(actionContainer.accountPageActions.verifyTasksHeader());
    }

    @And("^I should click on escalation icon$")
    public void iShouldClickOnEscalationIcon() {
        assertTrue(actionContainer.accountPageActions.clickEscalationIcon());
    }

    @And("^I should click on select escalation type dropdown$")
    public void iShouldClickOnSelectEscalationTypeDropdown() {
        assertTrue(actionContainer.accountPageActions.clickEscalationType());
    }

    @And("^I should click on select type untoched dropdown$")
    public void iShouldClickOnSelectTypeUntochedDropdown() {
        assertTrue(actionContainer.accountPageActions.clickSelectType());
    }

    @And("^I should click on add audit icon$")
    public void iShouldClickOnAddAuditIcon() {
        assertTrue(actionContainer.accountPageActions.clickAddIconSecond());
    }

    @And("^I should click on required audit name$")
    public void iShouldClickOnRequiredAuditName() {
        assertTrue(actionContainer.accountPageActions.clickAuditList());
    }

    @And("^I should click on eligibility to add event type$")
    public void iShouldClickOnEligibilityToAddEventType() {
        assertTrue(actionContainer.accountPageActions.clickEligibilityList());
    }

    @And("^I should click on add document plus icon$")
    public void iShouldClickOnAddDocumentPlusIcon() {
        assertTrue(actionContainer.accountPageActions.clickAddDocIcon());
    }

    @And("^I should select event type from the modal$")
    public void iShouldSelectEventTypeFromTheModal() {
        assertTrue(actionContainer.accountPageActions.SelectAddedEvents());
    }

    @And("^I should confirm the documents marked as not applicable$")
    public void iShouldConfirmTheDocumentsMarkedAsNotApplicable() {
//        assertTrue(actionContainer.accountPageActions.ConfirmNotApplicable());
    }
}