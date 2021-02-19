package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class LettersPageSteps {
    private ActionContainer actionContainer;

    public LettersPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I should enter the (.*) in template version name text box$")
    public void iShouldEnterTheTemplateVersionNameInTemplateVersionNameTextBox(String versionName) {
        assertTrue(actionContainer.lettersPageActions.enterTemplateVersionName(Testdata.getValue(versionName)));
    }

    @And("^I should enter the (.*) in affidavit version name text box$")
    public void iShouldEnterTheTemplateVersionNameInAffidavitVersionNameTextBox(String versionName) {
        assertTrue(actionContainer.lettersPageActions.enterAffidavitsVersionName(Testdata.getValue(versionName)));
    }

    @And("^I should click on select letter type drop down$")
    public void iShouldClickOnSelectLetterTypeDropDown() {
        assertTrue(actionContainer.lettersPageActions.clickLetterTypeDropdown());
    }

    @And("^I should verify add template modal$")
    public void iShouldVerifyAddTemplateModal() {
        assertTrue(actionContainer.lettersPageActions.verifyTemplateVersionNameLabel());
    }

    @And("^I should select all the documents from the listed selection box$")
    public void iShouldSelectAllTheDocumentsFromTheListedSelectionBox() {
        assertTrue(actionContainer.lettersPageActions.clickHeaderCheckboxes());
    }

    @And("^I should switch default template slider button$")
    public void iShouldSwitchDefaultTemplateSliderButton() {
        assertTrue(actionContainer.lettersPageActions.switchDefaultTemplate());
    }

    @And("^I should switch active template slider button$")
    public void iShouldSwitchActiveTemplateSliderButton() {
        assertTrue(actionContainer.lettersPageActions.switchActiveTemplate());
    }

    @And("^I should verify successfully created message$")
    public void iShouldVerifySuccessfullyCreatedMessage() {
        assertTrue(actionContainer.lettersPageActions.verifySuccessfullyCreatedMsg());
    }

    @And("^I should verify disabled submit button in the modal$")
    public void iShouldVerifyDisabledSubmitButtonInTheModal() {
        assertTrue(actionContainer.lettersPageActions.verifyDisabledSubmitButton());
    }

    @And("^I should upload English template in the upload templates dialog$")
    public void iShouldUploadEnglishTemplateInTheUploadTemplatesDialog() {
        assertTrue(actionContainer.lettersPageActions.uploadEnglishTemplate());
    }

    @And("^I should upload Spanish template in the upload templates dialog$")
    public void iShouldUploadSpanishTemplateInTheUploadTemplatesDialog() {
        assertTrue(actionContainer.lettersPageActions.uploadSpanishTemplate());
    }

    @And("^I should upload English Affidavit in the upload templates dialog$")
    public void iShouldUploadEnglishAffidavitInTheUploadTemplatesDialog() {
        assertTrue(actionContainer.lettersPageActions.uploadEnglishAffidavit());
    }

    @And("^I should upload Spanish Affidavit in the upload templates dialog$")
    public void iShouldUploadSpanishAffidavitInTheUploadTemplatesDialog() {
        assertTrue(actionContainer.lettersPageActions.uploadSpanishAffidavit());
    }

    @And("^I should delete the uploaded templates$")
    public void iShouldDeleteTheUploadedTemplates() {
        assertTrue(actionContainer.lettersPageActions.clickTrashButton());
    }

    @And("^I should enter the (.*) in the group name text box$")
    public void iShouldEnterTheGroupnameInTheGroupNameTextBox(String groupName) {
        assertTrue(actionContainer.lettersPageActions.enterGroupName(Testdata.getValue(groupName)));
    }

    @And("^I should click on Add Letter icon$")
    public void iShouldClickOnAddLetterIcon() {
        assertTrue(actionContainer.lettersPageActions.clickAddLetterIcon());
    }

    @And("^I should verify added letter (.*) in the letters grid$")
    public void iShouldVerifyAddedLetterTemplateVersionNameInTheLettersGrid(String versionName) {
        assertTrue(actionContainer.lettersPageActions.verifyTemplateVersionName(Testdata.getValue(versionName)));
    }

    @And("^I should click on Communications Management$")
    public void iShouldClickOnCommunicationsManagement() {
        assertTrue(actionContainer.lettersPageActions.clickCommunicationsManagement());
    }

    @And("^I should click on Communications Dashboard$")
    public void iShouldClickOnCommunicationsDashboard() {
        assertTrue(actionContainer.lettersPageActions.clickCommunicationsDashboard());
    }

    @And("^I should verify Scheduled jobs modal heading$")
    public void iShouldVerifyScheduledJobsModalHeading() {
        assertTrue(actionContainer.lettersPageActions.verifyScheduledJobsHeader());
    }

    @And("^I should verify (.*) in table header$")
    public void iShouldVerifyClientNameInTableHeader(String header) {
        assertTrue(actionContainer.lettersPageActions.verifyTableHeader(Testdata.getValue(header)));
    }

    @And("^I should verify (.*) in table data$")
    public void iShouldVerifyClientNameInTableData(String Data) {
        assertTrue(actionContainer.lettersPageActions.verifyTableData(Testdata.getValue(Data)));
    }

    @And("^I should click on (.*) in table data$")
    public void iShouldClickOnClientNameInTableData(String Data) {
        assertTrue(actionContainer.lettersPageActions.clickTableData(Testdata.getValue(Data)));
    }

    @And("^I should verify pink background for incomplete letter template upload$")
    public void iShouldVerifyPinkBackgroundForIncompleteLetterTemplateUpload() {
        assertTrue(actionContainer.lettersPageActions.verifyPinkHighlightedBackground());
    }

    @And("^I should verify the total employee count that will get the letter$")
    public void iShouldVerifyTheTotalEmployeeCountThatWillGetTheLetter() {
    }

    @And("^I should verify submit letter button in the grid$")
    public void iShouldVerifySubmitLetterButtonInTheGrid() {
        assertTrue(actionContainer.lettersPageActions.verifySubmitLetterInGrid());
    }

    @And("^I should click on submit letter for the respective grid$")
    public void iShouldClickOnSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickSubmitLetterInGrid());
    }

    @And("^I should verify ten records in the grid$")
    public void iShouldVerifyTenRecordsInTheGrid() {
        assertTrue(actionContainer.lettersPageActions.verifySubmitLetterInGrid());
    }

    @And("^I should verify Status Overview modal heading$")
    public void iShouldVerifyStatusOverviewModalHeading() {
        assertTrue(actionContainer.lettersPageActions.verifyStatusOverviewHeader());
    }

    @And("^I should verify Scheduled In Span$")
    public void iShouldVerifyScheduledInSpan() {
    }

    @And("^I should verify Complete In Span$")
    public void iShouldVerifyCompleteInSpan() {
    }

    @And("^I should click on second submit letter for the respective grid$")
    public void iShouldClickOnSecondSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickSecondSubmitLetterInGrid());
    }

    @And("^I should click on third submit letter for the respective grid$")
    public void iShouldClickOnThirdSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickThirdSubmitLetterInGrid());
    }

    @And("^I should click on fourth submit letter for the respective grid$")
    public void iShouldClickOnFourthSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickFourthSubmitLetterInGrid());
    }

    @And("^I should click on fifth submit letter for the respective grid$")
    public void iShouldClickOnFifthSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickFifthSubmitLetterInGrid());
    }

    @And("^I should click on sixth submit letter for the respective grid$")
    public void iShouldClickOnSixthSubmitLetterForTheRespectiveGrid() {
        assertTrue(actionContainer.lettersPageActions.clickSixthSubmitLetterInGrid());
    }

    @And("^I should run maximum five jobs in parallel$")
    public void iShouldRunMaximumFiveJobsInParallel() {

    }

    @And("^I should click on control settings in grid$")
    public void iShouldClickOnControlSettingsInGrid() {
        assertTrue(actionContainer.lettersPageActions.clickControlSettingsInGrid());
    }

    @And("^I should verify control settings in grid$")
    public void iShouldVerifyControlSettingsInGrid() {
        assertTrue(actionContainer.lettersPageActions.verifyControlSettingsInGrid());
    }

    @And("^I should click on refresh button in Queue grid$")
    public void iShouldClickOnRefreshButtonInQueueGrid() {
        assertTrue(actionContainer.lettersPageActions.clickRefreshIcon());
    }

    @And("^I should click on control settings in Queue grid$")
    public void iShouldClickOnControlSettingsInQueueGrid() {
        assertTrue(actionContainer.lettersPageActions.clickControlSettingsInQueueGrid());
    }

    @And("^I should click on Page count checkbox in the Queue grid$")
    public void iShouldClickOnPageCountCheckboxInTheQueueGrid() {
        assertTrue(actionContainer.lettersPageActions.clickCheckBoxInGrid());
    }

    @And("^I should close the letter modal$")
    public void iShouldCloseTheLetterModal() {
        assertTrue(actionContainer.lettersPageActions.clickCloseLetter());
    }

    @And("^I should click on maximize in letter modal$")
    public void iShouldClickOnMaximizeInLetterModal() {
        assertTrue(actionContainer.lettersPageActions.clickMaximizeWindow());
    }

    @And("^I should click on minimize in letter modal$")
    public void iShouldClickOnMinimizeInLetterModal() {
        assertTrue(actionContainer.lettersPageActions.clickMinimizeWindow());
    }

    @And("^I should click on Add letter icon in Queue grid$")
    public void iShouldClickOnAddLetterIconInQueueGrid() {
        assertTrue(actionContainer.lettersPageActions.clickAddLetter());
    }

    @And("^I should click on select Client dropdown$")
    public void iShouldClickOnSelectClientDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickSelectClients());
    }

    @And("^I should click on select audit dropdown$")
    public void iShouldClickOnSelectAuditDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickSelectAudits());
    }

    @And("^I should select all checkbox from the dropdown$")
    public void iShouldSelectAllCheckboxFromTheDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickCheckboxList());
    }

    @And("^I should click on select schedule letter job dropdown$")
    public void iShouldClickOnSelectScheduleLetterJobDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickLetterJobCalendar());
    }

    @And("^I should select today date from the displayed calender$")
    public void iShouldSelectTodayDateFromTheDisplayedCalender() {
        assertTrue(actionContainer.lettersPageActions.clickTodayDate());
    }

    @And("^I should enter (.*) in the template version name textbox$")
    public void iShouldEnterTemplateVersionNameInTheTemplateVersionNameTextbox(String versionName) {
        assertTrue(actionContainer.lettersPageActions.enterTemplateVersionName(Testdata.getValue(versionName)));
    }

    @And("^I should click on add icon in the displayed modal$")
    public void iShouldClickOnAddIconInTheDisplayedModal() {
        assertTrue(actionContainer.lettersPageActions.clickAddLetterSubmit());
    }

    @And("^I should click on cloud download icon in the grid$")
    public void iShouldClickOnCloudDownloadIconInTheGrid() {
        assertTrue(actionContainer.lettersPageActions.clickCloudDownloadIcon());
    }

    @And("^I should enter the (.*) in filterBy textbox$")
    public void iShouldEnterTheAuditnameInFilterByTextbox(String filterBy) {
        assertTrue(actionContainer.lettersPageActions.enterSearchHistory(Testdata.getValue(filterBy)));
    }

    @And("^I should click on refresh icon in the modal$")
    public void iShouldClickOnRefreshIconInTheModal() {
        assertTrue(actionContainer.lettersPageActions.clickSearchInHistoryModal());
    }

    @And("^I should click on Select Affidavits Type dropdown$")
    public void iShouldClickOnSelectAffidavitsTypeDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickSelectAffidavitsTypeDropDown());
    }

    @And("^I should click on Select Affidavit Configuration Type dropdown$")
    public void iShouldClickOnSelectAffidavitConfigurationTypeDropdown() {
        assertTrue(actionContainer.lettersPageActions.clickSelectAffidavitConfigurationTypeDropDown());
    }
}
