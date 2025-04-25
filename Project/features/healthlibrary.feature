Feature: Health Library Navigation

Scenario:HealthLibrary
  Given I am on clevelandClinic.
  When I scroll to health.
  And I click on diseases and conditions.
  And I click on Diagnostics.
  And I click on treatments.
  And I click on  organs.
  And I click on  drugs.
  
  Scenario:ForProviders
  Given I am on clevelandClinic Home page.
  When I scroll down to forproviders.
  And I click on joinNursery.
  And I click on career.
  And I click on patient.