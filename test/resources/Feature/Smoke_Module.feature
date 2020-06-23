Feature: Smoke Module

  @EVS-221
  Scenario Outline: EVS-221:As a user, I should be able a create a new user

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter firstName <firstName> in the textbox
    And I should check whether submit button is disabled
    And I should enter lastName <lastName> in the textbox
    And I should enter userName <userName> in the textbox
    And I should enter phoneNumber <phoneNumber> in the textbox
    And I should enter emailAddress <emailAddress> in the textbox
    And I should enter workLocation <workLocation> in the textbox
    And I should enter departmentName <departmentName> in the textbox
    And I should enter randomPercentage <randomPercentage> in the textbox
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |firstName|lastName|userName|phoneNumber|emailAddress|workLocation|departmentName|randomPercentage|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.FIRSTNAME|DP:LOGIN.LASTNAME|DP:LOGIN.USERNAME|DP:LOGIN.PHONENO|DP:LOGIN.EMAIL|DP:LOGIN.WORKLOCATION|DP:LOGIN.DEPARTNAME|DP:LOGIN.RANDOMPERCENT|

  @EVS-97
  Scenario Outline: EVS-97:As a user I should be able to create a new client on client configuration page

    Given I should enter login url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should click on system and data configuration
    And I should click on client configuration
    And I should click on Add Client icon
    And I should enter the <clientname> in the clientname textbox
    And I should enter the <clientsite> in the clientsite textbox
    And I should enter the <url> in the clientlogout url textbox
    And I should enter the <clientsite> in the wikilink textbox
    And I should enter the <phoneno> in the phoneno textbox
    And I should enter the <clientphoneid> in the clientphoneid textbox
    And I should enter the <phoneassignmentfrom> in the phoneassignmentfrom textbox
    And I should enter the <phoneassignmentto> in the phoneassignmentto textbox
    And I should select the clientservicerep in the clientservicerep dropdown
    And I should select the ivac language
    And I should select the communication language
    And I should select the communicationprint language
    And I should select logo for the client
    And I should click on Add client button
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|userName          | password          |clientname|clientsite|phoneno|clientphoneid|phoneassignmentfrom|phoneassignmentto|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.CLIENTNAME|DP:LOGIN.CLIENTSITE|DP:LOGIN.PHONENO|DP:LOGIN.PHONENOID|DP:LOGIN.ASSIGNFROM|DP:LOGIN.ASSIGNTO|



  @EVS-2210
  Scenario Outline: EVS-2210:As a user, I should be able a create a new user

    Given I should enter url <URL>
    When I should Login to core application with <userName> and <password>
    And I should click on Login button from Login screen
    And I should enter firstName <firstName> in the textbox
    And I should check whether submit button is disabled
    And I should enter lastName <lastName> in the textbox
    And I should enter userName <userName> in the textbox
    And I should enter phoneNumber <phoneNumber> in the textbox
    And I should enter emailAddress <emailAddress> in the textbox
    And I should enter workLocation <workLocation> in the textbox
    And I should enter departmentName <departmentName> in the textbox
    And I should enter randomPercentage <randomPercentage> in the textbox
    And I should click on profile icon in core
    And I should logoff from core login

    Examples:
      |URL|
      |DP:LOGIN.URL|