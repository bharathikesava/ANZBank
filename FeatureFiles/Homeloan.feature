Feature: Homeloan page
@Homeloanpagesingledata
Scenario: Validate Home loan How much could i Barrow
When i launch url in browser
And i select single and zero dependants
And i enter income and other income
And i enter living expenses and current home loan repayment
And i enter other loan repayments
And i enter other commitments
And i enter total credit card limit
When i click how much i could barrow
Then i could see the total estimation
When i click on start over
@Homeloginpage1
Scenario: Validate the values
When i open url in browseres 
And i enter living expenses as one
When i click how much could i barrow button
Then i could see error message








