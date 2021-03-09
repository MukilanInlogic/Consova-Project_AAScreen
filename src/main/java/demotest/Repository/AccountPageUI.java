package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPageUI {


    protected final WebDriver driver;

    public AccountPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//i[contains(@id,'loadAudit')]")
    protected WebElement LaunchAuditIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Edit']")
    protected List<WebElement> EditButton;

    @FindBy(how = How.NAME, using = "Email")
    protected WebElement EmailTxtBox;

    @FindBy(how = How.NAME, using = "FirstName")
    protected WebElement FirstNameTxtBox;

    @FindBy(how = How.NAME, using = "address2")
    protected WebElement AddressTxtBox;

    @FindBy(how = How.XPATH, using = "//li[contains(@class,'active')]")
    protected WebElement ActiveDependentTab;

    @FindBy(how = How.XPATH, using = "//li[@class='tab ng-star-inserted']")
    protected List<WebElement> InactiveDependentTab;

    @FindBy(how = How.XPATH, using = "//strong[contains(@class,'inline-block')]")
    protected List<WebElement> DependentEmployeeCriteria;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-trash')]")
    protected WebElement DeleteIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'Will_not_contact')]")
    protected WebElement WillNotContactIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'vip_badge')]")
    protected WebElement VIPBadge;

    @FindBy(how = How.XPATH, using = "//span[@ptooltip='Bad number']")
    protected WebElement BadNumberIcon;

    @FindBy(how = How.XPATH, using = "//i[@ptooltip='Left message']")
    protected WebElement LeftMessageIcon;

    @FindBy(how = How.XPATH, using = "//i[@ptooltip='Completed phone call']")
    protected WebElement CompletedPhoneCallIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-check')]")
    protected List<WebElement> TaskCheckIcon;

    @FindBy(how = How.XPATH, using = "//li[@role='option']")
    protected List<WebElement> RemoveReason;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-unlock')]")
    protected WebElement UnlockIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-unlock')]")
    protected List<WebElement> UnlockIconDependent;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-lock')]")
    protected WebElement LockIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'doc_download')]")
    protected WebElement DownloadIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'doc_print')]")
    protected WebElement PrintIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'filter_clear')]")
    protected WebElement ClearFilterIcon;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'notesLink')]")
    protected WebElement EmployeeAlert;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'notesLink')]")
    protected WebElement DependentAlert;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//i[contains(@class,'fa-check')]")
    protected WebElement AlertsCheckEnabled;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//span[contains(@class,'cursor-pointer')]")
    protected List<WebElement> AlertsList;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//button[contains(text(),'Save')]")
    protected WebElement SaveButtonInDialogBox;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//i[contains(@class,'fa-trash')]")
    protected WebElement DeleteButtonInDialogBox;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//i[contains(@class,'fa-refresh')]")
    protected WebElement RefreshButtonInDialogBox;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//button[contains(text(),'Cancel')]")
    protected WebElement CancelButtonInDialogBox;

    @FindBy(how = How.NAME, using = "contactName")
    protected WebElement contactName;

    @FindBy(how = How.NAME, using = "contactNumber")
    protected WebElement contactNumber;

    protected String DisabledTypeDiv = new StringBuilder("//div[contains(@class,'disabledType')][contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String DisabledTypeInput = new StringBuilder("//input[contains(@class,'disabledType')][contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();
    protected String ButtonInDialogBox = new StringBuilder("//div[@role='dialog']//button[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Name')]")
    protected WebElement CallerNameTxtbox;

    @FindBy(how = How.XPATH, using = "//div[@class='client-info']//img[@style='cursor:pointer']")
    protected WebElement SubclientLogo;

    @FindBy(how = How.XPATH, using = "//div[@class='client-info']//h6[@class='client-name']")
    protected WebElement SubclientName;

    @FindBy(how = How.XPATH, using = "//div[@class='sub-client']//img[contains(@src,'ic_contact')]")
    protected WebElement SubclientContact;

    @FindBy(how = How.XPATH, using = "//div[@class='sub-client']//img[contains(@src,'ic_fax')]")
    protected WebElement SubclientFax;

    @FindBy(how = How.XPATH, using = "//div[@class='sub-client']//a[contains(@href,'')]")
    protected WebElement SubclientWiki;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Tasks')]")
    protected WebElement TaskHeader;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'exclamation-triangle')]")
    protected WebElement EscalationIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-refresh')]")
    protected WebElement RefreshIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-pencil')]")
    protected WebElement PencilIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-trash')]")
    protected WebElement TrashIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-check')]")
    protected List<WebElement> CheckIcon;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-arrow-left')]")
    protected WebElement ArrowLeft;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-check')]")
    protected List<WebElement> DependentTypes;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    protected List<WebElement> TaskTypesCheckbox;

    @FindBy(how = How.XPATH, using = "//select[@name='flowType']")
    protected WebElement EscalationType;

    @FindBy(how = How.XPATH, using = "//select[@placeholder='Select Reason']")
    protected WebElement SelcetReason;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'untouched')]")
    protected WebElement SelectType;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add')]")
    protected List<WebElement> AddIconList;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add')]")
    protected List<WebElement> AddIconSpan;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),' Eligibility ')]")
    protected List<WebElement> EligibilityList;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Client Audit Name')]")
    protected List<WebElement> AuditList;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-plus')]")
    protected List<WebElement> PlusIcon;

    @FindBy(how = How.XPATH, using = "//label[contains(@class,'benefit-type initial')]")
    protected List<WebElement> AddedEvents;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'N/A')]")
    protected List<WebElement> NotApplicableDocument;

    @FindBy(how = How.XPATH, using = "//label[@for='add-event-1']")
    protected WebElement AddEvent;

    @FindBy(how = How.XPATH, using = "//h6[text()='History']")
    protected WebElement HistoryHeader;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Filter by')]")
    protected List<WebElement> FilterByTxtbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Activity')]")
    protected List<WebElement> ViewActivity;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Details')]")
    protected List<WebElement> ViewDetails;

    @FindBy(how = How.XPATH, using = "//input[contains(@class,'filter-input-element')]")
    protected List<WebElement> FilterTextbox;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-paginator-bottom')]")
    protected WebElement Pagination;

    @FindBy(how = How.XPATH, using = "//button[@disabled=''][contains(text(),'Linkable')]")
    protected WebElement DisabledLinkableButton;

    @FindBy(how = How.XPATH, using = "//button[@disabled=''][contains(text(),'Approved')]")
    protected WebElement DisabledApprovedButton;

    @FindBy(how = How.XPATH, using = "//button[@disabled=''][contains(text(),'Link')]")
    protected WebElement DisabledLinkButton;

    @FindBy(how = How.XPATH, using = "//button[@disabled=''][contains(text(),'Requested for Approval')]")
    protected WebElement DisabledRequestedForApprovalButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Link']")
    protected WebElement ActiveLinkButton;

    @FindBy(how = How.XPATH, using = "//span[@class='cursor-pointer text-primary']")
    protected WebElement HelpTicketId;

    @FindBy(how = How.NAME, using = "IsVip")
    protected WebElement VIPDropdown;

    @FindBy(how = How.XPATH, using = "//button[@ptooltip='Milestones']")
    protected WebElement DependentMilestones;

    @FindBy(how = How.XPATH, using = "//td[text()=' NewPackage ']")
    protected WebElement NewPackage;

    @FindBy(how = How.XPATH, using = "//td[text()=' PortalInquiry ']")
    protected WebElement PortalInquiry;

}