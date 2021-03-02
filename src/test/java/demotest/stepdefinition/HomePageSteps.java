package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

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

    @And("^I should navigate to newly opened window$")
    public void iShouldNavigateToNewlyOpenedWindow() {
        assertTrue(actionContainer.homePageActions.navigateToNewTab());
    }

    @And("^I should close the newly opened tab$")
    public void iShouldCloseTheNewlyOpenedTab() {
        assertTrue(actionContainer.homePageActions.closeCurrentTab());
    }

    @And("^I should close the displayed modal$")
    public void iShouldCloseTheDisplayedModal() {
        assertTrue(actionContainer.homePageActions.closeTheModal());
    }

    @And("^I should verify (.*) text In Span$")
    public void iShouldVerifyLettersTextInSpan(String inSpan) {
        assertTrue(actionContainer.homePageActions.verifyInSpan(Testdata.getValue(inSpan)));
    }

    @And("^I should click on (.*) In Span$")
    public void iShouldClickOnLettersAndFormsInSpan(String inSpan) {
        assertTrue(actionContainer.homePageActions.clickInSpan(Testdata.getValue(inSpan)));
    }

    @And("^I should verify (.*) In Button$")
    public void iShouldVerifyOKInButton(String inButton) {
        assertTrue(actionContainer.homePageActions.verifyInButton(Testdata.getValue(inButton)));
    }

    @And("^I should click on (.*) In Button$")
    public void iShouldClickOnLettersAndFormsInButton(String inButton) {
        assertTrue(actionContainer.homePageActions.clickInButton(Testdata.getValue(inButton)));
    }

    @And("^I should verify (.*) In Label$")
    public void iShouldVerifyHistoryInLabel(String inLabel) {
        assertTrue(actionContainer.homePageActions.verifyInLabel(Testdata.getValue(inLabel)));
    }

    @And("^I should click on (.*) In Label$")
    public void iShouldClickOnHistoryInLabel(String inLabel) {
        assertTrue(actionContainer.homePageActions.clickInLabel(Testdata.getValue(inLabel)));
    }

    @And("^I should verify (.*) text In Div$")
    public void iShouldVerifyLetterTextInDiv(String inDiv) {
        assertTrue(actionContainer.homePageActions.verifyInDiv(Testdata.getValue(inDiv)));
    }

    @And("^I should click on (.*) In Div$")
    public void iShouldClickOnLetterInDiv(String inDiv) {
        assertTrue(actionContainer.homePageActions.clickInDiv(Testdata.getValue(inDiv)));
    }

    @And("^I should verify (.*) text In Options$")
    public void iShouldVerifySelectInOptions(String inOption) {
        assertTrue(actionContainer.homePageActions.verifyInOption(Testdata.getValue(inOption)));
    }

    @And("^I should click on (.*) In Options$")
    public void iShouldClickOnSelectInOptions(String inOption) {
        assertTrue(actionContainer.homePageActions.clickInOption(Testdata.getValue(inOption)));
    }

    @And("^I should verify (.*) text In Bold$")
    public void iShouldVerifySelectInBold(String inBold) {
        assertTrue(actionContainer.homePageActions.verifyInBold(Testdata.getValue(inBold)));
    }

    @And("^I should click on (.*) In Bold$")
    public void iShouldClickOnSelectInBold(String inBold) {
        assertTrue(actionContainer.homePageActions.clickInBold(Testdata.getValue(inBold)));
    }

    @And("^I should verify (.*) text in Table Header$")
    public void iShouldVerifyClientNameInTableHeader(String header) {
        assertTrue(actionContainer.homePageActions.verifyTableHeader(Testdata.getValue(header)));
    }

    @And("^I should click on (.*) text in Table Header$")
    public void iShouldClickOnClientNameInTableHeader(String header) {
        assertTrue(actionContainer.homePageActions.verifyTableHeader(Testdata.getValue(header)));
    }

    @And("^I should verify (.*) text in Table Data$")
    public void iShouldVerifyClientNameInTableData(String Data) {
        assertTrue(actionContainer.homePageActions.verifyTableData(Testdata.getValue(Data)));
    }

    @And("^I should click on (.*) in Table Data$")
    public void iShouldClickOnClientNameInTableData(String Data) {
        assertTrue(actionContainer.homePageActions.clickTableData(Testdata.getValue(Data)));
    }

    @And("^I should verify (.*) header$")
    public void iShoudVerifyHeader(String header) {
        assertTrue(actionContainer.homePageActions.verifyHeader(Testdata.getValue(header)));
    }

    @And("^I should click on (.*) In List$")
    public void iShouldClickOnInitialInList(String inList) {
        assertTrue(actionContainer.homePageActions.clickInList(Testdata.getValue(inList)));
    }

    @And("^I should enter (.*) in first filterBy textbox$")
    public void iShouldEnterTheSearchItemInFirstFilterByTextbox(String filterItem) {
        assertTrue(actionContainer.homePageActions.FirstFilterBy(Testdata.getValue(filterItem)));
    }

    @And("^I should enter (.*) in third filterBy textbox$")
    public void iShouldEnterTheSearchItemInThirdFilterByTextbox(String filterItem) {
        assertTrue(actionContainer.homePageActions.ThirdFilterBy(Testdata.getValue(filterItem)));
    }

    @And("^I should not verify (.*) element in the display$")
    public void iShouldNotVerifyElementElementInTheDisplay(String NotVerify) {
        assertTrue(actionContainer.homePageActions.NotVerifyElementInDisplay(Testdata.getValue(NotVerify)));
    }

    @And("^I should enter (.*) in textarea$")
    public void iShouldEnterCommentsInTextarea(String Comment) {
        assertTrue(actionContainer.homePageActions.EnterCommentInTextarea(Testdata.getValue(Comment)));
    }

    @And("^I shoud verify disabled (.*) button$")
    public void iShoudVerifyDisabledIneligibleCodesButton(String disabled) {
        assertTrue(actionContainer.homePageActions.verifyDisabledButton(Testdata.getValue(disabled)));
    }

    @And("^I should verify disabled submit button$")
    public void iShouldVerifyDisabledSubmitButton() {
        assertTrue(actionContainer.homePageActions.verifyDisabledSubmitButton());
    }

    @And("^I should verify disabled bold button$")
    public void iShouldVerifyDisabledBoldButton() {
        assertTrue(actionContainer.homePageActions.verifyDisabledBoldButton());
    }

    @And("^I should verify warning message$")
    public void iShouldVerifyWarningMessage() {
        assertTrue(actionContainer.homePageActions.verifyWarningMessage());
    }

    @And("^I should delay$")
    public void iShouldDelay() {
        assertTrue(actionContainer.homePageActions.DelaySometime());
    }

    @And("^I should click on My Inventory$")
    public void iShouldClickOnMyInventory() {
        assertTrue(actionContainer.homePageActions.clickMyInventory());
    }

    @And("^I should click on System and Client Configuration$")
    public void iShouldClickOnSystemAndClientConfiguration() {
        assertTrue(actionContainer.homePageActions.clickSystemAndClientConfiguration());
    }

    @And("^I should click on Client Configuration$")
    public void iShouldClickOnClientConfiguration() {
        assertTrue(actionContainer.homePageActions.clickClientConfiguration());
    }

    @And("^I should click on first checkbox in the list$")
    public void iShouldClickOnFirstCheckboxInTheList() {
        assertTrue(actionContainer.homePageActions.SelectCheckbox());
    }
}