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

    @And("^I should enter your (.*) in first name textbox$")
    public void iShouldEnterYourMiddleNameInFirstNameTextbox(String inBold) {
        assertTrue(actionContainer.accountPageActions.enterFirstName(Testdata.getValue(inBold)));
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

    @And("^I should click on lock icon on the account level$")
    public void iShouldClickOnLockIconOnTheAccountLevel() {
        assertTrue(actionContainer.accountPageActions.clickUnlockIcon());
    }

    @And("^I should click on lock icon on the dependent level$")
    public void iShouldClickOnLockIconOnTheDependentLevel() {
        assertTrue(actionContainer.accountPageActions.clickUnlockIconDependentLvl());
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

    @And("^I should click on Cancel button in dialog$")
    public void iShouldClickOnCancelButtonInDialog() {
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

    @And("^I should verify tasks headers$")
    public void iShouldVerifyTasksHeaders() {
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

    @And("^I should click on add icon$")
    public void iShouldClickOnAddIcon() {
        assertTrue(actionContainer.accountPageActions.clickAddIconSpan());
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

    @And("^I should select event type from the document modal$")
    public void iShouldSelectEventTypeFromTheDocumentModal() {
        assertTrue(actionContainer.accountPageActions.SelectDocumentEvents());
    }

    @And("^I should confirm the documents marked as not applicable$")
    public void iShouldConfirmTheDocumentsMarkedAsNotApplicable() {
//        assertTrue(actionContainer.accountPageActions.ConfirmNotApplicable());
    }

    @And("^I should verify the criteria in employee and dependent$")
    public void iShouldVerifyTheCriteriaInEmployeeAndDependent() {
        assertTrue(actionContainer.accountPageActions.verifyDependentEmployeeCriteria());
    }

    @And("^I should verify escalation icon next to Tasks header$")
    public void iShouldVerifyEscalationIconNextToTasksHeader() {
        assertTrue(actionContainer.accountPageActions.verifyEscalationIcon());
    }

    @And("^I should click on first task$")
    public void iShouldClickOnFirstTask() {
        assertTrue(actionContainer.accountPageActions.CompleteFirstTask());
    }

    @And("^I should complete second task$")
    public void iShouldCompleteSecondTask() {
        assertTrue(actionContainer.accountPageActions.CompleteSecondTask());
    }

    @And("^I should complete all tasks$")
    public void iShouldCompleteAllTasks() {
//        assertTrue(actionContainer.accountPageActions.verifyEscalationIcon());
    }

    @And("^I should click on other relation excluding current relation type$")
    public void iShouldClickOnOtherRelationExcludingCurrentRelationType() {
        assertTrue(actionContainer.accountPageActions.SelectReasonFromList());
    }

    @And("^I should verify outcome icons$")
    public void iShouldVerifyOutcomeIcons() {
        assertTrue(actionContainer.accountPageActions.VerifyOutcomeIcons());
    }

    @And("^I should click on call completed icon$")
    public void iShouldClickOnCallCompletedIcon() {
        assertTrue(actionContainer.accountPageActions.clickCompletedPhoneCallIcon());
    }

    @And("^I should release locked icon on the account level$")
    public void iShouldReleaseLockedIconOnTheAccountLevel() {
        assertTrue(actionContainer.accountPageActions.clickLockIcon());
    }

    @And("^I should verify refresh icon$")
    public void iShouldVerifyRefreshIcon() {
        assertTrue(actionContainer.accountPageActions.verifyRefreshIcon());
    }

    @And("^I should verify pencil icon$")
    public void iShouldVerifyPencilIcon() {
        assertTrue(actionContainer.accountPageActions.verifyPencilIcon());
    }

    @And("^I should verify trash icon$")
    public void iShouldVerifyTrashIcon() {
        assertTrue(actionContainer.accountPageActions.verifyTrashIcon());
    }

    @And("^I should verify today date$")
    public void iShouldVerifyTodayDate() {
        
    }

    @And("^I should verify today date extended to next year$")
    public void iShouldVerifyTodayDateExtendedToNextYear() {

    }

    @And("^I should click on select reason dropdown$")
    public void iShouldClickOnSelectReasonDropdown() {
        assertTrue(actionContainer.accountPageActions.clickSelcetReasonDropdown());
    }

    @And("^I should select the task type$")
    public void iShouldSelectTheTaskType() {
        assertTrue(actionContainer.accountPageActions.SelectTaskType());
    }

    @And("^I should check the newly added document$")
    public void iShouldCheckTheNewlyAddedDocument() {
        assertTrue(actionContainer.accountPageActions.SelectLastCheckbox());
    }

    @And("^I should select last added document$")
    public void iShouldSelectLastAddedDocument() {
        assertTrue(actionContainer.accountPageActions.clickAddLastDocIcon());
    }

    @And("^I should verify history header in account screen$")
    public void iShouldVerifyHistoryHeaderInAccountScreen() {
        assertTrue(actionContainer.accountPageActions.verifyHistoryHeader());
    }

    @And("^I should verify filterBy textbox in panel$")
    public void iShouldVerifyFilterByTextboxInPanel() {
        assertTrue(actionContainer.accountPageActions.verifyFilterBy());
    }

    @And("^I should verify the pagination located at the bottom$")
    public void iShouldVerifyThePaginationLocatedAtTheBottom() {
        assertTrue(actionContainer.accountPageActions.verifyPagination());
    }

    @And("^I should click on view activity from the grid$")
    public void iShouldClickOnViewActivityFromTheGrid() {
        assertTrue(actionContainer.accountPageActions.clickViewActivity());
    }

    @And("^I should click on view details from the grid$")
    public void iShouldClickOnViewDetailsFromTheGrid() {
        assertTrue(actionContainer.accountPageActions.clickViewDetails());
    }

    @And("^I should click on download icon$")
    public void iShouldClickOnDownloadIcon() {
        assertTrue(actionContainer.accountPageActions.clickDownloadIcon());
    }

    @And("^I should click on printer icon$")
    public void iShouldClickOnPrinterIcon() {
        assertTrue(actionContainer.accountPageActions.clickPrinterIcon());
    }

    @And("^I should click on clear filter icon$")
    public void iShouldClickOnClearFilterIcon() {
        assertTrue(actionContainer.accountPageActions.clickClearFilterIcon());
    }

    @And("^I should enter (.*) in third filter input textbox$")
    public void iShouldEnterTheSearchItemInThirdFilterInputTextbox(String filterItem) {
        assertTrue(actionContainer.accountPageActions.ThirdFilterTextbox(Testdata.getValue(filterItem)));
    }

    @And("^I should click on back arrow button$")
    public void iShouldClickOnBackArrowButton() {
        assertTrue(actionContainer.accountPageActions.clickArrowLeft());
    }

    @And("^I should click on forward arrow button$")
    public void iShouldClickOnForwardArrowButton() {
        assertTrue(actionContainer.accountPageActions.clickArrowRight());
    }

    @And("^I should verify disabled linkable button in approval column$")
    public void iShouldVerifyDisabledLinkableButtonInApprovalColumn() {
        assertTrue(actionContainer.accountPageActions.verifyDisabledLinkableButton());
    }

    @And("^I should verify disabled approved linkable button in approval column$")
    public void iShouldVerifyDisabledApprovedLinkableButtonInApprovalColumn() {
        assertTrue(actionContainer.accountPageActions.verifyDisabledApprovedButton());
    }

    @And("^I should verify active link button in link to iverify column$")
    public void iShouldVerifyActiveLinkButtonInLinkToIverifyColumn() {
        assertTrue(actionContainer.accountPageActions.verifyActiveLinkButton());
    }

    @And("^I should click on active link button in link to iverify column$")
    public void iShouldClickOnActiveLinkButtonInLinkToIverifyColumn() {
        assertTrue(actionContainer.accountPageActions.clickActiveLinkButton());
    }

    @And("^I should verify disabled link button in link to iverify column$")
    public void iShouldVerifyDisabledLinkButtonInLinkToIverifyColumn() {
        assertTrue(actionContainer.accountPageActions.verifyDisabledLinkButton());
    }

    @And("^I should verify disabled requested fro approval button in link to iverify column$")
    public void iShouldVerifyDisabledRequestedFroApprovalButtonInLinkToIverifyColumn() {
        assertTrue(actionContainer.accountPageActions.verifyDisabledRequestedForApprovalButton());
    }

    @And("^I should click on ticket number to open the ticket$")
    public void iShouldClickOnTicketNumberToOpenTheTicket() {
        assertTrue(actionContainer.accountPageActions.clickHelpTicketId());
    }

    @And("^I should click on VIP confirmation dropdown$")
    public void iShouldClickOnVIPConfirmationDropdown() {
        assertTrue(actionContainer.accountPageActions.clickVIPDropdown());
    }

    @And("^I should verify the VIP badge after lastname$")
    public void iShouldVerifyTheVIPBadgeAfterLastname() {
        assertTrue(actionContainer.accountPageActions.verifyVIPBadge());
    }

    @And("^I should not verify the VIP badge after lastname$")
    public void iShouldNotVerifyTheVIPBadgeAfterLastname() {
        assertTrue(actionContainer.accountPageActions.verifyNoVIPBadge());
    }

    @And("^I should click on dependent milestone in dependent tab$")
    public void iShouldClickOnDependentMilestoneInDependentTab() {
        assertTrue(actionContainer.accountPageActions.clickDependentMilestone());
    }

    @And("^I should not verify NewPackage in table data$")
    public void iShouldNotVerifyNewPackageInTableData() {
        assertTrue(actionContainer.accountPageActions.NotVerifyNewPackage());
    }

    @And("^I should not verify PortalInquiry text in Table Data$")
    public void iShouldNotVerifyPortalInquiryTextInTableData() {
        assertTrue(actionContainer.accountPageActions.NotVerifyNewPortalInquiry());
    }

    @And("^I should click on Save Button in portal enquiry$")
    public void iShouldClickOnSaveButtonInPortalEnquiry() {
        assertTrue(actionContainer.accountPageActions.clickSaveButtonInDialogBox());
    }

    @And("^I should verify the term employee icon$")
    public void iShouldVerifyTheTermEmployeeIcon() {
        assertTrue(actionContainer.accountPageActions.VerifyTermEmployeeIcon());
    }

    @And("^I should not verify the term employee icon$")
    public void iShouldNotVerifyTheTermEmployeeIcon() {
        assertTrue(actionContainer.accountPageActions.NotVerifyTermEmployeeIcon());
    }

    @And("^I should click the term employee icon$")
    public void iShouldClickTheTermEmployeeIcon() {
        assertTrue(actionContainer.accountPageActions.clickTermEmployeeIcon());
    }

    @And("^I should click on auditor dropdown in inventory modal$")
    public void iShouldClickOnAuditorDropdownInInventoryModal() {
        assertTrue(actionContainer.accountPageActions.clickAuditorDropdown());
    }

    @And("^I should verify no active dependents label$")
    public void iShouldVerifyNoActiveDependentsLabel() {
        assertTrue(actionContainer.accountPageActions.verifyNoAciveAuditLabel());
    }

    @And("^I should verify the completed benefit type$")
    public void iShouldVerifyTheCompletedBenefitType() {
        assertTrue(actionContainer.accountPageActions.verifyCompletedBenefitInitial());
    }

    @And("^I should verify the completed date in required date format$")
    public void iShouldVerifyTheCompletedDateInRequiredDateFormat() {
        assertTrue(actionContainer.accountPageActions.verifyCompletedBenefitInitial());
    }

    @And("^I should verify enabled benefit type in the modal$")
    public void iShouldVerifyEnabledBenefitTypeInTheModal() {
        assertTrue(actionContainer.accountPageActions.verifyEnabledBenefitType());
    }

    @And("^I should enter (.*) date in completed date modal$")
    public void iShouldEnterDateInCompletedDateModal(String date) {
        assertTrue(actionContainer.accountPageActions.EnterCalendarInCompleteDateModal(Testdata.getValue(date)));
    }

    @And("^I should complete all documents listed$")
    public void iShouldCompleteAllDocumentsListed() {
        assertTrue(actionContainer.accountPageActions.CompleteDocuments());
    }

    @And("^I should click on complete random task$")
    public void iShouldClickOnCompleteRandomTask() {
        assertTrue(actionContainer.accountPageActions.clickTaskCheckIcon());
    }

    @And("^I should verify error message for completed date$")
    public void iShouldVerifyErrorMessageForCompletedDate() {
        assertTrue(actionContainer.accountPageActions.verifyErrorMessage());
    }

    @And("^I should click the purge dependent icon$")
    public void iShouldClickThePurgeDependentIcon() {
        assertTrue(actionContainer.accountPageActions.clickPurgeDependent());
    }

    @And("^I should click the purge employee icon$")
    public void iShouldClickThePurgeEmployeeIcon() {
        assertTrue(actionContainer.accountPageActions.clickPurgeEmployee());
    }

    @And("^I should verify error icon in the displayed modal$")
    public void iShouldVerifyErrorIconInTheDisplayedModal() {
        assertTrue(actionContainer.accountPageActions.verifyErrorIcon());
    }

    @And("^I should click on activity log fom the dropdown$")
    public void iShouldClickOnActivityLogFomTheDropdown() {
        assertTrue(actionContainer.accountPageActions.clickActivityLog());
    }

    @And("^I should verify activity logs header in newly opened window$")
    public void iShouldVerifyActivityLogsHeaderInNewlyOpenedWindow() {
        assertTrue(actionContainer.accountPageActions.verifyActivityLogHeader());
    }

    @And("^I should enter (.*) date in the date filter box$")
    public void iShouldEnterDateDateInTheDateFilterBox(String date) {
        assertTrue(actionContainer.accountPageActions.EnterDateFilter(Testdata.getValue(date)));
    }

    @And("^I should verify the list of activity performed by the logged user for last seven days$")
    public void iShouldVerifyTheListOfActivityPerformedByTheLoggedUserForLastSevenDays() {
//        assertTrue(actionContainer.accountPageActions.verifyDaySevenFromToday());
    }

    @And("^I should click on launch all audit icon$")
    public void iShouldClickOnLaunchAllAuditIcon() {
        assertTrue(actionContainer.accountPageActions.clickLaunchAllAuditIcon());
    }

    @And("^I should verify disabled Save button in the modal$")
    public void iShouldVerifyDisabledSaveButtonInTheModal() {
        assertTrue(actionContainer.accountPageActions.verifyDisabledSaveButtonInModal());
    }

    @And("^I should enter your (.*) in address one textbox$")
    public void iShouldEnterYourAddressInAddressOneTextbox(String inBold) {
        assertTrue(actionContainer.accountPageActions.enterAddressOne(Testdata.getValue(inBold)));
    }

    @And("^I should verify changed dependent relation type$")
    public void iShouldVerifyChangedDependentRelationType() {
    }

    @And("^I should select audit from the dropdown$")
    public void iShouldSelectAuditFromTheDropdown() {
        assertTrue(actionContainer.accountPageActions.SelectAuditTypeInDropdown());
    }

    @And("^I should select all from dependent dropdown$")
    public void iShouldSelectAllFromDependentDropdown() {
        assertTrue(actionContainer.accountPageActions.SelectAllCheckboxInDropdown());
    }

    @And("^I should click on Auditor dropdown to select an audit$")
    public void iShouldClickOnAuditorDropdownToSelectAnAudit() {
        assertTrue(actionContainer.accountPageActions.clickAuditorsDropdown());
    }

    @And("^I should open the admin ticket by clicking admin ticket number$")
    public void iShouldOpenTheAdminTicketByClickingAdminTicketNumber() {
        assertTrue(actionContainer.accountPageActions.clickAdminTicketNo());
    }
}