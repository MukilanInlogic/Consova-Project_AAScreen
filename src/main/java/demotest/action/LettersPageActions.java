package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.LettersPageUI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javax.xml.soap.Text;

public class LettersPageActions extends LettersPageUI {
    public LettersPageActions(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor)driver;

    public boolean enterTemplateVersionName(String versionName) {
        boolean isEntered = false;
        Sync.Delay(10000);
        if (templateVersionNameTxtBox.isDisplayed()){
            Textbox.enterValue(driver,templateVersionNameTxtBox,versionName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enterAffidavitsVersionName(String versionName) {
        boolean isEntered = false;
        Sync.Delay(10000);
        if (AffidavitsVersionNameTxtBox.isDisplayed()){
            Textbox.enterValue(driver,AffidavitsVersionNameTxtBox,versionName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickLetterTypeDropdown(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(selectLetterTypeDropDown.isDisplayed()){
            Element.click(driver,selectLetterTypeDropDown);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyTemplateVersionNameLabel(){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(TemplateVersionNameLbl.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickHeaderCheckboxes(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(HeaderCheckboxes.size()!=0){
            js.executeScript("arguments[0].click();",HeaderCheckboxes.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean uploadEnglishTemplate() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (TemplateUpload.size()!=0){
            TemplateUpload.get(0).sendKeys(filePath+"English_Template.docx");
            isEntered = true;
        }
        return isEntered;
    }

    public boolean uploadSpanishTemplate() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (TemplateUpload.size()!=0){
            TemplateUpload.get(1).sendKeys(filePath+"English_Template.docx");
            isEntered = true;
        }
        return isEntered;
    }

    public boolean uploadEnglishAffidavit() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (TemplateUpload.size()!=0){
            TemplateUpload.get(0).sendKeys(filePath+"Affidavit - English.docx");
            isEntered = true;
        }
        return isEntered;
    }

    public boolean uploadSpanishAffidavit() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (TemplateUpload.size()!=0){
            TemplateUpload.get(1).sendKeys(filePath+"Affidavit - English.docx");
            isEntered = true;
        }
        return isEntered;
    }

    public boolean switchDefaultTemplate(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(inputSwitchSlider.size()!=0){
            Element.click(driver,inputSwitchSlider.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean switchActiveTemplate(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(inputSwitchSlider.size()!=0){
            Element.click(driver,inputSwitchSlider.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifySuccessfullyCreatedMsg(){
        boolean isVerified=false;
        Sync.Delay(45000);
        if(SuccessfullyCreatedMsg.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyDisabledSubmitButton(){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(DisabledSubmitButton.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickTrashButton(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(TrashButton.size()!=0){
            Element.click(driver,TrashButton.get(1));
            Element.click(driver,TrashButton.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean enterGroupName(String groupName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (GroupNameTxtBox.isDisplayed()){
            Textbox.enterValue(driver,GroupNameTxtBox,groupName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickAddLetterIcon(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(AddLetterIcon.isDisplayed()){
            js.executeScript("arguments[0].click();",AddLetterIcon);
            //Element.click(driver,AddLetterIcon);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyTemplateVersionName(String versionName) {
        boolean isEntered = false;
        Sync.Delay(3000);
        System.out.println(versionName);
        if (driver!=null){
            Element.verifyElements(driver,elementInSpan,versionName);
            //Textbox.enterValue(driver,templateVersionNameTxtBox,versionName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickCommunicationsManagement(){
        boolean isClicked=false;
        Sync.Delay(15000);
        if(CommunicationsManagement.isDisplayed()){
            Element.click(driver,CommunicationsManagement);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickCommunicationsDashboard(){
        boolean isClicked=false;
        Sync.Delay(15000);
        if(CommunicationsDashboard.isDisplayed()){
            Element.click(driver,CommunicationsDashboard);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyScheduledJobsHeader(){
        boolean isVerified=false;
        Sync.Delay(45000);
        if(ScheduledJobsHeader.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyTableHeader(String header){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,TableHeader,header);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyTableData(String data){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.verifyElements(driver,TableData,data);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickTableData(String data){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(driver!=null){
            Element.click(driver,data,TableData);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifyPinkHighlightedBackground(){
        boolean isVerified=false;
        Sync.Delay(45000);
        if(PinkHighlightedBackground.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifySubmitLetterInGrid(){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSecondSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickThirdSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(2));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickFourthSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(3));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickFifthSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(4));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSixthSubmitLetterInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(SubmitLetterInGrid.size()!=0){
            Element.click(driver,SubmitLetterInGrid.get(5));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyStatusOverviewHeader(){
        boolean isVerified=false;
        Sync.Delay(3000);
        if(StatusOverviewHeader.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean clickControlSettingsInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(ControlSettingsInGrid.size()!=0){
            Element.click(driver,ControlSettingsInGrid.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean verifyControlSettingsInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(ControlSettingsInGrid.size()!=0){
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickControlSettingsInQueueGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(ControlSettingsInGrid.size()!=0){
            Element.click(driver,ControlSettingsInGrid.get(ControlSettingsInGrid.size()-1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickRefreshIcon(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(RefreshIcon.isDisplayed()){
            Element.click(driver,RefreshIcon);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickCheckBoxInGrid(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(CheckBoxInGrid.isDisplayed()){
            Element.click(driver,CheckBoxInGrid);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickCloseLetter(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(CloseLetter.isDisplayed()){
            Element.click(driver,CloseLetter);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickMaximizeWindow(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(MaximizeWindow.isDisplayed()){
            Element.click(driver,MaximizeWindow);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickMinimizeWindow(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(MinimizeWindow.isDisplayed()){
            Element.click(driver,MinimizeWindow);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickAddLetter(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(AddLetter.size()!=0){
            Element.click(driver,AddLetter.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSelectClients(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(SelectClients.isDisplayed()){
            Element.click(driver,SelectClients);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSelectAudits(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(SelectAudits.isDisplayed()){
            Element.click(driver,SelectAudits);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickLetterJobCalendar(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(LetterJobCalendar.isDisplayed()){
            Element.click(driver,LetterJobCalendar);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickTodayDate(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(TodayDate.isDisplayed()){
            Element.click(driver,TodayDate);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickCheckboxList(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(CheckboxList.size()!=0){
            Element.click(driver,CheckboxList.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickAddLetterSubmit(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(AddLetter.size()!=0){
            Element.click(driver,AddLetter.get(1));
            isClicked=true;
        }
        Sync.Delay(15000);
        return isClicked;
    }

    public boolean clickCloudDownloadIcon(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(CloudDownloadIcon.size()!=0){
            Element.click(driver,CloudDownloadIcon.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean enterSearchHistory(String filterBy) {
        boolean isEntered = false;
        Sync.Delay(10000);
        if (FilterByInHistoryTab.isDisplayed()){
            Textbox.enterValue(driver,FilterByInHistoryTab,filterBy);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickSearchInHistoryModal(){
        boolean isClicked=false;
        Sync.Delay(3000);
        if(searchIcon.size()!=0){
            Element.click(driver,searchIcon.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSelectAffidavitsTypeDropDown(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(SelectAffidavitsTypeDropDown.isDisplayed()){
            Element.click(driver,SelectAffidavitsTypeDropDown);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean clickSelectAffidavitConfigurationTypeDropDown(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(SelectAffidavitConfigurationTypeDropDown.isDisplayed()){
            Element.click(driver,SelectAffidavitConfigurationTypeDropDown);
            isClicked=true;
        }
        return isClicked;
    }

}