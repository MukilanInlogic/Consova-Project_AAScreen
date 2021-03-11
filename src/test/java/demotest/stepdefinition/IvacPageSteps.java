package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class IvacPageSteps {
    private ActionContainer actionContainer;

    public IvacPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @When("^I should Login to application with (.*) , (.*) and (.*)$")
    public void iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String lastName,String consovaID,String sSN) {
        assertTrue(actionContainer.ivacPageActions.lastNameText(Testdata.getValue(lastName)));
        assertTrue(actionContainer.ivacPageActions.consovaIdText(Testdata.getValue(consovaID)));
        assertTrue(actionContainer.ivacPageActions.ssnText(Testdata.getValue(sSN)));
    }

    @And("^I should select desired document by Browse icon$")
    public void iShouldSelectDesiredDocumentByBrowseIcon() {
        assertTrue(actionContainer.ivacPageActions.browsePath());
    }

    @And("^I should accept disclaimer Notice if displayed$")
    public void iShouldAcceptGDPRNoticeIfDisplayed() {
        assertTrue(actionContainer.ivacPageActions.disclaimerAcceptButton());
    }

    @And("^I should logoff from home screen$")
    public void iShouldLogoffFromLoginScreen() {
        assertTrue(actionContainer.ivacPageActions.logoffButton());
    }

    @And("^I should click on sidebar collapse icon in menubar$")
    public void iShouldClickOnSidebarCollapseIconInMenubar() {
        assertTrue(actionContainer.ivacPageActions.clickSidebarCollapse());
    }

    @And("^I should click on Contact Us icon$")
    public void iShouldClickOnContactUsIcon() {
        assertTrue(actionContainer.ivacPageActions.clickContactIcon());
    }

    @And("^I should click on latest View Affidavit link$")
    public void iShouldClickOnLatestViewAffidavitLink() {
        assertTrue(actionContainer.ivacPageActions.clickViewAffidavit());
    }

    @And("^I should click on employee profile name$")
    public void iShouldClickOnEmployeeProfileName() {
        assertTrue(actionContainer.ivacPageActions.clickProfileIcon());
    }
}