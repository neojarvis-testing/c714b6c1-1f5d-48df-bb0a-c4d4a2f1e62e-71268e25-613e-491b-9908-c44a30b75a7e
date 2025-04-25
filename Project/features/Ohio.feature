Feature: ClevelAnd Clinic WebSite
Scenario Outline: Respiratory
        Given I am on ClevelAnd Clinic Homepage.
        When I click on search bar.
        And I enter "<keyword>".
        And I click on Respiratory.
        Examples:
            |keyword|
            |Respiratory|
 
Scenario Outline: Ohio
        Given I am on Cleveland Clinic Homepage.
        When I click on Get Directions.
        And I search "<location>".
        And I click on Location Type.
        And I select on Health centers.
        And I select on Imaging Radiology.
        Examples:
            |location|
            |Ohio|