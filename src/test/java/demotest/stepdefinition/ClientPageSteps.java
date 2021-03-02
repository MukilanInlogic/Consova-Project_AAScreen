package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ClientPageSteps {
    private ActionContainer actionContainer;

    public ClientPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I should click on client configuration$")
    public void iShouldClickOnClientConfiguration() {
        assertTrue(actionContainer.clientPageActions.clientConfiguration());
    }

    @And("^I should click on Add Client icon$")
    public void iShouldClickOnAddClientIcon() {
        assertTrue(actionContainer.clientPageActions.addClientButton());
    }

    @And("^I should enter the (.*) in the clientname textbox$")
    public void iShouldEnterTheClientnameInTheClientnameTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.clientNameTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientsite textbox$")
    public void iShouldEnterTheClientsiteInTheClientsiteTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.clientSiteLinkTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientlogout url textbox$")
    public void iShouldEnterTheUrlInTheClientlogoutUrlTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.clientLogoutUrlTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the wikilink textbox$")
    public void iShouldEnterTheClientsiteInTheWikilinkTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.wikiLinkTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the phoneno textbox$")
    public void iShouldEnterThePhonenoInThePhonenoTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.clientPhoneNoTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientphoneid textbox$")
    public void iShouldEnterTheClientphoneidInTheClientphoneidTextbox(String firstNAme) {
        assertTrue(actionContainer.clientPageActions.clientPhoneIdTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter today date in the phoneassignmentfrom textbox$")
    public void iShouldEnterTodayDateInThePhoneassignmentfromTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodFromTxtBox());
    }

    @And("^I should enter today date in the phoneassignmentto textbox$")
    public void iShouldEnterTodayDateInThePhoneassignmenttoTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodToTxtBox());
    }

    @And("^I should select the clientservicerep in the clientservicerep dropdown$")
    public void iShouldSelectTheClientservicerepInTheClientservicerepDropdown() {
        assertTrue(actionContainer.clientPageActions.clientServiceRepSelect());
    }

    @And("^I should select the ivac language$")
    public void iShouldSelectTheIvacLanguage() {
        assertTrue(actionContainer.clientPageActions.ivacLanguageSelect());
    }

    @And("^I should select the communication language$")
    public void iShouldSelectTheCommunicationLanguage() {
        assertTrue(actionContainer.clientPageActions.communicationLanguageSelect());
    }

    @And("^I should select the communicationprint language$")
    public void iShouldSelectTheCommunicationprintLanguage() {
        assertTrue(actionContainer.clientPageActions.communicationPrintLanguageSelect());
    }

    @And("^I should select logo for the client$")
    public void iShouldSelectLogoForTheClient() {
        assertTrue(actionContainer.clientPageActions.logoUpload());
    }

    @And("^I should enter (.*) in the employee criteria field$")
    public void iShouldEnterEmployeeCriteriaInTheEmployeeCriteriaField(String employeecriteria) {
        assertTrue(actionContainer.clientPageActions.clientEditEmpTxtBox(Testdata.getValue(employeecriteria)));
    }

    @And("^I should enter (.*) in the dependent criteria field$")
    public void iShouldEnterDependentCriteriaInTheDependentCriteriaField(String dependentcriteria) {
        assertTrue(actionContainer.clientPageActions.clientEditDepTxtBox(Testdata.getValue(dependentcriteria)));
    }

    @And("^I should verify add sub client button$")
    public void iShouldVerifyAddSubClientButton() {
        assertTrue(actionContainer.clientPageActions.verifyAddSubClientButton());
    }

    @And("^I should search the added (.*) from left sided client list$")
    public void iShouldSearchTheAddedClientFromLeftSidedClientList(String clientname) {
        assertTrue(actionContainer.clientPageActions.clientSearchTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should verify client page$")
    public void iShouldVerifyClientPage() {
        assertTrue(actionContainer.clientPageActions.verifyClientPage());
    }

    @And("^I should click the added client from left sided client list$")
    public void iShouldClickTheAddedClientFromLeftSidedClientList() {
        assertTrue(actionContainer.clientPageActions.clickAddedClientInClientList());
    }

    @And("^I should verify Employee and Dependent has ten criteria fields$")
    public void iShouldVerifyEmployeeAndDependentHasTenCriteriaFields() {
        assertTrue(actionContainer.clientPageActions.verifyCountInCriteriaFields());
    }

    @And("^I should verify checkboxes for Iverify IverifyPro GoGreen upload docs and active status$")
    public void iShouldVerifyCheckboxesForIverifyIverifyProGoGreenUploadDocsAndActiveStatus() {
        assertTrue(actionContainer.clientPageActions.verifySliderRoundCheckboxes());
    }

    @And("^I should verify Add Client icon$")
    public void iShouldVerifyAddClientIcon() {
        assertTrue(actionContainer.clientPageActions.verifyAddClientButton());
    }

    @And("^I should verify the search client from left sided client list$")
    public void iShouldVerifyTheSearchClientFromLeftSidedClientList() {
        assertTrue(actionContainer.clientPageActions.verifyClientSearchTxtBox());
    }

    @And("^I should verify and click on inactive client and active client navigate slider$")
    public void iShouldVerifyAndClickOnInactiveClientAndActiveClientNavigateSlider() {
        assertTrue(actionContainer.clientPageActions.clickSliderRoundHideInactive());
    }

    @And("^I should verify the popup options$")
    public void iShouldVerifyThePopupOptions() {
        assertTrue(actionContainer.clientPageActions.verifyPopupOptions());
    }

    @And("^I should click on the Client Configuration sub menu option$")
    public void iShouldClickOnTheClientConfigurationSubMenuOption() {
        assertTrue(actionContainer.clientPageActions.clickclientConfigurationInList());
    }

    @And("^I should verify client information on the main panel$")
    public void iShouldVerifyClientInformationOnTheMainPanel() {
        assertTrue(actionContainer.clientPageActions.verifyClientInformation());
    }

    @And("^I should verify client logo on the page$")
    public void iShouldVerifyClientLogoOnThePage() {
        assertTrue(actionContainer.clientPageActions.verifyUploadedClientLogo());
    }

    @And("^I should verify add new logo beneath the client logo$")
    public void iShouldVerifyAddNewLogoBeneathTheClientLogo() {
        assertTrue(actionContainer.clientPageActions.verifyNewUploadClientLogo());
    }

    @And("^I should click on Add Sub Client button$")
    public void iShouldClickOnAddSubClientButton() {
        assertTrue(actionContainer.clientPageActions.clickAddSubClientButton());
    }

    @And("^I should enter the (.*) in the sub clientname textbox$")
    public void iShouldEnterTheSubclientnameInTheSubClientnameTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientNameTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the sub clientsite textbox$")
    public void iShouldEnterTheClientsiteInTheSubClientsiteTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientSiteLinkTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the sub client phoneno textbox$")
    public void iShouldEnterThePhonenoInTheSubClientPhonenoTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientPhoneNoTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should select the clientservicerep in the sub client clientservicerep dropdown$")
    public void iShouldSelectTheClientservicerepInTheSubClientClientservicerepDropdown() {
        assertTrue(actionContainer.clientPageActions.subClientServiceRepSelect());
    }

    @And("^I should enter today date in the sub client phoneassignmentfrom textbox$")
    public void iShouldEnterTodayDateInTheSubClientPhoneassignmentfromTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodFromInSubClientTxtBox());
    }

    @And("^I should enter today date in the sub client phoneassignmentto textbox$")
    public void iShouldEnterTodayDateInTheSubClientPhoneassignmenttoTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodToInSubClientTxtBox());
    }

    @And("^I should check round checkboxes for Iverify IverifyPro and upload docs$")
    public void iShouldCheckRoundCheckboxesForIverifyIverifyProAndUploadDocs() {
        assertTrue(actionContainer.clientPageActions.enableAllCheckboxes());
    }

    @And("^I should enter the (.*) in the sub client code textbox$")
    public void iShouldEnterTheCodeInTheSubClientCodeTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientCodeTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the sub clientphoneid textbox$")
    public void iShouldEnterTheSubclientphoneidInTheSubClientphoneidTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientPhoneIdTxtBox(Testdata.getValue(clientname)));
    }

    @And("^I should verify Edit Sub Client pencil icon$")
    public void iShouldVerifyEditSubClientPencilIcon() {
        assertTrue(actionContainer.clientPageActions.verifyEditSubClientButton());
    }

    @And("^I should click on Edit Sub Client pencil icon$")
    public void iShouldClickOnEditSubClientPencilIcon() {
        assertTrue(actionContainer.clientPageActions.clickEditSubClientButton());
    }

    @And("^I should verify edit sub client header in displayed modal$")
    public void iShouldVerifyEditSubClientHeaderInDisplayedModal() {
        assertTrue(actionContainer.clientPageActions.verifyEditSubClientHeaderInModal());
    }

    @And("^I should enter the (.*) in the edit sub clientname textbox$")
    public void iShouldEnterTheSubclientnameInTheEditSubClientnameTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientNameTxtBoxInEditModal(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the edit sub client phoneno textbox$")
    public void iShouldEnterThePhonenoInTheEditSubClientPhonenoTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientPhoneNoTxtBoxInEditModal(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the edit sub client code textbox$")
    public void iShouldEnterTheCodeInTheEditSubClientCodeTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientCodeTxtBoxInEditModal(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the edit sub clientsite textbox$")
    public void iShouldEnterTheClientsiteInTheEditSubClientsiteTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientSiteLinkTxtBoxInEditModal(Testdata.getValue(clientname)));
    }

    @And("^I should enter the (.*) in the edit sub clientphoneid textbox$")
    public void iShouldEnterTheSubclientphoneidInTheEditSubClientphoneidTextbox(String clientname) {
        assertTrue(actionContainer.clientPageActions.subClientPhoneIdTxtBoxInEditModal(Testdata.getValue(clientname)));
    }

    @And("^I should enter today date in the edit sub client phoneassignmentfrom textbox$")
    public void iShouldEnterTodayDateInTheEditSubClientPhoneassignmentfromTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodFromInSubClientTxtBoxInEditModal());
    }

    @And("^I should enter today date in the edit sub client phoneassignmentto textbox$")
    public void iShouldEnterTodayDateInTheEditSubClientPhoneassignmenttoTextbox() {
        assertTrue(actionContainer.clientPageActions.assignedPeriodToInSubClientTxtBoxInEditModal());
    }

    @And("^I should click on view icon to view the uploaded logo$")
    public void iShouldClickOnViewIconToViewTheUploadedLogo() {
        assertTrue(actionContainer.clientPageActions.clickViewSubClientLogo());
    }

    @And("^I should verify the popup message of no logo to display$")
    public void iShouldVerifyThePopupMessageOfNoLogoToDisplay() {
        assertTrue(actionContainer.clientPageActions.verifyNoSubClientLogoToDisplay());
    }

    @And("^I should upload the logo via plus icon$")
    public void iShouldUploadTheLogoViaPlusIcon() {
//        assertTrue(actionContainer.clientPageActions.subClientLogoUpload());
    }

    @And("^I should not get the popup message of no logo to display$")
    public void iShouldNotGetThePopupMessageOfNoLogoToDisplay() {
        assertTrue(actionContainer.clientPageActions.verifyNoSubClientLogoNotToDisplay());
    }

    @And("^I should verify the (.*) in the sub client row$")
    public void iShouldVerifyTheSubclientnameInTheSubClientRow(String subclientname) {
        assertTrue(actionContainer.clientPageActions.verifySubClientElements(Testdata.getValue(subclientname)));
    }

    @And("^I should click on (.*) icon to verify the client site$")
    public void iShouldClickOnClientsiteIconToVerifyTheClientSite(String subclientname) {
        assertTrue(actionContainer.clientPageActions.clickSubClientSite(Testdata.getValue(subclientname)));
    }

    @And("^I should verify the view icon to view the uploaded logo$")
    public void iShouldVerifyTheViewIconToViewTheUploadedLogo() {
        assertTrue(actionContainer.clientPageActions.verifyViewSubClientLogo());
    }

    @And("^I should verify the sub clientphoneid textbox$")
    public void iShouldVerifyTheSubClientphoneidTextbox() {
        assertTrue(actionContainer.clientPageActions.verifySubClientPhoneIdTxtBox());
    }

    @And("^I should verify today date in the sub client phoneassignmentfrom textbox$")
    public void iShouldVerifyTodayDateInTheSubClientPhoneassignmentfromTextbox() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodFromInSubClientTxtBox());
    }

    @And("^I should verify today date in the sub client phoneassignmentto textbox$")
    public void iShouldVerifyTodayDateInTheSubClientPhoneassignmenttoTextbox() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodToInSubClientTxtBox());
    }

    @And("^I should verify the edit sub clientphoneid textbox$")
    public void iShouldVerifyTheEditSubClientphoneidTextbox() {
        assertTrue(actionContainer.clientPageActions.verifySubClientPhoneIdTxtBoxInEditModal());
    }

    @And("^I should verify today date in the edit sub client phoneassignmentfrom textbox$")
    public void iShouldVerifyTodayDateInTheEditSubClientPhoneassignmentfromTextbox() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodFromInSubClientTxtBoxInEditModal());
    }

    @And("^I should verify today date in the edit sub client phoneassignmentto textbox$")
    public void iShouldVerifyTodayDateInTheEditSubClientPhoneassignmenttoTextbox() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodToInSubClientTxtBoxInEditModal());
    }

    @And("^I should verify the clientphoneid textbox in add client modal$")
    public void iShouldVerifyTheClientphoneidTextboxInAddClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyClientPhoneIdTxtBox());
    }

    @And("^I should verify today date in the phoneassignmentfrom textbox in add client modal$")
    public void iShouldVerifyTodayDateInThePhoneassignmentfromTextboxInAddClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodFromTxtBox());
    }

    @And("^I should verify today date in the phoneassignmentto textbox in add client modal$")
    public void iShouldVerifyTodayDateInThePhoneassignmenttoTextboxInAddClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodToTxtBox());
    }

    @And("^I should verify the clientphoneid textbox in edit client modal$")
    public void iShouldVerifyTheClientphoneidTextboxInEditClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyClientPhoneIdTxtBox());
    }

    @And("^I should verify today date in the phoneassignmentfrom textbox in edit client modal$")
    public void iShouldVerifyTodayDateInThePhoneassignmentfromTextboxInEditClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodFromTxtBox());
    }

    @And("^I should verify today date in the phoneassignmentto textbox in edit client modal$")
    public void iShouldVerifyTodayDateInThePhoneassignmenttoTextboxInEditClientModal() {
        assertTrue(actionContainer.clientPageActions.verifyAssignedPeriodToTxtBox());
    }

    @And("^I should click on project configuration$")
    public void iShouldClickOnProjectConfiguration() {
        assertTrue(actionContainer.clientPageActions.clickProjectConfigurationInList());
    }

    @And("^I should click on new audit icon$")
    public void iShouldClickOnNewAuditIcon() {
        assertTrue(actionContainer.clientPageActions.clickNewAuditIcon());
    }

    @And("^I should enter today date in client audit start date$")
    public void iShouldEnterTodayDateInClientAuditStartDate() {
        assertTrue(actionContainer.clientPageActions.clickClientAuditStartDate());
    }

    @And("^I should enter today date in client audit end date$")
    public void iShouldEnterTodayDateInClientAuditEndDate() {
        assertTrue(actionContainer.clientPageActions.clickClientAuditEndDate());
    }

    @And("^I should enter today date in client audit iverify start date$")
    public void iShouldEnterTodayDateInClientAuditIverifyStartDate() {
        assertTrue(actionContainer.clientPageActions.clickCalender());
    }

    @And("^I should enter today date in client audit iverify end date$")
    public void iShouldEnterTodayDateInClientAuditIverifyEndDate() {
        //assertTrue(actionContainer.clientPageActions.clickCalender());
    }

    @And("^I should enter today date in client audit iverifypro start date$")
    public void iShouldEnterTodayDateInClientAuditIverifyproStartDate() {
    }

    @And("^I should enter today date in client audit iverifypro end date$")
    public void iShouldEnterTodayDateInClientAuditIverifyproEndDate() {
    }

    @And("^I should enter today date in client audit upload docs start date$")
    public void iShouldEnterTodayDateInClientAuditUploadDocsStartDate() {
    }

    @And("^I should enter today date in client audit upload docs end date$")
    public void iShouldEnterTodayDateInClientAuditUploadDocsEndDate() {
    }

    @And("^I should verify the create audit label$")
    public void iShouldVerifyTheCreateAuditLabel() {
        assertTrue(actionContainer.clientPageActions.verifyCreateAuditIcon());
    }

    @And("^I should enter the (.*) in the create audit name$")
    public void iShouldEnterTheAuditnameInTheCreateAuditName(String auditName) {
        assertTrue(actionContainer.clientPageActions.newAuditNameTxtBox(Testdata.getValue(auditName)));
    }

    @And("^I should click on add deadline button$")
    public void iShouldClickOnAddDeadlineButton() {
        assertTrue(actionContainer.clientPageActions.clickAddDeadlineButton());
    }

    @And("^I should click on edit created audit$")
    public void iShouldClickOnEditCreatedAudit() {
        assertTrue(actionContainer.clientPageActions.clickEditSubClientButton());
    }

    @And("^I should enter the (.*) in the deadline one textbox$")
    public void iShouldEnterTheDeadlineoneInTheDeadlineOneTextbox(String deadline) {
        assertTrue(actionContainer.clientPageActions.newDeadlineNameTxtBox(Testdata.getValue(deadline)));
    }

    @And("^I should select the type from type dropdown$")
    public void iShouldSelectTheTypeFromTypeDropdown() {
        assertTrue(actionContainer.clientPageActions.selectDeadlineTypeDropdown());
    }

    @And("^I should select the deadline one type from dropdown list$")
    public void iShouldSelectTheDeadlineTypeFromDropdownList() {
        assertTrue(actionContainer.clientPageActions.selectDeadlineOneDeadlineType());
    }

    @And("^I should select the initial letter type from dropdown list$")
    public void iShouldSelectTheInitialLetterTypeFromDropdownList() {
        assertTrue(actionContainer.clientPageActions.selectInitialLetterDeadlineType());
    }

    @And("^I should enable the schedule$")
    public void iShouldEnableTheSchedule() {
        assertTrue(actionContainer.clientPageActions.scheduleRound());
    }

    @And("^I should click on frequeny type dropdown$")
    public void iShouldClickOnFrquesnyTypeDropdown() {
        assertTrue(actionContainer.clientPageActions.clickFrequencyTypeDropdown());
    }

    @And("^I should select once from frquency type$")
    public void iShouldSelectOnceFromFrquencyType() {
        assertTrue(actionContainer.clientPageActions.clickOnceFrequencyTypeDropdown());
    }

    @And("^I should select today date in start date of deadline one$")
    public void iShouldSelectTodayDateInStartDateOfDeadlineOne() {
        assertTrue(actionContainer.clientPageActions.startDateDeadlineOne());
    }

    @And("^I should click on Update button in displayed modal$")
    public void iShouldClickOnUpdateButtonInDispalyedModal() {
        assertTrue(actionContainer.clientPageActions.updateButton());
    }

    @And("^I should verify the create audit name$")
    public void iShouldVerifyTheCreateAuditName() {
        assertTrue(actionContainer.clientPageActions.verifyAuditNameTxtBox());
    }

    @And("^I should verify the deadline one textbox$")
    public void iShouldVerifyTheDeadlineOneTextbox() {
        assertTrue(actionContainer.clientPageActions.verifyDeadlineNameTxtBox());
    }

    @And("^I should verify the type from type dropdown$")
    public void iShouldVerifyTheTypeFromTypeDropdown() {
        assertTrue(actionContainer.clientPageActions.verifySelectDeadlineTypeDropdown());
    }

    @And("^I should verify the deadline types from dropdown list$")
    public void iShouldVerifyTheDeadlineTypesFromDropdownList() {
        assertTrue(actionContainer.clientPageActions.verifySelectDeadlineTypeDropdownList());
    }

    @And("^I should select English language in all options$")
    public void iShouldSelectEnglishLanguageInAllOptions() {
        assertTrue(actionContainer.clientPageActions.selectEnglishLanguage());
    }

    @And("^I should select Spanish language in all options$")
    public void iShouldSelectSpanishLanguageInAllOptions() {
        assertTrue(actionContainer.clientPageActions.selectSpanishLanguage());
    }

    @And("^I should select De English language in all options$")
    public void iShouldSelectDeEnglishLanguageInAllOptions() {
        assertTrue(actionContainer.clientPageActions.selectEnglishLanguage());
    }

    @And("^I should select De Spanish language in all options$")
    public void iShouldSelectDeSpanishLanguageInAllOptions() {
        assertTrue(actionContainer.clientPageActions.selectSpanishLanguage());
    }

    @And("^I should de select English language in all options$")
    public void iShouldDeSelectEnglishLanguageInAllOptions() {
        assertTrue(actionContainer.clientPageActions.unSelectEnglishLanguageFirst());
    }

    @And("^I should verify the trash button$")
    public void iShouldVerifyTheTrashButton() {
        assertTrue(actionContainer.clientPageActions.verifyTrashButton());
    }

    @And("^I should click on trash button$")
    public void iShouldClickOnTrashButton() {
        assertTrue(actionContainer.clientPageActions.clickTrashButton());
    }

    @And("^I should select recurring from frquency type$")
    public void iShouldSelectRecurringFromFrquencyType() {
        assertTrue(actionContainer.clientPageActions.clickRecurringFrequencyTypeDropdown());
    }

    @And("^I should select today date in end date of deadline one$")
    public void iShouldSelectTodayDateInEndDateOfDeadlineOne() {
        assertTrue(actionContainer.clientPageActions.endDateDeadlineOne());
    }

    @And("^I should click on System codes$")
    public void iShouldClickOnSystemCodes() {
        assertTrue(actionContainer.clientPageActions.systemCodes());
    }

    @And("^I should verify incomplete codes label$")
    public void iShouldVerifyIncompleteCodesLabel() {
        assertTrue(actionContainer.clientPageActions.verifyManageIncompleteCodesLbl());
    }

    @And("^I should click on manage incomplete codes$")
    public void iShouldClickOnManageIncompleteCodes() {
        assertTrue(actionContainer.clientPageActions.clickManageIncompleteCodesBtn());
    }

    @And("^I should click on add incomplete codes$")
    public void iShouldClickOnAddIncompleteCodes() {
        assertTrue(actionContainer.clientPageActions.clickAddIncompleteCodesBtn());
    }

    @And("^I should click on language dropdown$")
    public void iShouldClickOnLanguageDropdown() {
        assertTrue(actionContainer.clientPageActions.clickIncompleteCodeLanguageDropdown());
    }

    @And("^I should click on English Language$")
    public void iShouldClickOnEnglishLanguage() {
        assertTrue(actionContainer.clientPageActions.clickIncompleteCodeEnglishLanguageDropdown());
    }

    @And("^I should enter (.*) code in verbiage textarea$")
    public void iShouldEnterEnglishVerbiageCodeInVerbiageTextarea(String verbiagetxt) {
        assertTrue(actionContainer.clientPageActions.verbiageTxtBox(Testdata.getValue(verbiagetxt)));
    }

    @And("^I should enter (.*) code in action item verbiage textarea$")
    public void iShouldEnterEnglishVerbiageCodeInActionItemVerbiageTextarea(String verbiagetxt) {
        assertTrue(actionContainer.clientPageActions.actionItemVerbiageTxtBox(Testdata.getValue(verbiagetxt)));
    }

    @And("^I should click on choose document type dropdown$")
    public void iShouldClickOnChooseDocumentTypeDropdown() {
        assertTrue(actionContainer.clientPageActions.clickDocumentTypeChoose());
    }

    @And("^I should verify search textbox inside choose document type dropdown$")
    public void iShouldVerifySearchTextboxInsideChooseDocumentTypeDropdown() {
        assertTrue(actionContainer.clientPageActions.verifyDocumentTypeChooseSearchTxtBox());
    }

    @And("^I should click on checkboxes by selecting all$")
    public void iShouldClickOnCheckboxesBySelectingAll() {
        assertTrue(actionContainer.clientPageActions.clickDocumentTypeChooseChkBox());
    }

    @And("^I should click on Spanish Language$")
    public void iShouldClickOnSpanishLanguage() {
        assertTrue(actionContainer.clientPageActions.clickIncompleteCodeSpanishLanguageDropdown());
    }

    @And("^I should click on Add button in modal$")
    public void iShouldClickOnAddButtonInModal() {
        assertTrue(actionContainer.clientPageActions.clickAddButtonInModal());
    }

    @And("^I should click on Add button$")
    public void iShouldClickOnAddButton() {
        assertTrue(actionContainer.clientPageActions.clickAddButton());
    }

    @And("^I should verify edit incomplete code modal$")
    public void iShouldVerifyEditIncompleteCodeModal() {
        assertTrue(actionContainer.clientPageActions.verifyEditIncompleteCodeBtn());
    }

    @And("^I should verify edit modal elements in incomplete code modal$")
    public void iShouldVerifyEditModalElementsInIncompleteCodeModal() {
        assertTrue(actionContainer.clientPageActions.verifyEditIncompleteCodeElementsInModal());
    }

    @And("^I should verify edit buttons in the row list$")
    public void iShouldVerifyEditButtonsInTheRowList() {
        assertTrue(actionContainer.clientPageActions.verifyEditButton());
    }

    @And("^I should verify filter search in incomplete modal$")
    public void iShouldVerifyFilterSearchInIncompleteModal() {
        assertTrue(actionContainer.clientPageActions.verifyFilterSearchInIncompleteModal());
    }

    @And("^I should verify type filter dropdown select in incomplete modal$")
    public void iShouldVerifyTypeFilterDropdownSelectInIncompleteModal() {
        assertTrue(actionContainer.clientPageActions.verifyTypeFilterSearchInIncompleteModal());
    }

    @And("^I should verify headers in incomplete modal$")
    public void iShouldVerifyHeadersInIncompleteModal() {
        assertTrue(actionContainer.clientPageActions.verifyHeadersInIncompleteCodes());
    }

    @And("^I should click on download grid icon in incomplete codes$")
    public void iShouldClickOnDownloadGridIconInIncompleteCodes() {
        assertTrue(actionContainer.clientPageActions.clickDownloadGridIconInIncompleteCodes());
    }

    @And("^I should click on download grid icon in ineligible codes$")
    public void iShouldClickOnDownloadGridIconInIneligibleCodes() {
        assertTrue(actionContainer.clientPageActions.clickDownloadGridIconInIneligibleCodes());
    }

    @And("^I should verify ineligible codes label$")
    public void iShouldVerifyIneligibleCodesLabel() {
        assertTrue(actionContainer.clientPageActions.verifyManageIneligibleCodesLbl());
    }

    @And("^I should click on manage ineligible codes$")
    public void iShouldClickOnManageIneligibleCodes() {
        assertTrue(actionContainer.clientPageActions.clickManageIneligibleCodesBtn());
    }

    @And("^I should verify headers in ineligible modal$")
    public void iShouldVerifyHeadersInIneligibleModal() {
        assertTrue(actionContainer.clientPageActions.verifyHeadersInIneligibleCodes());
    }

    @And("^I should click on add ineligible codes$")
    public void iShouldClickOnAddIneligibleCodes() {
        assertTrue(actionContainer.clientPageActions.clickAddIneligibleCodesBtn());
    }

    @And("^I should select all dependents in ineligible modal$")
    public void iShouldSelectAllDependentsInIneligibleModal() {
        assertTrue(actionContainer.clientPageActions.selectAllDependentTypesInIneligibleModal());
    }

    @And("^I should enter (.*) in the version textbox$")
    public void iShouldEnterVersionnameInTheVersionTextbox(String versionName) {
        assertTrue(actionContainer.clientPageActions.enterVersionName(Testdata.getValue(versionName)));
    }

    @And("^I should verify edit ineligible code$")
    public void iShouldVerifyEditIneligibleCode() {
        assertTrue(actionContainer.clientPageActions.verifyEditIneligibleCodeLabel());
    }

    @And("^I should verify Documents label$")
    public void iShouldVerifyDocumentsLabel() {
        assertTrue(actionContainer.clientPageActions.verifyDocumentsLbl());
    }

    @And("^I should click on manage documents$")
    public void iShouldClickOnManageDocuments() {
        assertTrue(actionContainer.clientPageActions.clickManageDocumentsBtn());
    }

    @And("^I should click on add documents$")
    public void iShouldClickOnAddDocuments() {
        assertTrue(actionContainer.clientPageActions.clickAddManageDocumentsBtn());
    }

    @And("^I should click on choose document type dropdown in documents modal$")
    public void iShouldClickOnChooseDocumentTypeDropdownInDocumentsModal() {
        assertTrue(actionContainer.clientPageActions.clickDocumentTypeInDocumentModal());
    }

    @And("^I should select document type dropdown in documents modal$")
    public void iShouldSelectDocumentTypeDropdownInDocumentsModal() {
        assertTrue(actionContainer.clientPageActions.clickDocumentTypeInDocumentModalList());
    }

    @And("^I should verify edit document modal$")
    public void iShouldVerifyEditDocumentModal() {
        assertTrue(actionContainer.clientPageActions.verifyEditDocumentModal());
    }

    @And("^I should verify headers in the document modal$")
    public void iShouldVerifyHeadersInTheDocumentModal() {
        assertTrue(actionContainer.clientPageActions.verifyDocumentsHeaders());
    }

    @And("^I should verify the client default panel$")
    public void iShouldVerifyTheClientDefaultPanel() {
        assertTrue(actionContainer.clientPageActions.verifyClientDefaultPanel());
    }

    @And("^I should verify the timeline templates panel$")
    public void iShouldVerifyTheTimelineTemplatesPanel() {
        assertTrue(actionContainer.clientPageActions.verifyTimelineTemplatePanel());
    }

    @And("^I should verify the edit pencil icon on templates$")
    public void iShouldVerifyTheEditPencilIconOnTemplates() {
        assertTrue(actionContainer.clientPageActions.verifyEditIcon());
    }

    @And("^I should verify add new icon$")
    public void iShouldVerifyAddNewIcon() {
        assertTrue(actionContainer.clientPageActions.verifyAddIcon());
    }

    @And("^I should verify add new audit icon$")
    public void iShouldVerifyAddNewAuditIcon() {
        assertTrue(actionContainer.clientPageActions.verifyNewAuditIcon());
    }

    @And("^I should verify toggle icons$")
    public void iShouldVerifyToggleIcons() {
        assertTrue(actionContainer.clientPageActions.verifyToggleIcons());
    }

    @And("^I should verify languages in the modal$")
    public void iShouldVerifyLanguagesInTheModal() {
        assertTrue(actionContainer.clientPageActions.verifyLanguages());
    }

    @And("^I should click on configure button$")
    public void iShouldClickOnConfigureButton() {
        assertTrue(actionContainer.clientPageActions.clickConfigureButton());
    }

    @And("^I should verify Configure Dependent Sub Types modal$")
    public void iShouldVerifyConfigureDependentSubTypesModal() {
        assertTrue(actionContainer.clientPageActions.verifyConfigureDependentSubTypes());
    }

    @And("^I should click add sub type button$")
    public void iShouldClickAddSubTypeButton() {
        assertTrue(actionContainer.clientPageActions.clickAddSubTypeButton());
    }

    @And("^I should select Select All in the list displayed$")
    public void iShouldSelectSelectAllInTheListDisplayed() {
        assertTrue(actionContainer.clientPageActions.clickSelectAllInMultiselector());
    }

    @And("^I should click on download grid icon in documents requirement grid$")
    public void iShouldClickOnDownloadGridIconInDocumentsRequirementGrid() {
        assertTrue(actionContainer.clientPageActions.clickDownloadGridIconInDocuments());
    }

    @And("^I should verify the added document verbiage row$")
    public void iShouldVerifyTheAddedDocumentVerbiageRow() {
        assertTrue(actionContainer.clientPageActions.verifyAddedTableInGrid());
    }

    @And("^I should verify Project Information header$")
    public void iShouldVerifyProjectInformationHeader() {
        assertTrue(actionContainer.clientPageActions.verifyProjectInformationHeader());
    }

    @And("^I should verify inactive audit toggle icon$")
    public void iShouldVerifyInactiveAuditToggleIcon() {
        assertTrue(actionContainer.clientPageActions.verifyInactiveAuditToggle());
    }

    @And("^I should verify create new audit plus icon$")
    public void iShouldVerifyCreateNewAuditPlusIcon() {
        assertTrue(actionContainer.clientPageActions.verifyCreateAuditPlusIcon());
    }

    @And("^I should verify client logo updated successfully notification$")
    public void iShouldVerifyClientLogoUpdatedSuccessfullyNotification() {
        assertTrue(actionContainer.clientPageActions.verifySuccessfullyLogoUpdatedMessage());
    }

    @And("^I should verify exclamation mark in English and spanish$")
    public void iShouldVerifyExclamationMarkInEnglishAndSpanish() {
        assertTrue(actionContainer.clientPageActions.verifyExclamationMark());
    }

    @And("^I should click on Map documents button$")
    public void iShouldClickOnMapDocumentsButton() {
        assertTrue(actionContainer.clientPageActions.clickMapAlternateDocuments());
    }

    @And("^I should verify edit alternate documents modal$")
    public void iShouldVerifyEditAlternateDocumentsModal() {
        assertTrue(actionContainer.clientPageActions.verifyEditAlternateDocumentsLbl());
    }

    @And("^I should select added document (.*) as alternate document$")
    public void iShouldSelectAddedDocumentAsAlternateDocument(String addedDoc) {
        assertTrue(actionContainer.clientPageActions.selectAddedDocument(Testdata.getValue(addedDoc)));
    }

    @And("^I should verify added alternate document$")
    public void iShouldVerifyAddedAlternateDocument() {
        assertTrue(actionContainer.clientPageActions.verifySelectedAlternateDocuments());
    }

    @And("^I should click on file upload icon from the created client audit$")
    public void iShouldClickOnFileUploadIconFromTheCreatedClientAudit() {
        assertTrue(actionContainer.clientPageActions.clickFileUpload());
    }

    @And("^I should click on select template version drop down$")
    public void iShouldClickOnSelectTemplateVersionDropDown() {
        assertTrue(actionContainer.clientPageActions.clickSelectTemplateDropdown());
    }

    @And("^I should click on new milestone template icon$")
    public void iShouldClickOnNewMilestoneTemplateIcon() {
        assertTrue(actionContainer.clientPageActions.clickAddMilestoneTemplate());
    }

    @And("^I should enter the (.*) in the enter milestone template name$")
    public void iShouldEnterTheMilestomeNameInTheEnterMilestoneTemplateName(String templateName) {
        assertTrue(actionContainer.clientPageActions.enterMilestoneTemplateName(Testdata.getValue(templateName)));
    }

    @And("^I should enter the (.*) in the Event Days Out textbox$")
    public void iShouldEnterTheEventDaysOutInTheEventDaysOutTextbox(String templateName) {
        assertTrue(actionContainer.clientPageActions.enterEventDaysOutTxtBox(Testdata.getValue(templateName)));
    }

    @And("^I should click on select milestone type dropdown in modal$")
    public void iShouldClickOnSelectMilestoneTypeDropdownInModal() {
        assertTrue(actionContainer.clientPageActions.clickMilestoneTypeDropdown());
    }

    @And("^I should click on Initial Letter from dropdown$")
    public void iShouldClickOnInitialLetterFromDropdown() {
        assertTrue(actionContainer.clientPageActions.clickInitialLetter());
    }

    @And("^I should click edit icon in the grid$")
    public void iShouldClickEditIconInTheGrid() {
        assertTrue(actionContainer.clientPageActions.clickEditButton());
    }

    @And("^I should enable Is Employee Milestone$")
    public void iShouldEnableIsEmployeeMilestone() {
        assertTrue(actionContainer.clientPageActions.clickInitialLetter());
    }

    @And("^I should click on edit audit pencil icon$")
    public void iShouldClickOnEditAuditPencilIcon() {
        assertTrue(actionContainer.clientPageActions.clickEditAuditIcon());
    }

    @And("^I should select date within thirty days$")
    public void iShouldSelectDateWithinThirtyDays() {
        assertTrue(actionContainer.clientPageActions.selectDeadlineDate());
    }

    @And("^I should click on Project Configuration for walmart client$")
    public void iShouldClickOnProjectConfigurationForWalmartClient() {
        assertTrue(actionContainer.clientPageActions.clickWalmartProjectConfiguration());
    }

    @And("^I should click on Letters and Forms for walmart client$")
    public void iShouldClickOnLettersAndFormsForWalmartClient() {
        assertTrue(actionContainer.clientPageActions.clickWalmartLettersAndForms());
    }

    @And("^I should select the last day in this month$")
    public void iShouldSelectTheLastDayInThisMonth() {
        assertTrue(actionContainer.clientPageActions.selectLastDateInMonth());
    }

    @And("^I should click on sort icon in the dialog box$")
    public void iShouldClickOnSortIconInTheDialogBox() {
        assertTrue(actionContainer.clientPageActions.clickLastSortIcon());
    }

    @And("^I should verify upload english template$")
    public void iShouldVerifyUploadEnglishTemplate() {
        assertTrue(actionContainer.clientPageActions.clickUploadEnglishTemplateButton());
    }

    @And("^I should verify upload spanish template$")
    public void iShouldVerifyUploadSpanishTemplate() {
        assertTrue(actionContainer.clientPageActions.clickUploadSpanishTemplateButton());
    }

    @And("^I should enter (.*) affidavits name in the version name textbox$")
    public void iShouldEnterAffidavitsNameAffidavitsNameInTheVersionNameTextbox(String affidavitName) {
        assertTrue(actionContainer.clientPageActions.EnterAffidavitName(Testdata.getValue(affidavitName)));
    }

    @And("^I should click on active template toggle$")
    public void iShouldClickOnActiveTemplateToggle() {
        assertTrue(actionContainer.clientPageActions.clickActiveSlider());
    }

    @And("^I should click on Select Affidavits Type$")
    public void iShouldClickOnSelectAffidavitsType() {
        assertTrue(actionContainer.clientPageActions.clickSelectAffidavitsType());
    }

    @And("^I should click on Select Affidavit Configuration Type$")
    public void iShouldClickOnSelectAffidavitConfigurationtype() {
        assertTrue(actionContainer.clientPageActions.clickSelectAffidavitConfigurationType());
    }
}