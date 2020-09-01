Feature: Smoke Module

  @EVS-97
  Scenario Outline: EVS-97:As a user I should be able to create a new client on client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should click on Add Client icon
    And I should enter the <userName> in the clientname textbox
    And I should enter the <clientsite> in the clientsite textbox
    And I should enter the <URL> in the clientlogout url textbox
    And I should enter the <clientsite> in the wikilink textbox
    And I should enter the <phoneno> in the phoneno textbox
    And I should enter the <clientphoneid> in the clientphoneid textbox
    And I should click on Cancel button
#    And I should verify client page
    And I should click on Add Client icon
    And I should enter the <clientname> in the clientname textbox
    And I should enter the <clientsite> in the clientsite textbox
    And I should enter the <URL> in the clientlogout url textbox
    And I should enter the <clientsite> in the wikilink textbox
    And I should enter the <phoneno> in the phoneno textbox
    And I should enter the <clientphoneid> in the clientphoneid textbox
    And I should select the clientservicerep in the clientservicerep dropdown
    And I should verify checkboxes for Iverify IverifyPro GoGreen upload docs and active status
    And I should select the ivac language
    And I should enter today date in the phoneassignmentfrom textbox
    And I should select the communication language
    And I should enter today date in the phoneassignmentto textbox
    And I should select the communicationprint language
    And I should select logo for the client
    And I should enter <employeeCriteria> in the employee criteria field
    And I should enter <dependentCriteria> in the dependent criteria field
    And I should click on Add button
    And I should verify add sub client button
    And I should search the added <clientname> from left sided client list
    And I should verify the added client from left sided client list
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|clientsite|phoneno|clientphoneid|employeeCriteria|dependentCriteria|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.CLIENTSITE|DP:LOGIN.PHONENO|DP:LOGIN.PHONENOID|DP:LOGIN.EMPLOYEECRITERIA|DP:LOGIN.DEPENDENTCRITERIA|

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
    And I should verify the added client from left sided client list
    And I should verify the search client from left sided client list
    And I should search the added <clientname> from left sided client list
    And I should verify the added client from left sided client list
    And I should click the added client from left sided client list
    And I should verify the popup options
    And I should click on configure button
    And I should verify Configure Dependent Sub Types modal
    And I should click add sub type button
    And I should click on Dependent type dropdown
    And I should select spouse from the displayed dropdown
    And I should click on Dependent sub type dropdown
    And I should select Select All in the list displayed
    And I should click on Add button
    And I should click on Dependent type dropdown
    And I should select child from the displayed dropdown
    And I should click on Dependent sub type dropdown
    And I should select Select All in the list displayed
    And I should click on Add button
    And I should click on Dependent type dropdown
    And I should select domestic partner from the displayed dropdown
    And I should click on Dependent sub type dropdown
    And I should click on Add button
    And I should click on Dependent type dropdown
    And I should select court order from the displayed dropdown
    And I should click on Dependent sub type dropdown
    And I should click on Add button
    And I should click on Dependent type dropdown
    And I should select handicap dependent from the displayed dropdown
    And I should click on Dependent sub type dropdown
    And I should click on Add button
    And I should click add sub type button
    And I should close the displayed modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-132
  Scenario Outline: EVS-132:As a user I should be able to edit client information by clicking on the primary pencil icon

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should search the added <clientname> from left sided client list
    And I should verify the added client from left sided client list
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
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.NEWCLIENTNAME|

  @EVS-137
  Scenario Outline: EVS-137:As a user I should be able see existing client info on the client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should verify client page
    And I should search the added <clientname> from left sided client list
    And I should verify the added client from left sided client list
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
    And I should verify the added client from left sided client list
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
    And I should verify audit headers Audit ID Audit Name and Audit Date
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

  @EVS-148
  Scenario Outline: EVS-148:As a user I should be able to edit an existing audit on the project configuration page

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
    And I should verify successful message
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|auditname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.AUDITNAME|

  @EVS-455
  Scenario Outline: EVS-455:As a user I should be able to edit an existing audit on the project configuration page

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
    And I should verify successful message
    And I should click on edit created audit
    And I should verify the trash button
    And I should click on trash button
    And I should click on Update button in displayed modal
    And I should verify successful message
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
    And I should click on Update button in displayed modal
    And I should verify successful message
#    And I should click on edit created audit
#    And I should click on add deadline button
#    And I should enter the <deadlineone> in the deadline one textbox
#    And I should select the type from type dropdown
#    And I should select the deadline one type from dropdown list
#    And I should enable the schedule
#    And I should click on frequeny type dropdown
#    And I should select recurring from frquency type
#    And I should select today date in start date of deadline one
#    And I should select today date in end date of deadline one
#    And I should click on Update button in displayed modal
#    And I should verify successful message
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|deadlineone|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.DEADLINEONE|

  @EVS-457
  Scenario Outline: EVS-457:As a user I should see changes to the create audit screen in client configuration

#    Given I should enter login url <URL>
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
    And I should verify successful message
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
    And I should verify successful message
    And I should click on edit created audit
    And I should verify edit incomplete code modal
    And I should verify edit modal elements in incomplete code modal
    And I should enter <englishVerbiage> code in verbiage textarea
    And I should click on Update button in displayed modal
    And I should verify successful message
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
#    And I should verify successful message
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
    And I should verify edit document modal
    And I should verify disabled submit button
    And I should click on language dropdown
    And I should click on English Language
    And I should enter <editenglishVerbiage> code in verbiage textarea
    And I should click on language dropdown
    And I should click on Spanish Language
    And I should enter <spanishVerbiage> code in verbiage textarea
    And I should click on Update button in displayed modal
#    And I should verify successful message
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
    And I should verify the client default panel
    And I should verify the timeline templates panel
    And I should verify the edit pencil icon on templates
    And I should verify add new icon
    And I should verify toggle icons
    And I should verify languages in the modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|

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
  Scenario Outline: EVS-:As a user I should be able to edit an existing audit on the project configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should search the added <clientname> from left sided client list
    And I should click the added client from left sided client list
#    And I should click on System codes
#    And I should click on manage incomplete codes
#    And I should click on add incomplete codes
#    And I should click on language dropdown
#    And I should click on English Language
#    And I should enter <englishVerbiage> code in verbiage textarea
#    And I should enter <englishVerbiage> code in action item verbiage textarea
#    And I should click on choose document type dropdown
#    And I should verify search textbox inside choose document type dropdown
#    And I should click on checkboxes by selecting all
#    And I should click on language dropdown
#    And I should click on Spanish Language
#    And I should enter <spanishVerbiage> code in verbiage textarea
#    And I should enter <spanishVerbiage> code in action item verbiage textarea
#    And I should click on Add button in modal
#    And I should click on System codes
#    And I should verify ineligible codes label
#    And I should click on manage ineligible codes
#    And I should click on add ineligible codes
#    And I should click on language dropdown
#    And I should click on English Language
#    And I should enter <englishVerbiage> code in verbiage textarea
#    And I should click on language dropdown
#    And I should click on Spanish Language
#    And I should enter <spanishVerbiage> code in verbiage textarea
#    And I should verify disabled submit button
#    And I should select all dependents in ineligible modal
#    And I should enter <versionname> in the version textbox
#    And I should click on Add button in modal
#    And I should click on System codes
#    And I should verify ineligible codes label
#    And I should click on manage ineligible codes
#    And I should click on add ineligible codes
#    And I should click on language dropdown
#    And I should click on English Language
#    And I should enter <englishVerbiage> code in verbiage textarea
#    And I should click on language dropdown
#    And I should click on Spanish Language
#    And I should enter <spanishVerbiage> code in verbiage textarea
#    And I should verify disabled submit button
#    And I should select all dependents in ineligible modal
#    And I should enter <versionname> in the version textbox
#    And I should click on Add button in modal
#    And I should click on System codes
#    And I should verify Documents label
#    And I should click on manage documents
#    And I should click on add documents
#    And I should click on language dropdown
#    And I should click on English Language
#    And I should enter <englishVerbiage> code in verbiage textarea
#    And I should click on language dropdown
#    And I should click on Spanish Language
#    And I should enter <spanishVerbiage> code in verbiage textarea
#    And I should select all dependents in ineligible modal
#    And I should click on choose document type dropdown in documents modal
#    And I should select document type dropdown in documents modal
#    And I should click on Add button in modal
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|versionname|englishVerbiage|spanishVerbiage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.OLDCLIENTNAME|DP:LOGIN.VERSIONNAME|DP:LOGIN.ENGVERBIAGE|DP:LOGIN.SPAVERBIAGE|