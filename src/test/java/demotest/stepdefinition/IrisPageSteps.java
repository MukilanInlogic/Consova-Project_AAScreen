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
}