package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LettersPageUI {


    protected final WebDriver driver;

    public LettersPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected String elementInSpan = new StringBuilder("//span[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Document')]")
    protected WebElement templateVersionName;

    @FindBy(how = How.NAME, using = "templateVersionName")
    protected WebElement templateVersionNameTxtBox;

    @FindBy(how = How.NAME, using = "AffidavitsVersionName")
    protected WebElement AffidavitsVersionNameTxtBox;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-dropdown-label-container')]//label[contains(text(),'Select Affidavits Type')]")
    protected WebElement SelectAffidavitsTypeDropDown;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-dropdown-label-container')]//label[contains(text(),'Select Affidavit Configuration Type')]")
    protected WebElement SelectAffidavitConfigurationTypeDropDown;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Select Letter Type')]")
    protected WebElement selectLetterTypeDropDown;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Enter Template Version name')]")
    protected WebElement TemplateVersionNameLbl;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-listbox-header-w-checkbox')]//span[contains(@class,'ui-chkbox-icon ui-clickable')]")
    protected List<WebElement> HeaderCheckboxes;

    protected String filePath="C:\\Users\\amukilan\\Desktop\\Consova-Project_Core\\resources\\UploadFilesAndImages\\";

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    protected List<WebElement> TemplateUpload;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-inputswitch-slider']")
    protected List<WebElement> inputSwitchSlider;

    @FindBy(how = How.XPATH, using = "//div[text()='Letter version created successfully']")
    protected WebElement SuccessfullyCreatedMsg;

    @FindBy(how = How.XPATH, using = "//button[@disabled='']//span[contains(text(),'Submit')]")
    protected WebElement DisabledSubmitButton;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'fa-trash')]")
    protected List<WebElement> TrashButton;

    @FindBy(how = How.NAME, using = "GroupName")
    protected WebElement GroupNameTxtBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Letter')]")
    protected WebElement AddLetterIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Communications Management')]")
    protected WebElement CommunicationsManagement;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Communications Dashboard')]")
    protected WebElement CommunicationsDashboard;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Scheduled Jobs')]")
    protected WebElement ScheduledJobsHeader;

    protected String TableHeader = new StringBuilder("//th[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String TableData = new StringBuilder("//td[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'bg-pink')]")
    protected List<WebElement> PinkHighlightedBackground;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit Letter')]")
    protected List<WebElement> SubmitLetterInGrid;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Status Overview')]")
    protected WebElement StatusOverviewHeader;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-cog')]")
    protected List<WebElement> ControlSettingsInGrid;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-refresh')]")
    protected WebElement RefreshIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-chkbox-box')]")
    protected WebElement CheckBoxInGrid;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'pi pi-times')]")
    protected WebElement CloseLetter;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'pi-window-maximize')]")
    protected WebElement MaximizeWindow;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'pi-window-minimize')]")
    protected WebElement MinimizeWindow;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-plus')]")
    protected List<WebElement> AddLetter;

    @FindBy(how = How.XPATH, using = "//label[text()='Clients']")
    protected WebElement SelectClients;

    @FindBy(how = How.XPATH, using = "//label[text()='Audits']")
    protected WebElement SelectAudits;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'ui-calendar-button')]")
    protected WebElement LetterJobCalendar;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'ui-state-highlight')]")
    protected WebElement TodayDate;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-chkbox-box')]")
    protected List<WebElement> CheckboxList;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-cloud-download')]")
    protected List<WebElement> CloudDownloadIcon;

    @FindBy(how = How.XPATH, using = "//p-tabview//input[contains(@placeholder,'Filter by')]")
    protected WebElement FilterByInHistoryTab;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-search')]")
    protected List<WebElement> searchIcon;


}