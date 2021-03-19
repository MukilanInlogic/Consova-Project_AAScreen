Feature: Smoke Module

  @EVS-39
  Scenario Outline: EVS-39:As a user I should see employee details on the account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify <firstName> text In Span
    And I should verify <lastName> text In Span
    And I should verify <ssn> text In Div
    And I should verify Edit text In Span
    And I should verify Date of Birth In Label
    And I should verify Employee Id In Label
    And I should verify Address In Label
    And I should verify Contact Details In Label
    And I should verify Home text In Bold
    And I should verify Mobile text In Bold
    And I should verify Work text In Bold
    And I should verify Email text In Bold
    And I should verify Preferred Email text In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | firstName          | lastName          | ssn          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.FIRSTNAME | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-35
  Scenario Outline: EVS-35:As a user I should see dependent information (tabs) on the account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should verify Gender In Label
    And I should verify Edit text In Span
    And I should verify Dependent Id In Label
    And I should verify SSN In Label
    And I should verify Dependent Id In Label
    And I should verify Unique Id In Label
    And I should verify Date of Birth In Label
    And I should verify Alerts text In Span
    And I should verify Medical text In Span
    And I should verify Dental text In Span
    And I should verify Vision text In Span
    And I should verify Life text In Span
    And I should verify AD&D text In Span
    And I should verify the criteria in employee and dependent
    And I should click on dependent milestone in dependent tab
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-64
  Scenario Outline: EVS-64:As a user I should see edit icons that can be clicked on to allow editing of employee and dependent information
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should not verify the VIP badge after lastname
    And I should click on edit button to edit employee Demographics
    And I should verify Employee Demographics text In Span
    And I should verify First Name In Label
    And I should verify Middle Name In Label
    And I should verify Last Name In Label
    And I should verify Gender In Label
    And I should verify Date of Birth In Label
    And I should verify Vip In Label
    And I should verify SSN In Label
    And I should verify Employee Id In Label
    And I should verify Email In Label
    And I should enter your <firstName> in first name textbox
    And I should enter your <emailId> in email textbox
    And I should click on VIP confirmation dropdown
    And I should click on Yes In Options
    And I should click on Cancel In Bold
    And I should close the displayed modal
    And I should click on edit button to edit employee Demographics
    And I should enter your <firstName> in first name textbox
    And I should enter your <firstName> in email textbox
    And I should verify disabled bold button in modal
    And I should enter your <emailId> in email textbox
    And I should click on VIP confirmation dropdown
    And I should click on Yes In Options
    And I should click on Save In Bold
    And I should verify Confirmation text In Span
    And I should verify Save changes? text In Span
    And I should verify No In Button
    And I should click on Yes In Button
    And I should verify the VIP badge after lastname
    And I should click on edit button to edit employee contact info
    And I should verify Employee Contact Info text In Span
    And I should verify disabled bold button in modal
    And I should verify Address Line 1 In Label
    And I should verify Home Phone In Label
    And I should verify Mobile Phone In Label
    And I should verify City In Label
    And I should verify Zip Code In Label
    And I should enter your <address> in address textbox
    And I should click on Select Reason In Options
    And I should click on Client Request In Options
    And I should click on Cancel In Bold
    And I should close the displayed modal
    And I should click on edit button to edit employee contact info
    And I should enter your <address> in address textbox
    And I should click on Select Reason In Options
    And I should click on Client Request In Options
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on edit button to edit dependent Demographics
    And I should verify Dependent Demographics text In Span
    And I should verify disabled bold button in modal
    And I should enter your <firstNameDep> in first name textbox
    And I should click on Cancel In Bold
    And I should close the displayed modal
    And I should click on edit button to edit dependent Demographics
    And I should enter your <firstNameDep> in first name textbox
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should verify <accountNumber> text In Bold
    And I should verify <firstNameDep> text In Span
    And I should verify <emailId> text In Span
    And I should verify <address> text In Div
    And I should close the newly opened window
    And I should logoff from home screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should click on Accept In Button
    And I should verify dependent first name updated
    And I should click on employee profile name
    And I should click on Profile In Button
    And I should verify <emailId> text In Span
    And I should verify <address> text In Div
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | emailId          | firstName          | address          | firstNameDep                | irisURL           | irisuserName           | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.EMAILID | DP:LOGIN.FIRSTNAME | DP:LOGIN.ADDRESS | DP:LOGIN.FIRSTNAMEDEPENDENT | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-1836
  Scenario Outline: EVS-1836:As a user, I should be able to update address with reason - account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on edit button to edit employee contact info
    And I should enter your <address> in address one textbox
    And I should verify disabled Save button in the modal
    And I should click on Select Reason In Options
    And I should click on Client Request In Options
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | address          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |  DP:LOGIN.ADDRESS |

  @EVS-1534
  Scenario Outline: EVS-1534:As a user, I should be able to log Employee or Dependent alerts even when account is locked or employee is non responder
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on lock icon on the account level
    And I should click on employee alert button
    And I should verify Employee Alerts text In Span
    And I should select one alert
    And I should click on Save button in dialog box
    And I should click on employee alert button
    And I should verify the enabled alert
    And I should click on Cancel In Button
    And I should click on dependent alert button
    And I should verify Dependent Audit Alerts text In Span
    And I should select one alert
    And I should click on Save button in dialog box
    And I should click on dependent alert button
    And I should verify the enabled alert
    And I should click on Cancel In Button
    And I should release locked icon on the account level
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-65
  Scenario Outline: EVS-65:As a user I should be able to work account tasks on the account screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should click on Upload Documents In Span
    And I should select desired document by Browse icon
    And I should click on Upload button in dialog box
    And I should click on OK In Button
    And I should click on Contact Us icon
    And I should enter Comments in textarea
    And I should click on Submit In Button
    And I should verify Portal Inquiry received text In Div
    And I should click on OK In Button
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Claim In Button
    And I should verify Are you sure you want to claim the task(s)? text In Span
    And I should verify Cancel In Button
    And I should verify Proceed In Button
    And I should click on Proceed In Button
    And I should verify tasks headers
    And I should verify escalation icon next to Tasks header
    And I should verify Created Date in table header
    And I should verify Due Date in table header
    And I should verify Action in table header
    And I should verify NewPackage in table data
    And I should verify PortalInquiry text in Table Data
    And I should verify Complete All In Button
    And I should click on first task
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want mark this task completed? text In Span
    And I should verify Cancel In Button
    And I should verify Proceed In Button
    And I should verify escalation icon next to Tasks header
    And I should click on Proceed In Button
    And I should click on first task
    And I should verify Complete Portal Inquiry text In Span
    And I should verify Contact Name In Label
    And I should verify Contact Number In Label
    And I should verify Comments In Label
    And I should verify Select Outcome In Label
    And I should verify Add Note (Required) In Label
    And I should verify Cancel In Button
    And I should verify Save In Button
    And I should verify outcome icons
    And I should click on call completed icon
    And I should click on Save Button in portal enquiry
    And I should not verify NewPackage in table data
    And I should not verify PortalInquiry text in Table Data
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-223
  Scenario Outline: EVS-223:As a user, I should be able to see employee details on the audit screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should verify <accountNumber> text In Bold
    And I should verify <lastName> text In Span
    And I should verify <firstName> text In Span
    And I should verify <sSN> In Label
#    And I should verify sub client info on the account screen
    And I should verify All Packages In Label
    And I should verify Outstanding Tasks In Label
    And I should verify Employee Milestones In Label
    And I should verify Complete All In Button
    And I should verify View All In Button
    And I should verify Help Ticket In Button
    And I should verify disabled Save button
    And I should verify disabled Cancel button
    And I should verify Action In Button
    And I should verify Forms In Button
    And I should verify 1 of 1 Accounts text In Bold
    And I should click on My Inventory
    And I should click on launch all audit icon
    And I should click on forward arrow button
    And I should verify 2 of text In Bold
    And I should click on forward arrow button
    And I should verify 3 of text In Bold
    And I should click on back arrow button
    And I should verify 2 of text In Bold
    And I should click on back arrow button
    And I should verify 1 of text In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountNumber      |lastName          | sSN          |firstName|
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTNO |DP:LOGIN.LASTNAME | DP:LOGIN.SSN |DP:LOGIN.FIRSTNAME|

  @EVS-1132
  Scenario Outline: EVS-1132:As a user, I should see the history tab on the account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify history header in account screen
    And I should verify Communication Activity In Button
    And I should verify Web Portal Activity In Button
    And I should verify Assistance Center Activity In Button
    And I should verify Document Submission In Button
    And I should verify  Date  text in Table Header
    And I should verify  Activity Type  text in Table Header
    And I should verify  Type  text in Table Header
    And I should verify  Details  text in Table Header
    And I should verify filterBy textbox in panel
    And I should verify  Clear Filters text In Span
    And I should verify  Showing 1 of text In Span
    And I should click on Web Portal Activity In Button
    And I should click on view activity from the grid
    And I should verify Portal Activity second level header
    And I should verify <accountNumber> text In Span
    And I should verify iVerify text In Span
    And I should close the displayed modal
    And I should verify User Login text In Span
    And I should verify Accept Disclaimer text In Span
    And I should verify Dashboard Viewed text In Span
    And I should verify Upload Activity text In Span
    And I should verify Submit Comment text In Span
    And I should click on Web Portal Activity In Button
    And I should click on Document Submission In Button
    And I should verify Uploaded Document text In Span
    And I should click on View Document In Span
    And I should navigate to newly opened window
    And I should close the newly opened window
    And I should click on Document Submission In Button
    And I should click on Assistance Center Activity In Button
    And I should verify Action Note text In Span
    And I should click on view details from the grid
    And I should verify Action Note second level header
    And I should verify Outbound Call text In Span
    And I should click on download icon
    And I should click on printer icon
    And I should navigate to newly opened window
    And I should close the newly opened window
    And I should close the displayed modal
    And I should click on Assistance Center Activity In Button
    And I should click on Communication Activity In Button
    And I should verify There is no data available text In Span
    And I should click on Communication Activity In Button
    And I should verify the pagination located at the bottom
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-66
  Scenario Outline: EVS-66:As a user I should see all history information for the account in the History menu
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify history header in account screen
    And I should click on Web Portal Activity In Button
    And I should click on Clear Filters In Span
    And I should click on Web Portal Activity In Button
    And I should click on clear filter icon
    And I should enter Portal Activity in first filterBy textbox
    And I should click on Clear Filters In Span
    And I should enter Portal Activity in first filterBy textbox
    And I should click on clear filter icon
    And I should enter Portal in third filter input textbox
    And I should click on Clear Filters In Span
    And I should enter Portal in third filter input textbox
    And I should click on clear filter icon
    And I should verify the pagination located at the bottom
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-58
  Scenario Outline: EVS-58:As a user I should see dependent information on the account and auditing screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should verify <accountNumber> text In Bold
    And I should verify <SSN> text In Div
    And I should verify <lastName> text In Span
    And I should click on Alerts In Span
    And I should click on Cancel In Button
    And I should click on dependent milestone in dependent tab
    And I should close the displayed modal
    And I should verify View All In Button
    And I should verify the active dependent tab with dependent name
    And I should verify Dependent Id In Label
    And I should verify Date of Birth In Label
    And I should verify Unique Id In Label
    And I should verify SSN In Label
    And I should verify Gender In Label
    And I should verify Benefits In Label
    And I should verify Dependent Sub Type  In Label
    And I should verify Capture DOB In Label
    And I should verify Benefits Audited In Label
    And I should verify Status In Label
    And I should verify Consova PIN In Label
    And I should verify All Packages In Label
    And I should verify Employee Id In Label
    And I should verify Outstanding Tasks In Label
    And I should verify Employee Milestones In Label
    And I should verify Address In Label
    And I should verify the dependent relation
    And I should verify Date of Birth In Label
    And I should verify the date in the given format
    And I should verify SSN In Label
    And I should verify Dependent Id In Label
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountNumber      | SSN          | lastName          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTNO | DP:LOGIN.SSN | DP:LOGIN.LASTNAME |

  @EVS-1433
  Scenario Outline: EVS-1433:As a user, I should be able to change dependent relationship
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should click on Change Relation In Button
    And I should verify Edit Relationship text In Span
    And I should verify Current Relation In Label
    And I should verify Change Relationship In Label
    And I should verify Please select a reason for Changing Relationship: In Label
    And I should click on Select Relationship In Label
    And I should click on other relation excluding current relation type
    And I should click on Select Reason In Label
    And I should verify Client request text In Span
    And I should verify Documentation Received text In Span
    And I should click on Client request In Span
    And I should click on Cancel In Bold
    And I should click on Change Relation In Button
    And I should verify Edit Relationship text In Span
    And I should verify Current Relation In Label
    And I should verify Change Relationship In Label
    And I should click on Select Relationship In Label
    And I should click on other relation excluding current relation type
    And I should click on Select Reason In Label
    And I should click on Client request In Span
    And I should click on Save In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should verify <accountNumber> text In Bold
    And I should verify changed dependent relation type
    And I should close the newly opened window
    And I should logoff from home screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify changed dependent relation type
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | emailId          | firstName          | address          | firstNameDep                | irisURL           | irisuserName           | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.EMAILID | DP:LOGIN.FIRSTNAME | DP:LOGIN.ADDRESS | DP:LOGIN.FIRSTNAMEDEPENDENT | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-48
  Scenario Outline: EVS-48:As a user I should see timelines on the account screen at the employee and dependent levels
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Project Configuration for walmart client
    And I should click on edit audit pencil icon
#    And I should click on add deadline in edit audit modal
#    And I should enter deadline <deadlineName> in the name textbox
#    And I should click on Select Type In Options
#    And I should click on AuditDate In Options
    And I should check on employee milestone for deadline added
    And I should click on Update In Span
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Employee Milestones In Label
    And I should verify Date in table header
    And I should verify Milestone in table header
    And I should verify Dependent Name in table header
    And I should click on View All In Button
    And I should verify <deadlineName> text in Table Data
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | deadlineName       |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.ACCOUNTNO |

  @EVS-1575
  Scenario Outline: EVS-1575:As a user, I should see employee mile stones on the account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should verify Employee Milestones In Label
    And I should verify Date in table header
    And I should verify Milestone in table header
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Employee Milestones In Label
    And I should verify Date in table header
    And I should verify Milestone in table header
    And I should verify Dependent Name in table header
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-80
  Scenario Outline: EVS-80:As a user I should see locks at the account level
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on lock icon on the account level
    And I should click on Add button
    And I should verify Cancel In Button
    And I should verify Save In Button
    And I should verify Add new Authorized Caller text In Span
    And I should close the displayed modal
    And I should verify disabled Ineligible Codes button
    And I should verify disabled Complete Date button
    And I should verify locked icon on the dependent level
    And I should release locked icon on the account level
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-57
  Scenario Outline: EVS-57:As a user I should see locks at the dependent level
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should click on lock icon on the dependent level
    And I should click on Add button
    And I should verify Cancel In Button
    And I should verify Save In Button
    And I should verify Add new Authorized Caller text In Span
    And I should close the displayed modal
    And I should verify disabled Ineligible Codes button
    And I should verify disabled Complete Date button
    And I should verify locked icon on the dependent level
    And I should release locked icon on the account level
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-40
  Scenario Outline: EVS-40:As a user I should be able to add an authorized caller to the account
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Authorized Caller text In Div
    And I should click on Add In Button
    And I should verify Add new Authorized Caller text In Span
    And I should enter <callerName> in caller name textbox
    And I should click on Cancel button in dialog
    And I should close the displayed modal
    And I should verify Authorized Caller text In Div
    And I should click on Add In Button
    And I should verify Add new Authorized Caller text In Span
    And I should verify Name In Label
    And I should verify Relationship In Label
    And I should enter <callerName> in caller name textbox
    And I should click on Select Relationship In Options
    And I should click on Other In Options
    And I should click on Save button in dialog box
    And I should close the displayed modal
    And I should click on View All In Span
    And I should verify Add Caller In Button
    And I should verify Name text in Table Header
    And I should verify Relationship text in Table Header
    And I should verify Authorized By text in Table Header
    And I should verify Authorized Date text in Table Header
    And I should verify Exp Date text in Table Header
    And I should verify refresh icon
    And I should verify pencil icon
    And I should verify trash icon
    And I should click on delete icon in dialog box
    And I should verify today date
    And I should click on refresh icon in dialog box
    And I should verify today date extended to next year
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should click on employee profile name
    And I should click on Profile In Button
    And I should verify Add Caller text In Span
    And I should verify <callerName> text In Span
    And I should verify Other text In Span
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | callerName          | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.CALLERNAME | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-2476
  Scenario Outline: EVS-2476:As a user I should see the following change to the Authorized Caller selection options in iVerify and Core Account Screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on View All In Span
    And I should verify Add Caller In Button
    And I should click on Add Caller In Button
    And I should click on Select Relationship In Options
    And I should verify Spouse text In Options
    And I should verify Domestic Partner text In Options
    And I should verify Ex-Spouse text In Options
    And I should verify Child or Grandchild text In Options
    And I should verify HR or Benefits Representative text In Options
    And I should verify Translator text In Options
    And I should verify Other text In Options
    And I should click on Cancel In Button
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should click on employee profile name
    And I should click on Profile In Button
    And I should click on Add Caller In Span
    And I should click on Select Relationship In Label
    And I should verify Spouse text In Span
    And I should verify Domestic Partner text In Span
    And I should verify Ex-Spouse text In Span
    And I should verify Child or Grandchild text In Span
    And I should verify HR or Benefits Representative text In Span
    And I should verify Translator text In Span
    And I should verify Other text In Span
    And I should enter <callerName> in caller name textbox
    And I should click on Cancel In Button
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | callerName          | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.CALLERNAME | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-54
  Scenario Outline: EVS-54:As a user I should see client information on the top of the page
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify sub client info on the account screen
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-2099
  Scenario Outline: EVS-2099:As a user, I should be able to see affidavits with always available option - iVerify
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Letters and Forms for walmart client
    And I should verify Affidavits text In Span
    And I should click on Add Affidavit In Button
    And I should verify Upload Affidavits text In Span
    And I should verify Enter Affidavits Version name In Label
    And I should verify Is this active template In Label
    And I should verify Select Affidavits Type In Label
    And I should verify Select Affidavit Configuration Type In Label
    And I should verify upload english template
    And I should verify upload spanish template
    And I should click on back arrow button
    And I should click on Add Affidavit In Button
    And I should enter <affidavitsName1> affidavits name in the version name textbox
    And I should click on active template toggle
    And I should click on Select Affidavits Type
    And I should click on Domestic Partner In Span
    And I should click on Select Affidavit Configuration Type
    And I should click on Always available In Span
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on Submit In Button
    And I should verify Affidavits uploaded successfully text In Div
    And I should click on OK In Button
    And I should click on back arrow button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify Communications text In Div
    And I should verify Documents text In Span
    And I should verify Communications text In Span
    And I should verify Forms text In Span
    And I should click on Forms In Span
    And I should verify Domestic Partner text In Span
    And I should verify  View Affidavit text In Span
    And I should click on latest View Affidavit link
    And I should close the displayed modal
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | affidavitsName1         | accountNumber      | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.AFFIDAVITNAME1 | DP:LOGIN.ACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-2080&EVS-63
  Scenario Outline: EVS-2080&EVS-63:As a user, I should be able to link affidavit to the employee account - core
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Letters and Forms for walmart client
    And I should verify Affidavits text In Span
    And I should click on Add Affidavit In Button
    And I should enter <affidavitsName2> affidavits name in the version name textbox
    And I should click on active template toggle
    And I should click on Select Affidavits Type
    And I should click on Domestic Partner In Span
    And I should click on Select Affidavit Configuration Type
    And I should click on Linkable In Span
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on Submit In Button
    And I should verify Affidavits uploaded successfully text In Div
    And I should click on OK In Button
    And I should click on back arrow button
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Forms In Button
    And I should verify Available Forms text In Span
    And I should verify Name text In Bold
    And I should verify Type text In Bold
    And I should verify Approval text in Table Header
    And I should verify Link to iVerify text in Table Header
    And I should verify Last Link Date text in Table Header
    And I should verify scrollable table
    And I should enter <affidavitsName2> in first filterBy textbox
    And I should verify <affidavitsName2> text In Span
    And I should verify Domestic Partner text In Span
    And I should verify disabled linkable button in approval column
    And I should verify active link button in link to iverify column
    And I should click on active link button in link to iverify column
    And I should verify Linked In Button
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify Communications text In Div
    And I should verify Documents text In Span
    And I should verify Communications text In Span
    And I should verify Forms text In Span
    And I should click on Forms In Span
    And I should verify Domestic Partner text In Span
    And I should verify  View Affidavit text In Span
    And I should click on latest View Affidavit link
    And I should close the displayed modal
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | affidavitsName2         | accountURL          | accountNumber      | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.AFFIDAVITNAME2 | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-2100
  Scenario Outline: EVS-2100:As a user, I should be able to see affidavits that require approval from the audit and account screen (forms modal)
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Letters and Forms for walmart client
    And I should verify Affidavits text In Span
    And I should click on Add Affidavit In Button
    And I should enter <affidavitsName3> affidavits name in the version name textbox
    And I should click on active template toggle
    And I should click on Select Affidavits Type
    And I should click on Domestic Partner In Span
    And I should click on Select Affidavit Configuration Type
    And I should click on Always available In Span
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on Submit In Button
    And I should verify Affidavits uploaded successfully text In Div
    And I should click on OK In Button
    And I should click on back arrow button
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Forms In Button
    And I should enter <accountNumber> in first filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should verify Domestic Partner text In Span
    And I should verify disabled link button in link to iverify column
    And I should click on Request Approval In Button
    And I should verify Create Help Ticket text In Span
    And I should verify Consova PIN In Label
    And I should verify Assign To In Label
    And I should verify Select One text In Options
    And I should click on Select One In Options
    And I should verify Manager Review text In Options
    And I should verify Deceased Relative text In Options
    And I should verify Comments In Label
    And I should click on Select One In Options
    And I should click on Manager Review In Options
    And I should click on Cancel In Button
    And I should click on Request Approval In Button
    And I should verify Create Help Ticket text In Span
    And I should click on Select One In Options
    And I should click on Manager Review In Options
    And I should click on Submit In Button
    And I should verify disabled requested fro approval button in link to iverify column
    And I should verify active link button in link to iverify column
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <URL>
    When I should Login to core application with <manager> and <password>
    And I should click on Login button from Login screen
    And I should enter <accountNumber> in first filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should verify Manager Review text in Table Data
    And I should verify <affidavitsName3> text in Table Data
    And I should click on ticket number to open the ticket
    And I should verify View Help Ticket text In Span
    And I should verify <accountNumber> text In Span
    And I should enter Approved in textarea
    And I should click on Approve In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter <accountNumber> in first filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should click on ticket number to open the ticket
    And I should enter Resolved in textarea
    And I should click on Resolve In Button
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Forms In Button
    And I should enter <affidavitsName3> in first filterBy textbox
    And I should verify <affidavitsName3> text In Span
    And I should verify disabled linkable button in approval column
    And I should verify disabled linkable button in approval column
    And I should verify active link button in link to iverify column
    And I should click on active link button in link to iverify column
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify Communications text In Div
    And I should verify Documents text In Span
    And I should verify Communications text In Span
    And I should verify Forms text In Span
    And I should click on Forms In Span
    And I should verify Domestic Partner text In Span
    And I should verify  View Affidavit text In Span
    And I should click on latest View Affidavit link
    And I should close the displayed modal
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | affidavitsName3         | accountURL          | accountNumber      | ivacURL             | lastName          | sSN          | manager          | auditor          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.AFFIDAVITNAME3 | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN | DP:LOGIN.MANAGER | DP:LOGIN.AUDITOR |

  @EVS-2396
  Scenario Outline: EVS-2396:As a user, I should be able to map an affidavit to a document requirement
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Letters and Forms for walmart client
    And I should verify Affidavits text In Span
    And I should click on Add Affidavit In Button
    And I should enter <affidavitsName4> affidavits name in the version name textbox
    And I should click on active template toggle
    And I should click on Select Affidavits Type
    And I should click on Domestic Partner In Span
    And I should click on Select Affidavit Configuration Type
    And I should click on Linkable In Span
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on Submit In Button
    And I should verify Affidavits uploaded successfully text In Div
    And I should click on OK In Button
    And I should click on System codes for walmart
    And I should verify Documents text In Span
    And I should click on Manage Documents In Button
    And I should click on add documents
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should select all dependents in ineligible modal
    And I should click on choose document type dropdown in documents modal
    And I should select document type dropdown in documents modal
    And I should click on link icon
    And I should verify Client Affidavit Template text In Span
    And I should verify <affidavitsName4> text In Span
    And I should click on <affidavitsName4> In Span
    And I should click on Save In Button
    And I should click on Add button
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Add Document In Button
    And I should select last added document
    And I should select event type from the document modal
    And I should click on Save In Bold
    And I should verify <affidavitsName4> text In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify Communications text In Div
    And I should verify Documents text In Span
    And I should verify Communications text In Span
    And I should verify Forms text In Span
    And I should click on Forms In Span
    And I should verify Domestic Partner text In Span
    And I should verify  View Affidavit text In Span
    And I should click on latest View Affidavit link
    And I should close the displayed modal
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | englishVerbiage               | affidavitsName4         | accountNumber      | ivacURL             | lastName          | sSN          | accountURL          | spanishVerbiage      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ENGVERBIAGEAFFIDAVIT | DP:LOGIN.AFFIDAVITNAME4 | DP:LOGIN.ACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPAVERBIAGE |

    #Need to reframe
  @EVS-82
  Scenario Outline: EVS-82:As a user I should be able to add action notes to the account on Account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Action In Button
    And I should navigate to newly opened window
    And I should verify Type: text In Div
    And I should verify Secondary Type: text In Div
    And I should verify Contact Type: text In Div
    And I should verify Contact Number: text In Div
    And I should verify Contact Name: text In Div
    And I should verify Reasons: text In Div
    And I should verify CT: text In Div
    And I should verify Add Notes: text In Div
    And I should verify Internal Only: text In Div
    And I should click on Auditing In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Client Services In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Management In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Inbound Call In Div
    And I should verify Customer Service text In Div
    And I should click on Outbound Call In Div
    And I should verify Customer Service text In Div
    And I should verify Reminder Call text In Div
    And I should click on Escalation Call In Div
    And I should verify N/A text In Div
    And I should verify Employee text In Div
    And I should verify Auth Dep text In Div
    And I should verify NotAuth Dep text In Div
    And I should verify Translator text In Div
    And I should verify HR/Benefits text In Div
    And I should verify Other text In Div
    And I should click on Employee In Div
    And I should enter <contactName> in contact name textbox
    And I should enter <contactNumber> in contact number textbox
    And I should verify Status text In Div
    And I should verify Negative Status text In Div
    And I should verify Submit Docs text In Div
    And I should verify Obtain Docs text In Div
    And I should verify Portal Help text In Div
    And I should verify HIPAA text In Div
    And I should verify Forms text In Div
    And I should verify General text In Div
    And I should verify Security text In Div
    And I should verify HIPAA text In Div
    And I should click on Status In Div
    And I should verify General Inquiry text In Div
    And I should verify PIN/Portal text In Div
    And I should verify Submit text In Div
    And I should verify Complete text In Div
    And I should verify Status text In Div
    And I should verify Alternatives text In Div
    And I should verify HIPAA text In Div
    And I should verify NotAuth text In Div
    And I should verify NotAuth Info text In Div
    And I should verify Call Back text In Div
    And I should verify Reminder text In Div
    And I should verify SPER text In Div
    And I should click on General Inquiry In Div
    And I should click on Save In Button
    And I should close the newly opened window
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | contactName          | contactNumber    |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.CONTACTNAME | DP:LOGIN.PHONENO |

  @EVS-284
  Scenario Outline: EVS-284:As a user I should be able to add action notes to the account on Audit screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should click on Action In Button
    And I should navigate to newly opened window
    And I should verify Type: text In Div
    And I should verify Secondary Type: text In Div
    And I should verify Contact Type: text In Div
    And I should verify Contact Number: text In Div
    And I should verify Contact Name: text In Div
    And I should verify Reasons: text In Div
    And I should verify CT: text In Div
    And I should verify Add Notes: text In Div
    And I should verify Internal Only: text In Div
    And I should click on Auditing In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Client Services In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Management In Div
    And I should verify Employee text in disabled type div
    And I should verify Status text in disabled type div
    And I should verify General Inquiry text in disabled type div
    And I should click on Inbound Call In Div
    And I should verify Customer Service text In Div
    And I should click on Outbound Call In Div
    And I should verify Customer Service text In Div
    And I should verify Reminder Call text In Div
    And I should click on Escalation Call In Div
    And I should verify N/A text In Div
    And I should verify Employee text In Div
    And I should verify Auth Dep text In Div
    And I should verify NotAuth Dep text In Div
    And I should verify Translator text In Div
    And I should verify HR/Benefits text In Div
    And I should verify Other text In Div
    And I should click on Employee In Div
    And I should enter <contactName> in contact name textbox
    And I should enter <contactNumber> in contact number textbox
    And I should verify Status text In Div
    And I should verify Negative Status text In Div
    And I should verify Submit Docs text In Div
    And I should verify Obtain Docs text In Div
    And I should verify Portal Help text In Div
    And I should verify HIPAA text In Div
    And I should verify Forms text In Div
    And I should verify General text In Div
    And I should verify Security text In Div
    And I should verify HIPAA text In Div
    And I should click on Status In Div
    And I should verify General Inquiry text In Div
    And I should verify PIN/Portal text In Div
    And I should verify Submit text In Div
    And I should verify Complete text In Div
    And I should verify Status text In Div
    And I should verify Alternatives text In Div
    And I should verify HIPAA text In Div
    And I should verify NotAuth text In Div
    And I should verify NotAuth Info text In Div
    And I should verify Call Back text In Div
    And I should verify Reminder text In Div
    And I should verify SPER text In Div
    And I should click on General Inquiry In Div
    And I should click on Save In Button
    And I should verify / text In Span
    And I should close the newly opened window
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountNumber      | contactName          | contactNumber    |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTNO | DP:LOGIN.CONTACTNAME | DP:LOGIN.PHONENO |

  @EVS-224
  Scenario Outline: EVS-224:As a user, I should be able to escalate employee tasks
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on escalation icon
    And I should verify Escalate/De-escalate text In Span
    And I should verify Employee Name text In Bold
    And I should verify Consova PIN text In Bold
    And I should verify Client Name text In Bold
    And I should verify Escalate or De-escalate In Label
    And I should click on select escalation type dropdown
    And I should click on Escalate In Options
    And I should verify Escalate To In Label
    And I should click on select type untoched dropdown
    And I should verify Management text In Options
    And I should verify Client Services text In Options
    And I should click on Management In Options
    And I should verify Comment In Label
    And I should enter Comments in textarea
    And I should verify Escalate text in Table Header
    And I should verify Reason text in Table Header
    And I should verify Type text in Table Header
    And I should verify Due Date text in Table Header
    And I should verify Details text in Table Header
    And I should verify Package text In Span
    And I should verify Portal Inquiry text In Span
    And I should select the task type
    And I should click on select reason dropdown
    And I should select the reason for remove audit
    And I should click on Save In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-61
  Scenario Outline: EVS-61:As a user I should see web inquiry tasks get created by the system
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify tasks second level header
    And I should verify Created Date in table header
    And I should verify Due Date in table header
    And I should verify Action in table header
    And I should verify PortalInquiry in table data
    And I should click on Complete All In Button
    And I should verify Confirmation text In Span
    And I should click on Proceed In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-231
  Scenario Outline: EVS-231:As a user, I should complete QR tasks as Incorrect
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Complete All In Button
    And I should verify Confirmation text In Span
    And I should click on Proceed In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-51
  Scenario Outline: EVS-51:As a user I should be able to remove employees and dependents from a project
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should click on Upload Documents In Button
    And I should select desired document by Browse icon
    And I should click on Upload button in dialog box
    And I should click on OK In Button
    And I should close the newly opened window
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify delete audit button in the dependent section
    And I should click delete audit button in the dependent section
    And I should verify Remove From Audit text In Span
    And I should click on Cancel In Button
    And I should verify Remove From Audit text In Span
    And I should click on Select Reason In Label
    And I should verify Consova discretion text In Span
    And I should verify Dependent benefit(s) cancelled text In Span
    And I should verify Dependent reported as deceased text In Span
    And I should verify Employee benefit(s) cancelled text In Span
    And I should verify Employee reported as deceased text In Span
    And I should verify Employee terminated employment text In Span
    And I should verify Home in disrepair or requiring maintenance or renovation text In Span
    And I should verify Non-Payment of policy or too many missed payments text In Span
    And I should verify Criminal Record, false declarations text In Span
    And I should verify Change in a situation text In Span
    And I should verify Enlarged spleen text In Span
    And I should click on Consova discretion In Span
    And I should click on Remove From Audit In Button
    And I should click on No In Button
    And I should click on Remove From Audit In Button
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to remove this person from audit? text In Span
    And I should click on Yes In Button
    And I should verify Consova discretion text In Div
    And I should verify Removed from Audit text In Span
    And I should click on Edit Result In Button
    And I should click delete audit button in the dependent section
    And I should verify Remove From Audit text In Span
    And I should click on Select Reason In Label
    And I should click on Consova discretion In Span
    And I should click on Remove From Audit In Button
    And I should click on Yes In Button
    And I should verify the removed reason in red bold font with reason
    And I should verify Consova discretion text In Div
    And I should verify Removed from Audit text In Span
    And I should verify removed from audit in inclined position
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           | irisURL           | irisuserName           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.REMOVEEMPLOYEE | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME |

  @EVS-1971
  Scenario Outline: EVS-1971:As a user, I should see audit screen details for dependents with removed from audit
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should click on auditor dropdown in inventory modal
    And I should click on <auditorName> In Span
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should verify no active dependents label
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountNumber           | auditorName      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.REMOVEEMPLOYEE | DP:LOGIN.AUDITOR |

  @EVS-1968
  Scenario Outline: EVS-1968:As a user, I should be able to see removed from audit dependents - iVerify Pro
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the removed reason in red bold font with reason
    And I should verify Consova discretion text In Div
    And I should verify Removed from Audit text In Span
    And I should verify removed from audit in inclined position
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should verify the removed reason in red bold font with reason
    And I should verify Consova discretion text In Div
    And I should verify Removed from Audit text In Span
    And I should verify removed from audit in inclined position
    And I should close the newly opened window
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           | irisURL           | irisuserName           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.REMOVEEMPLOYEE | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME |

  @EVS-2727
  Scenario Outline: EVS-2727:As a user, I should see watermark on account screen based on the audit status
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Removed from Audit text In Span
    And I should enter account url <accountURL> with <accountNumberAuditOver>
    And I should verify <accountNumberAuditOver> text In Bold
    And I should verify Audit Over text In Span
    And I should verify audit over in inclined position
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           | accountNumberAuditOver     |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.REMOVEEMPLOYEE | DP:LOGIN.AUDITOVEREMPLOYEE |

  @EVS-38
  Scenario Outline: EVS-38:As a user I should be able to add employees and dependents to a project
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Removed from Audit text In Span
    And I should click on add icon
    And I should verify Add To Audit text In Span
    And I should click on required audit name
    And I should verify Add To Event text In Span
    And I should verify Available Event Types to Add In Label
    And I should click on eligibility to add event type
    And I should click on Select Benefits In Button
    And I should click on Add to Audit In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.REMOVEEMPLOYEE |

  @EVS-76
  Scenario Outline: EVS-76:As a user I should be able to add new documents on the auditing screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Add Document In Button
    And I should verify Add Documents text In Span
    And I should click on add document plus icon
    And I should select event type from the modal
    And I should click on Save In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.REMOVEEMPLOYEE |

  @EVS-425
  Scenario Outline: EVS-425:As a system I should mark all documents as N/A if the auditor marks the dependent as ineligible
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Ineligible Codes In Button
    And I should verify Add Documents text In Span
    And I should select event type from the modal
    And I should click on Save button in dialog box
    And I should confirm the documents marked as not applicable
    And I should click on Save In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO |

  @EVS-430
  Scenario Outline: EVS-430:As a system I should derive document status from alternate documents status on account
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify Documents label
    And I should click on manage documents
    And I should click on add documents
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should select all dependents in ineligible modal
    And I should click on choose document type dropdown in documents modal
    And I should select document type dropdown in documents modal
    And I should click on Add button
    And I should click on add documents
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage1> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage1> code in verbiage textarea
    And I should select all dependents in ineligible modal
    And I should click on choose document type dropdown in documents modal
    And I should select document type dropdown in documents modal
    And I should click on Map as Alternate Document In Button
    And I should verify Map to Primary Document text In Span
    And I should check the newly added document
    And I should click on Save In Button
    And I should click on Add button
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Add Document In Button
    And I should select last added document
    And I should select event type from the modal
    And I should click on Save In Bold
    And I should click on MIS In Bold
    And I should click on N/A In Bold
    And I should click on N/A In Bold
    And I should click on ALT In Bold
    And I should verify Add Alternate Documents text In Span
    And I should click on <englishVerbiage> In Div
    And I should click on Save In Button
    And I should verify MIS text In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber      | clientname             | englishVerbiage      | spanishVerbiage      | englishVerbiage1      | spanishVerbiage1      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:LOGIN.WALMARTCLIENT | DP:LOGIN.ENGVERBIAGE | DP:LOGIN.SPAVERBIAGE | DP:LOGIN.ENGVERBIAGE1 | DP:LOGIN.SPAVERBIAGE1 |

  @EVS-387
  Scenario Outline: EVS-387:As a system I should derive document status from alternate documents status on audit
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on load audit icon
    And I should verify <accountNumber> text In Bold
    And I should click on MIS In Bold
    And I should click on N/A In Bold
    And I should click on N/A In Bold
    And I should click on ALT In Bold
    And I should verify Add Alternate Documents text In Span
    And I should click on <englishVerbiage> In Div
    And I should click on Save In Button
    And I should verify MIS text In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountNumber      | englishVerbiage      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTNO | DP:LOGIN.ENGVERBIAGE |

  @EVS-67
  Scenario Outline: EVS-67:As a user I should see overall audit statuses related to ineligible and incomplete reasons
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should click on Manage Incomplete Codes In Button
    And I should click on Add Incomplete Code In Button
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should enter <englishVerbiage> code in action item verbiage textarea
    And I should click on choose document type dropdown
    And I should verify search textbox inside choose document type dropdown
    And I should click on checkboxes by selecting all
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should enter <spanishVerbiage> code in action item verbiage textarea
    And I should click on Add button in modal
    And I should click on System codes
    And I should click on Manage Ineligible Codes In Button
    And I should click on Add Ineligible Code In Button
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should verify disabled submit button
#    And I should click on Select SubClients In Span
#    And I should click on checkboxes by selecting all
    And I should select all dependents in ineligible modal
    And I should click on Add button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | clientname          | englishVerbiage      | spanishVerbiage      |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.TESTCLIENT | DP:LOGIN.ENGVERBIAGE | DP:LOGIN.SPAVERBIAGE |

  @EVS-2433
  Scenario Outline: EVS-2433:As a user, I should be able to set ineligible code type on ineligible modal
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should click on Manage Ineligible Codes In Button
    And I should click on Add Ineligible Code In Button
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should verify disabled submit button
    And I should select all dependents in ineligible modal
    And I should verify Is System Code: In Label
    And I should enable system code from round slider icon
    And I should click on Add button
    And I should enter <englishVerbiage> in first filterBy textbox
    And I should verify <englishVerbiage> text in Table Data
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | clientname          | englishVerbiage             | spanishVerbiage             |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.TESTCLIENT | DP:LOGIN.ENGVERBIAGESYSCODE | DP:LOGIN.SPAVERBIAGESYSCODE |

  @EVS-2248
  Scenario Outline: EVS-2248:As a user, I should be to configure ineligible reasons for sub clients
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should click on Manage Ineligible Codes In Button
    And I should enter <englishVerbiage> in first filterBy textbox
    And I should click on Edit Sub Client pencil icon
    And I should click on Add Ineligible Code In Button
    And I should click on add ineligible codes
    And I should verify disabled submit button
    And I should verify <subClient> text In Span
    And I should click on Update In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | clientname          | englishVerbiage             | subClient          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.TESTCLIENT | DP:LOGIN.ENGVERBIAGESYSCODE | DP:LOGIN.SUBCLIENT |

  @EVS-2133
  Scenario Outline: EVS-2133:As a user, I should be able to term an employee
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify the term employee icon
    And I should click the term employee icon
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to term this employee record? text In Span
    And I should click on No In Button
    And I should click the term employee icon
    And I should click on Yes In Button
    And I should not verify the term employee icon
    And I should verify Employee Termed text In Span
    And I should verify disabled Add button
    And I should verify disabled Edit Result button
    And I should verify disabled Change Relation button
    And I should verify disabled Complete All button
    And I should verify disabled Add Document button
    And I should verify disabled Complete Date button
    And I should verify disabled Ineligible Codes button
    And I should verify disabled Help Ticket button
    And I should click on View All In Button
    And I should close the displayed modal
    And I should click on dependent milestone in dependent tab
    And I should close the displayed modal
    And I should click on employee alert button
    And I should close the displayed modal
#    And I should click on dependent alert button
#    And I should close the displayed modal
    And I should click on Admin Ticket In Button
    And I should verify Create Admin Ticket text In Span
    And I should click on Cancel In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.TERMEDEMPLOYEE |

  @EVS-134
  Scenario Outline: EVS-134:As a user, I should capture dependent types for SP
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should verify (SP) text In Span
    And I should click on CL In Span
    And I should click on LM In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber            |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPOUSEACCOUNTNO |

  @EVS-2443
  Scenario Outline: EVS-2443:As a user, I should be able to capture complete date manually on the account and audit screen
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should click on Upload Documents In Button
    And I should select desired document by Browse icon
    And I should click on Upload button in dialog box
    And I should click on OK In Button
    And I should close the newly opened window
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Complete All In Button
    And I should click on Proceed In Button
    And I should click on CL In Span
    And I should complete all documents listed
    And I should click on Save In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <URL>
    When I should Login to core application with <userNameRandom> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory
    And I should enter <accountNumber> in first filterBy textbox
    And I should click on <accountNumber> In Span
    And I should navigate to newly opened window
    And I should verify <accountNumber> text In Bold
    And I should click on complete random task
    And I should click on Proceed In Button
    And I should click on Save In Button
    And I should verify error message for completed date
    And I should click on Close In Button
    And I should click on Complete Date In Button
    And I should verify Complete Date text In Span
    And I should verify enabled benefit type in the modal
    And I should click on Cancel button in dialog
    And I should click on Complete Date In Button
    And I should verify Complete Date text In Span
    And I should verify enabled benefit type in the modal
    And I should enter <date> date in completed date modal
    And I should click on Save Button in portal enquiry
    And I should click on Save In Button
    And I should close the newly opened window
    And I should click on load audit icon
    And I should verify <accountNumber> text In Bold
    And I should verify the completed benefit type
    And I should verify the completed date in required date format
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName                 | password          | accountURL          | accountNumber            | irisURL           | irisuserName           | date          | userNameRandom          |
      | DP:LOGIN.URL | DP:LOGIN.PACKAGEUSERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPOUSEACCOUNTNO | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME | DP:LOGIN.DATE | DP:LOGIN.RANDOMUSERNAME |

  @EVS-1820
  Scenario Outline: EVS-1820:As a user, I should see the captured Complete Date - iVerifyPro
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Complete Date In Button
    And I should verify the completed benefit type
    And I should verify the completed date in required date format
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should click on <accountNumber> In Div
    And I should navigate to newly opened window
    And I should verify  Complete  text In Div
    And I should close the newly opened window
    And I should logoff from home screen
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber            | irisURL           | irisuserName           |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPOUSEACCOUNTNO | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME |

  @EVS-2150
  Scenario Outline: EVS-2150:As a user, I should be able to purge a dependent
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should click the purge dependent icon
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to purge this dependent record? text In Span
    And I should click on No In Button
    And I should click the purge dependent icon
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to purge this dependent record? text In Span
    And I should click on Yes In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.PURGEEMPLOYEE |

  @EVS-2792
  Scenario Outline: EVS-2792:As a user, I should be able to purge an Employee
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should click the purge employee icon
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to purge this employee record? text In Span
    And I should click on No In Button
    And I should click the purge employee icon
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to purge this employee record? text In Span
    And I should click on Yes In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify search textbox at the right top of window
    And I should enter <accountNumber> in the search bar
    And I should logoff from home screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should verify Authentication text In Span
    And I should verify error icon in the displayed modal
    And I should verify We are not able to verify the requested account, or you are not in an active verification with Consova. text In Div
    And I should verify Click below to Return to Sign In to try again.If you believe this is an error, please contact Consova at (866) 529 - 9107 for assistance. text In Div
    And I should click on Return to Sign In In Button
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber          | irisURL           | irisuserName           | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.PURGEEMPLOYEE | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-1856
  Scenario Outline: EVS-1856:As a user, I shouldn't see save button enabled for following actions
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
    And I should click on Contact Us icon
    And I should enter Need assistance on my certificate in textarea
    And I should click on Submit In Button
    And I should verify Portal Inquiry received text In Div
    And I should click on OK In Button
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on Claim In Button
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to claim the task(s)? text In Span
    And I should click on Proceed In Button
    And I should click on first task
    And I should verify Complete Portal Inquiry text In Span
    And I should click on call completed icon
    And I should click on Save Button in portal enquiry
    And I should verify disabled Save button
    And I should verify disabled Cancel button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber            | ivacURL             | lastName          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPOUSEACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN |

  @EVS-546
  Scenario Outline: EVS-546:As a user, I should see Activity log menu option in the user account icon
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on profile icon in core
    And I should click on activity log fom the dropdown
    And I should navigate to newly opened window
    And I should verify activity logs header in newly opened window
    And I should enter <accountNumber> in first filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should verify Open Account Screen text in Table Data
    And I should verify the pagination located at the bottom
    And I should verify Activity Type  text in Table Header
    And I should verify Activity Occurred Datetime  text in Table Header
    And I should verify Employee Pin Accessed  text in Table Header
    And I should verify Employee Name  text in Table Header
    And I should verify Client Name  text in Table Header
    And I should click on Clear Filters In Span
    And I should verify filterBy textbox
    And I should enter <date> date in the date filter box
    And I should verify <date> text in Table Data
    And I should click on Clear Filters In Span
    And I should click on Activity Type  text in Table Header
    And I should click on Employee Pin Accessed  text in Table Header
    And I should click on Employee Name  text in Table Header
    And I should click on Client Name  text in Table Header
    And I should click on download icon
    And I should click on Activity Occurred Datetime  text in Table Header
    And I should verify the list of activity performed by the logged user for last seven days
    And I should enter <userName> in first filterBy textbox
    And I should verify There is no data available text In Span
    And I should click on Clear Filters In Span
    And I should close the newly opened window
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      | URL          | userName          | password          | accountURL          | accountNumber            | ivacURL             | lastName          | sSN          | date          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.SPOUSEACCOUNTNO | DP:LOGIN.IVERIFYURL | DP:LOGIN.LASTNAME | DP:LOGIN.SSN | DP:LOGIN.DATE |

  @EVS-279245
  Scenario Outline: EVS-279245:As a user, admin ticket
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should click on Admin Ticket In Button
    And I should verify Create Admin Ticket text In Span
    And I should verify <accountNumber> text In Bold
    And I should click on Select Ticket Owner In Label
    And I should click on <ticketOwnerInitial> In Span dialog box
    And I should click on Select Ticket Reason In Label
    And I should click on <ticketReason> In Span
    And I should click on Select Audit In Label
    And I should select audit from the dropdown
    And I should click on Select Dependent In Span
    And I should select all from dependent dropdown
    And I should enter Ticket created in textarea
    And I should click on Submit In Button
    And I should click on OK In Button
    And I should click on Home tab from menubar
    And I should click on Assigned to Client In Span
    And I should enter <accountNumber> in fourth filterBy textbox
    And I should verify There is no data available text In Span
    And I should click on Resolved In Span
    And I should enter <accountNumber> in fifth filterBy textbox
    And I should click on Assigned to Consova In Span
    And I should enter <accountNumber> in third filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should verify <auditor> text In Span
    And I should open the admin ticket by clicking admin ticket number
    And I should verify View Admin Ticket second level header
    And I should verify <accountNumber> In Span dialog box
    And I should verify <ticketOwnerInitial> In Span dialog box
    And I should enter Comments added in textarea
    And I should click on Save In Button
    And I should enter Re-assigned to client in textarea
    And I should click on Return to Client In Button
    And I should enter <accountNumber> in third filterBy textbox
    And I should click on Assigned to Client In Span
    And I should enter <accountNumber> in fourth filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should open the admin ticket by clicking admin ticket number
    And I should verify <accountNumber> In Span dialog box
    And I should click on Claim In Button
    And I should verify Confirmation text In Span
    And I should verify Are you sure you want to claim the ticket? text In Span
    And I should click on Yes In Button
    And I should click on Assigned to Consova In Span
    And I should enter <accountNumber> in third filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should open the admin ticket by clicking admin ticket number
    And I should verify Claimed ticket text In Div
    And I should click on <ticketOwnerInitial> In Label
    And I should click on <ticketOwner> In Span
    And I should enter Re-assigned to client in textarea
    And I should click on Return to Client In Button
    And I should click on Assigned to Client In Span
    And I should enter <accountNumber> in fourth filterBy textbox
    And I should verify <accountNumber> text In Span
#    And I should click on Auditor dropdown to select an audit
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <irisURL>
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should click on admin ticket icon
    And I should click on Assigned to Walmart In Span
    And I should verify Admin Ticket text In Span
    And I should enter <accountNumber> in first filterBy textbox
    And I should open the admin ticket by clicking admin ticket number
    And I should verify <accountNumber> In Span dialog box
    And I should enter Comments added in textarea
    And I should click on Save In Button
    And I should enter Re-assigned to Consova in textarea
    And I should click on Assign To Consova In Button
    And I should click on Assigned to Consova In Span
    And I should enter <accountNumber> in second filterBy textbox
    And I should open the admin ticket by clicking admin ticket number
    And I should enter Comments added in textarea
    And I should click on Save In Button
    And I should close the displayed modal
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Assigned to Consova In Span
    And I should enter <accountNumber> in third filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should open the admin ticket by clicking admin ticket number
    And I should verify View Admin Ticket second level header
    And I should verify <accountNumber> In Span dialog box
    And I should verify <ticketOwner> In Span dialog box
    And I should enter Ticket resolved in textarea
    And I should click on Resolve Ticket In Button
    And I should click on Resolved In Span
    And I should enter <accountNumber> in fifth filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <OutlookURL>
    And I should enter username as <irisuserName>
    And I should click on Next button
    And I should give password as <passwordOutlook>
    And I should login to outlook by clicking login button
    And I should click on outlook icon from menubar
    And I should navigate to newly opened window
    And I should click on email received for admin ticket
    And I should click on click here to open admin ticket
    And I should navigate to newly opened window
    And I should wait for the page loading
    When I should Login to core application with <irisuserName> and <password>
    And I should click on Login button from Login screen
    And I should verify <accountNumber> In Span dialog box
    And I should close the displayed modal
    And I should logoff from home screen
    And I should close the newly opened window
    And I should close the newly opened window
    Examples:
      | URL          | userName          | password          | passwordOutlook          | accountURL          | accountNumber      | irisURL           | irisuserName           | ticketOwnerInitial          | ticketOwner          | ticketReason          | auditor          | OutlookURL          |
      | DP:LOGIN.URL | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD | DP:LOGIN.OUTLOOKPASSWORD | DP:LOGIN.ACCOUNTURL | DP:LOGIN.ACCOUNTNO | DP:IVERIFYPRO.URL | DP:IVERIFYPRO.USERNAME | DP:LOGIN.TICKETOWNERINITIAL | DP:LOGIN.TICKETOWNER | DP:LOGIN.TICKETREASON | DP:LOGIN.AUDITOR | DP:LOGIN.OUTLOOKURL |