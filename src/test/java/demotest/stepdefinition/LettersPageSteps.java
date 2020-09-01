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

    @And("^I should click on Add button$")
    public void iShouldClickOnAddButton() {
        assertTrue(actionContainer.homePageActions.addButton());
    }

    @And("^I should click on system and data configuration$")
    public void iShouldClickOnSystemAndDataConfiguration() {
        assertTrue(actionContainer.homePageActions.systemAndDataConfiguration());
    }

    @And("^I should click on Cancel button$")
    public void iShouldClickOnCancelButton() {
        assertTrue(actionContainer.homePageActions.cancelButton());
    }

    @And("^I should click on Update button$")
    public void iShouldClickOnUpdateButton() {
        assertTrue(actionContainer.homePageActions.updateButton());
    }

    @And("^I should click on Edit button$")
    public void iShouldClickOnEditButton() {
        assertTrue(actionContainer.homePageActions.editButton());
    }

    @And("^I should click on create button$")
    public void iShouldClickOnCreateButton() {
        assertTrue(actionContainer.homePageActions.createButton());
    }

    @And("^I should verify disabled submit button$")
    public void iShouldVerifyDisabledSubmitButton() {
        assertTrue(actionContainer.homePageActions.verifyDisabledSubmitButton());
    }

    @And("^I should close the displayed modal$")
    public void iShouldCloseTheDisplayedModal() {
        assertTrue(actionContainer.homePageActions.closeTheModal());
    }

    @And("^I should click on Save button$")
    public void iShouldClickOnSaveButton() {
        assertTrue(actionContainer.homePageActions.clickSaveButton());
    }
}
