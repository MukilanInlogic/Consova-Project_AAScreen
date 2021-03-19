package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class IrisPageSteps {
    private ActionContainer actionContainer;

    public IrisPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I should verify search textbox at the right top of window$")
    public void iShouldVerifySearchTextboxAtTheRightTopOfWindow() {
        assertTrue(actionContainer.irisPageActions.verifySearchBar());
    }

    @And("^I should enter (.*) in the search bar$")
    public void iShouldEnterAccountNumberInTheSearchBar(String accNo) {
        assertTrue(actionContainer.irisPageActions.EnterSearchBar(Testdata.getValue(accNo)));
    }

    @And("^I should verify removed from audit in inclined position$")
    public void iShouldVerifyRemovedFromAuditInInclinedPosition() {
        assertTrue(actionContainer.irisPageActions.verifyInclinedRemoveAudit());
    }

    @And("^I should verify the removed reason in red bold font with reason$")
    public void iShouldVerifyTheRemovedReasonInRedBoldFontWithReason() {
        assertTrue(actionContainer.irisPageActions.verifyRemovedReasonDangerFont());
    }

    @And("^I should verify audit over in inclined position$")
    public void iShouldVerifyAuditOverInInclinedPosition() {
        assertTrue(actionContainer.irisPageActions.verifyInclinedAuditOver());
    }

    @And("^I should click on admin ticket icon$")
    public void iShouldClickOnAdminTicketIcon() {
        assertTrue(actionContainer.irisPageActions.clickAdminTicketIcon());
    }

    @And("^I should click on Next button$")
    public void iShouldClickOnNextButton() {
        assertTrue(actionContainer.irisPageActions.nextButtonInOutlook());
        System.out.println("iShouldClickOnNextButton");
    }

    @And("^I should enter username as (.*)$")
    public void iShouldEnterUsernameAsEmail(String email) {
        assertTrue(actionContainer.irisPageActions.office365username(Testdata.getValue(email)));
        System.out.println("iShouldEnterUsenameAsEmail");
    }

    @And("^I should give password as (.*)$")
    public void iShouldGivePasswordAsPassword(String password) {
        assertTrue(actionContainer.irisPageActions.office365password(Testdata.getValue(password)));
        System.out.println("iShouldEnterUsenameAsPassword");
    }

    @And("^I should click on outlook icon from menubar$")
    public void iShouldClickOnOutlookIconFromMenubar() {
        assertTrue(actionContainer.irisPageActions.outlookIcon());
        System.out.println("iShouldClickOnOutlookIconFromMenubar");
    }

    @And("^I should login to outlook by clicking login button$")
    public void iShouldLoginToOutlookByClickingLoginButton() {
        assertTrue(actionContainer.irisPageActions.loginButtonInOutlook());
        System.out.println("iShouldLoginToOutlookByClickingLoginButton");
    }

    @And("^I should click on email received for admin ticket$")
    public void iShouldClickOnEmailReceivedForAdminTicket() {
        assertTrue(actionContainer.irisPageActions.clickAdminTicketEmail());
    }

    @And("^I should click on click here to open admin ticket$")
    public void iShouldClickOnClickHereToOpenAdminTicket() {
        assertTrue(actionContainer.irisPageActions.clickClickHereLink());
    }
}