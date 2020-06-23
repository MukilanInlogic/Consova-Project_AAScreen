package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private ActionContainer actionContainer;

    public HomePageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @Given("^I should enter login url (.*)$")
    public void iShouldEnterLoginUrlURL(String url) {
        assertTrue(actionContainer.homePageActions.enterURL(Testdata.getValue(url)));
    }

    @When("^I should Login to core application with (.*) and (.*)$")
    public void iShouldLoginToCoreApplicationWithUserNameAndPassword(String userName,String password) {
        assertTrue(actionContainer.homePageActions.EnterLoginUserName(Testdata.getValue(userName)));
        assertTrue(actionContainer.homePageActions.EnterPassword(Testdata.getValue(password)));
    }

    @And("^I should click on Login button from Login screen$")
    public void iShouldClickOnLoginButtonFromLoginScreen() {
        assertTrue(actionContainer.homePageActions.ClickLogin());
    }

    @And("^I should click on profile icon in core$")
    public void iShouldClickOnProfileIconInCore() {
        assertTrue(actionContainer.homePageActions.profileIconInCore());
    }

    @And("^I should logoff from core login$")
    public void iShouldLogoffFromCoreLogin() {
        assertTrue(actionContainer.homePageActions.logoffButtonInCore());
    }

    @And("^I should enter firstName (.*) in the textbox$")
    public void iShouldEnterFirstNameFirstNameInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter lastName (.*) in the textbox$")
    public void iShouldEnterLastNameLastNameInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter userName (.*) in the textbox$")
    public void iShouldEnterUserNameUserNameInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter phoneNumber (.*) in the textbox$")
    public void iShouldEnterPhoneNumberPhoneNumberInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter emailAddress (.*) in the textbox$")
    public void iShouldEnterEmailAddressEmailAddressInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter workLocation (.*) in the textbox$")
    public void iShouldEnterWorkLocationWorkLocationInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter departmentName (.*) in the textbox$")
    public void iShouldEnterDepartmentNameDepartmentNameInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter randomPercentage (.*) in the textbox$")
    public void iShouldEnterRandomPercentageRandomPercentageInTheTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.EnterFirstName(Testdata.getValue(firstNAme)));
    }

    @And("^I should check whether submit button is disabled$")
    public void iShouldCheckWhetherSubmitButtonIsDisabled() {
        assertTrue(actionContainer.homePageActions.verifySubmitButton());
    }

    @And("^I should click on system and data configuration$")
    public void iShouldClickOnSystemAndDataConfiguration() {
        assertTrue(actionContainer.homePageActions.systemAndDataConfiguration());
    }

    @And("^I should click on client configuration$")
    public void iShouldClickOnClientConfiguration() {
        assertTrue(actionContainer.homePageActions.clientConfiguration());
    }

    @And("^I should click on Add Client icon$")
    public void iShouldClickOnAddClientIcon() {
        assertTrue(actionContainer.homePageActions.addClientButton());
    }

    @And("^I should enter the (.*) in the clientname textbox$")
    public void iShouldEnterTheClientnameInTheClientnameTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.clientNameTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientsite textbox$")
    public void iShouldEnterTheClientsiteInTheClientsiteTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.clientSiteLinkTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientlogout url textbox$")
    public void iShouldEnterTheUrlInTheClientlogoutUrlTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.clientLogoutUrlTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the wikilink textbox$")
    public void iShouldEnterTheClientsiteInTheWikilinkTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.wikiLinkTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the phoneno textbox$")
    public void iShouldEnterThePhonenoInThePhonenoTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.clientPhoneNoTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the clientphoneid textbox$")
    public void iShouldEnterTheClientphoneidInTheClientphoneidTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.clientPhoneIdTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the phoneassignmentfrom textbox$")
    public void iShouldEnterThePhoneassignmentfromInThePhoneassignmentfromTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.assignedPeriodFromTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should enter the (.*) in the phoneassignmentto textbox$")
    public void iShouldEnterThePhoneassignmenttoInThePhoneassignmenttoTextbox(String firstNAme) {
        assertTrue(actionContainer.homePageActions.assignedPeriodToTxtBox(Testdata.getValue(firstNAme)));
    }

    @And("^I should select the clientservicerep in the clientservicerep dropdown$")
    public void iShouldSelectTheClientservicerepInTheClientservicerepDropdown() {
        //assertTrue(actionContainer.homePageActions.verifySubmitButton());
    }

    @And("^I should select the ivac language$")
    public void iShouldSelectTheIvacLanguage() {
        //assertTrue(actionContainer.homePageActions.verifySubmitButton());
    }

    @And("^I should select the communication language$")
    public void iShouldSelectTheCommunicationLanguage() {
        //assertTrue(actionContainer.homePageActions.verifySubmitButton());
    }

    @And("^I should select the communicationprint language$")
    public void iShouldSelectTheCommunicationprintLanguage() {
        //assertTrue(actionContainer.homePageActions.verifySubmitButton());
    }

    @And("^I should select logo for the client$")
    public void iShouldSelectLogoForTheClient() {
        assertTrue(actionContainer.homePageActions.logoUpload());
    }

    @And("^I should click on Add client button$")
    public void iShouldClickOnAddClientButton() {
        assertTrue(actionContainer.homePageActions.addButton());
    }
}
