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
      |URL|userName          | password          |accountURL|accountNumber|firstName|lastName|ssn|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.FIRSTNAME|DP:LOGIN.LASTNAME|DP:LOGIN.SSN|

  @EVS-64
  Scenario Outline: EVS-64:As a user I should see edit icons that can be clicked on to allow editing of employee and dependent information
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
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
    And I should enter your <middleName> in middle name textbox
    And I should enter your <emailId> in email textbox
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on edit button to edit employee contact info
    And I should verify Employee Contact Info text In Span
    And I should verify disabled bold button
    And I should verify Address Line 1 In Label
    And I should verify Home Phone In Label
    And I should verify Mobile Phone In Label
    And I should verify City In Label
    And I should verify Zip Code In Label
    And I should enter your <address> in address textbox
    And I should click on Select Reason In Options
    And I should click on Client Request In Options
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on edit button to edit dependent Demographics
    And I should verify Dependent Demographics text In Span
    And I should verify disabled bold button
    And I should enter your <middleName> in middle name textbox
    And I should click on Save In Bold
    And I should click on Yes In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|emailId|middleName|address|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.EMAILID|DP:LOGIN.MIDDLENAME|DP:LOGIN.ADDRESS|

  @EVS-35
  Scenario Outline: EVS-35:As a user I should see dependent information (tabs) on the account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should click the second dependent tab
    And I should verify the active dependent tab with dependent name
    And I should verify Dependent Id In Label
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-48
  Scenario Outline: EVS-48:As a user I should see timelines on the account screen at the employee and dependent levels
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on System and Client Configuration
    And I should click on Client Configuration
    And I should click on Walmart In Span
    And I should click on Project Configuration In Span
    And I should click on edit audit pencil icon
    And I should select date within thirty days
    And I should enable Is Employee Milestone
    And I should click on Update In Span
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Employee Milestones In Label
    And I should verify Date in table header
    And I should verify Milestone in table header
    And I should verify Dependent Name in table header
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-65
  Scenario Outline: EVS-65:As a user I should be able to work account tasks on the account screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
#    And I should click on Accept In Button
#    And I should accept disclaimer Notice if displayed
    And I should click on Upload Documents In Span
    And I should select desired document by Browse icon
    And I should click on Upload button in dialog box
    And I should click on OK In Button
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify tasks header
    And I should verify Created Date in table header
    And I should verify Due Date in table header
    And I should verify Action in table header
    And I should verify NewPackage in table data
    And I should verify Complete All In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|ivacURL|lastName|sSN|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.IVACURL|DP:LOGIN.LASTNAME|DP:LOGIN.SSN|

  @EVS-58
  Scenario Outline: EVS-58:As a user I should see dependent information on the account and auditing screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should verify the dependent relation
    And I should verify Date of Birth In Label
    And I should verify the date in the given format
    And I should verify SSN In Label
    And I should verify Dependent Id In Label
    And I should click the second dependent tab
    And I should verify the active dependent tab with dependent name
    And I should verify the dependent relation
    And I should verify Date of Birth In Label
    And I should verify the date in the given format
    And I should verify SSN In Label
    And I should verify Dependent Id In Label
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-1971
  Scenario Outline: EVS-1971:As a user, I should see audit screen details for dependents with removed from audit
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should verify delete audit button in the dependent section
    And I should click delete audit button in the dependent section
    And I should verify Remove From Audit text In Span
    And I should click on Select Reason In Label
    And I should select the reason for remove audit
    And I should click on Remove From Audit In Button
    And I should accept the alert to remove from audit
    And I should verify Add In Button
    And I should verify Removed from Audit text In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

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
    And I should click on Select Relationship In Label
    And I should click on Spouse In Span
    And I should click on Select Reason In Label
    And I should click on Client request In Span
    And I should click on Save In Bold
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-134
  Scenario Outline: EVS-134:As a user, I should capture dependent types for SP
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should click on SP In Span
    And I should click on CL In Span
    And I should click on LM In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-57
  Scenario Outline: EVS-57:As a user I should see locks at the dependent level
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify the active dependent tab with dependent name
    And I should click on lock icon on the dependent level
    And I should verify locked icon on the dependent level
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-1534
  Scenario Outline: EVS-1534:As a user, I should be able to log Employee or Dependent alerts even when account is locked or employee is non responder
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
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
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

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
    And I should close the newly opened tab
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|contactName|contactNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.CONTACTNAME|DP:LOGIN.PHONENO|

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
    And I should close the newly opened tab
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountNumber|contactName|contactNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.CONTACTNAME|DP:LOGIN.PHONENO|

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
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

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
    And I should click on Cancel button in dialog box
    And I should verify Authorized Callers text In Span
    And I should close the displayed modal
    And I should click on Add In Button
    And I should verify Add new Authorized Caller text In Span
    And I should verify Name In Label
    And I should verify Relationship In Label
    And I should enter <callerName> in caller name textbox
    And I should click on Select Relationship In Options
    And I should click on Domestic Partner In Options
    And I should click on Save button in dialog box
#    And I should click on View All In Span
#    And I should verify Authorized Callers text In Span
#    And I should click on delete icon in dialog box
#    And I should click on refresh icon in dialog box
#    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|callerName|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.CALLERNAME|

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
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-224
  Scenario Outline: EVS-224:As a user, I should be able to escalate employee tasks
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on escalation icon
    And I should click on select escalation type dropdown
    And I should click on Escalate In Options
    And I should click on select type untoched dropdown
    And I should verify Management text In Options
    And I should verify Client Services text In Options
    And I should click on Management In Options
    And I should enter Comments in textarea
    And I should click on first checkbox in the list
    And I should click on Save In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-61
  Scenario Outline: EVS-61:As a user I should see web inquiry tasks get created by the system
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <accountNumber> and <sSN>
    And I should click on Login button from Login screen
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
    And I should verify tasks header
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
      |URL|userName          | password          |accountURL|accountNumber|ivacURL|lastName|sSN|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|DP:LOGIN.IVACURL|DP:LOGIN.LASTNAME|DP:LOGIN.SSN|

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
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-51
  Scenario Outline: EVS-51:As a user I should be able to remove employees and dependents from a project
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify delete audit button in the dependent section
    And I should click delete audit button in the dependent section
    And I should verify Remove From Audit text In Span
    And I should click on Select Reason In Label
    And I should click on Consova discretion In Span
    And I should click on Remove From Audit In Button
    And I should accept the alert to remove from audit
    And I should verify Consova discretion text In Div
    And I should verify Removed from Audit text In Span
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-38
  Scenario Outline: EVS-38:As a user I should be able to add employees and dependents to a project
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should verify Removed from Audit text In Span
    And I should click on add audit icon
    And I should verify Add To Audit text In Span
    And I should click on required audit name
    And I should verify Add To Event text In Span
    And I should verify Available Event Types to Add In Label
    And I should click on eligibility to add event type
    And I should click on audit type
    And I should click on Select Benefits In Button
    And I should click on Add to Audit In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-80
  Scenario Outline: EVS-80:As a user I should see locks at the account level
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify <accountNumber> text In Bold
    And I should click on lock icon on the dependent level
    And I should verify locked icon on the dependent level
    And I should click on profile icon in core
    And I should logoff from core login
    Examples:
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

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
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|


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
      |URL|userName          | password          |accountURL|accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|








  @EVS-131
  Scenario Outline: EVS-131:As a user I should see a new client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify Add Client icon
    And I should verify client page
    And I should verify and click on inactive client and active client navigate slider
    And I should verify <clientname> text In Span
    And I should verify the search client from left sided client list
    And I should search the added <clientname> from left sided client list
    And I should verify <clientname> text In Span
    And I should click the added client from left sided client list
    And I should verify the popup options
    And I should click on configure button
    And I should verify Configure Dependent Sub Types modal
    And I should click add sub type button
    And I should click on Select Type In Label
    And I should click on Spouse In Span
    And I should click on Choose In Span
    And I should select Select All in the list displayed
    And I should click on Add button
    And I should click on Select Type In Label
    And I should click on Child In Span
    And I should click on Choose In Span
    And I should select Select All in the list displayed
    And I should click on Add button
    And I should click on Select Type In Label
    And I should click on Domestic Partner In Span
    And I should click on Choose In Span
    And I should click on Add button
    And I should click on Select Type In Label
    And I should click on Court Order In Span
    And I should click on Choose In Span
    And I should click on Add button
    And I should click on Select Type In Label
    And I should click on Handicap Dependent In Span
    And I should click on Choose In Span
    And I should click on Add button
    And I should click add sub type button
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ADDCLIENTNAME|

  @EVS-132
  Scenario Outline: EVS-132:As a user I should be able to edit client information by clicking on the primary pencil icon

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should search the added <clientname> from left sided client list
    And I should verify <clientname> text In Span
    And I should click the added client from left sided client list
    And I should verify the edit client button in selected client page
    And I should click the edit client button in selected client page
    And I should enter the <userName> in the clientname textbox
    And I should click on Cancel button
    And I should verify the edit client button in selected client page
    And I should click the edit client button in selected client page
    And I should enter the <newclientname> in the clientname textbox
    And I should verify Employee and Dependent has ten criteria fields
    And I should click on Update button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|newclientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ADDCLIENTNAME|DP:LOGIN.CLIENTNAME|

  @EVS-137
  Scenario Outline: EVS-137:As a user I should be able see existing client info on the client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should search the added <clientname> from left sided client list
    And I should verify <clientname> text In Span
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should verify client logo on the page
    And I should verify client information on the main panel
    And I should click the edit client button in selected client page
    And I should verify add new logo beneath the client logo
    And I should verify Employee and Dependent has ten criteria fields
    And I should click on Cancel button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-139
  Scenario Outline: EVS-139:As a user I should be able to add a new logo under the client logo box on the screen

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should verify client logo on the page
    And I should click the edit client button in selected client page
    And I should select logo for the client
#    And I should verify client logo updated successfully notification
#    And I should click on Update button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-144
  Scenario Outline: EVS-144:As a user I should be able to edit or create a new subclient with a modal

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should search the added <clientname> from left sided client list
    And I should verify <clientname> text In Span
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should click on Add Sub Client button
    And I should enter the <subclientname> in the sub clientname textbox
    And I should enter the <phoneno> in the sub client phoneno textbox
    And I should enter the <code> in the sub client code textbox
    And I should enter the <clientsite> in the sub clientsite textbox
    And I should enter the <subclientphoneid> in the sub clientphoneid textbox
    And I should select the clientservicerep in the sub client clientservicerep dropdown
    And I should enter today date in the sub client phoneassignmentfrom textbox
    And I should enter today date in the sub client phoneassignmentto textbox
    And I should check round checkboxes for Iverify IverifyPro and upload docs
    And I should click on Add button
    And I should verify Edit Sub Client pencil icon
    And I should click on Edit Sub Client pencil icon
    And I should verify edit sub client header in displayed modal
    And I should enter the <editsubclientname> in the edit sub clientname textbox
    And I should enter the <phoneno> in the edit sub client phoneno textbox
    And I should enter the <code> in the edit sub client code textbox
    And I should enter the <clientsite> in the edit sub clientsite textbox
    And I should enter the <subclientphoneid> in the edit sub clientphoneid textbox
    And I should check round checkboxes for Iverify IverifyPro and upload docs
    And I should select the clientservicerep in the sub client clientservicerep dropdown
    And I should enter today date in the edit sub client phoneassignmentfrom textbox
    And I should enter today date in the edit sub client phoneassignmentto textbox
    And I should check round checkboxes for Iverify IverifyPro and upload docs
    And I should click on Cancel button
    And I should verify Edit Sub Client pencil icon
    And I should click on Edit Sub Client pencil icon
    And I should verify edit sub client header in displayed modal
    And I should enter the <editsubclientname> in the edit sub clientname textbox
    And I should enter the <phoneno> in the edit sub client phoneno textbox
    And I should enter the <code> in the edit sub client code textbox
    And I should enter the <clientsite> in the edit sub clientsite textbox
    And I should enter the <subclientphoneid> in the edit sub clientphoneid textbox
    And I should check round checkboxes for Iverify IverifyPro and upload docs
    And I should select the clientservicerep in the sub client clientservicerep dropdown
    And I should enter today date in the edit sub client phoneassignmentfrom textbox
    And I should enter today date in the edit sub client phoneassignmentto textbox
    And I should check round checkboxes for Iverify IverifyPro and upload docs
    And I should click on Update button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|subclientname|clientsite|phoneno|code|subclientphoneid|editsubclientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.SUBCLIENTNAME|DP:LOGIN.CLIENTSITE|DP:LOGIN.PHONENO|DP:LOGIN.CODE|DP:LOGIN.PHONENOID|DP:LOGIN.EDITSUBCLIENTNAME|

  @EVS-136
  Scenario Outline: EVS-136:As a user I should be able to upload a new subclient logo by clicking on the + icon

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should click on view icon to view the uploaded logo
    And I should verify the popup message of no logo to display
    And I should upload the logo via plus icon
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-141
  Scenario Outline: EVS-141:As a user I should be able to view an existing logo for subclients by clicking on the view button

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should click on view icon to view the uploaded logo
    And I should not get the popup message of no logo to display
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-138
  Scenario Outline: EVS-138:As a user I should see subclient information on the client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should verify the <subclientname> in the sub client row
    And I should verify the <clientsite> in the sub client row
    And I should verify the <code> in the sub client row
    And I should verify the view icon to view the uploaded logo
    And I should verify Edit Sub Client pencil icon
    And I should click on <clientsite> icon to verify the client site
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|subclientname|clientsite|code|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.EDITSUBCLIENTNAME|DP:LOGIN.CLIENTSITE|DP:LOGIN.CODE|

  @EVS-195
  Scenario Outline: EVS-195:As a user I should see a client phone ID on create subclient and edit subclient

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on the Client Configuration sub menu option
    And I should click on Add Sub Client button
    And I should verify the sub clientphoneid textbox
    And I should verify today date in the sub client phoneassignmentfrom textbox
    And I should verify today date in the sub client phoneassignmentto textbox
    And I should click on Cancel button
    And I should click on Edit Sub Client pencil icon
    And I should verify the edit sub clientphoneid textbox
    And I should verify today date in the edit sub client phoneassignmentfrom textbox
    And I should verify today date in the edit sub client phoneassignmentto textbox
    And I should click on Cancel button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-194
  Scenario Outline: EVS-194:As a user I should see a client phone ID on create client and edit client

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should click on Add Client icon
    And I should verify the clientphoneid textbox in add client modal
    And I should verify today date in the phoneassignmentfrom textbox in add client modal
    And I should verify today date in the phoneassignmentto textbox in add client modal
    And I should click on Cancel button
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click the edit client button in selected client page
    And I should verify the clientphoneid textbox in edit client modal
    And I should verify today date in the phoneassignmentfrom textbox in edit client modal
    And I should verify today date in the phoneassignmentto textbox in edit client modal
    And I should click on Cancel button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-145
  Scenario Outline: EVS-145:As a user I should be able to click on the project configuration menu option

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on project configuration
    And I should verify Project Information header
    And I should verify inactive audit toggle icon
    And I should verify create new audit plus icon
    And I should verify Audit ID in table header
    And I should verify Audit Name in table header
    And I should verify Audit Date in table header
    And I should verify Upload Template in table header
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-148&EVS-122
  Scenario Outline: EVS-148EVS-122:As a user I should be able to edit an existing audit on the project configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on project configuration
    And I should click on new audit icon
    And I should verify the create audit label
    And I should enter today date in client audit start date
    And I should enter today date in client audit end date
    And I should enter the <auditname> in the create audit name
    And I should enter today date in client audit iverify start date
    And I should enter today date in client audit iverify end date
    And I should enter today date in client audit iverifypro start date
    And I should enter today date in client audit iverifypro end date
    And I should enter today date in client audit upload docs start date
    And I should enter today date in client audit upload docs end date
    And I should click on Cancel button
    And I should click on project configuration
    And I should click on new audit icon
    And I should enter today date in client audit start date
    And I should enter today date in client audit end date
    And I should enter the <auditname> in the create audit name
    And I should enter today date in client audit iverify start date
    And I should enter today date in client audit iverify end date
    And I should enter today date in client audit iverifypro start date
    And I should enter today date in client audit iverifypro end date
    And I should enter today date in client audit upload docs start date
    And I should enter today date in client audit upload docs end date
    And I should de select English language in all options
    And I should select English language in all options
    And I should select Spanish language in all options
    And I should select De English language in all options
    And I should select De Spanish language in all options
    And I should select English language in all options
    And I should select Spanish language in all options
    And I should click on create button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|auditname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.AUDITNAME|

  @EVS-455
  Scenario Outline: EVS-455:As a user I should see changes to the create audit screen in client configuration (create templates)

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on project configuration
    And I should click on edit created audit
    And I should click on add deadline button
    And I should enter the <deadlineone> in the deadline one textbox
    And I should select the type from type dropdown
    And I should select the deadline one type from dropdown list
    And I should enable the schedule
    And I should click on frequeny type dropdown
    And I should select once from frquency type
    And I should select today date in start date of deadline one
    And I should click on Update button in displayed modal
    And I should click on edit created audit
    And I should verify the trash button
    And I should click on trash button
    And I should click on Update button in displayed modal
    And I should click on edit created audit
    And I should click on add deadline button
    And I should enter the <deadlineone> in the deadline one textbox
    And I should select the type from type dropdown
    And I should select the deadline one type from dropdown list
    And I should enable the schedule
    And I should click on frequeny type dropdown
    And I should select recurring from frquency type
    And I should select today date in start date of deadline one
#    And I should select today date in end date of deadline one
    And I should click on trash button
    And I should click on Update button in displayed modal
    And I should click on edit created audit
    And I should click on add deadline button
    And I should enter the <deadlineone> in the deadline one textbox
    And I should select the type from type dropdown
    And I should select the deadline one type from dropdown list
#    And I should select the initial letter type from dropdown list
    And I should click on Update button in displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|deadlineone|deadlineInitial|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.DEADLINEONE|DP:LOGIN.DEADLINEINITIAL|

  @EVS-457
  Scenario Outline: EVS-457:As a user I should see changes to the create audit screen in client configuration

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on project configuration
    And I should click on edit created audit
    And I should verify the create audit name
    And I should click on add deadline button
    And I should verify the deadline one textbox
    And I should verify the type from type dropdown
    And I should verify the deadline types from dropdown list
    And I should enable the schedule
    And I should click on frequeny type dropdown
    And I should select once from frquency type
    And I should select today date in start date of deadline one
    And I should click on Update button in displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|deadlineone|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.DEADLINEONE|

  @EVS-205
  Scenario Outline: EVS-205:As a user I should be able to view and edit missing languages

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should click on manage incomplete codes
    And I should click on add incomplete codes
    And I should verify exclamation mark in English and spanish
    And I should click on Cancel button
    And I should click on System codes
    And I should verify ineligible codes label
    And I should click on manage ineligible codes
    And I should click on add ineligible codes
    And I should verify exclamation mark in English and spanish
    And I should click on Cancel button
    And I should click on System codes
    And I should verify Documents label
    And I should click on manage documents
    And I should click on add documents
    And I should verify exclamation mark in English and spanish
    And I should click on Cancel button
    And I should click on System codes
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-199
  Scenario Outline: EVS-199:As a user I should be able to add or edit incomplete codes via a modal at the client level

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should click on manage incomplete codes
    And I should click on add incomplete codes
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
    And I should click on Cancel button
    And I should click on add incomplete codes
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
    And I should click on edit created audit
    And I should verify edit incomplete code modal
    And I should verify edit modal elements in incomplete code modal
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on Update button in displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|englishVerbiage|spanishVerbiage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.ENGVERBIAGE|DP:LOGIN.SPAVERBIAGE|

  @EVS-162
  Scenario Outline: EVS-162:As a user I should be able to manage incomplete codes using a new page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should click on manage incomplete codes
    And I should verify edit buttons in the row list
    And I should verify filter search in incomplete modal
    And I should verify type filter dropdown select in incomplete modal
    And I should verify headers in incomplete modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-160
  Scenario Outline: EVS-160:As a user I should be able to export incomplete codes using the export button

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should click on download grid icon in incomplete codes
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-202
  Scenario Outline: EVS-202:As a user I should be able to add or edit ineligible codes via a modal at the client level

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify ineligible codes label
    And I should click on manage ineligible codes
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should select all dependents in ineligible modal
    And I should enter <versionname> in the version textbox
    And I should click on Cancel button
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should verify disabled submit button
    And I should select all dependents in ineligible modal
    And I should enter <versionname> in the version textbox
    And I should click on Add button in modal
    And I should verify edit buttons in the row list
    And I should verify headers in ineligible modal
    And I should click on edit created audit
    And I should verify edit ineligible code
    And I should verify disabled submit button
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <editenglishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should click on Update button in displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|versionname|englishVerbiage|spanishVerbiage|editenglishVerbiage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.VERSIONNAME|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.ENGVERBIAGE|

  @EVS-172
  Scenario Outline: EVS-172:As a user I should be able to manage ineligible codes using a new page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify ineligible codes label
    And I should click on manage ineligible codes
    And I should verify edit buttons in the row list
    And I should verify headers in ineligible modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-159
  Scenario Outline: EVS-159:As a user I should be able to export ineligible codes using the export button

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should click on download grid icon in ineligible codes
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-196
  Scenario Outline: EVS-196:As a user I should be able to add or edit document requirements via a modal at the client level

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
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
    And I should click on Cancel button
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should select all dependents in ineligible modal
    And I should click on choose document type dropdown in documents modal
    And I should select document type dropdown in documents modal
    And I should click on Add button in modal
    And I should click on edit created audit
    And I should verify edit document modal
    And I should verify disabled submit button
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <editenglishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should click on Update In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|englishVerbiage|spanishVerbiage|editenglishVerbiage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.ENGVERBIAGE|

  @EVS-181
  Scenario Outline: EVS-181:As a user I should be able to manage new documents via a new page on client configuration

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify Documents label
    And I should click on manage documents
    And I should verify headers in the document modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-149
  Scenario Outline: EVS-149:As a system I should add a client defaults panel on the project configuration screen

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on project configuration
#    And I should verify the client default panel
    And I should verify Milestone Template text In Span
#    And I should verify the timeline templates panel
    And I should verify the edit pencil icon on templates
#    And I should verify add new icon
    And I should verify add new audit icon
    And I should verify toggle icons
    And I should verify languages in the modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|
########################
  @EVS-153
  Scenario Outline: EVS-153:As a user I should be able to expand the client configuration page to see system codes

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify incomplete codes label
    And I should verify ineligible codes label
    And I should verify Documents label
    And I should click on System codes
    And I should click on manage incomplete codes
    And I should verify edit buttons in the row list
    And I should verify filter search in incomplete modal
    And I should verify type filter dropdown select in incomplete modal
    And I should verify headers in incomplete modal
    And I should click on System codes
    And I should click on manage ineligible codes
    And I should verify edit buttons in the row list
    And I should verify headers in ineligible modal
    And I should click on System codes
    And I should click on manage documents
    And I should verify headers in the document modal
    And I should click on System codes
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-161
  Scenario Outline: EVS-161:As a user I should be able to export doc requirements codes using the export button

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify Documents label
    And I should click on download grid icon in documents requirement grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-173
  Scenario Outline: EVS-173:As a user I should be able to manage doc requirements using a new page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify Documents label
    And I should click on manage documents
    And I should verify headers in the document modal
    And I should verify the added document verbiage row
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-1383
  Scenario Outline: EVS-1383:As a user, I should select the alternate documents

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
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
    And I should click on Add button in modal
    And I should click on edit created audit
    And I should click on Map documents button
    And I should verify edit alternate documents modal
    And I should select added document <editenglishVerbiage> as alternate document
    And I should close the displayed modal
    And I should click on Map documents button
    And I should verify edit alternate documents modal
    And I should select added document <editenglishVerbiage> as alternate document
    And I should click on Save button
    And I should enter <editenglishVerbiage> code in verbiage textarea
    And I should click on Update button in displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|englishVerbiage|spanishVerbiage|editenglishVerbiage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.ENGVERBIAGE|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.ENGVERBIAGE|

  @EVS-1384
  Scenario Outline: EVS-1384:As a user, I should see mapped alternate documents

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should verify Documents label
    And I should click on manage documents
    And I should click on edit created audit
    And I should click on Map documents button
    And I should verify edit alternate documents modal
    And I should verify added alternate document
    And I should close the displayed modal
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-
  Scenario Outline: EVS-:As a user I should be able to edit an existing audit on the project configuration p

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on System codes
    And I should click on manage incomplete codes
    And I should click on add incomplete codes
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
    And I should verify ineligible codes label
    And I should click on manage ineligible codes
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should verify disabled submit button
    And I should select all dependents in ineligible modal
    And I should enter <versionname> in the version textbox
    And I should click on Add button in modal
    And I should click on System codes
    And I should verify ineligible codes label
    And I should click on manage ineligible codes
    And I should click on add ineligible codes
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should verify disabled submit button
    And I should select all dependents in ineligible modal
    And I should enter <versionname> in the version textbox
    And I should click on Add button in modal
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
    And I should click on Add button in modal
    And I should enter account url <accountURL> with <accountnumber>
    And I should verify the account number with <accountnumber>
    And I should click on Ineligible codes button
    And I should verify the added ineligible code <englishVerbiage> in the list
    And I should close the displayed modal
    And I should click on Add document button
    And I should verify the added document <englishVerbiage> in the list
    And I should click on Cancel button in the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|versionname|englishVerbiage|spanishVerbiage|accountURL|accountnumber|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.OLDCLIENTNAME|DP:LOGIN.VERSIONNAME|DP:LOGIN.INTEGRATIONCHECK|DP:LOGIN.SPAVERBIAGE|DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-617&EVS-680
  Scenario Outline: EVS-617&EVS-680:As a user, I should upload the letter versions

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on Forms In Span
    And I should verify Letters text In Span
    And I should click on Add Letter icon
    And I should verify add template modal
    And I should verify disabled submit button in the modal
    And I should enter the <templateVersionName> in template version name text box
    And I should switch default template slider button
    And I should switch active template slider button
    And I should switch default template slider button
    And I should verify disabled submit button in the modal
    And I should click on select letter type drop down
    And I should click on Initial In Span
    And I should verify disabled submit button in the modal
    And I should select all the documents from the listed selection box
    And I should click on Create Group In Span
    And I should enter the <groupName> in the group name text box
    And I should click on Save button
    And I should verify disabled submit button in the modal
    And I should upload English template in the upload templates dialog
    And I should click on Submit button
    And I should verify warning message
    And I should click on OK In Button
    And I should upload Spanish template in the upload templates dialog
    And I should delete the uploaded templates
    And I should verify disabled submit button in the modal
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on Submit button
    And I should verify successfully created message
    And I should click on OK In Button
    And I should click on Forms In Span
    And I should verify Letters text In Span
    And I should verify added letter <templateVersionName> in the letters grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|templateVersionName|groupName|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.TEMPLATEVERSIONNAME|DP:LOGIN.CODE|

  @EVS-643
  Scenario Outline: EVS-643:As a user, I should be able to upload templates per client audit

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click on <clientname> In Span
    And I should click on project configuration
    And I should click on new audit icon
    And I should enter today date in client audit start date
    And I should enter today date in client audit end date
    And I should enter the <auditname> in the create audit name
    And I should enter today date in client audit iverify start date
    And I should enter today date in client audit iverify end date
    And I should enter today date in client audit iverifypro start date
    And I should enter today date in client audit iverifypro end date
    And I should enter today date in client audit upload docs start date
    And I should enter today date in client audit upload docs end date
    And I should de select English language in all options
    And I should select English language in all options
    And I should select Spanish language in all options
    And I should select De English language in all options
    And I should select De Spanish language in all options
    And I should select English language in all options
    And I should select Spanish language in all options
    And I should click on add deadline button
    And I should enter the <deadlineone> in the deadline one textbox
    And I should select the type from type dropdown
    And I should select the deadline one type from dropdown list
    And I should click on add deadline button
    And I should enter the <deadlineInitial> in the deadline one textbox
    And I should select the type from type dropdown
    And I should select the initial letter type from dropdown list
    And I should click on create button
    And I should click on file upload icon from the created client audit
    And I should click on select letter type drop down
    And I should click on Initial In Span
    And I should click on select template version drop down
    And I should click on <templateVersionName> In Span
    And I should switch default template slider button
    And I should switch active template slider button
    And I should close the displayed modal
    And I should click on file upload icon from the created client audit
    And I should click on select letter type drop down
    And I should click on Initial In Span
    And I should click on select template version drop down
    And I should click on <templateVersionName> In Span
    And I should click on Save button
    And I should click on OK In Button
    And I should click on file upload icon from the created client audit
    And I should click on trash button
    And I should close the displayed modal
    And I should click on file upload icon from the created client audit
    And I should click on select letter type drop down
    And I should click on Initial In Span
    And I should click on select template version drop down
    And I should click on <templateVersionName> In Span
    And I should click on Save button
    And I should click on OK In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|auditname|deadlineone|deadlineInitial|templateVersionName|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.AUDITNAME|DP:LOGIN.DEADLINEONE|DP:LOGIN.DEADLINEINITIAL|DP:LOGIN.TEMPLATEVERSIONNAME|

  @EVS-569
  Scenario Outline: EVS-569:As a user, I should see scheduled letters on top right corner of the letter monitoring page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should verify Client Name in table header
    And I should verify Audit Name & Date in table header
    And I should verify Scheduled Date Time in table header
    And I should verify Type in table header
    And I should verify <auditname> text In Span
    And I should verify pink background for incomplete letter template upload
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |auditname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.AUDITNAME|

  @EVS-1432
  Scenario Outline: EVS-1432:As a user, I should see the letter count on preview

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should verify Employee Count in table header
    And I should verify the total employee count that will get the letter
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-1584
  Scenario Outline: EVS-1584:As a user, I should see changes to scheduled letter job changes

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on All In Span
    And I should click on Auto Run In Span
    And I should click on Manual In Span
    And I should verify submit letter button in the grid
    And I should click on submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should verify Scheduled In Span
    And I should verify ten records in the grid
    And I should verify Complete In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-572
  Scenario Outline: EVS-572:As a system, I need to run letters automatically

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on All In Span
#    And I should click on Auto Run In Span
    And I should click on second submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should click on third submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should click on fourth submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should click on fifth submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should click on sixth submit letter for the respective grid
    And I should click on Proceed In Button
    And I should click on OK In Button
    And I should run maximum five jobs in parallel
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-568
  Scenario Outline: EVS-568:As a user, I should see stats on top left corner of letter monitoring page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should verify Status Overview modal heading
    And I should verify Total Letter Counts text In Span
    And I should verify Total Email Counts text In Span
    And I should verify Letter Count by Status text In Span
    And I should verify Initial text In Div
    And I should verify Custom text In Div
    And I should verify DispositionComplete text In Div
    And I should verify DispositionInComplete text In Div
    And I should verify DispositionMixed text In Div
    And I should verify Printed text In Div
    And I should verify Merged text In Div
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-642
  Scenario Outline: EVS-642:As a user, I should see option Proof PDF button in control settings modal

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on control settings in grid
    And I should click on Proof PDF In Button
    And I should click on OK In Button
    And I should click on profile icon in core
    And I should logoff from core login
#    When I should Login to core application with <userName> and <password>
#    And I should click on Login button from Login screen
#    And I should click on profile icon in core
#    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-567
  Scenario Outline: EVS-567:As a user, I should see job queue tab on bottom half of letter monitor page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on control settings in grid
    And I should click on Proof PDF In Button
    And I should click on OK In Button
    And I should verify Client Name in table header
    And I should verify Audit Name and Date in table header
    And I should verify Scheduled Date Time in table header
    And I should verify Type in table header
    And I should verify Process Status in table header
    And I should verify Control Status in table header
    And I should verify control settings in grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-573
  Scenario Outline: EVS-573:As a user, I should see control settings option for each job in the queue

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on control settings in Queue grid
    And I should verify Build/Merge PDF In Button
    And I should verify Print PDF In Button
    And I should verify Split In Button
    And I should verify Rollback PDF In Button
    And I should verify Send Email In Button
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-574
  Scenario Outline: EVS-574:As a user, I should see option build/merge PDF button in control settings modal

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on control settings in Queue grid
    And I should click on Build/Merge PDF In Button
    And I should verify Please Select the Page Count text In Div
    And I should click on OK In Button
    And I should click on Page count checkbox in the Queue grid
    And I should click on control settings in Queue grid
    And I should click on Build/Merge PDF In Button
    And I should verify Build/Merged Letter text In Span
#    And I should click on maximize in letter modal
#    And I should verify Build/Merged Letter text In Span
#    And I should click on maximize in letter modal
#    And I should verify Build/Merged Letter text In Span
    And I should close the letter modal
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-575
  Scenario Outline: EVS-575:As a user, I should see option Print PDF button in control settings modal

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on control settings in Queue grid
    And I should click on Print PDF In Button
    And I should verify Please Select the Page Count text In Div
    And I should click on OK In Button
    And I should click on Page count checkbox in the Queue grid
    And I should click on control settings in Queue grid
    And I should click on Print PDF In Button
    And I should verify Print letter save successfully text In Div
    And I should click on OK In Button
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-576
  Scenario Outline: EVS-576:As a user, I should see option to Rollback PDF in control settings modal

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on control settings in Queue grid
    And I should click on Rollback In Button
    And I should click on Cancel In Button
    And I should click on control settings in Queue grid
    And I should click on Rollback In Button
    And I should click on Proceed In Button
    And I should verify Letter job rollback successfully text In Div
    And I should click on OK In Button
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-646
  Scenario Outline: EVS-646:As a user, I should see employee letter count grouped by page count and audit status on queue and history tabs

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on Queue In Span
    And I should verify Letter Counts in table header
    And I should click on History In Span
    And I should verify Client Name in table header
    And I should verify Letter Count in table header
    And I should click on Queue In Span
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-641
  Scenario Outline: EVS-641:As a user, I should be able to add custom letter

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on Add letter icon in Queue grid
    And I should click on select Client dropdown
    And I should click on <oldclientname> In Span
    And I should click on select audit dropdown
    And I should click on <auditname> In Span
    And I should click on select schedule letter job dropdown
    And I should select today date from the displayed calender
    And I should click on Predefined Status In Span
    And I should select all checkbox from the dropdown
    And I should enter templateVersionName in the template version name textbox
    And I should upload English template in the upload templates dialog
    And I should upload Spanish template in the upload templates dialog
    And I should click on add icon in the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |oldclientname|auditname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.OLDCLIENTNAME  |DP:LOGIN.AUDITNAME|

  @EVS-678
  Scenario Outline: EVS-678:As a user, I should select which dependents should show on letters

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on Add letter icon in Queue grid
    And I should click on Predefined Status In Span
    And I should verify Complete text In Span
    And I should verify Non responder text In Span
    And I should verify Custom text In Span
    And I should verify Incomplete text In Span
    And I should select all checkbox from the dropdown
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-686
  Scenario Outline: EVS-686:As a user, I should be able to export Queue and History tabs on Communication monitoring page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on cloud download icon in the grid
    And I should click on History In Span
    And I should click on cloud download icon in the grid
    And I should click on Queue In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-1024
  Scenario Outline: EVS-1024:As a user, I should be able to split the letter job

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on Page count checkbox in the Queue grid
    And I should click on control settings in Queue grid
    And I should verify Split In Button
    And I should click on Split In Button
    And I should click on refresh button in Queue grid
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |

  @EVS-570
  Scenario Outline: EVS-570:As a user, I should see history tab on bottom half of the letter monitoring page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on Communications Management
    And I should click on Communications Dashboard
    And I should verify Scheduled jobs modal heading
    And I should click on refresh button in Queue grid
    And I should click on History In Span
    And I should click on Select Client In Label
    And I should click on <oldclientname> In Span
    And I should click on Select Audit In Label
    And I should click on <auditname> In Span
    And I should click on refresh icon in the modal
    And I should enter the <auditname> in filterBy textbox
    And I should verify <auditname> text In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |oldclientname|auditname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.OLDCLIENTNAME  |DP:LOGIN.AUDITNAME|

  @EVS-1005
  Scenario Outline: EVS-1005:As a system, I should be able to upload Affidavits

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
    And I should click on Forms In Span
    And I should verify Affidavits text In Span
    And I should click on Add Affidavit In Button
    And I should verify Upload Affidavits text In Span
    And I should enter the <affidavitVersionName> in affidavit version name text box
    And I should switch default template slider button
    And I should click on Select Affidavits Type dropdown
    And I should click on Common Law In Span
#    And I should click on Domestic Partner In Span
    And I should click on Select Affidavit Configuration Type dropdown
    And I should click on Linkable In Span
#    And I should click on Always available In Span
    And I should upload English Affidavit in the upload templates dialog
    And I should upload Spanish Affidavit in the upload templates dialog
    And I should click on Submit In Button
    And I should verify Affidavits uploaded successfully text In Div
    And I should click on OK In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|affidavitVersionName|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.AFFIDAVITVERSIONNAME|

  @EVS-2116
  Scenario Outline: EVS-2116:As a user, I should be able to add milestone templates - refactor

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click on <clientname> In Span
    And I should click on project configuration
    And I should verify Project Information text In Span
    And I should verify Milestone Template text In Span
    And I should verify Milestone Template Name in table header
    And I should verify Is Active in table header
    And I should verify No records found in table data
    And I should click on new milestone template icon
    And I should verify Create Milestone Template text In Span
    And I should verify Milestone Template Name In Label
    And I should verify Is Active In Label
    And I should verify Is Default In Label
    And I should enter the <milestomeName> in the enter milestone template name
    And I should click on add deadline button
    And I should enter the <deadlineInitial> in the deadline one textbox
    And I should enter the <EventDaysOut> in the Event Days Out textbox
    And I should click on trash button
    And I should click on add deadline button
    And I should verify Event Name In Label
    And I should verify Event Days Out In Label
    And I should verify Schedule In Label
    And I should verify AutoRun In Label
    And I should verify Display On iVerifyPro In Label
    And I should verify Display Internally In Label
    And I should verify Is Key Process Date In Label
    And I should verify Is Employee MileStone In Label
    And I should enter the <deadlineInitial> in the deadline one textbox
    And I should enter the <EventDaysOut> in the Event Days Out textbox
    And I should click on Cancel In Button
    And I should enter the <milestomeName> in the enter milestone template name
    And I should click on add deadline button
    And I should enter the <deadlineInitial> in the deadline one textbox
    And I should click on select milestone type dropdown in modal
    And I should click on Initial Letter from dropdown
    And I should enter the <EventDaysOut> in the Event Days Out textbox
    And I should click on Save In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|milestomeName|deadlineInitial|EventDaysOut|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.MILESTONENAME|DP:LOGIN.DEADLINEINITIAL|DP:LOGIN.EVENTDAYSOUT|

  @EVS-2187
  Scenario Outline: EVS-2187:As a user, I should be able to edit milestone template

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click on <clientname> In Span
    And I should click on project configuration
    And I should click edit icon in the grid
    And I should enter the <milestomeName> in the enter milestone template name
    And I should click on Update In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|milestomeName|deadlineInitial|EventDaysOut|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.MILESTONENAME|DP:LOGIN.DEADLINEINITIAL|DP:LOGIN.EVENTDAYSOUT|


  @EVS-1887
  Scenario Outline: EVS-1887:As a user, I should be able to create help ticket - account screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should verify the opened account with enetered <accountNumber>
    And I should click on Help Ticket In Button
    And I should verify Create Help Ticket text In Span
    And I should click on select ticket type dropdown
#    And I should click on Select In Options
    And I should verify Manager Review text In Options
#    And I should verify Relationship Change text In Options
    And I should verify Deceased Relative text In Options
#    And I should verify Call Escalation text In Options
    And I should click on Manager Review In Options
    And I should enter <userName> comments in textarea
    And I should click on Cancel In Button
    And I should click on Help Ticket In Button
    And I should verify Create Help Ticket text In Span
    And I should click on Select In Options
    And I should verify Manager Review text In Options
#    And I should verify Relationship Change text In Options
    And I should verify Deceased Relative text In Options
#    And I should verify Call Escalation text In Options
    And I should click on Manager Review In Options
    And I should enter <userName> comments in textarea
    And I should click on Submit In Button
    And I should click on Help Ticket In Button
    And I should verify Help Ticket In Button
    And I should verify Ticket in table header
    And I should verify Ticket Reason in table header
    And I should verify Created Date in table header
    And I should verify Created User in table header
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountNumber|accountURL|
      |DP:LOGIN.URL|DP:LOGIN.AUDITOR | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.ACCOUNTURL|

  @EVS-2242
  Scenario Outline: EVS-2242:As a user, I should be able to create help ticket - home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should verify Ticket in table header
#    And I should verify Client Name in table header
#    And I should verify Consova PIN in table header
#    And I should verify Employee Name in table header
#    And I should verify Ticket Reason in table header
#    And I should verify Due Date in table header
#    And I should verify Last Comment in table header
#    And I should verify Created By in table header
#    And I should verify Created Date in table header
    And I should enter the <accountNumber> in first filterBy textbox
    And I should verify Manager Review in table data
    And I should verify <accountNumber> in table data
#    And I should verify due date is three days ahead from the created date
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountNumber|accountURL|
      |DP:LOGIN.URL|DP:LOGIN.AUDITORMANAGER | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.ACCOUNTURL|

  @EVS-2243
  Scenario Outline: EVS-2243:As a user, I should see assigned help tickets on home page
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter the <accountNumber> in first filterBy textbox
    And I should click on help ticket number from the grid to open created help ticket
    And I should verify View Help Ticket text In Span
    And I should verify <accountNumber> text In Span
    And I should verify Manager Review In Label
    And I should verify Ticket logged by <createdUser> text In Div
    And I should click on Cancel In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountNumber|createdUser|
      |DP:LOGIN.URL|DP:LOGIN.AUDITORMANAGER | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.AUDITOR|


  @EVS-2244
  Scenario Outline: EVS-2244:As a user, I should see assigned help tickets on home page
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter the <accountNumber> in first filterBy textbox
    And I should click on help ticket number from the grid to open created help ticket
    And I should verify View Help Ticket text In Span
    And I should enter <userName> comments in textarea
    And I should click on Update In Button
    And I should click on Cancel In Button
    And I should click on help ticket number from the grid to open created help ticket
    And I should click on reassigned to dropdown
    And I should not verify <usernameNotVerify> element in the display
    And I should click on <reassignedUser> In Options
    And I should enter <userName> comments in textarea
    And I should click on Reassign In Button
    And I should click on profile icon in core
    And I should logoff from core login
    When I should Login to core application with <reassignedUserName> and <password>
    And I should click on Login button from Login screen
    And I should enter the <accountNumber> in first filterBy textbox
    And I should click on help ticket number from the grid to open created help ticket
    And I should enter <reassignedUserName> comments in textarea
    And I should click on Resolve In Button
    And I should click on profile icon in core
    And I should logoff from core login
    Given I should enter login url <URL>
    When I should Login to core application with <reassignedUserName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountNumber>
    And I should click on Help Ticket In Button
    And I should open completed ticket in the modal
    And I should enter <reassignedUserName> comments in textarea
    And I should click on Update In Button
    And I should click on Cancel In Button
    And I should click on Home In Span
    And I should click on Home In Span
    And I should click on Home In Span
    And I should enter the <accountNumber> in first filterBy textbox
    And I should click on help ticket number from the grid to open created help ticket
    And I should enter <reassignedUserName> comments in textarea
    And I should click on Resolve In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          |password          |accountNumber|usernameNotVerify|reassignedUser|reassignedUserName|accountURL|auditor|
      |DP:LOGIN.URL|DP:LOGIN.AUDITORMANAGER |DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.REASSIGNEDUSERNAMENOTVERIFY|DP:LOGIN.REASSIGNEDUSER|DP:LOGIN.REASSIGNEDUSERNAME|DP:LOGIN.ACCOUNTURL|DP:LOGIN.AUDITOR |


  @EVS-1888
  Scenario Outline: EVS-1888:As a user, I should be able to create help ticket from account and audit screen
    Given I should enter login url <ivacURL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
#    And I should click on Accept In Button
#    And I should accept disclaimer Notice if displayed
    And I should click on Upload Documents In Span
    And I should select desired document by Browse icon
    And I should upload the document
    And I should click on OK In Button
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on My Inventory In Span
    And I should click on My Inventory In Span
    And I should click on My Inventory In Span
    And I should enter the <consovaId> in first filterBy textbox
    And I should click on load audit icon
#    And I should click on Help Ticket In Button
    And I should click on Help Ticket In Button
    And I should verify Create Help Ticket text In Span
    And I should click on Select One In Options
    And I should verify Manager Review text In Options
    And I should verify Relationship Change text In Options
    And I should verify Deceased Relative text In Options
    And I should verify Call Escalation text In Options
    And I should click on Manager Review In Options
    And I should enter <userName> comments in textarea
    And I should click on Submit In Button
    And I should click on Help Ticket In Button
    And I should verify Help Ticket In Button
    And I should verify Ticket in table header
    And I should verify Ticket Reason in table header
    And I should verify Created Date in table header
    And I should verify Created User in table header
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      | ivacURL          | lastName          | consovaId          | sSN          |URL|userName          | password          |accountNumber|accountURL|
      | DP:LOGIN.IVACURL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:LOGIN.URL|DP:LOGIN.PACKAGEUSERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|DP:LOGIN.ACCOUNTURL|

  @EVS-627
  Scenario Outline: EVS-627:As a user, I should create and manage admin ticket (Case research functionality)
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountnumber>
    And I should verify the opened account with enetered <accountnumber>
    And I should click on Admin Ticket In Button
    And I should click on Create New Ticket In Button
    And I should verify Create Admin Ticket text In Span
    And I should verify Consova PIN In Label
    And I should verify First Name In Label
    And I should verify Last Name In Label
    And I should click on Select Ticket Reason In Label
    And I should verify Employee audit Inquiry text In Span
    And I should verify Request call recording text In Span
    And I should verify Update employee contact information text In Span
    And I should verify Update demographic information text In Span
    And I should click on Employee audit Inquiry In Span
    And I should click on Select Audit In Label
    And I should select audit type from dropdown
    And I should enter <userName> in the comments box
    And I should click on Select Dependent In Span
    And I should select all from list displayed from dropdown
#    And I should click on Cancel In Button
    And I should click on Submit In Button
    And I should click on OK In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountURL|accountnumber|
      |DP:LOGIN.URL|DP:LOGIN.AUDITOR | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-626
  Scenario Outline: EVS-626:As a user, I should see admin ticket icon from Account view
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountnumber>
    And I should verify the opened account with enetered <accountnumber>
    And I should click on Admin Ticket In Button
    And I should click on View Open Ticket In Button
    And I should verify Assigned to Consova text In Span
    And I should verify Assigned to Client text In Span
    And I should click on Resolved In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountURL|accountnumber|
      |DP:LOGIN.URL|DP:LOGIN.AUDITOR | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|

  @EVS-613
  Scenario Outline: EVS-613:As a user, I should see admin ticket queue
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should verify Assigned to Consova text In Span
    And I should verify Assigned to Client text In Span
    And I should click on Assigned to Client In Span
    And I should verify Resolved text In Span
    And I should click on Resolved In Span
    And I should click on Assigned to Consova In Span
    And I should verify Client Name in table header
    And I should verify Ticket in table header
    And I should verify Consova PIN in table header
    And I should verify Ticket Reason in table header
    And I should verify Employee Name in table header
    And I should verify Audit Date in table header
    And I should verify Dependent Name in table header
    And I should verify Last Comment in table header
    And I should verify Last Comment Date in table header
    And I should verify Created Date in table header
    And I should enter <accountNumber> in second filterBy textbox
    And I should verify <accountNumber> text In Span
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountNumber|
      |DP:LOGIN.URL|DP:LOGIN.AUDITOR | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTNO|

  @EVS-677
  Scenario Outline: EVS-677:As a user, I should be able to create admin ticket on behalf of the client
    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter account url <accountURL> with <accountnumber>
    And I should verify the opened account with enetered <accountnumber>
    And I should click on Admin Ticket In Button
    And I should verify active ticket confirmation
    And I should verify Create New Ticket In Button
    And I should verify View Open Tickets In Button
    And I should verify the account number with <accountnumber>
    And I should verify Cancel In Button
    And I should click on Admin Ticket In Button
    And I should click on View Open Tickets In Button
    And I should verify Create Admin Ticket text In Span
    And I should verify Consova PIN In Label
    And I should verify First Name In Label
    And I should verify Last Name In Label
    And I should click on Select Ticket Reason In Label
    And I should verify Employee audit Inquiry text In Span
    And I should verify Request call recording text In Span
    And I should verify Update employee contact information text In Span
    And I should verify Update demographic information text In Span
    And I should click on Employee audit Inquiry In Span
    And I should click on Select Audit In Label
    And I should select audit type from dropdown
    And I should enter <userName> in the comments box
    And I should click on Select Dependent In Span
    And I should select all from list displayed from dropdown
    And I should click on Cancel In Button
#    And I should click on Submit In Button
#    And I should click on OK In Button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |accountURL|accountnumber|
      |DP:LOGIN.URL|DP:LOGIN.AUDITOR | DP:LOGIN.PASSWORD  |DP:LOGIN.ACCOUNTURL|DP:LOGIN.ACCOUNTNO|