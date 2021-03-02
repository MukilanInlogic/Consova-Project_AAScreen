package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClientPageUI {


    protected final WebDriver driver;

    public ClientPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected String strLeftPaneHeaderLocator = new StringBuilder("//td[contains(text(),'").append("<<REPLACE>>").append("')]").toString();
    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//a[contains(text(),'").append("<<REPLACE>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//span[text()='Client Configuration']")
    protected WebElement clientConfiguration;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Client']")
    protected WebElement addClientButton;

    @FindBy(how = How.NAME, using = "clientEditName")
    protected WebElement clientName;

    @FindBy(how = How.NAME, using = "clientEditUrl")
    protected WebElement clientSiteLink;

    @FindBy(how = How.NAME, using = "clientEditLogoutUrl")
    protected WebElement clientLogoutUrl;

    @FindBy(how = How.NAME, using = "clientEditWiki")
    protected WebElement wikiLink;

    @FindBy(how = How.NAME, using = "clientEditPhone")
    protected WebElement clientPhoneNo;

    @FindBy(how = How.NAME, using = "phoneId")
    protected WebElement clientPhoneId;

    @FindBy(how = How.NAME, using = "editAssignedPeriodFrom")
    protected WebElement assignedPeriodFrom;

    @FindBy(how = How.NAME, using = "editAssignedPeriodTo")
    protected WebElement assignedPeriodTo;

    @FindBy(how = How.NAME, using = "logoUpload")
    protected WebElement logoUpload;
    protected String ClientLogo="Tulips.jpg";

    @FindBy(how = How.XPATH, using = "//td[contains(@class,'ui-datepicker-today')]")
    protected WebElement TodayInBootstrapCalender;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'ui-state-default ng-tns-c28-61 ui-state-highlight ng-star-inserted')]")
    protected WebElement TodayInBootstrapCalenderInEndDate;

    @FindBy(how = How.NAME, using = "clientEditRep")
    protected WebElement clientServiceRepDropdown;

    @FindBy(how = How.XPATH, using = "//select[@name='clientEditRep']//option")
    protected List<WebElement> clientServiceRep;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-toggle btn-multiselect')]")
    protected List<WebElement> languageSelectDropdown;

    @FindBy(how = How.XPATH, using = "//span[text()=' English ']")
    protected WebElement languageEnglishSelect;

    @FindBy(how = How.XPATH, using = "//span[text()=' Spanish ']")
    protected WebElement languageSpanishSelect;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Sub Clients']")
    protected WebElement btnAddSubClients;

    @FindBy(how = How.NAME, using = "clientEditEmp1")
    protected WebElement clientEditEmp;

    @FindBy(how = How.NAME, using = "clientEditDep1")
    protected WebElement clientEditDep;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'menu-animate-left d-flex justify-content-between')]")
    protected List<WebElement> clientList;

    @FindBy(how = How.ID, using = "inlineFormInputGroup")
    protected WebElement clientSearchTxtBox;

    @FindBy(how = How.XPATH, using = "//strong[text()='Select a client to get started!']")
    protected WebElement txtInClientPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Sub Clients']")
    protected WebElement btnEditClient;

    @FindBy(how = How.NAME, using = "clientEditiVAC")
    protected WebElement sliderRoundclientEditiVAC;

    @FindBy(how = How.NAME, using = "clientEditiRIS")
    protected WebElement sliderRoundclientEditiRIS;

    @FindBy(how = How.NAME, using = "clientEditGreen")
    protected WebElement sliderRoundclientEditGreen;

    @FindBy(how = How.NAME, using = "clientUploadDocuments")
    protected WebElement sliderRoundclientUploadDocuments;

    @FindBy(how = How.NAME, using = "IsActive")
    protected WebElement sliderRoundIsActive;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'clientEditEmp')]")
    protected List<WebElement> EmployeeCriteriaFields;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'clientEditDep')]")
    protected List<WebElement> DependentCriteriaFields;

    @FindBy(how = How.XPATH, using = "//span[@class='slider round']")
    protected WebElement sliderRoundHideInactive;

    @FindBy(how = How.XPATH, using = "//span[@class='slider round']")
    protected List<WebElement> sliderRound;

    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'list-unstyled menu-lists')]//span[text()='Client Configuration']")
    protected WebElement clientConfigurationInList;

    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'list-unstyled menu-lists')]//span[text()='Project Configuration']")
    protected WebElement projectConfigurationInList;

    @FindBy(how = How.XPATH, using = "//img[@alt='logo']")
    protected WebElement uploadedClientLogo;

    @FindBy(how = How.NAME, using = "logoUpload")
    protected WebElement newUploadClientLogo;

    @FindBy(how = How.XPATH, using = "//span[text()='Client Information']")
    protected WebElement clientInformationInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Client Name')]")
    protected WebElement clientNameInPanel;
    //@FindBy(how = How.XPATH, using = "")
    //protected WebElement clientIdInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Client Site Link')]")
    protected WebElement clientSiteLinkInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Phone #')]")
    protected WebElement phoneNoInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'')]")
    protected WebElement enabledIVACInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'')]")
    protected WebElement enabledIRISInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'')]")
    protected WebElement enabledGoGreenInPanel;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Client Service Rep')]")
    protected WebElement clientServiceRepInPanel;

    @FindBy(how = How.NAME, using = "newSubclientName")
    protected WebElement subClientName;

    @FindBy(how = How.NAME, using = "newSubclientPhone")
    protected WebElement subClientPhoneNo;

    @FindBy(how = How.NAME, using = "newAssignedPeriodFrom")
    protected WebElement subClientPhoneNoFrom;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'ui-state-highlight ng-star-inserted')]")
    protected WebElement subClientTodayDateInBootstrap;

    @FindBy(how = How.NAME, using = "newAssignedPeriodTo")
    protected WebElement subClientPhoneNoTo;

    @FindBy(how = How.NAME, using = "newSubclientSiteLink")
    protected WebElement subClientSiteLink;

    @FindBy(how = How.NAME, using = "newSubClientCode")
    protected WebElement subClientCode;

    @FindBy(how = How.NAME, using = "newSubclientTopicId")
    protected WebElement subClientPhoneId;

    @FindBy(how = How.NAME, using = "subclientEditRep")
    protected WebElement subClientEditRep;

    @FindBy(how = How.XPATH, using = "//select[@name='subclientEditRep']//option")
    protected List<WebElement> subClientEditRepDropdown;

    @FindBy(how = How.XPATH, using = "//span[@class='slider round']")
    protected List<WebElement> subClientSliders;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-pencil')]")
    protected WebElement editSubClient;

    @FindBy(how = How.XPATH, using = "//span[text()='Edit Subclient']")
    protected WebElement editSubClientModalHeader;

    @FindBy(how = How.NAME, using = "editSubclientName")
    protected WebElement subClientNameInEditModal;

    @FindBy(how = How.NAME, using = "editSubclientPhone")
    protected WebElement subClientPhoneNoInEditModal;

    @FindBy(how = How.NAME, using = "editAssignedPeriodFrom")
    protected WebElement subClientPhoneNoFromInEditModal;

    @FindBy(how = How.NAME, using = "editAssignedPeriodTo")
    protected WebElement subClientPhoneNoToInEditModal;

    @FindBy(how = How.NAME, using = "editSubclientSiteLink")
    protected WebElement subClientSiteLinkInEditModal;

    @FindBy(how = How.NAME, using = "editSubClientCode")
    protected WebElement subClientCodeInEditModal;

    @FindBy(how = How.NAME, using = "editSubclientTopicId")
    protected WebElement subClientPhoneIdInEditModal;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-plus')]")
    protected WebElement addSubClientLogoIcon;

    @FindBy(how = How.ID, using = "new-audit")
    protected WebElement AddNewAudit;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View')]")
    protected WebElement viewSubClientLogo;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Subclient has no logo to display')]")
    protected WebElement noSubClientLogoToDisplay;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Subclient Information')]")
    protected WebElement subClientInformation;

    protected String subClientDetails = new StringBuilder("//tr//td[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.ID, using = "new-audit")
    protected WebElement newAuditIcon;

    @FindBy(how = How.NAME, using = "auditName")
    protected WebElement createAuditLabel;

    @FindBy(how = How.NAME, using = "auditName")
    protected WebElement newAuditName;

    @FindBy(how = How.NAME, using = "clientAuditStartDate")
    protected WebElement clientAuditStartDate;

    @FindBy(how = How.NAME, using = "clientAuditEndDate")
    protected WebElement clientAuditEndDate;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'ui-calendar-w-btn')]")
    protected List<WebElement> calender;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'English')]")
    protected List<WebElement> englishLanguage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Spanish')]")
    protected List<WebElement> spanishLanguage;

    @FindBy(how = How.ID, using = "add-deadline")
    protected WebElement addDeadline;

    @FindBy(how = How.XPATH, using = "//input[contains(@class,'ng-untouched ng-pristine ng-invalid')]")
    protected WebElement deadlineNameTxtBox;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'ng-pristine ng-invalid')]")
    protected WebElement dropdownType;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'Deadline1')]")
    protected WebElement DeadlineOneDeadlineType;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'InitialLetter')]")
    protected List<WebElement> InitialLetterDeadlineType;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'ng-pristine ng-valid')]")
    protected WebElement frequencyTypeDropdown;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'ng-pristine ng-valid')]//option[text()='Once']")
    protected WebElement onceFrequencyTypeDropdown;

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'ng-pristine ng-valid')]//option[text()='Recurring']")
    protected WebElement recurringFrequencyTypeDropdown;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'StartDay')]")
    protected WebElement startDate;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'EndDay')]")
    protected WebElement endDate;

    @FindBy(how = How.XPATH, using = "//span[text()='Update']")
    protected WebElement updateButton;

    @FindBy(how = How.XPATH, using = "//select[@class='form-control ng-untouched ng-pristine']/@disabled")
    protected WebElement disabledFrequencyType;

    @FindBy(how = How.XPATH, using = "//input[@class='ng-untouched ng-pristine ng-valid']")
    protected WebElement schedularDisabled;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Client logo updated')]")
    protected WebElement SuccessfullyLogoUpdatedMessage;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-trash')]")
    protected WebElement trashButton;

    @FindBy(how = How.XPATH, using = "//span[text()='System Codes']")
    protected WebElement systemCodes;

    @FindBy(how = How.XPATH, using = "//span[text()='Incomplete Codes ']")
    protected WebElement ManageIncompleteCodesLbl;

    @FindBy(how = How.XPATH, using = "//span[text()='Ineligible Codes ']")
    protected WebElement ManageIneligibleCodesLbl;

    @FindBy(how = How.XPATH, using = "//span[text()='Documents ']")
    protected WebElement DocumentsLbl;

    @FindBy(how = How.XPATH, using = "//button[text()='Manage Incomplete Codes']")
    protected WebElement ManageIncompleteCodesBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Manage Ineligible Codes']")
    protected WebElement ManageIneligibleCodesBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Manage Documents']")
    protected WebElement ManageDocumentsBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Incomplete Code']")
    protected WebElement AddIncompleteCodesBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Ineligible Code']")
    protected WebElement AddIneligibleCodesBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Document']")
    protected WebElement AddManageDocumentsBtn;

    @FindBy(how = How.NAME, using = "languageTypeId")
    protected WebElement IncompleteCodeLanguageDropdown;

    @FindBy(how = How.XPATH, using = "//select[@name='languageTypeId']//option[contains(text(),'English')]")
    protected WebElement IncompleteCodeEnglishLanguageDropdown;

    @FindBy(how = How.XPATH, using = "//select[@name='languageTypeId']//option[contains(text(),'Spanish')]")
    protected WebElement IncompleteCodeSpanishLanguageDropdown;

    @FindBy(how = How.NAME, using = "verbiage")
    protected WebElement verbiage;

    @FindBy(how = How.NAME, using = "actionItemVerbiage")
    protected WebElement actionItemVerbiage;

    @FindBy(how = How.XPATH, using = "//div[@class='ui-multiselect-label-container']")
    protected WebElement documentTypeChoose;

    @FindBy(how = How.XPATH, using = "//input[@role='textbox']")
    protected WebElement documentTypeChooseSearchTxtBox;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-chkbox-box')]")
    protected List<WebElement> documentTypeChooseChkBox;

    @FindBy(how = How.XPATH, using = "//span[text()='Add']")
    protected WebElement addButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    protected WebElement addButtonInModal;

    @FindBy(how = How.XPATH, using = "//span[text()='Edit Incomplete Code']")
    protected WebElement editIncompleteCodeModal;

    @FindBy(how = How.XPATH, using = "//span[text()='Edit Document as Alternate']")
    protected WebElement editDocumentModal;

    @FindBy(how = How.XPATH, using = "//input[@class='form-control filter-input-element']")
    protected List<WebElement> filterSearch;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'filter-input-element ui-dropdown')]")
    protected WebElement typeFilter;

    @FindBy(how = How.XPATH, using = "//span[text()='All']")
    protected WebElement allInTypeFilter;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='Id']")
    protected WebElement IdHeader;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='Name']")
    protected WebElement VerbiageHeader;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='ActionItemVerbiage']")
    protected WebElement ActionItemVerbiageHeader;

    @FindBy(how = How.XPATH, using = "//th[text()='Type']")
    protected WebElement TypeHeader;

    @FindBy(how = How.XPATH, using = "//th[text()='Language']")
    protected WebElement LanguageHeader;

    @FindBy(how = How.XPATH, using = "//th[text()='IsActive']")
    protected WebElement IsActiveHeader;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='Type']")
    protected WebElement sortablecolumnTypeHeader;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='sortableLanguages']")
    protected WebElement sortablecolumnLanguageHeader;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'ic_doc_download')]")
    protected List<WebElement> downloadIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='CH']")
    protected WebElement CH;
    @FindBy(how = How.XPATH, using = "//span[text()='SP']")
    protected WebElement SP;
    @FindBy(how = How.XPATH, using = "//span[text()='CO']")
    protected WebElement CO;
    @FindBy(how = How.XPATH, using = "//span[text()='DP']")
    protected WebElement DP;
    @FindBy(how = How.XPATH, using = "//span[text()='HD']")
    protected WebElement HD;

    @FindBy(how = How.NAME, using = "version")
    protected WebElement versionName;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'pi-sort')]")
    protected List<WebElement> SortIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Edit Ineligible Code']")
    protected WebElement EditIneligibleCodeLabel;

    @FindBy(how = How.NAME, using = "docType")
    protected WebElement docType;

    @FindBy(how = How.XPATH, using = "//select[@name='docType']//option")
    protected List<WebElement> docTypeListInDropDown;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='Verbiage']")
    protected WebElement VerbiageInDocumentModal;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='DocumentType']")
    protected WebElement DocumentTypeInDocumentModal;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='SortableLanguages']")
    protected WebElement SortableLanguagesInDocumentModal;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='Relationship']")
    protected WebElement RelationshipInDocumentModal;

    @FindBy(how = How.XPATH, using = "//th[@psortablecolumn='AffidavitTypeId']")
    protected WebElement AffidavitTypeIdInDocumentModal;

    @FindBy(how = How.XPATH, using = "//strong[text()='Client Defaults']")
    protected WebElement clientDefaultLbl;

    @FindBy(how = How.XPATH, using = "//strong[text()='Timeline templates']")
    protected WebElement timelineTemplatesLbl;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Print Options')]")
    protected WebElement printLanguagesLbl;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Languages')]")
    protected WebElement LanguagesLbl;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Configure')]")
    protected WebElement configureButton;

    @FindBy(how = How.XPATH, using = "//div[@class='ui-dialog-content ui-widget-content']//span[text()='Configure Dependent Sub Types']")
    protected WebElement ConfigureDependentSubTypesLbl;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Sub Type')]")
    protected WebElement AddSubTypeButton;

    protected String spanText = new StringBuilder("//span[contains(text(),'").append("<<REPLACECONTENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-multiselect-header')]//div[contains(@class,'ui-chkbox-box')]")
    protected WebElement selectAllInMultiselector;

    @FindBy(how = How.XPATH, using = "//div[@class='ui-table-scrollable-body']//tbody[@class='ui-table-tbody']")
    protected WebElement addedTableInGrid;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex align-items-center']//label[@class='switch']")
    protected WebElement inactiveActiveToggle;

    @FindBy(how = How.XPATH, using = "//span[text()='Project Information']")
    protected WebElement projectInformationLbl;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-exclamation')]")
    protected List<WebElement> exclamationWarningSymbol;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Map Document')]")
    protected WebElement mapAlternateDocuments;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit Document(s)')]")
    protected WebElement editAlternateDocuments;

    @FindBy(how = How.XPATH, using = "//p[contains(@class,'flex-wrap')]//span[contains(@class,'fa-check consova-orange')]")
    protected List<WebElement> selectedAlternateDocuments;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-upload']")
    protected List<WebElement> FileUpload;

    @FindBy(how = How.XPATH, using = "//label[text()='Select Template']")
    protected WebElement SelectTemplateDropdown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Milestone Template')]//button[contains(text(),'Add')]")
    protected WebElement AddMilestoneTemplate;

    @FindBy(how = How.NAME, using = "milestoneName")
    protected WebElement MilestoneTemplateName;

    @FindBy(how = How.XPATH, using = "//div[contains(@style,'width:calc')]//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
    protected WebElement EventDaysOutTxtBox;

    @FindBy(how = How.XPATH, using = "//div[contains(@style,'width:calc')]//select[@class='form-control ng-untouched ng-pristine ng-invalid']")
    protected WebElement MilestoneTypeDropdown;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'InitialLetter')]")
    protected WebElement clickInitialLetter;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-pencil')]")
    protected List<WebElement> EditIcon;

    @FindBy(how = How.ID, using = "edit-audit-1")
    protected WebElement EditAuditIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'pi-calendar')]")
    protected List<WebElement> Calendar;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'align-items-center')]//span[contains(@class,'pi-calendar')]")
    protected List<WebElement> LastCalendarDate;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'ui-state-default')]")
    protected List<WebElement> LastDateInMonth;

    @FindBy(how = How.XPATH, using = "//td[contains(@class,'ui-datepicker-other-month')]//span[contains(text(),' 1 ')]")
    protected WebElement DatePick;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'1000')]//span[text()='Project Configuration']")
    protected WebElement WalmartProjectConfiguration;

}