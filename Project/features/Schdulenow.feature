Feature: ClevelandClinic
 
Scenario: Schedule Now
Given Nikhith is on Cleveland Clinic Page
When I click on schedule now and verify "Appointments | Cleveland Clinic"
And I click on request appointment and verify "Request an Appointment | Cleveland Clinic"
And I click on Get Started and verify text "Who is this request for?"
And I click on Me and verify text "Have you received care at Cleveland Clinic within the last three years?"
And I click on Not Sure and verify "Please help us get to know you better."
And I enter first name "sigma tester"
And I enter lastname "test"
And I select gender "Male"
And I select marital status "Single"
And I enter date "09/07/1997"
And I click on next
And I verify "How can we contact you about your appointment?" and enter address "22 merry street"
And I enter city "COIMBATORE"
And I select state "OH"
And I enter zipcode "43210"
And I enter email "mjd000@gmail.com"
And I enter phone number "614.466.2000"
And I click on next
And I verfiy text "Tell us about your appointment needs." and enter reason "I am scheduling this appointment to consult regarding a persistent cough and cold that I have been experiencing for the past week."
And I click on next
And I verify text "Tell us about your appointment needs (cont.)." and I capture screenshot "Tell us about your appointment needs (cont.)."
 
Scenario Outline: Find Doctor
Given Nikhith is on ClevelandClinic Page
When I click on Find Doctor
And I click on search bar and enter "<input>"
And I enter location "<location>" and click on it
And I enter department "<department>" and click on it
And I enter language "<language>" and click on it
Examples:
|input|location|department|language|
|heart|East Cleveland, OH|Cardiovascular Medicine|English|