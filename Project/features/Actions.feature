Feature: Footer Action
Scenario: Verify Actions Urls
Given Im on Cleveland Clinic Webpage.
When I click on Appointments and Access
And I click on Accepted Insurance
And I click on Events Calendar
And I click on Financial Assisstance
And I click on Give to Cleveland clinic 
And I click on Pay your Bill online
And I click on Price Transparency
And I click on Refer a patient
And I click on Phone Directory
And I click on Virtual Second Opinions
And I click on Virtual Visits 
Then I click on Cleveland Logo
 
Scenario Outline: Navigation Bar Health Library
Given Im on Cleveland Clinic Website.
When I click on Health Library
And I click on Body Systems and organs
And I Enter "<Value>"
And I click on Eyes
Then I click on Red Eyes
Examples:
|Value|
|Eyes|